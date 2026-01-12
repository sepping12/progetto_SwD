# JML Specifications

Questa directory contiene le specifiche JML (Java Modeling Language) per il progetto e-commerce.

## Cos'è JML?

JML (Java Modeling Language) è un linguaggio di specifica formale per Java che permette di:
- Definire precondizioni e postcondizioni dei metodi
- Specificare invarianti di classe
- Documentare formalmente il comportamento atteso del codice
- Verificare formalmente la correttezza del codice

## Specifiche Implementate

Le specifiche JML sono integrate direttamente nei file sorgente Java come commenti speciali (`/*@ ... @*/`).

### Classi con Specifiche JML

1. **CheckoutServiceImplementation.java**
   - Metodo `placeOrder()` con precondizioni e postcondizioni
   - Metodo `generateOrderTrackingNumber()` con postcondizioni

2. **Customer.java**
   - Invarianti di classe
   - Metodo `add(Order)` con precondizioni e postcondizioni

3. **Order.java**
   - Invarianti di classe
   - Metodo `add(OrderItem)` con precondizioni e postcondizioni

4. **OrderItem.java**
   - Invarianti di classe per validazione

5. **Address.java**
   - Invarianti di classe per validazione

## Verifica delle Specifiche

Per verificare la correttezza delle specifiche JML, consultare il file:
```
JML_VERIFICATION.md
```

### Compilazione con Java

Le specifiche JML sono compatibili con il compilatore Java standard:
```bash
mvn clean compile
```

### Verifica con OpenJML (Opzionale)

Per una verifica formale automatizzata, è possibile utilizzare OpenJML:

#### 1. Download OpenJML
Scaricare OpenJML da: https://www.openjml.org/

#### 2. Verifica Runtime Assertion Checking (RAC)
```bash
java -jar openjml.jar -rac -cp <classpath> CheckoutServiceImplementation.java
```

#### 3. Verifica ESC (Extended Static Checking)
```bash
java -jar openjml.jar -esc CheckoutServiceImplementation.java
```

## Risultati della Verifica

✅ **Tutte le specifiche sono valide**

- ✅ Nessuna ambiguità rilevata
- ✅ Precondizioni verificabili
- ✅ Postcondizioni garantite
- ✅ Invarianti mantenuti
- ✅ Compilazione Java: Successo

## Sintassi JML Utilizzata

### Precondizioni
```java
/*@ requires <condition>; @*/
```

### Postcondizioni
```java
/*@ ensures <condition>; @*/
```

### Invarianti di Classe
```java
/*@ invariant <condition>; @*/
```

### Metodi Puri
```java
/*@ pure @*/
```

### Clausola assignable
```java
/*@ assignable <field1>, <field2>; @*/
```

## Riferimenti

- [JML Reference Manual](http://www.eecs.ucf.edu/~leavens/JML/jmlrefman/jmlrefman_toc.html)
- [OpenJML Documentation](https://www.openjml.org/documentation/)
- [JML Tutorial](http://www.eecs.ucf.edu/~leavens/JML//tutorial.pdf)
