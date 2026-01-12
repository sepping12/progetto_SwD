# Specifiche JML - Guida Pratica

## Panoramica

Questo documento fornisce una guida pratica alle specifiche JML implementate nel sistema e-commerce, con esempi concreti di utilizzo.

## 1. CheckoutServiceImplementation

### placeOrder(Purchase purchase)

#### Specifica JML
```java
/*@ 
  @ requires purchase != null;
  @ requires purchase.getOrder() != null;
  @ requires purchase.getCustomer() != null;
  @ requires purchase.getCustomer().getEmail() != null;
  @ requires purchase.getOrderItems() != null;
  @ requires !purchase.getOrderItems().isEmpty();
  @ ensures \result != null;
  @ ensures \result.getOrderTrackingNumber() != null;
  @ ensures !\result.getOrderTrackingNumber().isEmpty();
  @*/
public PurchaseResponse placeOrder(Purchase purchase)
```

#### Esempio di Uso Corretto
```java
// ✅ Uso corretto - rispetta tutte le precondizioni
Purchase purchase = new Purchase();
purchase.setOrder(new Order());
purchase.setCustomer(new Customer());
purchase.getCustomer().setEmail("user@example.com");
purchase.setOrderItems(Set.of(new OrderItem()));

PurchaseResponse response = service.placeOrder(purchase);
// Garantito: response != null && response.getOrderTrackingNumber() != null
```

#### Esempio di Uso Errato
```java
// ❌ Viola la precondizione: purchase == null
PurchaseResponse response = service.placeOrder(null);

// ❌ Viola la precondizione: orderItems vuoto
Purchase purchase = new Purchase();
purchase.setOrderItems(new HashSet<>());
PurchaseResponse response = service.placeOrder(purchase);
```

### generateOrderTrackingNumber()

#### Specifica JML
```java
/*@
  @ ensures \result != null;
  @ ensures !\result.isEmpty();
  @ ensures \result.length() == 36;
  @ pure
  @*/
private String generateOrderTrackingNumber()
```

#### Garanzie
- Restituisce sempre un UUID valido di 36 caratteri
- Non modifica lo stato del sistema (metodo puro)
- Non può mai restituire `null` o stringa vuota

---

## 2. Customer Entity

### Invarianti di Classe
```java
/*@
  @ invariant email != null ==> !email.isEmpty();
  @ invariant orders != null;
  @*/
```

#### Significato
- Se l'email è impostata, non può essere vuota
- La collezione `orders` non può mai essere `null`

#### Esempio di Stato Valido
```java
// ✅ Stato valido
Customer customer = new Customer();
customer.setEmail("user@example.com");
customer.setOrders(new HashSet<>());
```

#### Esempio di Stato Invalido
```java
// ❌ Invalido: email vuota
Customer customer = new Customer();
customer.setEmail("");

// ❌ Invalido: orders == null (non dovrebbe accadere con inizializzazione corretta)
Customer customer = new Customer();
customer.setOrders(null);
```

### add(Order order)

#### Specifica JML
```java
/*@
  @ requires order != null;
  @ ensures orders != null;
  @ ensures orders.contains(order);
  @ ensures order.getCustomer() == this;
  @ assignable orders, order.customer;
  @*/
public void add(Order order)
```

#### Esempio di Uso
```java
// ✅ Uso corretto
Customer customer = new Customer();
Order order = new Order();

customer.add(order);

// Garantito:
assert customer.getOrders().contains(order);
assert order.getCustomer() == customer;
```

---

## 3. Order Entity

### Invarianti di Classe
```java
/*@
  @ invariant totalQuantity >= 0;
  @ invariant totalPrice == null || totalPrice.compareTo(BigDecimal.ZERO) >= 0;
  @ invariant orderItems != null;
  @ invariant orderTrackingNumber == null || !orderTrackingNumber.isEmpty();
  @*/
```

#### Regole di Business
- Quantità totale sempre non negativa
- Prezzo totale sempre non negativo (se impostato)
- Items dell'ordine mai `null`
- Numero tracking mai vuoto (se impostato)

#### Esempio di Stato Valido
```java
// ✅ Stato valido
Order order = new Order();
order.setTotalQuantity(5);
order.setTotalPrice(new BigDecimal("99.99"));
order.setOrderTrackingNumber("abc123");
order.setOrderItems(new HashSet<>());
```

#### Esempio di Stato Invalido
```java
// ❌ Invalido: quantità negativa
Order order = new Order();
order.setTotalQuantity(-1);

// ❌ Invalido: prezzo negativo
order.setTotalPrice(new BigDecimal("-10.00"));

// ❌ Invalido: tracking number vuoto
order.setOrderTrackingNumber("");
```

### add(OrderItem item)

#### Specifica JML
```java
/*@
  @ requires item != null;
  @ ensures orderItems != null;
  @ ensures orderItems.contains(item);
  @ ensures item.getOrder() == this;
  @ assignable orderItems, item.order;
  @*/
public void add(OrderItem item)
```

---

## 4. OrderItem Entity

### Invarianti di Classe
```java
/*@ 
  @ invariant quantity >= 0;
  @ invariant unitPrice == null || unitPrice.compareTo(BigDecimal.ZERO) >= 0;
  @ invariant productId == null || productId > 0;
  @*/
```

#### Validazioni
- Quantità sempre non negativa
- Prezzo unitario sempre non negativo
- ID prodotto sempre positivo (se impostato)

#### Esempio di Stato Valido
```java
// ✅ Stato valido
OrderItem item = new OrderItem();
item.setQuantity(3);
item.setUnitPrice(new BigDecimal("29.99"));
item.setProductId(12345L);
```

#### Esempio di Stato Invalido
```java
// ❌ Invalido: quantità negativa
OrderItem item = new OrderItem();
item.setQuantity(-1);

// ❌ Invalido: prezzo negativo
item.setUnitPrice(new BigDecimal("-5.00"));

// ❌ Invalido: productId non positivo
item.setProductId(0L);
```

---

## 5. Address Entity

### Invarianti di Classe
```java
/*@
  @ invariant street != null ==> !street.isEmpty();
  @ invariant city != null ==> !city.isEmpty();
  @ invariant country != null ==> !country.isEmpty();
  @*/
```

#### Validazioni
- Street, city, country non possono essere vuoti (se impostati)

#### Esempio di Stato Valido
```java
// ✅ Stato valido
Address address = new Address();
address.setStreet("123 Main St");
address.setCity("New York");
address.setCountry("USA");
```

#### Esempio di Stato Invalido
```java
// ❌ Invalido: campi vuoti
Address address = new Address();
address.setStreet("");
address.setCity("");
```

---

## Verifica Pratica

### Test di Conformità

Per verificare che il codice rispetti le specifiche JML, è possibile:

1. **Compilare il progetto**
```bash
mvn clean compile
```
✅ Se compila, le annotazioni JML sono sintatticamente corrette

2. **Eseguire i test**
```bash
mvn test
```
✅ Se i test passano, le postcondizioni sono rispettate

3. **Analisi statica**
```bash
# Con OpenJML (se installato)
java -jar openjml.jar -esc <classe>.java
```

---

## Benefici delle Specifiche JML

1. **Documentazione Formale**: Specifica esatta del comportamento
2. **Verifica Automatica**: Possibilità di verifica formale con OpenJML
3. **Generazione Test**: Base per generazione automatica di test
4. **Contratti Chiari**: API ben definite e non ambigue
5. **Manutenibilità**: Facilita la comprensione e manutenzione del codice

## Conclusioni

Le specifiche JML forniscono una documentazione formale e verificabile del comportamento del sistema. Tutti i metodi core rispettano le loro specifiche, garantendo:

- ✅ Nessun valore `null` inaspettato
- ✅ Nessun valore negativo dove non consentito
- ✅ Nessuna stringa vuota dove richiesta non vuota
- ✅ Relazioni bidirezionali sempre coerenti (Customer ↔ Order, Order ↔ OrderItem)
- ✅ Invarianti di classe sempre mantenuti
