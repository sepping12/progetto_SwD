package com.shittu24.ecommerce.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory4 = product0.getCategory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(productCategory4);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        int int6 = orderItem0.getQuantity();
        com.shittu24.ecommerce.entity.Order order7 = orderItem0.getOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        address6.setCountry("");
        address6.setCountry("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.lang.String str9 = product0.getName();
        product0.setDescription("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Address address16 = null;
        order3.setShippingAddress(address16);
        order3.setId((java.lang.Long) 10L);
        java.lang.String str20 = order3.getStatus();
        int int21 = order3.getTotalQuantity();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        java.lang.Long long11 = product0.getId();
        java.lang.String str12 = product0.getImageUrl();
        product0.setUnitsInStock(10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(productCategory10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer10 = order3.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet11 = customer10.getOrders();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.math.BigDecimal bigDecimal18 = null;
        order15.setTotalPrice(bigDecimal18);
        java.lang.String str20 = order15.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order15.getOrderItems();
        com.shittu24.ecommerce.entity.Address address22 = order15.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer23 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order24 = null;
        customer23.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet26 = customer23.getOrders();
        order15.setCustomer(customer23);
        com.shittu24.ecommerce.entity.Address address28 = null;
        order15.setShippingAddress(address28);
        order15.setId((java.lang.Long) 10L);
        java.lang.String str32 = order15.getStatus();
        customer10.add(order15);
        order15.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNotNull(orderSet11);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNotNull(orderSet26);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address12 = order11.getBillingAddress();
        order11.setOrderTrackingNumber("");
        java.util.Date date15 = null;
        order11.setLastUpdated(date15);
        com.shittu24.ecommerce.entity.Address address17 = new com.shittu24.ecommerce.entity.Address();
        order11.setBillingAddress(address17);
        java.lang.String str19 = address17.getState();
        java.lang.String str20 = address17.getCountry();
        java.lang.String str21 = address17.getCountry();
        java.lang.String str22 = address17.getCity();
        java.lang.String str23 = address17.getCity();
        order3.setBillingAddress(address17);
        com.shittu24.ecommerce.entity.Order order25 = address17.getOrder();
        java.lang.String str26 = address17.getZipCode();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(order25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.util.Date date5 = product0.getLastUpdated();
        java.util.Date date6 = null;
        product0.setLastUpdated(date6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        java.lang.String str9 = customer2.getFirstName();
        customer2.setLastName("hi!");
        java.lang.String str12 = customer2.getEmail();
        customer2.setLastName("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.util.Date date9 = null;
        product0.setLastUpdated(date9);
        java.lang.String str11 = product0.getDescription();
        java.lang.String str12 = product0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        customer0.setEmail("hi!");
        customer0.setId((java.lang.Long) 1L);
        customer0.setId((java.lang.Long) 100L);
        java.lang.String str14 = customer0.getEmail();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        java.util.Date date8 = null;
        order3.setLastUpdated(date8);
        order3.setOrderTrackingNumber("");
        order3.setId((java.lang.Long) (-1L));
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order3.getOrderItems();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet14);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setActive(false);
        java.math.BigDecimal bigDecimal5 = null;
        product0.setUnitPrice(bigDecimal5);
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address11 = order10.getBillingAddress();
        order10.setOrderTrackingNumber("");
        java.util.Date date14 = null;
        order10.setLastUpdated(date14);
        com.shittu24.ecommerce.entity.Address address16 = new com.shittu24.ecommerce.entity.Address();
        order10.setBillingAddress(address16);
        address16.setCountry("");
        order3.setShippingAddress(address16);
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet26 = order24.getOrderItems();
        java.lang.String str27 = order24.getStatus();
        java.lang.Long long28 = order24.getId();
        order24.setTotalQuantity((int) (short) 10);
        address16.setOrder(order24);
        address16.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        address16.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Address address36 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str37 = address36.getCountry();
        com.shittu24.ecommerce.entity.Order order38 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date39 = null;
        order38.setLastUpdated(date39);
        java.math.BigDecimal bigDecimal41 = order38.getTotalPrice();
        java.util.Date date42 = null;
        order38.setLastUpdated(date42);
        address36.setOrder(order38);
        address16.setOrder(order38);
        java.lang.String str46 = address16.getState();
        address16.setState("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(bigDecimal41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str46, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order14 = orderItem13.getOrder();
        boolean boolean15 = product0.equals((java.lang.Object) orderItem13);
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order19.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order19.getOrderItems();
        com.shittu24.ecommerce.entity.Address address23 = order19.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address24 = order19.getBillingAddress();
        java.util.Date date25 = null;
        order19.setLastUpdated(date25);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet27 = order19.getOrderItems();
        orderItem13.setOrder(order19);
        com.shittu24.ecommerce.entity.Order order29 = orderItem13.getOrder();
        int int30 = orderItem13.getQuantity();
        java.lang.Long long31 = orderItem13.getId();
        orderItem13.setId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal34 = orderItem13.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(address23);
        org.junit.Assert.assertNull(address24);
        org.junit.Assert.assertNotNull(orderItemSet27);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNull(bigDecimal34);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.util.Date date2 = null;
        order0.setDateCreated(date2);
        java.util.Date date4 = order0.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address5 = order0.getShippingAddress();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order9.getOrderItems();
        java.lang.String str12 = order9.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order9.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        java.util.Date date19 = order17.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem20 = null;
        order17.add(orderItem20);
        order17.setOrderTrackingNumber("");
        java.util.Date date24 = order17.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet25 = order17.getOrderItems();
        order9.setOrderItems(orderItemSet25);
        order0.setOrderItems(orderItemSet25);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNotNull(orderItemSet25);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setUnitsInStock((int) 'a');
        java.util.Date date9 = product0.getDateCreated();
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.lang.Long long9 = orderItem7.getProductId();
        com.shittu24.ecommerce.entity.Order order10 = orderItem7.getOrder();
        order3.add(orderItem7);
        java.lang.String str12 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order3.getOrderItems();
        order3.setTotalQuantity(100);
        order3.setTotalQuantity(97);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(orderItemSet13);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setUnitsInStock((int) (short) 0);
        com.shittu24.ecommerce.entity.Product product6 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean8 = product6.equals((java.lang.Object) 1.0f);
        product6.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory11 = product6.getCategory();
        product6.setName("hi!");
        product6.setName("");
        java.lang.String str16 = product6.getImageUrl();
        java.math.BigDecimal bigDecimal17 = null;
        product6.setUnitPrice(bigDecimal17);
        boolean boolean19 = product0.equals((java.lang.Object) product6);
        product6.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(productCategory11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str4 = address0.getState();
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date1 = null;
        order0.setLastUpdated(date1);
        java.math.BigDecimal bigDecimal3 = order0.getTotalPrice();
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getShippingAddress();
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.lang.Long long4 = orderItem0.getId();
        com.shittu24.ecommerce.entity.Order order5 = orderItem0.getOrder();
        orderItem0.setQuantity((int) ' ');
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str9 = order8.getStatus();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str11 = customer10.getFirstName();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer10.add(order12);
        customer10.setLastName("hi!");
        order8.setCustomer(customer10);
        orderItem0.setOrder(order8);
        orderItem0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getBillingAddress();
        java.util.Date date7 = order0.getLastUpdated();
        java.util.Date date8 = null;
        order0.setLastUpdated(date8);
        order0.setStatus("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order1 = orderItem0.getOrder();
        int int2 = orderItem0.getQuantity();
        java.lang.Long long3 = orderItem0.getId();
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = product0.toString();
        product0.setSku("hi!");
        java.util.Date date18 = null;
        product0.setDateCreated(date18);
        java.lang.String str20 = product0.getSku();
        java.lang.String str21 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        java.lang.String str8 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.util.Date date9 = null;
        product0.setLastUpdated(date9);
        java.math.BigDecimal bigDecimal11 = product0.getUnitPrice();
        java.lang.String str12 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer26.getOrders();
        customer24.setOrders(orderSet27);
        customer24.setLastName("");
        order3.setCustomer(customer24);
        java.util.Date date32 = null;
        order3.setLastUpdated(date32);
        com.shittu24.ecommerce.entity.Customer customer34 = order3.getCustomer();
        java.lang.Long long35 = customer34.getId();
        com.shittu24.ecommerce.entity.OrderItem orderItem36 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long37 = orderItem36.getProductId();
        orderItem36.setImageUrl("");
        java.lang.Long long40 = orderItem36.getId();
        java.lang.Long long41 = orderItem36.getProductId();
        com.shittu24.ecommerce.entity.Customer customer42 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order43 = null;
        customer42.add(order43);
        com.shittu24.ecommerce.entity.Order order45 = new com.shittu24.ecommerce.entity.Order();
        customer42.add(order45);
        java.util.Date date47 = order45.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem48 = null;
        order45.add(orderItem48);
        orderItem36.setOrder(order45);
        customer34.add(order45);
        int int52 = order45.getTotalQuantity();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet27);
        org.junit.Assert.assertNotNull(customer34);
        org.junit.Assert.assertNull(long35);
        org.junit.Assert.assertNull(long37);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNull(long41);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str9 = customer8.getFirstName();
        java.lang.Long long10 = customer8.getId();
        order3.setCustomer(customer8);
        com.shittu24.ecommerce.entity.Address address12 = new com.shittu24.ecommerce.entity.Address();
        address12.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = address12.getZipCode();
        java.lang.String str16 = address12.getZipCode();
        order3.setBillingAddress(address12);
        java.util.Date date18 = null;
        order3.setLastUpdated(date18);
        java.util.Date date20 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        java.util.Date date8 = null;
        order3.setLastUpdated(date8);
        java.lang.String str10 = order3.getStatus();
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address12 = order11.getBillingAddress();
        order11.setOrderTrackingNumber("");
        java.util.Date date15 = null;
        order11.setLastUpdated(date15);
        com.shittu24.ecommerce.entity.Address address17 = new com.shittu24.ecommerce.entity.Address();
        order11.setBillingAddress(address17);
        java.lang.String str19 = address17.getState();
        java.lang.String str20 = address17.getCountry();
        java.lang.String str21 = address17.getCountry();
        java.lang.String str22 = address17.getCity();
        java.lang.String str23 = address17.getCity();
        order3.setShippingAddress(address17);
        address17.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        com.shittu24.ecommerce.entity.Address address9 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str10 = address9.getCity();
        address9.setCountry("hi!");
        order0.setBillingAddress(address9);
        java.lang.Long long14 = address9.getId();
        address9.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        com.shittu24.ecommerce.entity.Order order20 = new com.shittu24.ecommerce.entity.Order();
        customer17.add(order20);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order20.getOrderItems();
        com.shittu24.ecommerce.entity.Address address23 = new com.shittu24.ecommerce.entity.Address();
        address23.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str26 = address23.getZipCode();
        java.lang.String str27 = address23.getZipCode();
        com.shittu24.ecommerce.entity.Order order28 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address29 = order28.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address30 = order28.getShippingAddress();
        address23.setOrder(order28);
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer32.add(order33);
        com.shittu24.ecommerce.entity.Order order35 = new com.shittu24.ecommerce.entity.Order();
        customer32.add(order35);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet37 = order35.getOrderItems();
        java.lang.String str38 = order35.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet39 = order35.getOrderItems();
        order28.setOrderItems(orderItemSet39);
        order20.setOrderItems(orderItemSet39);
        int int42 = order20.getTotalQuantity();
        address9.setOrder(order20);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(address29);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNotNull(orderItemSet37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(orderItemSet39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        address0.setCountry("hi!");
        address0.setCountry("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long11 = address0.getId();
        address0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        java.lang.String str16 = address14.getState();
        java.lang.String str17 = address14.getCountry();
        java.lang.String str18 = address14.getState();
        order3.setBillingAddress(address14);
        java.lang.String str20 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet24 = customer21.getOrders();
        customer21.setEmail("");
        customer21.setEmail("");
        java.lang.Long long29 = customer21.getId();
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date31 = null;
        order30.setLastUpdated(date31);
        java.math.BigDecimal bigDecimal33 = order30.getTotalPrice();
        customer21.add(order30);
        order3.setCustomer(customer21);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Date date41 = order39.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem42 = null;
        order39.add(orderItem42);
        com.shittu24.ecommerce.entity.Address address44 = null;
        order39.setShippingAddress(address44);
        com.shittu24.ecommerce.entity.OrderItem orderItem46 = new com.shittu24.ecommerce.entity.OrderItem();
        int int47 = orderItem46.getQuantity();
        java.lang.Long long48 = orderItem46.getProductId();
        order39.add(orderItem46);
        orderItem46.setProductId((java.lang.Long) 10L);
        java.lang.String str52 = orderItem46.getImageUrl();
        java.lang.String str53 = orderItem46.getImageUrl();
        order3.add(orderItem46);
        com.shittu24.ecommerce.entity.Address address55 = null;
        order3.setShippingAddress(address55);
        java.util.Date date57 = null;
        order3.setDateCreated(date57);
        com.shittu24.ecommerce.entity.Address address59 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str60 = address59.getCountry();
        java.lang.Long long61 = address59.getId();
        order3.setShippingAddress(address59);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderSet24);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(bigDecimal33);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(long48);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(long61);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        boolean boolean8 = product0.isActive();
        com.shittu24.ecommerce.entity.Product product9 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean11 = product9.equals((java.lang.Object) 1.0f);
        product9.setName("");
        java.util.Date date14 = null;
        product9.setDateCreated(date14);
        product9.setActive(true);
        boolean boolean18 = product0.equals((java.lang.Object) true);
        java.lang.String str19 = product0.getImageUrl();
        product0.setSku("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        com.shittu24.ecommerce.entity.Product product16 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str17 = product16.getSku();
        java.lang.Long long18 = product16.getId();
        product16.setUnitsInStock((int) (byte) -1);
        product16.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int23 = product16.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order25 = null;
        customer24.add(order25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        customer24.add(order27);
        java.util.Date date29 = order27.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem30 = null;
        order27.add(orderItem30);
        java.util.Date date32 = null;
        order27.setLastUpdated(date32);
        boolean boolean34 = product16.equals((java.lang.Object) order27);
        orderItem13.setOrder(order27);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet41 = order39.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet42 = order39.getOrderItems();
        order27.setOrderItems(orderItemSet42);
        java.util.Date date44 = order27.getDateCreated();
        com.shittu24.ecommerce.entity.Customer customer45 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str46 = customer45.getFirstName();
        java.lang.Long long47 = customer45.getId();
        customer45.setFirstName("");
        java.lang.String str50 = customer45.getLastName();
        java.lang.String str51 = customer45.getFirstName();
        java.lang.String str52 = customer45.getLastName();
        order27.setCustomer(customer45);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(orderItemSet41);
        org.junit.Assert.assertNotNull(orderItemSet42);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(long47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.String str2 = customer0.getEmail();
        customer0.setEmail("");
        java.lang.Long long5 = customer0.getId();
        customer0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        java.lang.String str9 = customer2.getEmail();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = null;
        order13.add(orderItem16);
        com.shittu24.ecommerce.entity.Address address18 = null;
        order13.setShippingAddress(address18);
        com.shittu24.ecommerce.entity.OrderItem orderItem20 = new com.shittu24.ecommerce.entity.OrderItem();
        int int21 = orderItem20.getQuantity();
        java.lang.Long long22 = orderItem20.getProductId();
        order13.add(orderItem20);
        orderItem20.setProductId((java.lang.Long) 10L);
        java.lang.String str26 = orderItem20.getImageUrl();
        java.lang.Long long27 = orderItem20.getId();
        com.shittu24.ecommerce.entity.Customer customer28 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer28.add(order29);
        com.shittu24.ecommerce.entity.Order order31 = new com.shittu24.ecommerce.entity.Order();
        customer28.add(order31);
        java.util.Date date33 = order31.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem34 = null;
        order31.add(orderItem34);
        com.shittu24.ecommerce.entity.Address address36 = null;
        order31.setShippingAddress(address36);
        com.shittu24.ecommerce.entity.OrderItem orderItem38 = new com.shittu24.ecommerce.entity.OrderItem();
        int int39 = orderItem38.getQuantity();
        java.lang.Long long40 = orderItem38.getProductId();
        order31.add(orderItem38);
        com.shittu24.ecommerce.entity.Customer customer42 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order43 = null;
        customer42.add(order43);
        com.shittu24.ecommerce.entity.Order order45 = new com.shittu24.ecommerce.entity.Order();
        customer42.add(order45);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet47 = order45.getOrderItems();
        java.lang.String str48 = order45.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet49 = order45.getOrderItems();
        order31.setOrderItems(orderItemSet49);
        java.math.BigDecimal bigDecimal51 = order31.getTotalPrice();
        orderItem20.setOrder(order31);
        order31.setTotalQuantity((int) 'a');
        com.shittu24.ecommerce.entity.Customer customer55 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order56 = null;
        customer55.add(order56);
        com.shittu24.ecommerce.entity.Order order58 = new com.shittu24.ecommerce.entity.Order();
        customer55.add(order58);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet60 = order58.getOrderItems();
        java.util.Date date61 = order58.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer62 = order58.getCustomer();
        customer62.setId((java.lang.Long) 1L);
        order31.setCustomer(customer62);
        customer2.add(order31);
        order31.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNotNull(orderItemSet47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(orderItemSet49);
        org.junit.Assert.assertNull(bigDecimal51);
        org.junit.Assert.assertNotNull(orderItemSet60);
        org.junit.Assert.assertNull(date61);
        org.junit.Assert.assertNotNull(customer62);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.math.BigDecimal bigDecimal15 = null;
        order12.setTotalPrice(bigDecimal15);
        java.lang.String str17 = order12.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order12.getOrderItems();
        com.shittu24.ecommerce.entity.Address address19 = order12.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order21 = null;
        customer20.add(order21);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet23 = customer20.getOrders();
        order12.setCustomer(customer20);
        com.shittu24.ecommerce.entity.Address address25 = null;
        order12.setShippingAddress(address25);
        java.math.BigDecimal bigDecimal27 = order12.getTotalPrice();
        java.util.Date date28 = null;
        order12.setDateCreated(date28);
        boolean boolean30 = product0.equals((java.lang.Object) date28);
        java.lang.Long long31 = product0.getId();
        java.util.Date date32 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(address19);
        org.junit.Assert.assertNotNull(orderSet23);
        org.junit.Assert.assertNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNull(date32);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        java.lang.Long long6 = customer0.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order10.getOrderItems();
        java.math.BigDecimal bigDecimal13 = null;
        order10.setTotalPrice(bigDecimal13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address16 = order15.getBillingAddress();
        order15.setOrderTrackingNumber("");
        java.util.Date date19 = null;
        order15.setLastUpdated(date19);
        com.shittu24.ecommerce.entity.Address address21 = new com.shittu24.ecommerce.entity.Address();
        order15.setBillingAddress(address21);
        java.lang.String str23 = address21.getState();
        java.lang.String str24 = address21.getCountry();
        java.lang.String str25 = address21.getState();
        order10.setBillingAddress(address21);
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str28 = customer27.getFirstName();
        java.lang.String str29 = customer27.getEmail();
        customer27.setEmail("");
        java.lang.Long long32 = customer27.getId();
        order10.setCustomer(customer27);
        int int34 = order10.getTotalQuantity();
        customer0.add(order10);
        customer0.setEmail("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
        java.lang.String str5 = customer0.getLastName();
        java.lang.String str6 = customer0.getFirstName();
        java.lang.Long long7 = customer0.getId();
        com.shittu24.ecommerce.entity.Address address8 = new com.shittu24.ecommerce.entity.Address();
        address8.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str11 = address8.getZipCode();
        java.lang.String str12 = address8.getZipCode();
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address14 = order13.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address15 = order13.getShippingAddress();
        address8.setOrder(order13);
        java.lang.String str17 = address8.getCountry();
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        java.util.Date date23 = order21.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem24 = null;
        order21.add(orderItem24);
        com.shittu24.ecommerce.entity.Address address26 = null;
        order21.setShippingAddress(address26);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet28 = order21.getOrderItems();
        order21.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address8.setOrder(order21);
        customer0.add(order21);
        java.lang.String str33 = customer0.getEmail();
        java.lang.String str34 = customer0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str17, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(orderItemSet28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str8 = customer0.getFirstName();
        java.lang.String str9 = customer0.getEmail();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.lang.String str12 = order3.getStatus();
        order3.setId((java.lang.Long) 1L);
        java.lang.String str15 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Product product16 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.OrderItem orderItem17 = new com.shittu24.ecommerce.entity.OrderItem();
        int int18 = orderItem17.getQuantity();
        orderItem17.setId((java.lang.Long) 10L);
        java.lang.String str21 = orderItem17.getImageUrl();
        boolean boolean22 = product16.equals((java.lang.Object) orderItem17);
        java.math.BigDecimal bigDecimal23 = orderItem17.getUnitPrice();
        java.lang.String str24 = orderItem17.getImageUrl();
        order3.add(orderItem17);
        java.lang.Long long26 = orderItem17.getProductId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(long26);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        order3.setTotalQuantity(0);
        java.util.Date date12 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order3.getOrderItems();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(orderItemSet13);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        product0.setUnitsInStock(0);
        java.util.Date date12 = product0.getDateCreated();
        java.util.Date date13 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        com.shittu24.ecommerce.entity.Customer customer5 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order6 = null;
        customer5.add(order6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        customer5.add(order8);
        java.util.Date date10 = order8.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem11 = null;
        order8.add(orderItem11);
        order8.setOrderTrackingNumber("");
        java.util.Date date15 = order8.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order8.getOrderItems();
        java.lang.String str17 = order8.getStatus();
        address0.setOrder(order8);
        order8.setTotalQuantity((int) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.lang.Long long4 = orderItem0.getId();
        int int5 = orderItem0.getQuantity();
        java.lang.Long long6 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        product0.setId((java.lang.Long) 1L);
        java.util.Date date14 = product0.getLastUpdated();
        java.lang.String str15 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.Address address16 = new com.shittu24.ecommerce.entity.Address();
        address16.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str19 = address16.getZipCode();
        java.lang.String str20 = address16.getZipCode();
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address22 = order21.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address23 = order21.getShippingAddress();
        address16.setOrder(order21);
        com.shittu24.ecommerce.entity.Customer customer25 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order26 = null;
        customer25.add(order26);
        com.shittu24.ecommerce.entity.Order order28 = new com.shittu24.ecommerce.entity.Order();
        customer25.add(order28);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet30 = order28.getOrderItems();
        java.lang.String str31 = order28.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet32 = order28.getOrderItems();
        order21.setOrderItems(orderItemSet32);
        com.shittu24.ecommerce.entity.Customer customer34 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order35 = null;
        customer34.add(order35);
        com.shittu24.ecommerce.entity.Order order37 = new com.shittu24.ecommerce.entity.Order();
        customer34.add(order37);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet39 = order37.getOrderItems();
        com.shittu24.ecommerce.entity.Address address40 = new com.shittu24.ecommerce.entity.Address();
        address40.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str43 = address40.getZipCode();
        java.lang.String str44 = address40.getZipCode();
        com.shittu24.ecommerce.entity.Order order45 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address46 = order45.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address47 = order45.getShippingAddress();
        address40.setOrder(order45);
        com.shittu24.ecommerce.entity.Customer customer49 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order50 = null;
        customer49.add(order50);
        com.shittu24.ecommerce.entity.Order order52 = new com.shittu24.ecommerce.entity.Order();
        customer49.add(order52);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet54 = order52.getOrderItems();
        java.lang.String str55 = order52.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet56 = order52.getOrderItems();
        order45.setOrderItems(orderItemSet56);
        order37.setOrderItems(orderItemSet56);
        order21.setOrderItems(orderItemSet56);
        boolean boolean60 = product0.equals((java.lang.Object) order21);
        order21.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNull(address23);
        org.junit.Assert.assertNotNull(orderItemSet30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(orderItemSet32);
        org.junit.Assert.assertNotNull(orderItemSet39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(address46);
        org.junit.Assert.assertNull(address47);
        org.junit.Assert.assertNotNull(orderItemSet54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(orderItemSet56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        orderItem0.setQuantity(35);
        int int8 = orderItem0.getQuantity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str4 = address0.getZipCode();
        java.lang.String str5 = address0.getStreet();
        java.lang.String str6 = address0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        java.util.Date date8 = null;
        order3.setDateCreated(date8);
        order3.setStatus("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str12 = order3.getStatus();
        java.math.BigDecimal bigDecimal13 = null;
        order3.setTotalPrice(bigDecimal13);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setName("");
        java.lang.String str10 = product0.getSku();
        boolean boolean11 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.lang.String str2 = order0.getOrderTrackingNumber();
        java.lang.String str3 = order0.getStatus();
        com.shittu24.ecommerce.entity.OrderItem orderItem4 = new com.shittu24.ecommerce.entity.OrderItem();
        int int5 = orderItem4.getQuantity();
        java.math.BigDecimal bigDecimal6 = null;
        orderItem4.setUnitPrice(bigDecimal6);
        orderItem4.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal10 = null;
        orderItem4.setUnitPrice(bigDecimal10);
        orderItem4.setId((java.lang.Long) 1L);
        orderItem4.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order0.add(orderItem4);
        java.math.BigDecimal bigDecimal17 = orderItem4.getUnitPrice();
        orderItem4.setQuantity((int) (byte) 0);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(bigDecimal17);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order17.getOrderItems();
        java.lang.String str20 = order17.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order17.getOrderItems();
        order3.setOrderItems(orderItemSet21);
        java.math.BigDecimal bigDecimal23 = order3.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address24 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str25 = address24.getCountry();
        java.lang.Long long26 = address24.getId();
        address24.setState("");
        order3.setBillingAddress(address24);
        java.lang.String str30 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Customer customer5 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order6 = null;
        customer5.add(order6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        customer5.add(order8);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order8.getOrderItems();
        java.util.Date date11 = order8.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str13 = customer12.getFirstName();
        com.shittu24.ecommerce.entity.Order order14 = null;
        customer12.add(order14);
        java.lang.Long long16 = customer12.getId();
        order8.setCustomer(customer12);
        com.shittu24.ecommerce.entity.OrderItem orderItem18 = new com.shittu24.ecommerce.entity.OrderItem();
        int int19 = orderItem18.getQuantity();
        order8.add(orderItem18);
        com.shittu24.ecommerce.entity.Product product21 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str22 = product21.getSku();
        java.lang.Long long23 = product21.getId();
        product21.setUnitsInStock((int) (byte) -1);
        product21.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int28 = product21.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer29 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order30 = null;
        customer29.add(order30);
        com.shittu24.ecommerce.entity.Order order32 = new com.shittu24.ecommerce.entity.Order();
        customer29.add(order32);
        java.util.Date date34 = order32.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem35 = null;
        order32.add(orderItem35);
        java.util.Date date37 = null;
        order32.setLastUpdated(date37);
        boolean boolean39 = product21.equals((java.lang.Object) order32);
        orderItem18.setOrder(order32);
        com.shittu24.ecommerce.entity.Address address41 = order32.getBillingAddress();
        address0.setOrder(order32);
        java.util.Date date43 = order32.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(address41);
        org.junit.Assert.assertNull(date43);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        address0.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setCountry("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setId((java.lang.Long) 1L);
        java.lang.String str8 = product0.getImageUrl();
        product0.setSku("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal11 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        java.util.Date date8 = order3.getDateCreated();
        java.util.Date date9 = order3.getDateCreated();
        java.util.Date date10 = order3.getDateCreated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.lang.String str7 = product0.getName();
        product0.setSku("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.util.Date date2 = null;
        order0.setDateCreated(date2);
        java.lang.String str4 = order0.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order0.getOrderItems();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderItemSet5);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str4 = address0.getZipCode();
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getStreet();
        java.lang.String str8 = address0.getStreet();
        java.lang.String str9 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setFirstName("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order11.getOrderItems();
        java.lang.String str14 = order11.getStatus();
        java.util.Date date15 = order11.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str17 = customer16.getFirstName();
        java.lang.Long long18 = customer16.getId();
        order11.setCustomer(customer16);
        com.shittu24.ecommerce.entity.Address address20 = new com.shittu24.ecommerce.entity.Address();
        address20.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str23 = address20.getZipCode();
        java.lang.String str24 = address20.getZipCode();
        order11.setBillingAddress(address20);
        java.lang.String str26 = address20.getStreet();
        address20.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setShippingAddress(address20);
        java.lang.Long long30 = order3.getId();
        java.util.Date date31 = order3.getDateCreated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(date31);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.lang.String str12 = order3.getOrderTrackingNumber();
        java.util.Date date13 = order3.getLastUpdated();
        java.lang.String str14 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.OrderItem orderItem15 = new com.shittu24.ecommerce.entity.OrderItem();
        int int16 = orderItem15.getQuantity();
        java.math.BigDecimal bigDecimal17 = null;
        orderItem15.setUnitPrice(bigDecimal17);
        com.shittu24.ecommerce.entity.Order order19 = orderItem15.getOrder();
        int int20 = orderItem15.getQuantity();
        com.shittu24.ecommerce.entity.Order order21 = orderItem15.getOrder();
        orderItem15.setId((java.lang.Long) 1L);
        int int24 = orderItem15.getQuantity();
        order3.add(orderItem15);
        com.shittu24.ecommerce.entity.Order order26 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address27 = order26.getBillingAddress();
        java.util.Date date28 = null;
        order26.setDateCreated(date28);
        orderItem15.setOrder(order26);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(address27);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getCountry();
        java.lang.String str10 = address6.getState();
        java.lang.Long long11 = address6.getId();
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address13 = order12.getBillingAddress();
        order12.setOrderTrackingNumber("");
        order12.setOrderTrackingNumber("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setOrder(order12);
        java.lang.String str19 = address6.getCountry();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        java.lang.String str13 = customer7.getEmail();
        java.lang.String str14 = customer7.getFirstName();
        java.lang.String str15 = customer7.getFirstName();
        customer7.setLastName("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Customer customer1 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer1.add(order2);
        com.shittu24.ecommerce.entity.Order order4 = new com.shittu24.ecommerce.entity.Order();
        customer1.add(order4);
        java.util.Date date6 = order4.getDateCreated();
        java.lang.Long long7 = order4.getId();
        int int8 = order4.getTotalQuantity();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order4.getOrderItems();
        customer0.add(order4);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order4.getOrderItems();
        com.shittu24.ecommerce.entity.OrderItem orderItem12 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order13 = orderItem12.getOrder();
        int int14 = orderItem12.getQuantity();
        orderItem12.setId((java.lang.Long) 100L);
        order4.add(orderItem12);
        order4.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getCountry();
        java.lang.String str10 = address6.getCountry();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Date date16 = order14.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem17 = null;
        order14.add(orderItem17);
        java.lang.String str19 = order14.getStatus();
        address6.setOrder(order14);
        java.lang.String str21 = address6.getCountry();
        java.lang.String str22 = address6.getCountry();
        java.lang.String str23 = address6.getZipCode();
        com.shittu24.ecommerce.entity.Order order24 = address6.getOrder();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(order24);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str6 = customer0.getFirstName();
        customer0.setFirstName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        java.lang.Long long16 = order12.getId();
        order12.setTotalQuantity((int) (short) 10);
        order12.setStatus("");
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address22 = order21.getBillingAddress();
        order21.setOrderTrackingNumber("");
        java.util.Date date25 = null;
        order21.setLastUpdated(date25);
        com.shittu24.ecommerce.entity.Address address27 = new com.shittu24.ecommerce.entity.Address();
        order21.setBillingAddress(address27);
        java.lang.String str29 = address27.getState();
        java.lang.String str30 = address27.getCountry();
        java.lang.String str31 = address27.getCountry();
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer32.add(order33);
        com.shittu24.ecommerce.entity.Order order35 = new com.shittu24.ecommerce.entity.Order();
        customer32.add(order35);
        java.util.Date date37 = order35.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem38 = null;
        order35.add(orderItem38);
        java.lang.String str40 = order35.getStatus();
        address27.setOrder(order35);
        java.lang.String str42 = address27.getCountry();
        order12.setBillingAddress(address27);
        customer0.add(order12);
        order12.setTotalQuantity((int) (short) 1);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        java.lang.String str16 = address14.getState();
        java.lang.String str17 = address14.getCountry();
        java.lang.String str18 = address14.getState();
        order3.setBillingAddress(address14);
        java.lang.String str20 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet24 = customer21.getOrders();
        customer21.setEmail("");
        customer21.setEmail("");
        java.lang.Long long29 = customer21.getId();
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date31 = null;
        order30.setLastUpdated(date31);
        java.math.BigDecimal bigDecimal33 = order30.getTotalPrice();
        customer21.add(order30);
        order3.setCustomer(customer21);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Date date41 = order39.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem42 = null;
        order39.add(orderItem42);
        com.shittu24.ecommerce.entity.Address address44 = null;
        order39.setShippingAddress(address44);
        com.shittu24.ecommerce.entity.OrderItem orderItem46 = new com.shittu24.ecommerce.entity.OrderItem();
        int int47 = orderItem46.getQuantity();
        java.lang.Long long48 = orderItem46.getProductId();
        order39.add(orderItem46);
        orderItem46.setProductId((java.lang.Long) 10L);
        java.lang.String str52 = orderItem46.getImageUrl();
        java.lang.String str53 = orderItem46.getImageUrl();
        order3.add(orderItem46);
        com.shittu24.ecommerce.entity.Customer customer55 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Customer customer56 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str57 = customer56.getFirstName();
        customer56.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet60 = customer56.getOrders();
        customer56.setFirstName("hi!");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet63 = customer56.getOrders();
        customer55.setOrders(orderSet63);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderSet24);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(bigDecimal33);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(long48);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(customer55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(orderSet60);
        org.junit.Assert.assertNotNull(orderSet63);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = null;
        order13.add(orderItem16);
        order13.setOrderTrackingNumber("");
        java.util.Date date20 = order13.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address22 = order21.getBillingAddress();
        order21.setOrderTrackingNumber("");
        java.util.Date date25 = null;
        order21.setLastUpdated(date25);
        com.shittu24.ecommerce.entity.Address address27 = new com.shittu24.ecommerce.entity.Address();
        order21.setBillingAddress(address27);
        java.lang.String str29 = address27.getState();
        java.lang.String str30 = address27.getCountry();
        java.lang.String str31 = address27.getCountry();
        java.lang.String str32 = address27.getCity();
        java.lang.String str33 = address27.getCity();
        order13.setBillingAddress(address27);
        java.lang.String str35 = address27.getState();
        java.lang.String str36 = address27.getStreet();
        address27.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setShippingAddress(address27);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        java.lang.String str14 = orderItem10.getImageUrl();
        java.lang.String str15 = orderItem10.getImageUrl();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order19.getOrderItems();
        java.lang.String str22 = order19.getStatus();
        java.util.Date date23 = order19.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray24 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet25 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet25, orderItemArray24);
        order19.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet25);
        order19.setTotalQuantity(0);
        com.shittu24.ecommerce.entity.OrderItem orderItem30 = null;
        order19.add(orderItem30);
        orderItem10.setOrder(order19);
        java.lang.Long long33 = orderItem10.getProductId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(orderItemArray24);
        org.junit.Assert.assertArrayEquals(orderItemArray24, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(long33);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        address0.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = address0.getZipCode();
        address0.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order13 = address0.getOrder();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order11.getOrderItems();
        java.lang.String str14 = order11.getStatus();
        java.util.Date date15 = order11.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str17 = customer16.getFirstName();
        java.lang.Long long18 = customer16.getId();
        order11.setCustomer(customer16);
        com.shittu24.ecommerce.entity.Address address20 = new com.shittu24.ecommerce.entity.Address();
        address20.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str23 = address20.getZipCode();
        java.lang.String str24 = address20.getZipCode();
        order11.setBillingAddress(address20);
        java.lang.String str26 = address20.getStreet();
        address20.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setShippingAddress(address20);
        java.lang.Long long30 = address20.getId();
        java.lang.String str31 = address20.getCountry();
        java.lang.String str32 = address20.getCountry();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str31, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str32, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address7 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address8 = order3.getBillingAddress();
        java.util.Date date9 = null;
        order3.setLastUpdated(date9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.util.Date date12 = null;
        order3.setLastUpdated(date12);
        java.lang.String str14 = order3.getStatus();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        product0.setId((java.lang.Long) 1L);
        java.util.Date date14 = null;
        product0.setLastUpdated(date14);
        java.util.Date date16 = null;
        product0.setDateCreated(date16);
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order21 = null;
        customer20.add(order21);
        com.shittu24.ecommerce.entity.Order order23 = new com.shittu24.ecommerce.entity.Order();
        customer20.add(order23);
        java.util.Date date25 = order23.getDateCreated();
        java.lang.Long long26 = order23.getId();
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order28 = null;
        customer27.add(order28);
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        customer27.add(order30);
        order23.setCustomer(customer27);
        java.lang.String str33 = order23.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer34 = order23.getCustomer();
        com.shittu24.ecommerce.entity.Address address35 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str36 = address35.getCountry();
        java.lang.Long long37 = address35.getId();
        address35.setZipCode("hi!");
        address35.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order42 = address35.getOrder();
        order23.setBillingAddress(address35);
        com.shittu24.ecommerce.entity.Customer customer44 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str45 = customer44.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer46 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet47 = customer46.getOrders();
        customer44.setOrders(orderSet47);
        customer44.setLastName("");
        order23.setCustomer(customer44);
        java.util.Date date52 = null;
        order23.setLastUpdated(date52);
        com.shittu24.ecommerce.entity.Customer customer54 = order23.getCustomer();
        java.lang.Long long55 = customer54.getId();
        com.shittu24.ecommerce.entity.OrderItem orderItem56 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long57 = orderItem56.getProductId();
        orderItem56.setImageUrl("");
        java.lang.Long long60 = orderItem56.getId();
        java.lang.Long long61 = orderItem56.getProductId();
        com.shittu24.ecommerce.entity.Customer customer62 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order63 = null;
        customer62.add(order63);
        com.shittu24.ecommerce.entity.Order order65 = new com.shittu24.ecommerce.entity.Order();
        customer62.add(order65);
        java.util.Date date67 = order65.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem68 = null;
        order65.add(orderItem68);
        orderItem56.setOrder(order65);
        customer54.add(order65);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet72 = customer54.getOrders();
        boolean boolean73 = product0.equals((java.lang.Object) orderSet72);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(customer34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(long37);
        org.junit.Assert.assertNull(order42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderSet47);
        org.junit.Assert.assertNotNull(customer54);
        org.junit.Assert.assertNull(long55);
        org.junit.Assert.assertNull(long57);
        org.junit.Assert.assertNull(long60);
        org.junit.Assert.assertNull(long61);
        org.junit.Assert.assertNull(date67);
        org.junit.Assert.assertNotNull(orderSet72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.lang.Long long4 = orderItem0.getId();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        order5.setOrderTrackingNumber("");
        java.util.Date date9 = null;
        order5.setLastUpdated(date9);
        com.shittu24.ecommerce.entity.Address address11 = order5.getBillingAddress();
        java.lang.String str12 = order5.getOrderTrackingNumber();
        orderItem0.setOrder(order5);
        com.shittu24.ecommerce.entity.Customer customer14 = order5.getCustomer();
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address16 = order15.getBillingAddress();
        order15.setOrderTrackingNumber("");
        java.util.Date date19 = null;
        order15.setLastUpdated(date19);
        com.shittu24.ecommerce.entity.Address address21 = new com.shittu24.ecommerce.entity.Address();
        order15.setBillingAddress(address21);
        java.lang.String str23 = address21.getState();
        java.lang.String str24 = address21.getCountry();
        java.lang.String str25 = address21.getCountry();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        customer26.add(order29);
        java.util.Date date31 = order29.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem32 = null;
        order29.add(orderItem32);
        java.lang.String str34 = order29.getStatus();
        address21.setOrder(order29);
        java.lang.String str36 = address21.getStreet();
        address21.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        address21.setId((java.lang.Long) 10L);
        order5.setBillingAddress(address21);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet42 = order5.getOrderItems();
        order5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(customer14);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(orderItemSet42);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        address0.setStreet("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        orderItem10.setImageUrl("hi!");
        orderItem10.setProductId((java.lang.Long) (-1L));
        java.lang.Long long18 = orderItem10.getId();
        orderItem10.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order21 = orderItem10.getOrder();
        com.shittu24.ecommerce.entity.Customer customer22 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order23 = null;
        customer22.add(order23);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        customer22.add(order25);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet27 = order25.getOrderItems();
        java.math.BigDecimal bigDecimal28 = null;
        order25.setTotalPrice(bigDecimal28);
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address31 = order30.getBillingAddress();
        order30.setOrderTrackingNumber("");
        java.util.Date date34 = null;
        order30.setLastUpdated(date34);
        com.shittu24.ecommerce.entity.Address address36 = new com.shittu24.ecommerce.entity.Address();
        order30.setBillingAddress(address36);
        java.lang.String str38 = address36.getState();
        java.lang.String str39 = address36.getCountry();
        java.lang.String str40 = address36.getState();
        order25.setBillingAddress(address36);
        com.shittu24.ecommerce.entity.Customer customer42 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str43 = customer42.getFirstName();
        java.lang.String str44 = customer42.getEmail();
        customer42.setEmail("");
        java.lang.Long long47 = customer42.getId();
        order25.setCustomer(customer42);
        orderItem10.setOrder(order25);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNotNull(order21);
        org.junit.Assert.assertNotNull(orderItemSet27);
        org.junit.Assert.assertNull(address31);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(long47);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str9 = customer8.getFirstName();
        java.lang.Long long10 = customer8.getId();
        order3.setCustomer(customer8);
        com.shittu24.ecommerce.entity.Address address12 = new com.shittu24.ecommerce.entity.Address();
        address12.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = address12.getZipCode();
        java.lang.String str16 = address12.getZipCode();
        order3.setBillingAddress(address12);
        java.lang.String str18 = address12.getStreet();
        address12.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address12.getCountry();
        address12.setId((java.lang.Long) 10L);
        java.lang.String str24 = address12.getStreet();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str24, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str9 = customer8.getFirstName();
        java.lang.Long long10 = customer8.getId();
        order3.setCustomer(customer8);
        com.shittu24.ecommerce.entity.Address address12 = new com.shittu24.ecommerce.entity.Address();
        address12.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = address12.getZipCode();
        java.lang.String str16 = address12.getZipCode();
        order3.setBillingAddress(address12);
        java.lang.String str18 = address12.getStreet();
        address12.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address12.getCountry();
        com.shittu24.ecommerce.entity.Customer customer22 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order23 = null;
        customer22.add(order23);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        customer22.add(order25);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet27 = order25.getOrderItems();
        java.math.BigDecimal bigDecimal28 = null;
        order25.setTotalPrice(bigDecimal28);
        java.lang.String str30 = order25.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet31 = order25.getOrderItems();
        com.shittu24.ecommerce.entity.Address address32 = order25.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet36 = customer33.getOrders();
        order25.setCustomer(customer33);
        com.shittu24.ecommerce.entity.Address address38 = null;
        order25.setShippingAddress(address38);
        com.shittu24.ecommerce.entity.Address address40 = order25.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address41 = order25.getShippingAddress();
        address12.setOrder(order25);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(orderItemSet31);
        org.junit.Assert.assertNull(address32);
        org.junit.Assert.assertNotNull(orderSet36);
        org.junit.Assert.assertNull(address40);
        org.junit.Assert.assertNull(address41);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        com.shittu24.ecommerce.entity.ProductCategory productCategory9 = null;
        product0.setCategory(productCategory9);
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order7.getOrderItems();
        java.lang.String str10 = order7.getStatus();
        java.util.Date date11 = order7.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray12 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet13, orderItemArray12);
        order7.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet13);
        order7.setTotalQuantity(0);
        com.shittu24.ecommerce.entity.Address address18 = order7.getShippingAddress();
        com.shittu24.ecommerce.entity.Address address19 = order7.getShippingAddress();
        orderItem0.setOrder(order7);
        java.math.BigDecimal bigDecimal21 = order7.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address22 = order7.getShippingAddress();
        java.util.Date date23 = null;
        order7.setLastUpdated(date23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(orderItemArray12);
        org.junit.Assert.assertArrayEquals(orderItemArray12, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(address19);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNull(address22);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        java.math.BigDecimal bigDecimal8 = null;
        order3.setTotalPrice(bigDecimal8);
        java.util.Date date10 = null;
        order3.setLastUpdated(date10);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        java.lang.String str13 = customer7.getEmail();
        java.lang.String str14 = customer7.getFirstName();
        java.lang.String str15 = customer7.getFirstName();
        customer7.setLastName("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        com.shittu24.ecommerce.entity.Customer customer1 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer1.add(order2);
        com.shittu24.ecommerce.entity.Order order4 = new com.shittu24.ecommerce.entity.Order();
        customer1.add(order4);
        java.util.Date date6 = order4.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = null;
        order4.add(orderItem7);
        com.shittu24.ecommerce.entity.Address address9 = null;
        order4.setShippingAddress(address9);
        com.shittu24.ecommerce.entity.OrderItem orderItem11 = new com.shittu24.ecommerce.entity.OrderItem();
        int int12 = orderItem11.getQuantity();
        java.lang.Long long13 = orderItem11.getProductId();
        order4.add(orderItem11);
        orderItem11.setProductId((java.lang.Long) 10L);
        java.lang.String str17 = orderItem11.getImageUrl();
        java.lang.Long long18 = orderItem11.getId();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = null;
        order22.add(orderItem25);
        com.shittu24.ecommerce.entity.Address address27 = null;
        order22.setShippingAddress(address27);
        com.shittu24.ecommerce.entity.OrderItem orderItem29 = new com.shittu24.ecommerce.entity.OrderItem();
        int int30 = orderItem29.getQuantity();
        java.lang.Long long31 = orderItem29.getProductId();
        order22.add(orderItem29);
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        com.shittu24.ecommerce.entity.Order order36 = new com.shittu24.ecommerce.entity.Order();
        customer33.add(order36);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet38 = order36.getOrderItems();
        java.lang.String str39 = order36.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet40 = order36.getOrderItems();
        order22.setOrderItems(orderItemSet40);
        java.math.BigDecimal bigDecimal42 = order22.getTotalPrice();
        orderItem11.setOrder(order22);
        address0.setOrder(order22);
        order22.setStatus("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal47 = null;
        order22.setTotalPrice(bigDecimal47);
        java.math.BigDecimal bigDecimal49 = order22.getTotalPrice();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(orderItemSet38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(orderItemSet40);
        org.junit.Assert.assertNull(bigDecimal42);
        org.junit.Assert.assertNull(bigDecimal49);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.lang.String str12 = order3.getStatus();
        java.util.Date date13 = order3.getDateCreated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str11 = customer10.getFirstName();
        customer10.setId((java.lang.Long) 0L);
        order3.setCustomer(customer10);
        order3.setTotalQuantity((int) (short) -1);
        java.math.BigDecimal bigDecimal17 = null;
        order3.setTotalPrice(bigDecimal17);
        java.util.Date date19 = null;
        order3.setLastUpdated(date19);
        order3.setTotalQuantity((int) (short) 1);
        java.util.Date date23 = null;
        order3.setLastUpdated(date23);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.String str7 = order3.getStatus();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        customer7.setId((java.lang.Long) 100L);
        customer7.setId((java.lang.Long) 10L);
        java.lang.String str17 = customer7.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet18 = customer7.getOrders();
        java.lang.Class<?> wildcardClass19 = orderSet18.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(orderSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.lang.String str3 = customer0.getLastName();
        java.lang.String str4 = customer0.getEmail();
        customer0.setEmail("Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        address0.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setCity("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setUnitsInStock(10);
        com.shittu24.ecommerce.entity.ProductCategory productCategory6 = null;
        product0.setCategory(productCategory6);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        int int5 = product0.getUnitsInStock();
        product0.setSku("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer0.add(order2);
        customer0.setLastName("hi!");
        java.lang.String str6 = customer0.getFirstName();
        java.lang.String str7 = customer0.getLastName();
        customer0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        int int8 = order3.getTotalQuantity();
        com.shittu24.ecommerce.entity.Customer customer9 = order3.getCustomer();
        java.lang.String str10 = customer9.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet11 = customer9.getOrders();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(customer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(orderSet11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setBillingAddress(address8);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str11 = customer10.getFirstName();
        customer10.setFirstName("");
        java.lang.String str14 = customer10.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet15 = customer10.getOrders();
        java.lang.Long long16 = customer10.getId();
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        com.shittu24.ecommerce.entity.Order order20 = new com.shittu24.ecommerce.entity.Order();
        customer17.add(order20);
        java.util.Date date22 = order20.getDateCreated();
        java.lang.Long long23 = order20.getId();
        customer10.add(order20);
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = new com.shittu24.ecommerce.entity.OrderItem();
        int int26 = orderItem25.getQuantity();
        java.math.BigDecimal bigDecimal27 = null;
        orderItem25.setUnitPrice(bigDecimal27);
        com.shittu24.ecommerce.entity.Order order29 = orderItem25.getOrder();
        int int30 = orderItem25.getQuantity();
        java.lang.Long long31 = orderItem25.getId();
        java.lang.Long long32 = orderItem25.getProductId();
        orderItem25.setProductId((java.lang.Long) 100L);
        order20.add(orderItem25);
        order3.add(orderItem25);
        com.shittu24.ecommerce.entity.Order order37 = orderItem25.getOrder();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(orderSet15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(order29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNotNull(order37);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        int int7 = order3.getTotalQuantity();
        java.util.Date date8 = null;
        order3.setLastUpdated(date8);
        java.util.Date date10 = null;
        order3.setDateCreated(date10);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.String str2 = customer0.getEmail();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order11.getOrderItems();
        java.lang.String str14 = order11.getStatus();
        java.util.Date date15 = order11.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str17 = customer16.getFirstName();
        java.lang.Long long18 = customer16.getId();
        order11.setCustomer(customer16);
        com.shittu24.ecommerce.entity.Address address20 = new com.shittu24.ecommerce.entity.Address();
        address20.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str23 = address20.getZipCode();
        java.lang.String str24 = address20.getZipCode();
        order11.setBillingAddress(address20);
        java.lang.String str26 = address20.getStreet();
        address20.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setShippingAddress(address20);
        java.lang.Long long30 = order3.getId();
        java.util.Date date31 = null;
        order3.setDateCreated(date31);
        java.lang.Long long33 = order3.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(long33);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getState();
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = null;
        order13.add(orderItem16);
        com.shittu24.ecommerce.entity.Address address18 = null;
        order13.setBillingAddress(address18);
        java.lang.Long long20 = order13.getId();
        order13.setOrderTrackingNumber("");
        java.util.Date date23 = null;
        order13.setLastUpdated(date23);
        address0.setOrder(order13);
        address0.setId((java.lang.Long) 100L);
        java.lang.String str28 = address0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str28, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        product0.setActive(false);
        product0.setName("hi!");
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        int int12 = product0.getUnitsInStock();
        java.util.Date date13 = product0.getLastUpdated();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order9.getOrderItems();
        java.math.BigDecimal bigDecimal12 = null;
        order9.setTotalPrice(bigDecimal12);
        orderItem0.setOrder(order9);
        int int15 = orderItem0.getQuantity();
        orderItem0.setQuantity((int) '#');
        java.math.BigDecimal bigDecimal18 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(bigDecimal18);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setActive(true);
        java.lang.String str10 = product0.getDescription();
        java.lang.String str11 = product0.toString();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=null, category=null, sku=Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null), name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=35, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=null, category=null, sku=Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null), name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=35, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.lang.String str2 = order0.getOrderTrackingNumber();
        int int3 = order0.getTotalQuantity();
        com.shittu24.ecommerce.entity.OrderItem orderItem4 = new com.shittu24.ecommerce.entity.OrderItem();
        int int5 = orderItem4.getQuantity();
        java.math.BigDecimal bigDecimal6 = null;
        orderItem4.setUnitPrice(bigDecimal6);
        orderItem4.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order13.getOrderItems();
        java.math.BigDecimal bigDecimal16 = null;
        order13.setTotalPrice(bigDecimal16);
        orderItem4.setOrder(order13);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order13.getOrderItems();
        order0.setOrderItems(orderItemSet19);
        int int21 = order0.getTotalQuantity();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getLastName();
        customer0.setEmail("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str5 = customer4.getFirstName();
        customer4.setFirstName("");
        java.lang.String str8 = customer4.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet9 = customer4.getOrders();
        java.lang.Long long10 = customer4.getId();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str12 = customer11.getFirstName();
        customer11.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet15 = customer11.getOrders();
        customer4.setOrders(orderSet15);
        customer0.setOrders(orderSet15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderSet9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(orderSet15);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address11 = order10.getBillingAddress();
        order10.setOrderTrackingNumber("");
        java.util.Date date14 = null;
        order10.setLastUpdated(date14);
        com.shittu24.ecommerce.entity.Address address16 = new com.shittu24.ecommerce.entity.Address();
        order10.setBillingAddress(address16);
        address16.setCountry("");
        order3.setShippingAddress(address16);
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet26 = order24.getOrderItems();
        java.lang.String str27 = order24.getStatus();
        java.lang.Long long28 = order24.getId();
        order24.setTotalQuantity((int) (short) 10);
        address16.setOrder(order24);
        address16.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        address16.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Address address36 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str37 = address36.getCountry();
        com.shittu24.ecommerce.entity.Order order38 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date39 = null;
        order38.setLastUpdated(date39);
        java.math.BigDecimal bigDecimal41 = order38.getTotalPrice();
        java.util.Date date42 = null;
        order38.setLastUpdated(date42);
        address36.setOrder(order38);
        address16.setOrder(order38);
        address16.setStreet("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(bigDecimal41);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.lang.String str6 = product0.getDescription();
        java.lang.String str7 = product0.getDescription();
        product0.setSku("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal6 = null;
        orderItem0.setUnitPrice(bigDecimal6);
        orderItem0.setId((java.lang.Long) 1L);
        orderItem0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        orderItem0.setQuantity((int) 'a');
        orderItem0.setProductId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        java.lang.String str8 = customer0.getEmail();
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setId((java.lang.Long) 10L);
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order14 = null;
        customer13.add(order14);
        com.shittu24.ecommerce.entity.Order order16 = new com.shittu24.ecommerce.entity.Order();
        customer13.add(order16);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order16.getOrderItems();
        java.math.BigDecimal bigDecimal19 = null;
        order16.setTotalPrice(bigDecimal19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address22 = order21.getBillingAddress();
        order21.setOrderTrackingNumber("");
        java.util.Date date25 = null;
        order21.setLastUpdated(date25);
        com.shittu24.ecommerce.entity.Address address27 = new com.shittu24.ecommerce.entity.Address();
        order21.setBillingAddress(address27);
        java.lang.String str29 = address27.getState();
        java.lang.String str30 = address27.getCountry();
        java.lang.String str31 = address27.getState();
        order16.setBillingAddress(address27);
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str34 = customer33.getFirstName();
        java.lang.String str35 = customer33.getEmail();
        customer33.setEmail("");
        java.lang.Long long38 = customer33.getId();
        order16.setCustomer(customer33);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet40 = customer33.getOrders();
        customer0.setOrders(orderSet40);
        customer0.setFirstName("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNotNull(orderSet40);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.lang.String str12 = order3.getStatus();
        order3.setTotalQuantity((int) (short) 10);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Customer customer15 = order10.getCustomer();
        java.math.BigDecimal bigDecimal16 = null;
        order10.setTotalPrice(bigDecimal16);
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet23 = order21.getOrderItems();
        java.util.Date date24 = order21.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer25 = order21.getCustomer();
        order21.setTotalQuantity((int) (byte) 0);
        com.shittu24.ecommerce.entity.Order order28 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address29 = order28.getBillingAddress();
        order28.setOrderTrackingNumber("");
        java.util.Date date32 = null;
        order28.setLastUpdated(date32);
        com.shittu24.ecommerce.entity.Address address34 = new com.shittu24.ecommerce.entity.Address();
        order28.setBillingAddress(address34);
        address34.setCountry("");
        order21.setShippingAddress(address34);
        order10.setBillingAddress(address34);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(customer15);
        org.junit.Assert.assertNotNull(orderItemSet23);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNotNull(customer25);
        org.junit.Assert.assertNull(address29);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        java.util.Date date13 = null;
        product0.setLastUpdated(date13);
        java.lang.String str15 = product0.getDescription();
        java.lang.String str16 = product0.getSku();
        product0.setDescription("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date11 = null;
        product0.setDateCreated(date11);
        com.shittu24.ecommerce.entity.ProductCategory productCategory13 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(productCategory13);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setUnitsInStock((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getCountry();
        java.lang.String str10 = address6.getCountry();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Date date16 = order14.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem17 = null;
        order14.add(orderItem17);
        java.lang.String str19 = order14.getStatus();
        address6.setOrder(order14);
        java.lang.String str21 = address6.getCountry();
        address6.setZipCode("");
        address6.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setLastUpdated(date7);
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        java.util.Date date16 = order12.getLastUpdated();
        java.lang.Long long17 = order12.getId();
        com.shittu24.ecommerce.entity.Address address18 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str19 = address18.getCity();
        address18.setCountry("hi!");
        address18.setState("hi!");
        java.lang.String str24 = address18.getStreet();
        address18.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order12.setBillingAddress(address18);
        address18.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str30 = address18.getCity();
        boolean boolean31 = product0.equals((java.lang.Object) address18);
        java.lang.String str32 = product0.getSku();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str30, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.lang.Long long9 = orderItem7.getProductId();
        com.shittu24.ecommerce.entity.Order order10 = orderItem7.getOrder();
        order3.add(orderItem7);
        java.lang.String str12 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order3.getOrderItems();
        java.util.Date date14 = order3.getLastUpdated();
        order3.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.Address address6 = order3.getShippingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order3.getShippingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet7 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Date date13 = order11.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem14 = null;
        order11.add(orderItem14);
        order11.setOrderTrackingNumber("");
        java.util.Date date18 = order11.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order11.getOrderItems();
        order3.setOrderItems(orderItemSet19);
        java.util.Date date21 = order3.getLastUpdated();
        order3.setStatus("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal24 = null;
        order3.setTotalPrice(bigDecimal24);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order17.getOrderItems();
        java.lang.String str20 = order17.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order17.getOrderItems();
        order3.setOrderItems(orderItemSet21);
        java.math.BigDecimal bigDecimal23 = order3.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address24 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str25 = address24.getCountry();
        java.lang.Long long26 = address24.getId();
        address24.setState("");
        order3.setBillingAddress(address24);
        java.util.Date date30 = null;
        order3.setDateCreated(date30);
        java.util.Date date32 = order3.getLastUpdated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(date32);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setLastName("");
        java.lang.String str5 = customer0.getLastName();
        customer0.setLastName("Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
        java.lang.String str5 = customer0.getLastName();
        java.lang.String str6 = customer0.getFirstName();
        java.lang.Long long7 = customer0.getId();
        com.shittu24.ecommerce.entity.Address address8 = new com.shittu24.ecommerce.entity.Address();
        address8.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str11 = address8.getZipCode();
        java.lang.String str12 = address8.getZipCode();
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address14 = order13.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address15 = order13.getShippingAddress();
        address8.setOrder(order13);
        java.lang.String str17 = address8.getCountry();
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        java.util.Date date23 = order21.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem24 = null;
        order21.add(orderItem24);
        com.shittu24.ecommerce.entity.Address address26 = null;
        order21.setShippingAddress(address26);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet28 = order21.getOrderItems();
        order21.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address8.setOrder(order21);
        customer0.add(order21);
        java.math.BigDecimal bigDecimal33 = null;
        order21.setTotalPrice(bigDecimal33);
        com.shittu24.ecommerce.entity.Address address35 = order21.getBillingAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str17, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(orderItemSet28);
        org.junit.Assert.assertNull(address35);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        int int16 = orderItem13.getQuantity();
        java.math.BigDecimal bigDecimal17 = null;
        orderItem13.setUnitPrice(bigDecimal17);
        orderItem13.setProductId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        customer0.setEmail("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        customer0.setEmail("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        customer0.setEmail("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        customer0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getCountry();
        java.lang.String str10 = address6.getCountry();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Date date16 = order14.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem17 = null;
        order14.add(orderItem17);
        java.lang.String str19 = order14.getStatus();
        address6.setOrder(order14);
        java.lang.String str21 = address6.getCountry();
        java.lang.String str22 = address6.getCountry();
        java.lang.String str23 = address6.getZipCode();
        java.lang.String str24 = address6.getZipCode();
        address6.setCountry("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        com.shittu24.ecommerce.entity.Customer customer1 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer1.add(order2);
        com.shittu24.ecommerce.entity.Order order4 = new com.shittu24.ecommerce.entity.Order();
        customer1.add(order4);
        java.util.Date date6 = order4.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = null;
        order4.add(orderItem7);
        com.shittu24.ecommerce.entity.Address address9 = null;
        order4.setShippingAddress(address9);
        com.shittu24.ecommerce.entity.OrderItem orderItem11 = new com.shittu24.ecommerce.entity.OrderItem();
        int int12 = orderItem11.getQuantity();
        java.lang.Long long13 = orderItem11.getProductId();
        order4.add(orderItem11);
        orderItem11.setProductId((java.lang.Long) 10L);
        java.lang.String str17 = orderItem11.getImageUrl();
        java.lang.Long long18 = orderItem11.getId();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = null;
        order22.add(orderItem25);
        com.shittu24.ecommerce.entity.Address address27 = null;
        order22.setShippingAddress(address27);
        com.shittu24.ecommerce.entity.OrderItem orderItem29 = new com.shittu24.ecommerce.entity.OrderItem();
        int int30 = orderItem29.getQuantity();
        java.lang.Long long31 = orderItem29.getProductId();
        order22.add(orderItem29);
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        com.shittu24.ecommerce.entity.Order order36 = new com.shittu24.ecommerce.entity.Order();
        customer33.add(order36);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet38 = order36.getOrderItems();
        java.lang.String str39 = order36.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet40 = order36.getOrderItems();
        order22.setOrderItems(orderItemSet40);
        java.math.BigDecimal bigDecimal42 = order22.getTotalPrice();
        orderItem11.setOrder(order22);
        address0.setOrder(order22);
        order22.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(orderItemSet38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(orderItemSet40);
        org.junit.Assert.assertNull(bigDecimal42);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        java.util.Date date13 = null;
        product0.setLastUpdated(date13);
        java.lang.String str15 = product0.getDescription();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean18 = product0.isActive();
        java.lang.String str19 = product0.getName();
        java.util.Date date20 = null;
        product0.setLastUpdated(date20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.util.Date date2 = null;
        order0.setDateCreated(date2);
        java.util.Date date4 = order0.getLastUpdated();
        java.lang.String str5 = order0.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        address6.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address6.getZipCode();
        address6.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str12 = address6.getStreet();
        java.lang.String str13 = address6.getCity();
        address6.setZipCode("");
        java.lang.String str16 = address6.getState();
        order0.setBillingAddress(address6);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str16, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        order3.setCustomer(customer7);
        java.lang.Long long10 = customer7.getId();
        java.lang.String str11 = customer7.getFirstName();
        customer7.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.ProductCategory productCategory11 = null;
        product0.setCategory(productCategory11);
        product0.setUnitsInStock(1);
        java.util.Date date15 = null;
        product0.setLastUpdated(date15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setName("");
        java.lang.String str10 = product0.getImageUrl();
        java.math.BigDecimal bigDecimal11 = null;
        product0.setUnitPrice(bigDecimal11);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = product0.toString();
        java.lang.String str16 = product0.getImageUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str16, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        java.lang.String str16 = customer11.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet17 = customer11.getOrders();
        java.lang.String str18 = customer11.getFirstName();
        java.lang.String str19 = customer11.getEmail();
        customer11.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(orderSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order13.getOrderItems();
        java.util.Date date16 = order13.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str18 = customer17.getFirstName();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer17.add(order19);
        java.lang.Long long21 = customer17.getId();
        order13.setCustomer(customer17);
        com.shittu24.ecommerce.entity.OrderItem orderItem23 = new com.shittu24.ecommerce.entity.OrderItem();
        int int24 = orderItem23.getQuantity();
        order13.add(orderItem23);
        com.shittu24.ecommerce.entity.Product product26 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str27 = product26.getSku();
        java.lang.Long long28 = product26.getId();
        product26.setUnitsInStock((int) (byte) -1);
        product26.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int33 = product26.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer34 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order35 = null;
        customer34.add(order35);
        com.shittu24.ecommerce.entity.Order order37 = new com.shittu24.ecommerce.entity.Order();
        customer34.add(order37);
        java.util.Date date39 = order37.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem40 = null;
        order37.add(orderItem40);
        java.util.Date date42 = null;
        order37.setLastUpdated(date42);
        boolean boolean44 = product26.equals((java.lang.Object) order37);
        orderItem23.setOrder(order37);
        order3.add(orderItem23);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order3 = null;
        customer2.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer2.getOrders();
        customer0.setOrders(orderSet5);
        java.lang.String str7 = customer0.getEmail();
        java.lang.String str8 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.lang.String str9 = product0.toString();
        java.util.Date date10 = product0.getLastUpdated();
        java.util.Date date11 = null;
        product0.setDateCreated(date11);
        product0.setId((java.lang.Long) (-1L));
        java.util.Date date15 = product0.getDateCreated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = product0.toString();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setName("");
        java.lang.String str20 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product(id=10, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str20, "Product(id=10, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        java.lang.String str8 = customer0.getEmail();
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setId((java.lang.Long) 10L);
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order14 = null;
        customer13.add(order14);
        com.shittu24.ecommerce.entity.Order order16 = new com.shittu24.ecommerce.entity.Order();
        customer13.add(order16);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order16.getOrderItems();
        java.math.BigDecimal bigDecimal19 = null;
        order16.setTotalPrice(bigDecimal19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address22 = order21.getBillingAddress();
        order21.setOrderTrackingNumber("");
        java.util.Date date25 = null;
        order21.setLastUpdated(date25);
        com.shittu24.ecommerce.entity.Address address27 = new com.shittu24.ecommerce.entity.Address();
        order21.setBillingAddress(address27);
        java.lang.String str29 = address27.getState();
        java.lang.String str30 = address27.getCountry();
        java.lang.String str31 = address27.getState();
        order16.setBillingAddress(address27);
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str34 = customer33.getFirstName();
        java.lang.String str35 = customer33.getEmail();
        customer33.setEmail("");
        java.lang.Long long38 = customer33.getId();
        order16.setCustomer(customer33);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet40 = customer33.getOrders();
        customer0.setOrders(orderSet40);
        customer0.setEmail("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNotNull(orderSet40);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        java.lang.Long long6 = customer0.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order10.getOrderItems();
        java.math.BigDecimal bigDecimal13 = null;
        order10.setTotalPrice(bigDecimal13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address16 = order15.getBillingAddress();
        order15.setOrderTrackingNumber("");
        java.util.Date date19 = null;
        order15.setLastUpdated(date19);
        com.shittu24.ecommerce.entity.Address address21 = new com.shittu24.ecommerce.entity.Address();
        order15.setBillingAddress(address21);
        java.lang.String str23 = address21.getState();
        java.lang.String str24 = address21.getCountry();
        java.lang.String str25 = address21.getState();
        order10.setBillingAddress(address21);
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str28 = customer27.getFirstName();
        java.lang.String str29 = customer27.getEmail();
        customer27.setEmail("");
        java.lang.Long long32 = customer27.getId();
        order10.setCustomer(customer27);
        int int34 = order10.getTotalQuantity();
        customer0.add(order10);
        com.shittu24.ecommerce.entity.Address address36 = null;
        order10.setBillingAddress(address36);
        com.shittu24.ecommerce.entity.Address address38 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str39 = address38.getCity();
        address38.setCountry("hi!");
        address38.setState("hi!");
        java.lang.String str44 = address38.getStreet();
        com.shittu24.ecommerce.entity.Customer customer45 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order46 = null;
        customer45.add(order46);
        com.shittu24.ecommerce.entity.Order order48 = new com.shittu24.ecommerce.entity.Order();
        customer45.add(order48);
        order48.setId((java.lang.Long) 0L);
        address38.setOrder(order48);
        com.shittu24.ecommerce.entity.Order order53 = address38.getOrder();
        com.shittu24.ecommerce.entity.Order order54 = address38.getOrder();
        address38.setState("");
        java.lang.String str57 = address38.getStreet();
        address38.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str60 = address38.getZipCode();
        order10.setShippingAddress(address38);
        address38.setStreet("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str64 = address38.getState();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(order53);
        org.junit.Assert.assertNotNull(order54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str60, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long11 = product0.getId();
        product0.setSku("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str14 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product(id=null, category=null, sku=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str14, "Product(id=null, category=null, sku=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        java.lang.Long long9 = order0.getId();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        java.lang.Long long16 = order13.getId();
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        com.shittu24.ecommerce.entity.Order order20 = new com.shittu24.ecommerce.entity.Order();
        customer17.add(order20);
        order13.setCustomer(customer17);
        com.shittu24.ecommerce.entity.Customer customer23 = order13.getCustomer();
        order0.setCustomer(customer23);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNotNull(customer23);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Order order15 = address0.getOrder();
        address0.setZipCode("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        orderItem10.setProductId((java.lang.Long) 10L);
        java.lang.String str16 = orderItem10.getImageUrl();
        int int17 = orderItem10.getQuantity();
        orderItem10.setQuantity((int) (short) 10);
        java.lang.String str20 = orderItem10.getImageUrl();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        boolean boolean6 = product0.isActive();
        java.lang.String str7 = product0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.lang.String str5 = product0.getSku();
        product0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        java.lang.Long long8 = order3.getId();
        order3.setTotalQuantity((int) '4');
        java.util.Date date11 = null;
        order3.setLastUpdated(date11);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        boolean boolean6 = product0.isActive();
        java.math.BigDecimal bigDecimal7 = product0.getUnitPrice();
        java.util.Date date8 = product0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        java.math.BigDecimal bigDecimal10 = product0.getUnitPrice();
        com.shittu24.ecommerce.entity.ProductCategory productCategory11 = product0.getCategory();
        com.shittu24.ecommerce.entity.ProductCategory productCategory12 = product0.getCategory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(productCategory11);
        org.junit.Assert.assertNull(productCategory12);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Date date11 = order9.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem12 = null;
        order9.add(orderItem12);
        orderItem0.setOrder(order9);
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCity();
        address15.setCountry("hi!");
        address15.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address15.getStreet();
        address15.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        order9.setShippingAddress(address15);
        java.lang.Long long25 = order9.getId();
        java.util.Date date26 = order9.getLastUpdated();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(date26);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order3.getOrderItems();
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer13.getOrders();
        customer13.setEmail("");
        java.lang.String str17 = customer13.getFirstName();
        customer13.setFirstName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setCustomer(customer13);
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Date date26 = order24.getDateCreated();
        java.lang.Long long27 = order24.getId();
        com.shittu24.ecommerce.entity.Customer customer28 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer28.add(order29);
        com.shittu24.ecommerce.entity.Order order31 = new com.shittu24.ecommerce.entity.Order();
        customer28.add(order31);
        order24.setCustomer(customer28);
        com.shittu24.ecommerce.entity.Customer customer34 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order35 = null;
        customer34.add(order35);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet37 = customer34.getOrders();
        customer34.setEmail("");
        customer34.setId((java.lang.Long) 10L);
        java.lang.String str42 = customer34.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet43 = customer34.getOrders();
        customer28.setOrders(orderSet43);
        customer13.setOrders(orderSet43);
        customer13.setLastName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNotNull(orderSet37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(orderSet43);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        java.lang.Long long3 = customer0.getId();
        customer0.setLastName("Product(id=10, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        address0.setId((java.lang.Long) 10L);
        address0.setZipCode("Product(id=null, category=null, sku=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        product0.setName("");
        java.lang.String str12 = product0.getName();
        product0.setDescription("");
        product0.setName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean17 = product0.isActive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = null;
        product0.setCategory(productCategory10);
        java.lang.Long long12 = product0.getId();
        int int13 = product0.getUnitsInStock();
        product0.setActive(true);
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        java.util.Date date11 = product0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.Object obj9 = null;
        boolean boolean10 = product0.equals(obj9);
        java.math.BigDecimal bigDecimal11 = product0.getUnitPrice();
        com.shittu24.ecommerce.entity.ProductCategory productCategory12 = product0.getCategory();
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        java.lang.Long long15 = orderItem13.getProductId();
        com.shittu24.ecommerce.entity.Order order16 = orderItem13.getOrder();
        java.math.BigDecimal bigDecimal17 = null;
        orderItem13.setUnitPrice(bigDecimal17);
        orderItem13.setId((java.lang.Long) 0L);
        orderItem13.setProductId((java.lang.Long) 100L);
        java.lang.String str23 = orderItem13.getImageUrl();
        boolean boolean24 = product0.equals((java.lang.Object) orderItem13);
        java.math.BigDecimal bigDecimal25 = null;
        product0.setUnitPrice(bigDecimal25);
        boolean boolean27 = product0.isActive();
        com.shittu24.ecommerce.entity.ProductCategory productCategory28 = null;
        product0.setCategory(productCategory28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(productCategory12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.util.Date date9 = null;
        product0.setLastUpdated(date9);
        java.math.BigDecimal bigDecimal11 = product0.getUnitPrice();
        java.lang.Class<?> wildcardClass12 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.lang.Long long4 = order0.getId();
        com.shittu24.ecommerce.entity.Address address5 = order0.getBillingAddress();
        order0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.String str2 = orderItem0.getImageUrl();
        java.lang.String str3 = orderItem0.getImageUrl();
        java.lang.String str4 = orderItem0.getImageUrl();
        orderItem0.setProductId((java.lang.Long) 1L);
        orderItem0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.Object obj9 = null;
        boolean boolean10 = product0.equals(obj9);
        java.math.BigDecimal bigDecimal11 = product0.getUnitPrice();
        com.shittu24.ecommerce.entity.ProductCategory productCategory12 = product0.getCategory();
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        java.lang.Long long15 = orderItem13.getProductId();
        com.shittu24.ecommerce.entity.Order order16 = orderItem13.getOrder();
        java.math.BigDecimal bigDecimal17 = null;
        orderItem13.setUnitPrice(bigDecimal17);
        orderItem13.setId((java.lang.Long) 0L);
        orderItem13.setProductId((java.lang.Long) 100L);
        java.lang.String str23 = orderItem13.getImageUrl();
        boolean boolean24 = product0.equals((java.lang.Object) orderItem13);
        java.lang.String str25 = product0.getImageUrl();
        product0.setId((java.lang.Long) 0L);
        product0.setDescription("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(productCategory12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        java.lang.Long long3 = product0.getId();
        java.math.BigDecimal bigDecimal4 = product0.getUnitPrice();
        product0.setDescription("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Order order15 = address0.getOrder();
        com.shittu24.ecommerce.entity.Order order16 = address0.getOrder();
        java.lang.String str17 = address0.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal10 = order3.getTotalPrice();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        boolean boolean8 = product0.isActive();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        int int9 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        java.lang.Long long11 = product0.getId();
        java.lang.Long long12 = product0.getId();
        java.util.Date date13 = null;
        product0.setLastUpdated(date13);
        java.lang.String str15 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(productCategory10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        product0.setSku("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        product0.setUnitsInStock(0);
        com.shittu24.ecommerce.entity.ProductCategory productCategory13 = product0.getCategory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(productCategory13);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = product0.getImageUrl();
        boolean boolean11 = product0.isActive();
        product0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        order3.setId((java.lang.Long) 100L);
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        com.shittu24.ecommerce.entity.Customer customer1 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer1.add(order2);
        com.shittu24.ecommerce.entity.Order order4 = new com.shittu24.ecommerce.entity.Order();
        customer1.add(order4);
        java.util.Date date6 = order4.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = null;
        order4.add(orderItem7);
        com.shittu24.ecommerce.entity.Address address9 = null;
        order4.setShippingAddress(address9);
        com.shittu24.ecommerce.entity.OrderItem orderItem11 = new com.shittu24.ecommerce.entity.OrderItem();
        int int12 = orderItem11.getQuantity();
        java.lang.Long long13 = orderItem11.getProductId();
        order4.add(orderItem11);
        orderItem11.setProductId((java.lang.Long) 10L);
        java.lang.String str17 = orderItem11.getImageUrl();
        java.lang.Long long18 = orderItem11.getId();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = null;
        order22.add(orderItem25);
        com.shittu24.ecommerce.entity.Address address27 = null;
        order22.setShippingAddress(address27);
        com.shittu24.ecommerce.entity.OrderItem orderItem29 = new com.shittu24.ecommerce.entity.OrderItem();
        int int30 = orderItem29.getQuantity();
        java.lang.Long long31 = orderItem29.getProductId();
        order22.add(orderItem29);
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        com.shittu24.ecommerce.entity.Order order36 = new com.shittu24.ecommerce.entity.Order();
        customer33.add(order36);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet38 = order36.getOrderItems();
        java.lang.String str39 = order36.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet40 = order36.getOrderItems();
        order22.setOrderItems(orderItemSet40);
        java.math.BigDecimal bigDecimal42 = order22.getTotalPrice();
        orderItem11.setOrder(order22);
        address0.setOrder(order22);
        java.math.BigDecimal bigDecimal45 = order22.getTotalPrice();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet46 = order22.getOrderItems();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(orderItemSet38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(orderItemSet40);
        org.junit.Assert.assertNull(bigDecimal42);
        org.junit.Assert.assertNull(bigDecimal45);
        org.junit.Assert.assertNotNull(orderItemSet46);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order9.getOrderItems();
        java.math.BigDecimal bigDecimal12 = null;
        order9.setTotalPrice(bigDecimal12);
        orderItem0.setOrder(order9);
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order18.getOrderItems();
        java.util.Date date21 = order18.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer22 = order18.getCustomer();
        order9.setCustomer(customer22);
        com.shittu24.ecommerce.entity.Address address24 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str25 = address24.getCity();
        address24.setCountry("hi!");
        address24.setState("hi!");
        java.lang.String str30 = address24.getStreet();
        com.shittu24.ecommerce.entity.Customer customer31 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order32 = null;
        customer31.add(order32);
        com.shittu24.ecommerce.entity.Order order34 = new com.shittu24.ecommerce.entity.Order();
        customer31.add(order34);
        order34.setId((java.lang.Long) 0L);
        address24.setOrder(order34);
        address24.setId((java.lang.Long) 100L);
        order9.setBillingAddress(address24);
        address24.setState("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(customer22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
        java.lang.String str5 = customer0.getFirstName();
        customer0.setEmail("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date11 = null;
        product0.setDateCreated(date11);
        java.math.BigDecimal bigDecimal13 = null;
        product0.setUnitPrice(bigDecimal13);
        java.lang.String str15 = product0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        order3.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet8 = customer7.getOrders();
        customer7.setLastName("Product(id=null, category=null, sku=Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null), name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNotNull(orderSet8);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str6 = customer0.getFirstName();
        customer0.setFirstName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = customer0.getLastName();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order13.getOrderItems();
        java.lang.String str16 = order13.getStatus();
        java.lang.Long long17 = order13.getId();
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet23 = order21.getOrderItems();
        java.lang.String str24 = order21.getStatus();
        java.util.Date date25 = order21.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str27 = customer26.getFirstName();
        java.lang.Long long28 = customer26.getId();
        order21.setCustomer(customer26);
        com.shittu24.ecommerce.entity.Address address30 = new com.shittu24.ecommerce.entity.Address();
        address30.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str33 = address30.getZipCode();
        java.lang.String str34 = address30.getZipCode();
        order21.setBillingAddress(address30);
        java.lang.String str36 = address30.getStreet();
        address30.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order13.setShippingAddress(address30);
        customer0.add(order13);
        java.math.BigDecimal bigDecimal41 = order13.getTotalPrice();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNotNull(orderItemSet23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(bigDecimal41);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        order3.setTotalQuantity(100);
        java.lang.Long long10 = order3.getId();
        java.lang.String str11 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        orderItem10.setImageUrl("hi!");
        orderItem10.setProductId((java.lang.Long) (-1L));
        java.lang.Long long18 = orderItem10.getId();
        com.shittu24.ecommerce.entity.Order order19 = null;
        orderItem10.setOrder(order19);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        address0.setId((java.lang.Long) 1L);
        address0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str11 = customer10.getFirstName();
        customer10.setId((java.lang.Long) 0L);
        order3.setCustomer(customer10);
        order3.setTotalQuantity((int) (short) -1);
        java.math.BigDecimal bigDecimal17 = null;
        order3.setTotalPrice(bigDecimal17);
        java.util.Date date19 = null;
        order3.setLastUpdated(date19);
        com.shittu24.ecommerce.entity.Address address21 = order3.getBillingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(address21);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address11 = order10.getBillingAddress();
        order10.setOrderTrackingNumber("");
        java.util.Date date14 = null;
        order10.setLastUpdated(date14);
        com.shittu24.ecommerce.entity.Address address16 = new com.shittu24.ecommerce.entity.Address();
        order10.setBillingAddress(address16);
        address16.setCountry("");
        order3.setShippingAddress(address16);
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet26 = order24.getOrderItems();
        java.lang.String str27 = order24.getStatus();
        java.lang.Long long28 = order24.getId();
        order24.setTotalQuantity((int) (short) 10);
        address16.setOrder(order24);
        address16.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        address16.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address16.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address16.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setId((java.lang.Long) 100L);
        java.lang.String str6 = address0.getCity();
        address0.setZipCode("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        java.lang.String str16 = address14.getState();
        java.lang.String str17 = address14.getCountry();
        java.lang.String str18 = address14.getState();
        order3.setBillingAddress(address14);
        java.util.Date date20 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        java.lang.Long long6 = customer0.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order10.getOrderItems();
        java.math.BigDecimal bigDecimal13 = null;
        order10.setTotalPrice(bigDecimal13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address16 = order15.getBillingAddress();
        order15.setOrderTrackingNumber("");
        java.util.Date date19 = null;
        order15.setLastUpdated(date19);
        com.shittu24.ecommerce.entity.Address address21 = new com.shittu24.ecommerce.entity.Address();
        order15.setBillingAddress(address21);
        java.lang.String str23 = address21.getState();
        java.lang.String str24 = address21.getCountry();
        java.lang.String str25 = address21.getState();
        order10.setBillingAddress(address21);
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str28 = customer27.getFirstName();
        java.lang.String str29 = customer27.getEmail();
        customer27.setEmail("");
        java.lang.Long long32 = customer27.getId();
        order10.setCustomer(customer27);
        int int34 = order10.getTotalQuantity();
        customer0.add(order10);
        com.shittu24.ecommerce.entity.Address address36 = null;
        order10.setBillingAddress(address36);
        com.shittu24.ecommerce.entity.Address address38 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str39 = address38.getCity();
        address38.setCountry("hi!");
        address38.setState("hi!");
        java.lang.String str44 = address38.getStreet();
        com.shittu24.ecommerce.entity.Customer customer45 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order46 = null;
        customer45.add(order46);
        com.shittu24.ecommerce.entity.Order order48 = new com.shittu24.ecommerce.entity.Order();
        customer45.add(order48);
        order48.setId((java.lang.Long) 0L);
        address38.setOrder(order48);
        com.shittu24.ecommerce.entity.Order order53 = address38.getOrder();
        com.shittu24.ecommerce.entity.Order order54 = address38.getOrder();
        address38.setState("");
        java.lang.String str57 = address38.getStreet();
        address38.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str60 = address38.getZipCode();
        order10.setShippingAddress(address38);
        com.shittu24.ecommerce.entity.Order order62 = address38.getOrder();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(order53);
        org.junit.Assert.assertNotNull(order54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str60, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(order62);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Order order15 = address0.getOrder();
        com.shittu24.ecommerce.entity.Order order16 = address0.getOrder();
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet22 = customer21.getOrders();
        customer21.setEmail("");
        java.lang.String str25 = customer21.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet26 = customer21.getOrders();
        java.lang.Long long27 = customer21.getId();
        com.shittu24.ecommerce.entity.Customer customer28 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer28.add(order29);
        com.shittu24.ecommerce.entity.Order order31 = new com.shittu24.ecommerce.entity.Order();
        customer28.add(order31);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet33 = order31.getOrderItems();
        java.math.BigDecimal bigDecimal34 = null;
        order31.setTotalPrice(bigDecimal34);
        com.shittu24.ecommerce.entity.Order order36 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address37 = order36.getBillingAddress();
        order36.setOrderTrackingNumber("");
        java.util.Date date40 = null;
        order36.setLastUpdated(date40);
        com.shittu24.ecommerce.entity.Address address42 = new com.shittu24.ecommerce.entity.Address();
        order36.setBillingAddress(address42);
        java.lang.String str44 = address42.getState();
        java.lang.String str45 = address42.getCountry();
        java.lang.String str46 = address42.getState();
        order31.setBillingAddress(address42);
        com.shittu24.ecommerce.entity.Customer customer48 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str49 = customer48.getFirstName();
        java.lang.String str50 = customer48.getEmail();
        customer48.setEmail("");
        java.lang.Long long53 = customer48.getId();
        order31.setCustomer(customer48);
        int int55 = order31.getTotalQuantity();
        customer21.add(order31);
        address0.setOrder(order31);
        address0.setZipCode("Product(id=null, category=null, sku=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertNotNull(orderSet22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet26);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNotNull(orderItemSet33);
        org.junit.Assert.assertNull(address37);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(long53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Date date11 = order9.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem12 = null;
        order9.add(orderItem12);
        orderItem0.setOrder(order9);
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCity();
        address15.setCountry("hi!");
        address15.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address15.getStreet();
        address15.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        order9.setShippingAddress(address15);
        java.lang.Long long25 = order9.getId();
        com.shittu24.ecommerce.entity.Address address26 = order9.getBillingAddress();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address26);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order14 = orderItem13.getOrder();
        boolean boolean15 = product0.equals((java.lang.Object) orderItem13);
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order19.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order19.getOrderItems();
        com.shittu24.ecommerce.entity.Address address23 = order19.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address24 = order19.getBillingAddress();
        java.util.Date date25 = null;
        order19.setLastUpdated(date25);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet27 = order19.getOrderItems();
        orderItem13.setOrder(order19);
        java.util.Date date29 = null;
        order19.setLastUpdated(date29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(address23);
        org.junit.Assert.assertNull(address24);
        org.junit.Assert.assertNotNull(orderItemSet27);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        java.math.BigDecimal bigDecimal10 = product0.getUnitPrice();
        java.math.BigDecimal bigDecimal11 = null;
        product0.setUnitPrice(bigDecimal11);
        boolean boolean13 = product0.isActive();
        java.lang.String str14 = product0.toString();
        java.lang.String str15 = product0.getImageUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str14, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        java.util.Date date8 = null;
        order3.setLastUpdated(date8);
        java.lang.Long long10 = order3.getId();
        java.util.Date date11 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem12 = new com.shittu24.ecommerce.entity.OrderItem();
        int int13 = orderItem12.getQuantity();
        java.math.BigDecimal bigDecimal14 = null;
        orderItem12.setUnitPrice(bigDecimal14);
        int int16 = orderItem12.getQuantity();
        orderItem12.setQuantity((int) (byte) -1);
        java.lang.Long long19 = orderItem12.getProductId();
        java.math.BigDecimal bigDecimal20 = orderItem12.getUnitPrice();
        order3.add(orderItem12);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(bigDecimal20);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        java.lang.String str2 = address0.getZipCode();
        java.lang.String str3 = address0.getCountry();
        java.lang.String str4 = address0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order1 = orderItem0.getOrder();
        int int2 = orderItem0.getQuantity();
        java.lang.Long long3 = orderItem0.getId();
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getId();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str17 = customer16.getFirstName();
        customer16.setFirstName("");
        java.lang.String str20 = customer16.getEmail();
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str22 = customer21.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer23 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order24 = null;
        customer23.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet26 = customer23.getOrders();
        customer21.setOrders(orderSet26);
        customer16.setOrders(orderSet26);
        customer11.setOrders(orderSet26);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet30 = customer11.getOrders();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(orderSet26);
        org.junit.Assert.assertNotNull(orderSet30);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        java.lang.String str4 = address0.getCountry();
        java.lang.Long long5 = address0.getId();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        address6.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address6.getZipCode();
        java.lang.String str10 = address6.getZipCode();
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address12 = order11.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address13 = order11.getShippingAddress();
        address6.setOrder(order11);
        order11.setOrderTrackingNumber("hi!");
        address0.setOrder(order11);
        com.shittu24.ecommerce.entity.Order order18 = address0.getOrder();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet24 = order22.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet25 = order22.getOrderItems();
        com.shittu24.ecommerce.entity.Address address26 = order22.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address27 = order22.getBillingAddress();
        java.util.Date date28 = null;
        order22.setLastUpdated(date28);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet30 = order22.getOrderItems();
        int int31 = order22.getTotalQuantity();
        java.util.Date date32 = null;
        order22.setDateCreated(date32);
        address0.setOrder(order22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNotNull(order18);
        org.junit.Assert.assertNotNull(orderItemSet24);
        org.junit.Assert.assertNotNull(orderItemSet25);
        org.junit.Assert.assertNull(address26);
        org.junit.Assert.assertNull(address27);
        org.junit.Assert.assertNotNull(orderItemSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        java.lang.String str16 = address14.getState();
        java.lang.String str17 = address14.getCountry();
        java.lang.String str18 = address14.getState();
        order3.setBillingAddress(address14);
        java.lang.String str20 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet24 = customer21.getOrders();
        customer21.setEmail("");
        customer21.setEmail("");
        java.lang.Long long29 = customer21.getId();
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date31 = null;
        order30.setLastUpdated(date31);
        java.math.BigDecimal bigDecimal33 = order30.getTotalPrice();
        customer21.add(order30);
        order3.setCustomer(customer21);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Date date41 = order39.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem42 = null;
        order39.add(orderItem42);
        com.shittu24.ecommerce.entity.Address address44 = null;
        order39.setShippingAddress(address44);
        com.shittu24.ecommerce.entity.OrderItem orderItem46 = new com.shittu24.ecommerce.entity.OrderItem();
        int int47 = orderItem46.getQuantity();
        java.lang.Long long48 = orderItem46.getProductId();
        order39.add(orderItem46);
        orderItem46.setProductId((java.lang.Long) 10L);
        java.lang.String str52 = orderItem46.getImageUrl();
        java.lang.String str53 = orderItem46.getImageUrl();
        order3.add(orderItem46);
        com.shittu24.ecommerce.entity.Address address55 = order3.getShippingAddress();
        java.math.BigDecimal bigDecimal56 = null;
        order3.setTotalPrice(bigDecimal56);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderSet24);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(bigDecimal33);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(long48);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(address55);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        orderItem10.setImageUrl("hi!");
        java.math.BigDecimal bigDecimal16 = null;
        orderItem10.setUnitPrice(bigDecimal16);
        orderItem10.setQuantity((int) (short) 10);
        orderItem10.setProductId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = product0.toString();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setId((java.lang.Long) 10L);
        product0.setSku("Product(id=10, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.Object obj9 = null;
        boolean boolean10 = product0.equals(obj9);
        java.util.Date date11 = product0.getLastUpdated();
        int int12 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setBillingAddress(address8);
        com.shittu24.ecommerce.entity.Address address10 = null;
        order3.setShippingAddress(address10);
        java.math.BigDecimal bigDecimal12 = null;
        order3.setTotalPrice(bigDecimal12);
        java.util.Date date14 = null;
        order3.setDateCreated(date14);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Order order15 = address0.getOrder();
        com.shittu24.ecommerce.entity.Order order16 = address0.getOrder();
        java.lang.String str17 = address0.getState();
        java.lang.String str18 = address0.getStreet();
        address0.setZipCode("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        java.lang.String str16 = address14.getState();
        java.lang.String str17 = address14.getCountry();
        java.lang.String str18 = address14.getState();
        order3.setBillingAddress(address14);
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str21 = customer20.getFirstName();
        java.lang.String str22 = customer20.getEmail();
        customer20.setEmail("");
        java.lang.Long long25 = customer20.getId();
        order3.setCustomer(customer20);
        customer20.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address30 = order29.getBillingAddress();
        order29.setOrderTrackingNumber("");
        java.util.Date date33 = null;
        order29.setLastUpdated(date33);
        com.shittu24.ecommerce.entity.Address address35 = new com.shittu24.ecommerce.entity.Address();
        order29.setBillingAddress(address35);
        customer20.add(order29);
        customer20.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet40 = customer20.getOrders();
        java.lang.String str41 = customer20.getFirstName();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNotNull(orderSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str41, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = order3.getShippingAddress();
        order3.setTotalQuantity((int) (short) 0);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.lang.String str9 = product0.toString();
        java.util.Date date10 = product0.getLastUpdated();
        product0.setDescription("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setSku("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        com.shittu24.ecommerce.entity.Product product16 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str17 = product16.getSku();
        java.lang.Long long18 = product16.getId();
        product16.setUnitsInStock((int) (byte) -1);
        product16.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int23 = product16.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order25 = null;
        customer24.add(order25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        customer24.add(order27);
        java.util.Date date29 = order27.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem30 = null;
        order27.add(orderItem30);
        java.util.Date date32 = null;
        order27.setLastUpdated(date32);
        boolean boolean34 = product16.equals((java.lang.Object) order27);
        orderItem13.setOrder(order27);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet41 = order39.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet42 = order39.getOrderItems();
        order27.setOrderItems(orderItemSet42);
        java.util.Date date44 = order27.getDateCreated();
        order27.setStatus("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(orderItemSet41);
        org.junit.Assert.assertNotNull(orderItemSet42);
        org.junit.Assert.assertNull(date44);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        orderItem10.setProductId((java.lang.Long) 10L);
        java.lang.String str16 = orderItem10.getImageUrl();
        java.lang.String str17 = orderItem10.getImageUrl();
        java.lang.Long long18 = orderItem10.getId();
        com.shittu24.ecommerce.entity.Order order19 = orderItem10.getOrder();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNotNull(order19);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order17 = address0.getOrder();
        address0.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setStreet("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order17);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setName("");
        java.lang.String str10 = product0.getImageUrl();
        java.math.BigDecimal bigDecimal11 = null;
        product0.setUnitPrice(bigDecimal11);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = product0.getImageUrl();
        java.util.Date date16 = null;
        product0.setLastUpdated(date16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setActive(true);
        java.lang.String str9 = product0.getSku();
        java.lang.String str10 = product0.toString();
        java.lang.String str11 = product0.getSku();
        java.lang.Long long12 = product0.getId();
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        java.lang.Long long8 = customer0.getId();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet10 = customer9.getOrders();
        customer9.setEmail("");
        java.lang.String str13 = customer9.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer9.getOrders();
        java.lang.Long long15 = customer9.getId();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order19.getOrderItems();
        java.math.BigDecimal bigDecimal22 = null;
        order19.setTotalPrice(bigDecimal22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address25 = order24.getBillingAddress();
        order24.setOrderTrackingNumber("");
        java.util.Date date28 = null;
        order24.setLastUpdated(date28);
        com.shittu24.ecommerce.entity.Address address30 = new com.shittu24.ecommerce.entity.Address();
        order24.setBillingAddress(address30);
        java.lang.String str32 = address30.getState();
        java.lang.String str33 = address30.getCountry();
        java.lang.String str34 = address30.getState();
        order19.setBillingAddress(address30);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str37 = customer36.getFirstName();
        java.lang.String str38 = customer36.getEmail();
        customer36.setEmail("");
        java.lang.Long long41 = customer36.getId();
        order19.setCustomer(customer36);
        int int43 = order19.getTotalQuantity();
        customer9.add(order19);
        com.shittu24.ecommerce.entity.Address address45 = null;
        order19.setBillingAddress(address45);
        com.shittu24.ecommerce.entity.Address address47 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str48 = address47.getCity();
        address47.setCountry("hi!");
        address47.setState("hi!");
        java.lang.String str53 = address47.getStreet();
        com.shittu24.ecommerce.entity.Customer customer54 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order55 = null;
        customer54.add(order55);
        com.shittu24.ecommerce.entity.Order order57 = new com.shittu24.ecommerce.entity.Order();
        customer54.add(order57);
        order57.setId((java.lang.Long) 0L);
        address47.setOrder(order57);
        com.shittu24.ecommerce.entity.Order order62 = address47.getOrder();
        com.shittu24.ecommerce.entity.Order order63 = address47.getOrder();
        address47.setState("");
        java.lang.String str66 = address47.getStreet();
        address47.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str69 = address47.getZipCode();
        order19.setShippingAddress(address47);
        customer0.add(order19);
        java.math.BigDecimal bigDecimal72 = order19.getTotalPrice();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNotNull(orderSet10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(address25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(long41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(order62);
        org.junit.Assert.assertNotNull(order63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str69, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(bigDecimal72);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date13 = null;
        product0.setDateCreated(date13);
        java.lang.String str15 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.lang.String str3 = customer0.getLastName();
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order7.getOrderItems();
        java.util.Date date10 = order7.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer11 = order7.getCustomer();
        order7.setTotalQuantity((int) (byte) 0);
        java.util.Date date14 = null;
        order7.setLastUpdated(date14);
        customer0.add(order7);
        java.util.Date date17 = order7.getLastUpdated();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        int int5 = product0.getUnitsInStock();
        java.lang.String str6 = product0.toString();
        product0.setName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setUnitsInStock((int) (short) 100);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Address address16 = null;
        order3.setShippingAddress(address16);
        order3.setId((java.lang.Long) 10L);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order3.getOrderItems();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNotNull(orderItemSet20);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        java.lang.String str4 = address0.getCountry();
        java.lang.Long long5 = address0.getId();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        address6.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address6.getZipCode();
        java.lang.String str10 = address6.getZipCode();
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address12 = order11.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address13 = order11.getShippingAddress();
        address6.setOrder(order11);
        order11.setOrderTrackingNumber("hi!");
        address0.setOrder(order11);
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(address13);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        int int5 = product0.getUnitsInStock();
        java.lang.String str6 = product0.toString();
        java.lang.String str7 = product0.toString();
        java.util.Date date8 = null;
        product0.setDateCreated(date8);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)" + "'", str7, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address7 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address8 = order3.getBillingAddress();
        java.util.Date date9 = null;
        order3.setLastUpdated(date9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        int int12 = order3.getTotalQuantity();
        java.util.Date date13 = null;
        order3.setDateCreated(date13);
        com.shittu24.ecommerce.entity.Customer customer15 = order3.getCustomer();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(customer15);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer26.getOrders();
        customer24.setOrders(orderSet27);
        customer24.setLastName("");
        order3.setCustomer(customer24);
        java.util.Date date32 = null;
        order3.setLastUpdated(date32);
        java.math.BigDecimal bigDecimal34 = null;
        order3.setTotalPrice(bigDecimal34);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet27);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setLastUpdated(date7);
        product0.setSku("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str11 = product0.getSku();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Order order15 = address0.getOrder();
        com.shittu24.ecommerce.entity.Order order16 = address0.getOrder();
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setId((java.lang.Long) 0L);
        java.lang.String str21 = address0.getZipCode();
        java.lang.String str22 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str22, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        customer7.setId((java.lang.Long) 1L);
        customer7.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer7.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        java.lang.Long long6 = customer0.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order10.getOrderItems();
        java.math.BigDecimal bigDecimal13 = null;
        order10.setTotalPrice(bigDecimal13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address16 = order15.getBillingAddress();
        order15.setOrderTrackingNumber("");
        java.util.Date date19 = null;
        order15.setLastUpdated(date19);
        com.shittu24.ecommerce.entity.Address address21 = new com.shittu24.ecommerce.entity.Address();
        order15.setBillingAddress(address21);
        java.lang.String str23 = address21.getState();
        java.lang.String str24 = address21.getCountry();
        java.lang.String str25 = address21.getState();
        order10.setBillingAddress(address21);
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str28 = customer27.getFirstName();
        java.lang.String str29 = customer27.getEmail();
        customer27.setEmail("");
        java.lang.Long long32 = customer27.getId();
        order10.setCustomer(customer27);
        int int34 = order10.getTotalQuantity();
        customer0.add(order10);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str37 = customer36.getFirstName();
        customer36.setFirstName("");
        java.lang.String str40 = customer36.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet41 = customer36.getOrders();
        java.lang.Long long42 = customer36.getId();
        com.shittu24.ecommerce.entity.Customer customer43 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str44 = customer43.getFirstName();
        customer43.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet47 = customer43.getOrders();
        customer36.setOrders(orderSet47);
        customer0.setOrders(orderSet47);
        customer0.setFirstName("");
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str54 = customer0.getEmail();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(orderSet41);
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(orderSet47);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Customer customer15 = order10.getCustomer();
        java.math.BigDecimal bigDecimal16 = null;
        order10.setTotalPrice(bigDecimal16);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order10.getOrderItems();
        java.util.Date date19 = order10.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(customer15);
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Date date11 = order9.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem12 = null;
        order9.add(orderItem12);
        orderItem0.setOrder(order9);
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCity();
        address15.setCountry("hi!");
        address15.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address15.getStreet();
        address15.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        order9.setShippingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer25 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order26 = null;
        customer25.add(order26);
        com.shittu24.ecommerce.entity.Order order28 = new com.shittu24.ecommerce.entity.Order();
        customer25.add(order28);
        java.util.Date date30 = order28.getDateCreated();
        java.lang.Long long31 = order28.getId();
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer32.add(order33);
        com.shittu24.ecommerce.entity.Order order35 = new com.shittu24.ecommerce.entity.Order();
        customer32.add(order35);
        order28.setCustomer(customer32);
        com.shittu24.ecommerce.entity.Customer customer38 = order28.getCustomer();
        order9.setCustomer(customer38);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(customer38);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        int int6 = orderItem0.getQuantity();
        java.lang.Long long7 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal8 = null;
        orderItem0.setUnitPrice(bigDecimal8);
        orderItem0.setImageUrl("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order7.getOrderItems();
        java.lang.String str10 = order7.getStatus();
        java.util.Date date11 = order7.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray12 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet13, orderItemArray12);
        order7.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet13);
        order7.setTotalQuantity(0);
        com.shittu24.ecommerce.entity.Address address18 = order7.getShippingAddress();
        com.shittu24.ecommerce.entity.Address address19 = order7.getShippingAddress();
        orderItem0.setOrder(order7);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address22 = order21.getBillingAddress();
        order21.setOrderTrackingNumber("");
        java.util.Date date25 = null;
        order21.setLastUpdated(date25);
        com.shittu24.ecommerce.entity.Address address27 = new com.shittu24.ecommerce.entity.Address();
        order21.setBillingAddress(address27);
        java.lang.String str29 = address27.getState();
        java.lang.String str30 = address27.getCountry();
        java.lang.String str31 = address27.getState();
        java.lang.Long long32 = address27.getId();
        com.shittu24.ecommerce.entity.Order order33 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address34 = order33.getBillingAddress();
        order33.setOrderTrackingNumber("");
        order33.setOrderTrackingNumber("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address27.setOrder(order33);
        order7.setShippingAddress(address27);
        order7.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(orderItemArray12);
        org.junit.Assert.assertArrayEquals(orderItemArray12, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(address19);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNull(address34);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setFirstName("");
        java.lang.String str4 = customer0.getEmail();
        com.shittu24.ecommerce.entity.Customer customer5 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order6 = null;
        customer5.add(order6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        customer5.add(order8);
        java.util.Date date10 = order8.getDateCreated();
        java.lang.Long long11 = order8.getId();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        order8.setCustomer(customer12);
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet21 = customer18.getOrders();
        customer18.setEmail("");
        customer18.setId((java.lang.Long) 10L);
        java.lang.String str26 = customer18.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer18.getOrders();
        customer12.setOrders(orderSet27);
        customer0.setOrders(orderSet27);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(orderSet21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(orderSet27);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        java.lang.String str11 = product0.getSku();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.util.Date date2 = null;
        order0.setDateCreated(date2);
        java.util.Date date4 = order0.getLastUpdated();
        java.lang.String str5 = order0.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Address address6 = order0.getShippingAddress();
        int int7 = order0.getTotalQuantity();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order17.getOrderItems();
        java.lang.String str20 = order17.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order17.getOrderItems();
        order3.setOrderItems(orderItemSet21);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet23 = order3.getOrderItems();
        java.util.Date date24 = order3.getDateCreated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNotNull(orderItemSet23);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        java.util.Date date15 = order10.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getBillingAddress();
        java.util.Date date7 = order0.getLastUpdated();
        java.util.Date date8 = null;
        order0.setLastUpdated(date8);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order13.getOrderItems();
        java.lang.String str16 = order13.getStatus();
        java.lang.Long long17 = order13.getId();
        java.util.Date date18 = null;
        order13.setLastUpdated(date18);
        java.lang.String str20 = order13.getStatus();
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address22 = order21.getBillingAddress();
        order21.setOrderTrackingNumber("");
        java.util.Date date25 = null;
        order21.setLastUpdated(date25);
        com.shittu24.ecommerce.entity.Address address27 = new com.shittu24.ecommerce.entity.Address();
        order21.setBillingAddress(address27);
        java.lang.String str29 = address27.getState();
        java.lang.String str30 = address27.getCountry();
        java.lang.String str31 = address27.getCountry();
        java.lang.String str32 = address27.getCity();
        java.lang.String str33 = address27.getCity();
        order13.setShippingAddress(address27);
        com.shittu24.ecommerce.entity.Order order35 = address27.getOrder();
        address27.setStreet("hi!");
        order0.setShippingAddress(address27);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(order35);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        java.lang.String str9 = customer2.getEmail();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = null;
        order13.add(orderItem16);
        com.shittu24.ecommerce.entity.Address address18 = null;
        order13.setShippingAddress(address18);
        com.shittu24.ecommerce.entity.OrderItem orderItem20 = new com.shittu24.ecommerce.entity.OrderItem();
        int int21 = orderItem20.getQuantity();
        java.lang.Long long22 = orderItem20.getProductId();
        order13.add(orderItem20);
        orderItem20.setProductId((java.lang.Long) 10L);
        java.lang.String str26 = orderItem20.getImageUrl();
        java.lang.Long long27 = orderItem20.getId();
        com.shittu24.ecommerce.entity.Customer customer28 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer28.add(order29);
        com.shittu24.ecommerce.entity.Order order31 = new com.shittu24.ecommerce.entity.Order();
        customer28.add(order31);
        java.util.Date date33 = order31.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem34 = null;
        order31.add(orderItem34);
        com.shittu24.ecommerce.entity.Address address36 = null;
        order31.setShippingAddress(address36);
        com.shittu24.ecommerce.entity.OrderItem orderItem38 = new com.shittu24.ecommerce.entity.OrderItem();
        int int39 = orderItem38.getQuantity();
        java.lang.Long long40 = orderItem38.getProductId();
        order31.add(orderItem38);
        com.shittu24.ecommerce.entity.Customer customer42 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order43 = null;
        customer42.add(order43);
        com.shittu24.ecommerce.entity.Order order45 = new com.shittu24.ecommerce.entity.Order();
        customer42.add(order45);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet47 = order45.getOrderItems();
        java.lang.String str48 = order45.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet49 = order45.getOrderItems();
        order31.setOrderItems(orderItemSet49);
        java.math.BigDecimal bigDecimal51 = order31.getTotalPrice();
        orderItem20.setOrder(order31);
        order31.setTotalQuantity((int) 'a');
        com.shittu24.ecommerce.entity.Customer customer55 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order56 = null;
        customer55.add(order56);
        com.shittu24.ecommerce.entity.Order order58 = new com.shittu24.ecommerce.entity.Order();
        customer55.add(order58);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet60 = order58.getOrderItems();
        java.util.Date date61 = order58.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer62 = order58.getCustomer();
        customer62.setId((java.lang.Long) 1L);
        order31.setCustomer(customer62);
        customer2.add(order31);
        java.lang.String str67 = customer2.getEmail();
        customer2.setId((java.lang.Long) 100L);
        java.lang.String str70 = customer2.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNotNull(orderItemSet47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(orderItemSet49);
        org.junit.Assert.assertNull(bigDecimal51);
        org.junit.Assert.assertNotNull(orderItemSet60);
        org.junit.Assert.assertNull(date61);
        org.junit.Assert.assertNotNull(customer62);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order25 = null;
        customer24.add(order25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        customer24.add(order27);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet29 = order27.getOrderItems();
        java.math.BigDecimal bigDecimal30 = null;
        order27.setTotalPrice(bigDecimal30);
        java.lang.String str32 = order27.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet33 = order27.getOrderItems();
        com.shittu24.ecommerce.entity.Address address34 = order27.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer35 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order36 = null;
        customer35.add(order36);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet38 = customer35.getOrders();
        order27.setCustomer(customer35);
        com.shittu24.ecommerce.entity.Address address40 = order27.getBillingAddress();
        java.math.BigDecimal bigDecimal41 = null;
        order27.setTotalPrice(bigDecimal41);
        address15.setOrder(order27);
        com.shittu24.ecommerce.entity.OrderItem orderItem44 = null;
        order27.add(orderItem44);
        java.util.Date date46 = order27.getLastUpdated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNotNull(orderItemSet29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(orderItemSet33);
        org.junit.Assert.assertNull(address34);
        org.junit.Assert.assertNotNull(orderSet38);
        org.junit.Assert.assertNull(address40);
        org.junit.Assert.assertNull(date46);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str12 = customer11.getFirstName();
        java.lang.Long long13 = customer11.getId();
        customer11.setFirstName("");
        java.lang.String str16 = customer11.getLastName();
        java.lang.String str17 = customer11.getFirstName();
        java.lang.Long long18 = customer11.getId();
        com.shittu24.ecommerce.entity.Address address19 = new com.shittu24.ecommerce.entity.Address();
        address19.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str22 = address19.getZipCode();
        java.lang.String str23 = address19.getZipCode();
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address25 = order24.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address26 = order24.getShippingAddress();
        address19.setOrder(order24);
        java.lang.String str28 = address19.getCountry();
        com.shittu24.ecommerce.entity.Customer customer29 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order30 = null;
        customer29.add(order30);
        com.shittu24.ecommerce.entity.Order order32 = new com.shittu24.ecommerce.entity.Order();
        customer29.add(order32);
        java.util.Date date34 = order32.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem35 = null;
        order32.add(orderItem35);
        com.shittu24.ecommerce.entity.Address address37 = null;
        order32.setShippingAddress(address37);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet39 = order32.getOrderItems();
        order32.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address19.setOrder(order32);
        customer11.add(order32);
        boolean boolean44 = product0.equals((java.lang.Object) customer11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(address25);
        org.junit.Assert.assertNull(address26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str28, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertNotNull(orderItemSet39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        address6.setOrder(order12);
        address6.setZipCode("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setState("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Customer customer1 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str2 = customer1.getFirstName();
        customer1.setFirstName("");
        java.lang.String str5 = customer1.getEmail();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str7 = customer6.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet11 = customer8.getOrders();
        customer6.setOrders(orderSet11);
        customer1.setOrders(orderSet11);
        customer0.setOrders(orderSet11);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str16 = order15.getStatus();
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str18 = customer17.getFirstName();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer17.add(order19);
        customer17.setLastName("hi!");
        order15.setCustomer(customer17);
        com.shittu24.ecommerce.entity.Address address24 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str25 = address24.getCity();
        address24.setCountry("hi!");
        order15.setBillingAddress(address24);
        customer0.add(order15);
        java.lang.String str30 = customer0.getLastName();
        java.lang.String str31 = customer0.getEmail();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(orderSet11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order25 = null;
        customer24.add(order25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        customer24.add(order27);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet29 = order27.getOrderItems();
        java.math.BigDecimal bigDecimal30 = null;
        order27.setTotalPrice(bigDecimal30);
        java.lang.String str32 = order27.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet33 = order27.getOrderItems();
        com.shittu24.ecommerce.entity.Address address34 = order27.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer35 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order36 = null;
        customer35.add(order36);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet38 = customer35.getOrders();
        order27.setCustomer(customer35);
        com.shittu24.ecommerce.entity.Address address40 = order27.getBillingAddress();
        java.math.BigDecimal bigDecimal41 = null;
        order27.setTotalPrice(bigDecimal41);
        address15.setOrder(order27);
        com.shittu24.ecommerce.entity.Address address44 = order27.getShippingAddress();
        java.math.BigDecimal bigDecimal45 = order27.getTotalPrice();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNotNull(orderItemSet29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(orderItemSet33);
        org.junit.Assert.assertNull(address34);
        org.junit.Assert.assertNotNull(orderSet38);
        org.junit.Assert.assertNull(address40);
        org.junit.Assert.assertNull(address44);
        org.junit.Assert.assertNull(bigDecimal45);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        com.shittu24.ecommerce.entity.Address address9 = order5.getShippingAddress();
        java.lang.String str10 = order5.getStatus();
        com.shittu24.ecommerce.entity.Address address11 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.util.Date date18 = order15.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str20 = customer19.getFirstName();
        com.shittu24.ecommerce.entity.Order order21 = null;
        customer19.add(order21);
        java.lang.Long long23 = customer19.getId();
        order15.setCustomer(customer19);
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = new com.shittu24.ecommerce.entity.OrderItem();
        int int26 = orderItem25.getQuantity();
        order15.add(orderItem25);
        java.lang.Long long28 = orderItem25.getId();
        order5.add(orderItem25);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(long28);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.OrderItem orderItem1 = new com.shittu24.ecommerce.entity.OrderItem();
        int int2 = orderItem1.getQuantity();
        orderItem1.setId((java.lang.Long) 10L);
        java.lang.String str5 = orderItem1.getImageUrl();
        boolean boolean6 = product0.equals((java.lang.Object) orderItem1);
        product0.setName("hi!");
        java.lang.String str9 = product0.getName();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(productCategory10);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        order3.setStatus("");
        com.shittu24.ecommerce.entity.Address address11 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.lang.String str18 = order15.getStatus();
        java.util.Date date19 = order15.getLastUpdated();
        java.lang.Long long20 = order15.getId();
        order15.setStatus("hi!");
        com.shittu24.ecommerce.entity.Address address23 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str24 = address23.getCity();
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date26 = null;
        order25.setLastUpdated(date26);
        java.math.BigDecimal bigDecimal28 = order25.getTotalPrice();
        address23.setOrder(order25);
        com.shittu24.ecommerce.entity.OrderItem orderItem30 = new com.shittu24.ecommerce.entity.OrderItem();
        int int31 = orderItem30.getQuantity();
        java.math.BigDecimal bigDecimal32 = null;
        orderItem30.setUnitPrice(bigDecimal32);
        orderItem30.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal36 = null;
        orderItem30.setUnitPrice(bigDecimal36);
        order25.add(orderItem30);
        order15.add(orderItem30);
        order3.add(orderItem30);
        java.math.BigDecimal bigDecimal41 = orderItem30.getUnitPrice();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(bigDecimal41);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.util.Date date2 = null;
        order0.setDateCreated(date2);
        java.util.Date date4 = order0.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer5 = order0.getCustomer();
        java.lang.String str6 = order0.getOrderTrackingNumber();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Order order15 = address0.getOrder();
        java.lang.String str16 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setStatus("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date4 = order0.getDateCreated();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        boolean boolean10 = product0.equals((java.lang.Object) 1.0f);
        java.lang.String str11 = product0.getDescription();
        product0.setDescription("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        java.lang.String str16 = address14.getState();
        java.lang.String str17 = address14.getCountry();
        java.lang.String str18 = address14.getState();
        order3.setBillingAddress(address14);
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str21 = customer20.getFirstName();
        java.lang.String str22 = customer20.getEmail();
        customer20.setEmail("");
        java.lang.Long long25 = customer20.getId();
        order3.setCustomer(customer20);
        order3.setId((java.lang.Long) 0L);
        java.util.Date date29 = null;
        order3.setDateCreated(date29);
        java.util.Date date31 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(date31);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer10 = order3.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet11 = customer10.getOrders();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.math.BigDecimal bigDecimal18 = null;
        order15.setTotalPrice(bigDecimal18);
        java.lang.String str20 = order15.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order15.getOrderItems();
        com.shittu24.ecommerce.entity.Address address22 = order15.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer23 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order24 = null;
        customer23.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet26 = customer23.getOrders();
        order15.setCustomer(customer23);
        com.shittu24.ecommerce.entity.Address address28 = null;
        order15.setShippingAddress(address28);
        order15.setId((java.lang.Long) 10L);
        java.lang.String str32 = order15.getStatus();
        customer10.add(order15);
        int int34 = order15.getTotalQuantity();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNotNull(orderSet11);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNotNull(orderSet26);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        java.lang.String str11 = product0.getName();
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Class<?> wildcardClass14 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.lang.String str12 = order3.getOrderTrackingNumber();
        java.util.Date date13 = order3.getLastUpdated();
        java.lang.String str14 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.OrderItem orderItem15 = new com.shittu24.ecommerce.entity.OrderItem();
        int int16 = orderItem15.getQuantity();
        java.math.BigDecimal bigDecimal17 = null;
        orderItem15.setUnitPrice(bigDecimal17);
        com.shittu24.ecommerce.entity.Order order19 = orderItem15.getOrder();
        int int20 = orderItem15.getQuantity();
        com.shittu24.ecommerce.entity.Order order21 = orderItem15.getOrder();
        orderItem15.setId((java.lang.Long) 1L);
        int int24 = orderItem15.getQuantity();
        order3.add(orderItem15);
        com.shittu24.ecommerce.entity.Address address26 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str27 = address26.getCity();
        address26.setCountry("hi!");
        address26.setState("hi!");
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer32.add(order33);
        com.shittu24.ecommerce.entity.Order order35 = new com.shittu24.ecommerce.entity.Order();
        customer32.add(order35);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet37 = order35.getOrderItems();
        java.lang.String str38 = order35.getStatus();
        java.util.Date date39 = order35.getLastUpdated();
        java.math.BigDecimal bigDecimal40 = null;
        order35.setTotalPrice(bigDecimal40);
        address26.setOrder(order35);
        com.shittu24.ecommerce.entity.Address address43 = order35.getShippingAddress();
        orderItem15.setOrder(order35);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(orderItemSet37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNull(address43);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.Customer customer10 = order3.getCustomer();
        java.util.Date date11 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address12 = order3.getBillingAddress();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("hi!");
        java.lang.String str6 = customer0.getFirstName();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        order3.setId((java.lang.Long) 100L);
        java.util.Date date18 = order3.getDateCreated();
        order3.setTotalQuantity((int) (byte) 0);
        order3.setStatus("Product(id=10, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setActive(false);
        com.shittu24.ecommerce.entity.ProductCategory productCategory6 = null;
        product0.setCategory(productCategory6);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getLastName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet2 = customer0.getOrders();
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer3.add(order4);
        com.shittu24.ecommerce.entity.Order order6 = new com.shittu24.ecommerce.entity.Order();
        customer3.add(order6);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet8 = order6.getOrderItems();
        com.shittu24.ecommerce.entity.Address address9 = new com.shittu24.ecommerce.entity.Address();
        address9.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str12 = address9.getZipCode();
        java.lang.String str13 = address9.getZipCode();
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address15 = order14.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address16 = order14.getShippingAddress();
        address9.setOrder(order14);
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet23 = order21.getOrderItems();
        java.lang.String str24 = order21.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet25 = order21.getOrderItems();
        order14.setOrderItems(orderItemSet25);
        order6.setOrderItems(orderItemSet25);
        com.shittu24.ecommerce.entity.Order order28 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address29 = order28.getBillingAddress();
        order28.setOrderTrackingNumber("");
        java.util.Date date32 = null;
        order28.setLastUpdated(date32);
        com.shittu24.ecommerce.entity.Address address34 = new com.shittu24.ecommerce.entity.Address();
        order28.setBillingAddress(address34);
        java.lang.String str36 = address34.getState();
        java.lang.String str37 = address34.getCountry();
        order6.setShippingAddress(address34);
        customer0.add(order6);
        customer0.setEmail("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet2);
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNotNull(orderItemSet23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(orderItemSet25);
        org.junit.Assert.assertNull(address29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        java.util.Date date13 = null;
        product0.setLastUpdated(date13);
        java.lang.String str15 = product0.getDescription();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int18 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.lang.Long long9 = orderItem7.getProductId();
        com.shittu24.ecommerce.entity.Order order10 = orderItem7.getOrder();
        order3.add(orderItem7);
        java.util.Date date12 = null;
        order3.setDateCreated(date12);
        java.math.BigDecimal bigDecimal14 = order3.getTotalPrice();
        java.util.Date date15 = order3.getDateCreated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(bigDecimal14);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setId((java.lang.Long) 1L);
        java.lang.String str8 = product0.getImageUrl();
        product0.setSku("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        product0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.util.Date date5 = product0.getLastUpdated();
        java.lang.String str6 = product0.getName();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = null;
        product0.setCategory(productCategory7);
        product0.setActive(true);
        java.lang.String str11 = product0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Address address16 = null;
        order3.setShippingAddress(address16);
        com.shittu24.ecommerce.entity.Address address18 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str20 = customer19.getFirstName();
        com.shittu24.ecommerce.entity.Order order21 = null;
        customer19.add(order21);
        customer19.setLastName("hi!");
        order3.setCustomer(customer19);
        java.lang.String str26 = customer19.getEmail();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal11 = null;
        product0.setUnitPrice(bigDecimal11);
        java.lang.String str13 = product0.getName();
        product0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        address0.setOrder(order10);
        com.shittu24.ecommerce.entity.Customer customer15 = order10.getCustomer();
        java.math.BigDecimal bigDecimal16 = null;
        order10.setTotalPrice(bigDecimal16);
        order10.setOrderTrackingNumber("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int20 = order10.getTotalQuantity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(customer15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order14 = orderItem13.getOrder();
        boolean boolean15 = product0.equals((java.lang.Object) orderItem13);
        orderItem13.setId((java.lang.Long) (-1L));
        java.math.BigDecimal bigDecimal18 = orderItem13.getUnitPrice();
        java.lang.Long long19 = orderItem13.getProductId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bigDecimal18);
        org.junit.Assert.assertNull(long19);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setLastName("");
        java.lang.String str5 = customer0.getLastName();
        java.lang.String str6 = customer0.getFirstName();
        java.lang.Class<?> wildcardClass7 = customer0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        com.shittu24.ecommerce.entity.Order order7 = address0.getOrder();
        com.shittu24.ecommerce.entity.Order order8 = address0.getOrder();
        address0.setZipCode("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.lang.String str9 = product0.toString();
        java.util.Date date10 = product0.getLastUpdated();
        product0.setDescription("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        java.math.BigDecimal bigDecimal14 = null;
        order3.setTotalPrice(bigDecimal14);
        com.shittu24.ecommerce.entity.Address address16 = order3.getShippingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(address16);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        java.util.Date date13 = null;
        product0.setLastUpdated(date13);
        product0.setDescription("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setUnitsInStock((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        java.lang.Long long8 = order3.getId();
        com.shittu24.ecommerce.entity.Address address9 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str10 = address9.getCity();
        address9.setCountry("hi!");
        address9.setState("hi!");
        java.lang.String str15 = address9.getStreet();
        address9.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setBillingAddress(address9);
        java.lang.String str19 = address9.getCity();
        java.lang.String str20 = address9.getZipCode();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str19, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.lang.String str5 = product0.getSku();
        java.lang.String str6 = product0.toString();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = null;
        product0.setCategory(productCategory7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        java.lang.Long long16 = order3.getId();
        com.shittu24.ecommerce.entity.Address address17 = order3.getBillingAddress();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(address17);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer26.getOrders();
        customer24.setOrders(orderSet27);
        customer24.setLastName("");
        order3.setCustomer(customer24);
        java.util.Date date32 = null;
        order3.setLastUpdated(date32);
        com.shittu24.ecommerce.entity.Customer customer34 = order3.getCustomer();
        java.lang.Long long35 = customer34.getId();
        java.lang.String str36 = customer34.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer37 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str38 = customer37.getFirstName();
        customer37.setFirstName("");
        java.lang.String str41 = customer37.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet42 = customer37.getOrders();
        java.lang.Long long43 = customer37.getId();
        com.shittu24.ecommerce.entity.Customer customer44 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order45 = null;
        customer44.add(order45);
        com.shittu24.ecommerce.entity.Order order47 = new com.shittu24.ecommerce.entity.Order();
        customer44.add(order47);
        java.util.Date date49 = order47.getDateCreated();
        java.lang.Long long50 = order47.getId();
        customer37.add(order47);
        java.lang.String str52 = order47.getOrderTrackingNumber();
        order47.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order47.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer34.add(order47);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet27);
        org.junit.Assert.assertNotNull(customer34);
        org.junit.Assert.assertNull(long35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(orderSet42);
        org.junit.Assert.assertNull(long43);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNull(long50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        orderItem10.setImageUrl("hi!");
        java.math.BigDecimal bigDecimal16 = null;
        orderItem10.setUnitPrice(bigDecimal16);
        orderItem10.setId((java.lang.Long) 10L);
        java.math.BigDecimal bigDecimal20 = null;
        orderItem10.setUnitPrice(bigDecimal20);
        orderItem10.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order24 = orderItem10.getOrder();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(order24);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        java.lang.Long long11 = product0.getId();
        java.lang.String str12 = product0.getImageUrl();
        boolean boolean13 = product0.isActive();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(productCategory10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        java.lang.Long long11 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.math.BigDecimal bigDecimal18 = null;
        order15.setTotalPrice(bigDecimal18);
        java.lang.String str20 = order15.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order15.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer22 = order15.getCustomer();
        com.shittu24.ecommerce.entity.Customer customer23 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order24 = null;
        customer23.add(order24);
        com.shittu24.ecommerce.entity.Order order26 = new com.shittu24.ecommerce.entity.Order();
        customer23.add(order26);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet28 = order26.getOrderItems();
        java.lang.String str29 = order26.getStatus();
        java.util.Date date30 = order26.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address31 = null;
        order26.setShippingAddress(address31);
        java.lang.String str33 = order26.getOrderTrackingNumber();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet34 = order26.getOrderItems();
        order15.setOrderItems(orderItemSet34);
        order3.setOrderItems(orderItemSet34);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNotNull(customer22);
        org.junit.Assert.assertNotNull(orderItemSet28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(orderItemSet34);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        product0.setActive(false);
        java.lang.Long long8 = product0.getId();
        java.lang.String str9 = product0.getImageUrl();
        java.util.Date date10 = product0.getDateCreated();
        java.util.Date date11 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.ProductCategory productCategory12 = null;
        product0.setCategory(productCategory12);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setCountry("hi!");
        address0.setZipCode("hi!");
        java.lang.Long long10 = address0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        java.lang.String str10 = order3.getStatus();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Date date16 = order14.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem17 = null;
        order14.add(orderItem17);
        order14.setOrderTrackingNumber("");
        java.util.Date date21 = order14.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order14.getOrderItems();
        java.lang.String str23 = order14.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet24 = order14.getOrderItems();
        order3.setOrderItems(orderItemSet24);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(orderItemSet24);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getLastName();
        java.lang.String str7 = customer0.getEmail();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        order3.setTotalQuantity((int) (short) 10);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = null;
        order13.add(orderItem16);
        com.shittu24.ecommerce.entity.Address address18 = null;
        order13.setShippingAddress(address18);
        com.shittu24.ecommerce.entity.OrderItem orderItem20 = new com.shittu24.ecommerce.entity.OrderItem();
        int int21 = orderItem20.getQuantity();
        java.lang.Long long22 = orderItem20.getProductId();
        order13.add(orderItem20);
        orderItem20.setProductId((java.lang.Long) 10L);
        java.lang.String str26 = orderItem20.getImageUrl();
        int int27 = orderItem20.getQuantity();
        order3.add(orderItem20);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet29 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer30 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str31 = customer30.getFirstName();
        java.lang.String str32 = customer30.getEmail();
        customer30.setEmail("");
        customer30.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setCustomer(customer30);
        java.lang.String str38 = customer30.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet39 = customer30.getOrders();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(orderItemSet29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(orderSet39);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        boolean boolean9 = product0.isActive();
        java.lang.String str10 = product0.getSku();
        product0.setUnitsInStock((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        java.lang.String str16 = customer11.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet17 = customer11.getOrders();
        java.lang.Long long18 = customer11.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(orderSet17);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = null;
        product0.setCategory(productCategory10);
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        java.util.Date date19 = order17.getDateCreated();
        java.lang.Long long20 = order17.getId();
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        order17.setCustomer(customer21);
        java.lang.String str27 = order17.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer28 = order17.getCustomer();
        com.shittu24.ecommerce.entity.Address address29 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str30 = address29.getCountry();
        java.lang.Long long31 = address29.getId();
        address29.setZipCode("hi!");
        address29.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order36 = address29.getOrder();
        order17.setBillingAddress(address29);
        com.shittu24.ecommerce.entity.Customer customer38 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order39 = null;
        customer38.add(order39);
        com.shittu24.ecommerce.entity.Order order41 = new com.shittu24.ecommerce.entity.Order();
        customer38.add(order41);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet43 = order41.getOrderItems();
        java.math.BigDecimal bigDecimal44 = null;
        order41.setTotalPrice(bigDecimal44);
        java.lang.String str46 = order41.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet47 = order41.getOrderItems();
        com.shittu24.ecommerce.entity.Address address48 = order41.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer49 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order50 = null;
        customer49.add(order50);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet52 = customer49.getOrders();
        order41.setCustomer(customer49);
        com.shittu24.ecommerce.entity.Address address54 = order41.getBillingAddress();
        java.math.BigDecimal bigDecimal55 = null;
        order41.setTotalPrice(bigDecimal55);
        address29.setOrder(order41);
        com.shittu24.ecommerce.entity.Address address58 = order41.getBillingAddress();
        boolean boolean59 = product0.equals((java.lang.Object) order41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(customer28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNull(order36);
        org.junit.Assert.assertNotNull(orderItemSet43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(orderItemSet47);
        org.junit.Assert.assertNull(address48);
        org.junit.Assert.assertNotNull(orderSet52);
        org.junit.Assert.assertNull(address54);
        org.junit.Assert.assertNull(address58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        java.util.Date date8 = null;
        order3.setDateCreated(date8);
        order3.setStatus("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Address address12 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer13 = order3.getCustomer();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNotNull(customer13);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order11.getOrderItems();
        java.lang.String str14 = order11.getStatus();
        java.util.Date date15 = order11.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str17 = customer16.getFirstName();
        java.lang.Long long18 = customer16.getId();
        order11.setCustomer(customer16);
        com.shittu24.ecommerce.entity.Address address20 = new com.shittu24.ecommerce.entity.Address();
        address20.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str23 = address20.getZipCode();
        java.lang.String str24 = address20.getZipCode();
        order11.setBillingAddress(address20);
        java.lang.String str26 = address20.getStreet();
        address20.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setShippingAddress(address20);
        address20.setId((java.lang.Long) 10L);
        address20.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        java.lang.String str9 = customer2.getFirstName();
        customer2.setLastName("hi!");
        java.lang.String str12 = customer2.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.lang.Long long9 = orderItem7.getProductId();
        com.shittu24.ecommerce.entity.Order order10 = orderItem7.getOrder();
        order3.add(orderItem7);
        com.shittu24.ecommerce.entity.Address address12 = order3.getShippingAddress();
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str14 = customer13.getFirstName();
        java.lang.Long long15 = customer13.getId();
        java.lang.String str16 = customer13.getEmail();
        order3.setCustomer(customer13);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet18 = customer13.getOrders();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(orderSet18);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        orderItem10.setImageUrl("hi!");
        orderItem10.setProductId((java.lang.Long) (-1L));
        java.lang.Long long18 = orderItem10.getId();
        orderItem10.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order21 = orderItem10.getOrder();
        order21.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNotNull(order21);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setStatus("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Address address4 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str5 = address4.getCity();
        address4.setCountry("hi!");
        address4.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address4.setZipCode("");
        order0.setBillingAddress(address4);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        boolean boolean9 = product0.isActive();
        java.util.Date date10 = product0.getDateCreated();
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        product0.setName("");
        product0.setName("Product(id=null, category=null, sku=Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null), name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        customer0.setLastName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order9.getOrderItems();
        java.math.BigDecimal bigDecimal12 = null;
        order9.setTotalPrice(bigDecimal12);
        orderItem0.setOrder(order9);
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str16 = customer15.getFirstName();
        java.lang.String str17 = customer15.getEmail();
        order9.setCustomer(customer15);
        java.lang.Long long19 = order9.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long19);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet10 = customer0.getOrders();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNotNull(orderSet10);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        int int9 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        java.lang.Long long11 = product0.getId();
        java.lang.Long long12 = product0.getId();
        java.lang.String str13 = product0.getImageUrl();
        java.util.Date date14 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(productCategory10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.String str2 = orderItem0.getImageUrl();
        java.lang.String str3 = orderItem0.getImageUrl();
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        java.lang.Long long10 = order3.getId();
        java.util.Date date11 = null;
        order3.setLastUpdated(date11);
        order3.setOrderTrackingNumber("hi!");
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Date date20 = order18.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem21 = null;
        order18.add(orderItem21);
        com.shittu24.ecommerce.entity.Address address23 = null;
        order18.setShippingAddress(address23);
        com.shittu24.ecommerce.entity.Customer customer25 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str26 = customer25.getFirstName();
        customer25.setId((java.lang.Long) 0L);
        order18.setCustomer(customer25);
        order3.setCustomer(customer25);
        java.lang.String str31 = customer25.getFirstName();
        customer25.setLastName("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer25.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        java.util.Date date4 = null;
        product0.setLastUpdated(date4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order1 = orderItem0.getOrder();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order3 = null;
        customer2.add(order3);
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        customer2.add(order5);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet7 = order5.getOrderItems();
        java.lang.String str8 = order5.getStatus();
        java.util.Date date9 = order5.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address10 = null;
        order5.setShippingAddress(address10);
        orderItem0.setOrder(order5);
        java.lang.Long long13 = orderItem0.getId();
        com.shittu24.ecommerce.entity.Order order14 = orderItem0.getOrder();
        orderItem0.setImageUrl("");
        java.lang.Long long17 = orderItem0.getProductId();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNotNull(order14);
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.ProductCategory productCategory8 = null;
        product0.setCategory(productCategory8);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.math.BigDecimal bigDecimal9 = null;
        orderItem7.setUnitPrice(bigDecimal9);
        com.shittu24.ecommerce.entity.Order order11 = orderItem7.getOrder();
        int int12 = orderItem7.getQuantity();
        com.shittu24.ecommerce.entity.Order order13 = orderItem7.getOrder();
        orderItem7.setId((java.lang.Long) 1L);
        orderItem7.setQuantity((int) (short) 1);
        order3.add(orderItem7);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        com.shittu24.ecommerce.entity.Product product16 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str17 = product16.getSku();
        java.lang.Long long18 = product16.getId();
        product16.setUnitsInStock((int) (byte) -1);
        product16.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int23 = product16.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order25 = null;
        customer24.add(order25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        customer24.add(order27);
        java.util.Date date29 = order27.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem30 = null;
        order27.add(orderItem30);
        java.util.Date date32 = null;
        order27.setLastUpdated(date32);
        boolean boolean34 = product16.equals((java.lang.Object) order27);
        orderItem13.setOrder(order27);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet41 = order39.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet42 = order39.getOrderItems();
        order27.setOrderItems(orderItemSet42);
        order27.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(orderItemSet41);
        org.junit.Assert.assertNotNull(orderItemSet42);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        address6.setCountry("");
        address6.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str12 = address6.getZipCode();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        address0.setOrder(order2);
        order2.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = order2.getDateCreated();
        order2.setTotalQuantity((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        product0.setUnitsInStock(97);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Customer customer1 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str2 = customer1.getFirstName();
        customer1.setFirstName("");
        java.lang.String str5 = customer1.getEmail();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str7 = customer6.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet11 = customer8.getOrders();
        customer6.setOrders(orderSet11);
        customer1.setOrders(orderSet11);
        customer0.setOrders(orderSet11);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str16 = order15.getStatus();
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str18 = customer17.getFirstName();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer17.add(order19);
        customer17.setLastName("hi!");
        order15.setCustomer(customer17);
        com.shittu24.ecommerce.entity.Address address24 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str25 = address24.getCity();
        address24.setCountry("hi!");
        order15.setBillingAddress(address24);
        customer0.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet30 = customer0.getOrders();
        java.lang.String str31 = customer0.getLastName();
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer32.add(order33);
        com.shittu24.ecommerce.entity.Order order35 = new com.shittu24.ecommerce.entity.Order();
        customer32.add(order35);
        java.lang.String str37 = order35.getOrderTrackingNumber();
        customer0.add(order35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(orderSet11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setId((java.lang.Long) 1L);
        java.lang.String str8 = product0.getImageUrl();
        java.lang.String str9 = product0.getImageUrl();
        product0.setActive(false);
        java.lang.String str12 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray8 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet9, orderItemArray8);
        order3.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet9);
        order3.setTotalQuantity(0);
        com.shittu24.ecommerce.entity.OrderItem orderItem14 = null;
        order3.add(orderItem14);
        com.shittu24.ecommerce.entity.Order order16 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address17 = order16.getBillingAddress();
        order16.setOrderTrackingNumber("");
        java.util.Date date20 = null;
        order16.setLastUpdated(date20);
        com.shittu24.ecommerce.entity.Address address22 = new com.shittu24.ecommerce.entity.Address();
        order16.setBillingAddress(address22);
        address22.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setShippingAddress(address22);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(address17);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        java.lang.Long long16 = orderItem13.getId();
        java.lang.String str17 = orderItem13.getImageUrl();
        java.lang.String str18 = orderItem13.getImageUrl();
        com.shittu24.ecommerce.entity.Order order19 = orderItem13.getOrder();
        order19.setOrderTrackingNumber("");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(order19);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        java.lang.String str8 = address0.getZipCode();
        address0.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order11 = address0.getOrder();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setId((java.lang.Long) (-1L));
        product0.setUnitsInStock((int) (short) 100);
        int int10 = product0.getUnitsInStock();
        product0.setUnitsInStock(10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.Object obj9 = null;
        boolean boolean10 = product0.equals(obj9);
        product0.setName("hi!");
        java.util.Date date13 = product0.getLastUpdated();
        java.util.Date date14 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.Class<?> wildcardClass4 = product0.getClass();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        java.lang.Object obj3 = null;
        boolean boolean4 = product0.equals(obj3);
        product0.setSku("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Class<?> wildcardClass9 = product0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Address address11 = new com.shittu24.ecommerce.entity.Address();
        address11.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str14 = address11.getZipCode();
        address11.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        com.shittu24.ecommerce.entity.Order order20 = new com.shittu24.ecommerce.entity.Order();
        customer17.add(order20);
        java.util.Date date22 = order20.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem23 = null;
        order20.add(orderItem23);
        order20.setOrderTrackingNumber("");
        java.util.Date date27 = order20.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet28 = order20.getOrderItems();
        address11.setOrder(order20);
        boolean boolean30 = product0.equals((java.lang.Object) address11);
        java.util.Date date31 = null;
        product0.setDateCreated(date31);
        product0.setSku("");
        java.util.Date date35 = null;
        product0.setLastUpdated(date35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(orderItemSet28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.lang.String str9 = product0.getName();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.lang.String str5 = order3.getStatus();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        address6.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address6.getZipCode();
        order3.setBillingAddress(address6);
        com.shittu24.ecommerce.entity.Order order11 = address6.getOrder();
        address6.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.util.Date date2 = null;
        order0.setDateCreated(date2);
        int int4 = order0.getTotalQuantity();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        com.shittu24.ecommerce.entity.Product product16 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str17 = product16.getSku();
        java.lang.Long long18 = product16.getId();
        product16.setUnitsInStock((int) (byte) -1);
        product16.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int23 = product16.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order25 = null;
        customer24.add(order25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        customer24.add(order27);
        java.util.Date date29 = order27.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem30 = null;
        order27.add(orderItem30);
        java.util.Date date32 = null;
        order27.setLastUpdated(date32);
        boolean boolean34 = product16.equals((java.lang.Object) order27);
        orderItem13.setOrder(order27);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet41 = order39.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet42 = order39.getOrderItems();
        order27.setOrderItems(orderItemSet42);
        com.shittu24.ecommerce.entity.Order order44 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address45 = order44.getBillingAddress();
        order44.setOrderTrackingNumber("");
        java.util.Date date48 = null;
        order44.setLastUpdated(date48);
        com.shittu24.ecommerce.entity.Address address50 = new com.shittu24.ecommerce.entity.Address();
        order44.setBillingAddress(address50);
        address50.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer54 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order55 = null;
        customer54.add(order55);
        com.shittu24.ecommerce.entity.Order order57 = new com.shittu24.ecommerce.entity.Order();
        customer54.add(order57);
        java.util.Date date59 = order57.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem60 = null;
        order57.add(orderItem60);
        com.shittu24.ecommerce.entity.Address address62 = null;
        order57.setShippingAddress(address62);
        com.shittu24.ecommerce.entity.Customer customer64 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str65 = customer64.getFirstName();
        customer64.setId((java.lang.Long) 0L);
        order57.setCustomer(customer64);
        order57.setTotalQuantity((int) (short) -1);
        java.math.BigDecimal bigDecimal71 = null;
        order57.setTotalPrice(bigDecimal71);
        address50.setOrder(order57);
        java.util.Date date74 = null;
        order57.setDateCreated(date74);
        com.shittu24.ecommerce.entity.Customer customer76 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str77 = customer76.getFirstName();
        com.shittu24.ecommerce.entity.Order order78 = null;
        customer76.add(order78);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet80 = customer76.getOrders();
        order57.setCustomer(customer76);
        customer76.setFirstName("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order27.setCustomer(customer76);
        java.lang.String str85 = order27.getOrderTrackingNumber();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(orderItemSet41);
        org.junit.Assert.assertNotNull(orderItemSet42);
        org.junit.Assert.assertNull(address45);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(orderSet80);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        java.util.Date date8 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setActive(false);
        java.math.BigDecimal bigDecimal5 = null;
        product0.setUnitPrice(bigDecimal5);
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        product0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        java.lang.String str5 = address0.getState();
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setActive(true);
        product0.setName("");
        boolean boolean11 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        java.lang.Long long8 = customer0.getId();
        java.lang.Long long9 = customer0.getId();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal5 = null;
        orderItem0.setUnitPrice(bigDecimal5);
        orderItem0.setQuantity((int) (byte) -1);
        orderItem0.setId((java.lang.Long) 10L);
        java.math.BigDecimal bigDecimal11 = null;
        orderItem0.setUnitPrice(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        java.lang.String str16 = address14.getState();
        java.lang.String str17 = address14.getCountry();
        java.lang.String str18 = address14.getState();
        order3.setBillingAddress(address14);
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str21 = customer20.getFirstName();
        java.lang.String str22 = customer20.getEmail();
        customer20.setEmail("");
        java.lang.Long long25 = customer20.getId();
        order3.setCustomer(customer20);
        java.lang.Long long27 = order3.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(long27);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getCountry();
        java.lang.String str10 = address6.getCountry();
        address6.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str13 = address6.getZipCode();
        java.lang.String str14 = address6.getStreet();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str14, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setActive(true);
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        product0.setUnitsInStock((int) 'a');
        product0.setDescription("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean16 = product0.isActive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order9.getOrderItems();
        java.math.BigDecimal bigDecimal12 = null;
        order9.setTotalPrice(bigDecimal12);
        orderItem0.setOrder(order9);
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str16 = customer15.getFirstName();
        java.lang.String str17 = customer15.getEmail();
        order9.setCustomer(customer15);
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = null;
        order22.add(orderItem25);
        java.util.Date date27 = null;
        order22.setDateCreated(date27);
        java.util.Date date29 = null;
        order22.setLastUpdated(date29);
        com.shittu24.ecommerce.entity.Address address31 = order22.getShippingAddress();
        customer15.add(order22);
        customer15.setEmail("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(address31);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        java.util.Date date8 = null;
        order3.setLastUpdated(date8);
        java.math.BigDecimal bigDecimal10 = null;
        order3.setTotalPrice(bigDecimal10);
        java.util.Date date12 = null;
        order3.setLastUpdated(date12);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        int int6 = orderItem0.getQuantity();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        java.util.Date date12 = order10.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = null;
        order10.add(orderItem13);
        com.shittu24.ecommerce.entity.Address address15 = null;
        order10.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Address address17 = order10.getShippingAddress();
        order10.setStatus("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        orderItem0.setOrder(order10);
        java.lang.String str21 = orderItem0.getImageUrl();
        orderItem0.setProductId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(address17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        int int2 = order0.getTotalQuantity();
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer3.add(order4);
        com.shittu24.ecommerce.entity.Order order6 = new com.shittu24.ecommerce.entity.Order();
        customer3.add(order6);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet8 = order6.getOrderItems();
        java.math.BigDecimal bigDecimal9 = null;
        order6.setTotalPrice(bigDecimal9);
        java.lang.String str11 = order6.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order6.getOrderItems();
        com.shittu24.ecommerce.entity.Address address13 = order6.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet17 = customer14.getOrders();
        order6.setCustomer(customer14);
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str20 = customer19.getFirstName();
        customer19.setFirstName("");
        java.lang.String str23 = customer19.getEmail();
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet29 = customer26.getOrders();
        customer24.setOrders(orderSet29);
        customer19.setOrders(orderSet29);
        customer14.setOrders(orderSet29);
        order0.setCustomer(customer14);
        customer14.setFirstName("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str36 = customer14.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNotNull(orderSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet29);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        int int16 = orderItem13.getQuantity();
        orderItem13.setId((java.lang.Long) (-1L));
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet24 = order22.getOrderItems();
        java.math.BigDecimal bigDecimal25 = null;
        order22.setTotalPrice(bigDecimal25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address28 = order27.getBillingAddress();
        order27.setOrderTrackingNumber("");
        java.util.Date date31 = null;
        order27.setLastUpdated(date31);
        com.shittu24.ecommerce.entity.Address address33 = new com.shittu24.ecommerce.entity.Address();
        order27.setBillingAddress(address33);
        java.lang.String str35 = address33.getState();
        java.lang.String str36 = address33.getCountry();
        java.lang.String str37 = address33.getState();
        order22.setBillingAddress(address33);
        java.lang.String str39 = order22.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer40 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order41 = null;
        customer40.add(order41);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet43 = customer40.getOrders();
        customer40.setEmail("");
        customer40.setEmail("");
        java.lang.Long long48 = customer40.getId();
        com.shittu24.ecommerce.entity.Order order49 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date50 = null;
        order49.setLastUpdated(date50);
        java.math.BigDecimal bigDecimal52 = order49.getTotalPrice();
        customer40.add(order49);
        order22.setCustomer(customer40);
        com.shittu24.ecommerce.entity.Customer customer55 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order56 = null;
        customer55.add(order56);
        com.shittu24.ecommerce.entity.Order order58 = new com.shittu24.ecommerce.entity.Order();
        customer55.add(order58);
        java.util.Date date60 = order58.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem61 = null;
        order58.add(orderItem61);
        com.shittu24.ecommerce.entity.Address address63 = null;
        order58.setShippingAddress(address63);
        com.shittu24.ecommerce.entity.OrderItem orderItem65 = new com.shittu24.ecommerce.entity.OrderItem();
        int int66 = orderItem65.getQuantity();
        java.lang.Long long67 = orderItem65.getProductId();
        order58.add(orderItem65);
        orderItem65.setProductId((java.lang.Long) 10L);
        java.lang.String str71 = orderItem65.getImageUrl();
        java.lang.String str72 = orderItem65.getImageUrl();
        order22.add(orderItem65);
        com.shittu24.ecommerce.entity.Address address74 = null;
        order22.setShippingAddress(address74);
        java.util.Date date76 = null;
        order22.setDateCreated(date76);
        orderItem13.setOrder(order22);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(orderItemSet24);
        org.junit.Assert.assertNull(address28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(orderSet43);
        org.junit.Assert.assertNull(long48);
        org.junit.Assert.assertNull(bigDecimal52);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        int int9 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        java.lang.Long long11 = product0.getId();
        java.lang.Long long12 = product0.getId();
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str14 = customer13.getLastName();
        java.lang.Long long15 = customer13.getId();
        boolean boolean16 = product0.equals((java.lang.Object) customer13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(productCategory10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.Product product6 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean8 = product6.equals((java.lang.Object) 1.0f);
        product6.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory11 = product6.getCategory();
        java.lang.String str12 = product6.getImageUrl();
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order14 = null;
        customer13.add(order14);
        com.shittu24.ecommerce.entity.Order order16 = new com.shittu24.ecommerce.entity.Order();
        customer13.add(order16);
        order16.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Address address20 = new com.shittu24.ecommerce.entity.Address();
        address20.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str23 = address20.getZipCode();
        java.lang.String str24 = address20.getZipCode();
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address26 = order25.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address27 = order25.getShippingAddress();
        address20.setOrder(order25);
        com.shittu24.ecommerce.entity.Customer customer29 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order30 = null;
        customer29.add(order30);
        com.shittu24.ecommerce.entity.Order order32 = new com.shittu24.ecommerce.entity.Order();
        customer29.add(order32);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet34 = order32.getOrderItems();
        java.lang.String str35 = order32.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet36 = order32.getOrderItems();
        order25.setOrderItems(orderItemSet36);
        order16.setOrderItems(orderItemSet36);
        boolean boolean39 = product6.equals((java.lang.Object) orderItemSet36);
        order3.setOrderItems(orderItemSet36);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(productCategory11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(address26);
        org.junit.Assert.assertNull(address27);
        org.junit.Assert.assertNotNull(orderItemSet34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(orderItemSet36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getBillingAddress();
        java.util.Date date7 = order0.getLastUpdated();
        java.util.Date date8 = null;
        order0.setLastUpdated(date8);
        com.shittu24.ecommerce.entity.Address address10 = order0.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address11 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str12 = address11.getCity();
        address11.setCountry("hi!");
        address11.setState("hi!");
        java.lang.String str17 = address11.getStreet();
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        order21.setId((java.lang.Long) 0L);
        address11.setOrder(order21);
        com.shittu24.ecommerce.entity.Order order26 = address11.getOrder();
        com.shittu24.ecommerce.entity.Order order27 = address11.getOrder();
        address11.setState("");
        order0.setShippingAddress(address11);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertNotNull(order27);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        product0.setId((java.lang.Long) 10L);
        java.util.Date date11 = product0.getDateCreated();
        java.lang.String str12 = product0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=10, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=10, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Date date21 = order19.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem22 = null;
        order19.add(orderItem22);
        customer11.add(order19);
        customer11.setLastName("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer11.getOrders();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(orderSet27);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        address6.setOrder(order12);
        address6.setZipCode("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setCity("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        order3.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) ' ');
        org.junit.Assert.assertNotNull(customer7);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getCountry();
        java.lang.String str10 = address6.getState();
        java.lang.Long long11 = address6.getId();
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address13 = order12.getBillingAddress();
        order12.setOrderTrackingNumber("");
        order12.setOrderTrackingNumber("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setOrder(order12);
        int int19 = order12.getTotalQuantity();
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order21 = null;
        customer20.add(order21);
        com.shittu24.ecommerce.entity.Order order23 = new com.shittu24.ecommerce.entity.Order();
        customer20.add(order23);
        java.util.Date date25 = order23.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem26 = null;
        order23.add(orderItem26);
        com.shittu24.ecommerce.entity.Address address28 = null;
        order23.setShippingAddress(address28);
        com.shittu24.ecommerce.entity.OrderItem orderItem30 = new com.shittu24.ecommerce.entity.OrderItem();
        int int31 = orderItem30.getQuantity();
        java.lang.Long long32 = orderItem30.getProductId();
        order23.add(orderItem30);
        com.shittu24.ecommerce.entity.Customer customer34 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order35 = null;
        customer34.add(order35);
        com.shittu24.ecommerce.entity.Order order37 = new com.shittu24.ecommerce.entity.Order();
        customer34.add(order37);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet39 = order37.getOrderItems();
        java.lang.String str40 = order37.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet41 = order37.getOrderItems();
        order23.setOrderItems(orderItemSet41);
        java.math.BigDecimal bigDecimal43 = order23.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address44 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str45 = address44.getCountry();
        java.lang.Long long46 = address44.getId();
        address44.setState("");
        order23.setBillingAddress(address44);
        java.util.Date date50 = order23.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer51 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order52 = null;
        customer51.add(order52);
        com.shittu24.ecommerce.entity.Order order54 = new com.shittu24.ecommerce.entity.Order();
        customer51.add(order54);
        java.util.Date date56 = order54.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem57 = null;
        order54.add(orderItem57);
        order54.setOrderTrackingNumber("");
        java.util.Date date61 = order54.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order62 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address63 = order62.getBillingAddress();
        order62.setOrderTrackingNumber("");
        java.util.Date date66 = null;
        order62.setLastUpdated(date66);
        com.shittu24.ecommerce.entity.Address address68 = new com.shittu24.ecommerce.entity.Address();
        order62.setBillingAddress(address68);
        java.lang.String str70 = address68.getState();
        java.lang.String str71 = address68.getCountry();
        java.lang.String str72 = address68.getCountry();
        java.lang.String str73 = address68.getCity();
        java.lang.String str74 = address68.getCity();
        order54.setBillingAddress(address68);
        address68.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order23.setBillingAddress(address68);
        order12.setShippingAddress(address68);
        address68.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNotNull(orderItemSet39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(orderItemSet41);
        org.junit.Assert.assertNull(bigDecimal43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(long46);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertNull(date61);
        org.junit.Assert.assertNull(address63);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str9 = customer8.getFirstName();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer8.add(order10);
        customer8.setLastName("hi!");
        order3.setCustomer(customer8);
        java.util.Date date15 = order3.getLastUpdated();
        java.util.Date date16 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        address14.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setBillingAddress(address14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address20 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str21 = address20.getCity();
        address20.setCountry("hi!");
        address20.setState("hi!");
        java.lang.String str26 = address20.getStreet();
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order28 = null;
        customer27.add(order28);
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        customer27.add(order30);
        order30.setId((java.lang.Long) 0L);
        address20.setOrder(order30);
        com.shittu24.ecommerce.entity.Order order35 = address20.getOrder();
        com.shittu24.ecommerce.entity.Order order36 = address20.getOrder();
        address20.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address20.setId((java.lang.Long) 0L);
        java.lang.String str41 = address20.getZipCode();
        order3.setBillingAddress(address20);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertNotNull(order36);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order25 = null;
        customer24.add(order25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        customer24.add(order27);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet29 = order27.getOrderItems();
        java.math.BigDecimal bigDecimal30 = null;
        order27.setTotalPrice(bigDecimal30);
        java.lang.String str32 = order27.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet33 = order27.getOrderItems();
        com.shittu24.ecommerce.entity.Address address34 = order27.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer35 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order36 = null;
        customer35.add(order36);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet38 = customer35.getOrders();
        order27.setCustomer(customer35);
        com.shittu24.ecommerce.entity.Address address40 = order27.getBillingAddress();
        java.math.BigDecimal bigDecimal41 = null;
        order27.setTotalPrice(bigDecimal41);
        address15.setOrder(order27);
        java.lang.String str44 = address15.getCountry();
        com.shittu24.ecommerce.entity.Order order45 = address15.getOrder();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNotNull(orderItemSet29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(orderItemSet33);
        org.junit.Assert.assertNull(address34);
        org.junit.Assert.assertNotNull(orderSet38);
        org.junit.Assert.assertNull(address40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(order45);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        customer11.setId((java.lang.Long) 100L);
        customer11.setLastName("hi!");
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str21 = customer20.getFirstName();
        java.lang.String str22 = customer20.getEmail();
        java.lang.String str23 = customer20.getFirstName();
        customer20.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet26 = customer20.getOrders();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer20.getOrders();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet28 = customer20.getOrders();
        customer11.setOrders(orderSet28);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(orderSet26);
        org.junit.Assert.assertNotNull(orderSet27);
        org.junit.Assert.assertNotNull(orderSet28);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        address6.setOrder(order12);
        address6.setZipCode("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address6.getCity();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setName("");
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.ProductCategory productCategory8 = product0.getCategory();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(productCategory8);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        product0.setUnitsInStock((-1));
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        java.lang.String str16 = address14.getState();
        java.lang.String str17 = address14.getCountry();
        java.lang.String str18 = address14.getState();
        java.lang.String str19 = address14.getCountry();
        boolean boolean20 = product0.equals((java.lang.Object) address14);
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet26 = order24.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet27 = order24.getOrderItems();
        com.shittu24.ecommerce.entity.Address address28 = order24.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address29 = order24.getBillingAddress();
        java.util.Date date30 = null;
        order24.setLastUpdated(date30);
        int int32 = order24.getTotalQuantity();
        java.lang.String str33 = order24.getOrderTrackingNumber();
        address14.setOrder(order24);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNotNull(orderItemSet27);
        org.junit.Assert.assertNull(address28);
        org.junit.Assert.assertNull(address29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        java.util.Date date8 = order3.getDateCreated();
        order3.setTotalQuantity(100);
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.util.Date date17 = order14.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str19 = customer18.getFirstName();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer18.add(order20);
        java.lang.Long long22 = customer18.getId();
        order14.setCustomer(customer18);
        java.lang.String str24 = customer18.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet25 = customer18.getOrders();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet26 = customer18.getOrders();
        order3.setCustomer(customer18);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(orderSet25);
        org.junit.Assert.assertNotNull(orderSet26);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.lang.String str12 = order3.getStatus();
        order3.setId((java.lang.Long) 1L);
        java.lang.String str15 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Order order16 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address17 = order16.getBillingAddress();
        order16.setOrderTrackingNumber("");
        java.util.Date date20 = null;
        order16.setLastUpdated(date20);
        com.shittu24.ecommerce.entity.Address address22 = new com.shittu24.ecommerce.entity.Address();
        order16.setBillingAddress(address22);
        java.lang.String str24 = address22.getState();
        address22.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order28 = null;
        customer27.add(order28);
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        customer27.add(order30);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet32 = order30.getOrderItems();
        java.lang.String str33 = order30.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet34 = order30.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer35 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order36 = null;
        customer35.add(order36);
        com.shittu24.ecommerce.entity.Order order38 = new com.shittu24.ecommerce.entity.Order();
        customer35.add(order38);
        java.util.Date date40 = order38.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem41 = null;
        order38.add(orderItem41);
        order38.setOrderTrackingNumber("");
        java.util.Date date45 = order38.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet46 = order38.getOrderItems();
        order30.setOrderItems(orderItemSet46);
        address22.setOrder(order30);
        order3.setBillingAddress(address22);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(address17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(orderItemSet32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(orderItemSet34);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNotNull(orderItemSet46);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setName("");
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Product product8 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str9 = product8.getSku();
        java.util.Date date10 = product8.getDateCreated();
        java.lang.String str11 = product8.getDescription();
        boolean boolean12 = product0.equals((java.lang.Object) str11);
        product0.setActive(false);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        customer0.setEmail("hi!");
        customer0.setId((java.lang.Long) 1L);
        customer0.setId((java.lang.Long) 100L);
        java.lang.String str14 = customer0.getFirstName();
        java.lang.String str15 = customer0.getFirstName();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order17.getOrderItems();
        java.lang.String str20 = order17.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order17.getOrderItems();
        order3.setOrderItems(orderItemSet21);
        java.math.BigDecimal bigDecimal23 = order3.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address24 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str25 = address24.getCountry();
        java.lang.Long long26 = address24.getId();
        address24.setState("");
        order3.setBillingAddress(address24);
        java.util.Date date30 = order3.getLastUpdated();
        int int31 = order3.getTotalQuantity();
        java.lang.Long long32 = order3.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(long32);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal11 = null;
        product0.setUnitPrice(bigDecimal11);
        int int13 = product0.getUnitsInStock();
        boolean boolean14 = product0.isActive();
        java.math.BigDecimal bigDecimal15 = null;
        product0.setUnitPrice(bigDecimal15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.lang.String str10 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address9 = order8.getBillingAddress();
        order8.setOrderTrackingNumber("");
        java.util.Date date12 = null;
        order8.setLastUpdated(date12);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        order8.setBillingAddress(address14);
        address14.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setBillingAddress(address14);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address20 = order19.getBillingAddress();
        order19.setOrderTrackingNumber("");
        java.util.Date date23 = null;
        order19.setLastUpdated(date23);
        com.shittu24.ecommerce.entity.Address address25 = new com.shittu24.ecommerce.entity.Address();
        order19.setBillingAddress(address25);
        java.lang.String str27 = address25.getState();
        address25.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address25.setZipCode("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str32 = address25.getCity();
        address25.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setShippingAddress(address25);
        java.util.Date date36 = order3.getDateCreated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(address20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(date36);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        product0.setActive(false);
        product0.setName("hi!");
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        int int12 = product0.getUnitsInStock();
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = product0.getImageUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getState();
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = address0.getState();
        java.lang.String str11 = address0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        address0.setOrder(order2);
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.math.BigDecimal bigDecimal9 = null;
        orderItem7.setUnitPrice(bigDecimal9);
        orderItem7.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal13 = null;
        orderItem7.setUnitPrice(bigDecimal13);
        order2.add(orderItem7);
        com.shittu24.ecommerce.entity.Address address16 = order2.getBillingAddress();
        java.util.Date date17 = null;
        order2.setLastUpdated(date17);
        java.util.Date date19 = order2.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.Customer customer13 = order3.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer13.getOrders();
        java.lang.String str15 = customer13.getFirstName();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setUnitsInStock((int) (short) 0);
        com.shittu24.ecommerce.entity.Product product6 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean8 = product6.equals((java.lang.Object) 1.0f);
        product6.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory11 = product6.getCategory();
        product6.setName("hi!");
        product6.setName("");
        java.lang.String str16 = product6.getImageUrl();
        java.math.BigDecimal bigDecimal17 = null;
        product6.setUnitPrice(bigDecimal17);
        boolean boolean19 = product0.equals((java.lang.Object) product6);
        java.lang.Long long20 = product0.getId();
        java.util.Date date21 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.ProductCategory productCategory22 = product0.getCategory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(productCategory11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(productCategory22);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = null;
        product0.setCategory(productCategory10);
        java.lang.Long long12 = product0.getId();
        java.math.BigDecimal bigDecimal13 = product0.getUnitPrice();
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        java.util.Date date19 = order17.getDateCreated();
        java.lang.Long long20 = order17.getId();
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        order17.setCustomer(customer21);
        com.shittu24.ecommerce.entity.Customer customer27 = order17.getCustomer();
        com.shittu24.ecommerce.entity.Product product28 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str29 = product28.getSku();
        java.lang.Long long30 = product28.getId();
        product28.setUnitsInStock((int) (byte) -1);
        product28.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int35 = product28.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Date date41 = order39.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem42 = null;
        order39.add(orderItem42);
        java.util.Date date44 = null;
        order39.setLastUpdated(date44);
        boolean boolean46 = product28.equals((java.lang.Object) order39);
        java.util.Date date47 = null;
        order39.setDateCreated(date47);
        customer27.add(order39);
        com.shittu24.ecommerce.entity.Address address50 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str51 = address50.getCity();
        address50.setCountry("hi!");
        address50.setState("hi!");
        java.lang.String str56 = address50.getStreet();
        com.shittu24.ecommerce.entity.Customer customer57 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order58 = null;
        customer57.add(order58);
        com.shittu24.ecommerce.entity.Order order60 = new com.shittu24.ecommerce.entity.Order();
        customer57.add(order60);
        order60.setId((java.lang.Long) 0L);
        address50.setOrder(order60);
        customer27.add(order60);
        boolean boolean66 = product0.equals((java.lang.Object) customer27);
        java.lang.String str67 = customer27.getEmail();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(bigDecimal13);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNotNull(customer27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = product0.toString();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal18 = null;
        product0.setUnitPrice(bigDecimal18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer12 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address13 = null;
        order3.setBillingAddress(address13);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNotNull(customer12);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setBillingAddress(address8);
        com.shittu24.ecommerce.entity.Address address10 = order3.getShippingAddress();
        order3.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(address10);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer26.getOrders();
        customer24.setOrders(orderSet27);
        customer24.setLastName("");
        order3.setCustomer(customer24);
        java.math.BigDecimal bigDecimal32 = null;
        order3.setTotalPrice(bigDecimal32);
        int int34 = order3.getTotalQuantity();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setState("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setState("Product(id=null, category=null, sku=Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null), name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Order order7 = address0.getOrder();
        java.lang.String str8 = address0.getState();
        java.lang.Long long9 = address0.getId();
        address0.setCity("Product(id=null, category=null, sku=Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null), name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        boolean boolean10 = product0.equals((java.lang.Object) 1.0f);
        java.lang.String str11 = product0.getDescription();
        product0.setActive(true);
        com.shittu24.ecommerce.entity.ProductCategory productCategory14 = null;
        product0.setCategory(productCategory14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.lang.Long long4 = order0.getId();
        order0.setTotalQuantity(1);
        java.lang.String str7 = order0.getOrderTrackingNumber();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setFirstName("");
        java.lang.String str4 = customer0.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        java.lang.Long long6 = customer0.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        java.util.Date date12 = order10.getDateCreated();
        java.lang.Long long13 = order10.getId();
        customer0.add(order10);
        java.lang.String str15 = order10.getOrderTrackingNumber();
        java.lang.String str16 = order10.getOrderTrackingNumber();
        order10.setStatus("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray8 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet9, orderItemArray8);
        order3.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet9);
        order3.setTotalQuantity(0);
        java.util.Date date14 = order3.getDateCreated();
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        address6.setOrder(order12);
        java.lang.Long long17 = address6.getId();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        java.math.BigDecimal bigDecimal8 = null;
        order3.setTotalPrice(bigDecimal8);
        int int10 = order3.getTotalQuantity();
        java.util.Date date11 = order3.getDateCreated();
        java.util.Date date12 = null;
        order3.setDateCreated(date12);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.OrderItem orderItem1 = new com.shittu24.ecommerce.entity.OrderItem();
        int int2 = orderItem1.getQuantity();
        orderItem1.setId((java.lang.Long) 10L);
        java.lang.String str5 = orderItem1.getImageUrl();
        boolean boolean6 = product0.equals((java.lang.Object) orderItem1);
        java.math.BigDecimal bigDecimal7 = null;
        product0.setUnitPrice(bigDecimal7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        java.lang.Long long10 = order3.getId();
        java.util.Date date11 = null;
        order3.setLastUpdated(date11);
        java.math.BigDecimal bigDecimal13 = null;
        order3.setTotalPrice(bigDecimal13);
        java.util.Date date15 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getStreet();
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address0.getCity();
        address0.setStreet("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Date date13 = order11.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem14 = null;
        order11.add(orderItem14);
        java.util.Date date16 = null;
        order11.setLastUpdated(date16);
        boolean boolean18 = product0.equals((java.lang.Object) order11);
        java.util.Date date19 = null;
        order11.setDateCreated(date19);
        java.util.Date date21 = null;
        order11.setLastUpdated(date21);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer10 = order3.getCustomer();
        customer10.setEmail("Product(id=10, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(customer10);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet13 = customer10.getOrders();
        customer10.setEmail("");
        customer10.setId((java.lang.Long) 10L);
        java.lang.String str18 = customer10.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet19 = customer10.getOrders();
        customer7.setOrders(orderSet19);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderSet13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(orderSet19);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet4 = customer0.getOrders();
        java.lang.String str5 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        java.util.Date date8 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.Address address9 = order3.getBillingAddress();
        java.lang.String str10 = order3.getStatus();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = null;
        product0.setCategory(productCategory5);
        java.util.Date date7 = product0.getLastUpdated();
        java.util.Date date8 = null;
        product0.setLastUpdated(date8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        java.lang.Long long8 = customer0.getId();
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date10 = null;
        order9.setLastUpdated(date10);
        java.math.BigDecimal bigDecimal12 = order9.getTotalPrice();
        customer0.add(order9);
        java.lang.String str14 = order9.getOrderTrackingNumber();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order9.getOrderItems();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(orderItemSet15);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.lang.String str3 = customer0.getLastName();
        customer0.setFirstName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer26.getOrders();
        customer24.setOrders(orderSet27);
        customer24.setLastName("");
        order3.setCustomer(customer24);
        java.util.Date date32 = null;
        order3.setLastUpdated(date32);
        com.shittu24.ecommerce.entity.Customer customer34 = order3.getCustomer();
        java.lang.Long long35 = customer34.getId();
        customer34.setFirstName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer34.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet27);
        org.junit.Assert.assertNotNull(customer34);
        org.junit.Assert.assertNull(long35);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address11 = order10.getBillingAddress();
        order10.setOrderTrackingNumber("");
        java.util.Date date14 = null;
        order10.setLastUpdated(date14);
        com.shittu24.ecommerce.entity.Address address16 = new com.shittu24.ecommerce.entity.Address();
        order10.setBillingAddress(address16);
        address16.setCountry("");
        order3.setShippingAddress(address16);
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet26 = order24.getOrderItems();
        java.lang.String str27 = order24.getStatus();
        java.lang.Long long28 = order24.getId();
        order24.setTotalQuantity((int) (short) 10);
        address16.setOrder(order24);
        address16.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        address16.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str36 = address16.getCountry();
        address16.setStreet("Product(id=null, category=null, sku=Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null), name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order14 = orderItem13.getOrder();
        boolean boolean15 = product0.equals((java.lang.Object) orderItem13);
        java.lang.Long long16 = orderItem13.getId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        java.lang.String str9 = address0.getCountry();
        java.lang.String str10 = address0.getZipCode();
        address0.setId((java.lang.Long) (-1L));
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order18.getOrderItems();
        java.math.BigDecimal bigDecimal21 = null;
        order18.setTotalPrice(bigDecimal21);
        com.shittu24.ecommerce.entity.Order order23 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address24 = order23.getBillingAddress();
        order23.setOrderTrackingNumber("");
        java.util.Date date27 = null;
        order23.setLastUpdated(date27);
        com.shittu24.ecommerce.entity.Address address29 = new com.shittu24.ecommerce.entity.Address();
        order23.setBillingAddress(address29);
        java.lang.String str31 = address29.getState();
        java.lang.String str32 = address29.getCountry();
        java.lang.String str33 = address29.getState();
        order18.setBillingAddress(address29);
        com.shittu24.ecommerce.entity.Customer customer35 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str36 = customer35.getFirstName();
        java.lang.String str37 = customer35.getEmail();
        customer35.setEmail("");
        java.lang.Long long40 = customer35.getId();
        order18.setCustomer(customer35);
        customer35.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order44 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address45 = order44.getBillingAddress();
        order44.setOrderTrackingNumber("");
        java.util.Date date48 = null;
        order44.setLastUpdated(date48);
        com.shittu24.ecommerce.entity.Address address50 = new com.shittu24.ecommerce.entity.Address();
        order44.setBillingAddress(address50);
        customer35.add(order44);
        com.shittu24.ecommerce.entity.Order order53 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address54 = order53.getBillingAddress();
        order53.setOrderTrackingNumber("");
        java.util.Date date57 = null;
        order53.setLastUpdated(date57);
        com.shittu24.ecommerce.entity.Address address59 = new com.shittu24.ecommerce.entity.Address();
        order53.setBillingAddress(address59);
        order44.setBillingAddress(address59);
        address0.setOrder(order44);
        java.math.BigDecimal bigDecimal63 = order44.getTotalPrice();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(address24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNull(address45);
        org.junit.Assert.assertNull(address54);
        org.junit.Assert.assertNull(bigDecimal63);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        com.shittu24.ecommerce.entity.Address address9 = order5.getShippingAddress();
        order5.setOrderTrackingNumber("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order17.getOrderItems();
        java.lang.String str20 = order17.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order17.getOrderItems();
        order3.setOrderItems(orderItemSet21);
        java.math.BigDecimal bigDecimal23 = order3.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address24 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str25 = address24.getCountry();
        java.lang.Long long26 = address24.getId();
        address24.setState("");
        order3.setBillingAddress(address24);
        java.util.Date date30 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer31 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order32 = null;
        customer31.add(order32);
        com.shittu24.ecommerce.entity.Order order34 = new com.shittu24.ecommerce.entity.Order();
        customer31.add(order34);
        java.util.Date date36 = order34.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem37 = null;
        order34.add(orderItem37);
        order34.setOrderTrackingNumber("");
        java.util.Date date41 = order34.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order42 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address43 = order42.getBillingAddress();
        order42.setOrderTrackingNumber("");
        java.util.Date date46 = null;
        order42.setLastUpdated(date46);
        com.shittu24.ecommerce.entity.Address address48 = new com.shittu24.ecommerce.entity.Address();
        order42.setBillingAddress(address48);
        java.lang.String str50 = address48.getState();
        java.lang.String str51 = address48.getCountry();
        java.lang.String str52 = address48.getCountry();
        java.lang.String str53 = address48.getCity();
        java.lang.String str54 = address48.getCity();
        order34.setBillingAddress(address48);
        address48.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setBillingAddress(address48);
        com.shittu24.ecommerce.entity.Address address59 = new com.shittu24.ecommerce.entity.Address();
        address59.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str62 = address59.getZipCode();
        java.lang.String str63 = address59.getZipCode();
        com.shittu24.ecommerce.entity.Order order64 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address65 = order64.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address66 = order64.getShippingAddress();
        address59.setOrder(order64);
        java.lang.String str68 = address59.getCountry();
        address59.setCountry("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setBillingAddress(address59);
        address59.setState("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long74 = address59.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNull(address43);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(address65);
        org.junit.Assert.assertNull(address66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str68, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long74);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        java.lang.String str9 = address0.getCountry();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = null;
        order13.add(orderItem16);
        com.shittu24.ecommerce.entity.Address address18 = null;
        order13.setShippingAddress(address18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order13.getOrderItems();
        order13.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setOrder(order13);
        address0.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order26 = address0.getOrder();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNotNull(order26);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.lang.String str2 = order0.getOrderTrackingNumber();
        java.lang.String str3 = order0.getStatus();
        com.shittu24.ecommerce.entity.OrderItem orderItem4 = new com.shittu24.ecommerce.entity.OrderItem();
        int int5 = orderItem4.getQuantity();
        java.math.BigDecimal bigDecimal6 = null;
        orderItem4.setUnitPrice(bigDecimal6);
        orderItem4.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal10 = null;
        orderItem4.setUnitPrice(bigDecimal10);
        orderItem4.setId((java.lang.Long) 1L);
        orderItem4.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order0.add(orderItem4);
        com.shittu24.ecommerce.entity.Address address17 = order0.getShippingAddress();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(address17);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order12.getOrderItems();
        order5.setOrderItems(orderItemSet16);
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet23 = order21.getOrderItems();
        com.shittu24.ecommerce.entity.Address address24 = new com.shittu24.ecommerce.entity.Address();
        address24.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str27 = address24.getZipCode();
        java.lang.String str28 = address24.getZipCode();
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address30 = order29.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address31 = order29.getShippingAddress();
        address24.setOrder(order29);
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        com.shittu24.ecommerce.entity.Order order36 = new com.shittu24.ecommerce.entity.Order();
        customer33.add(order36);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet38 = order36.getOrderItems();
        java.lang.String str39 = order36.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet40 = order36.getOrderItems();
        order29.setOrderItems(orderItemSet40);
        order21.setOrderItems(orderItemSet40);
        order5.setOrderItems(orderItemSet40);
        com.shittu24.ecommerce.entity.Address address44 = order5.getBillingAddress();
        order5.setOrderTrackingNumber("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNotNull(orderItemSet23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNull(address31);
        org.junit.Assert.assertNotNull(orderItemSet38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(orderItemSet40);
        org.junit.Assert.assertNull(address44);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setUnitsInStock((int) (short) 0);
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.math.BigDecimal bigDecimal8 = product0.getUnitPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order9.getOrderItems();
        java.math.BigDecimal bigDecimal12 = null;
        order9.setTotalPrice(bigDecimal12);
        orderItem0.setOrder(order9);
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str16 = customer15.getFirstName();
        java.lang.String str17 = customer15.getEmail();
        order9.setCustomer(customer15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order9.getOrderItems();
        com.shittu24.ecommerce.entity.Address address20 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str21 = address20.getCity();
        address20.setCountry("hi!");
        java.lang.String str24 = address20.getCountry();
        order9.setShippingAddress(address20);
        address20.setCountry("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order3.getOrderItems();
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer13.getOrders();
        customer13.setEmail("");
        java.lang.String str17 = customer13.getFirstName();
        customer13.setFirstName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setCustomer(customer13);
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Date date26 = order24.getDateCreated();
        java.lang.Long long27 = order24.getId();
        com.shittu24.ecommerce.entity.Customer customer28 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer28.add(order29);
        com.shittu24.ecommerce.entity.Order order31 = new com.shittu24.ecommerce.entity.Order();
        customer28.add(order31);
        order24.setCustomer(customer28);
        com.shittu24.ecommerce.entity.Customer customer34 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order35 = null;
        customer34.add(order35);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet37 = customer34.getOrders();
        customer34.setEmail("");
        customer34.setId((java.lang.Long) 10L);
        java.lang.String str42 = customer34.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet43 = customer34.getOrders();
        customer28.setOrders(orderSet43);
        customer13.setOrders(orderSet43);
        java.lang.Long long46 = customer13.getId();
        customer13.setFirstName("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNotNull(orderSet37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(orderSet43);
        org.junit.Assert.assertNull(long46);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        java.lang.Object obj3 = null;
        boolean boolean4 = product0.equals(obj3);
        product0.setSku("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.lang.Class<?> wildcardClass8 = product0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.lang.String str8 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer11.getOrders();
        order3.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Date date21 = order19.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem22 = null;
        order19.add(orderItem22);
        customer11.add(order19);
        order19.setStatus("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order28 = null;
        customer27.add(order28);
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        customer27.add(order30);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet32 = order30.getOrderItems();
        java.lang.String str33 = order30.getStatus();
        java.lang.Long long34 = order30.getId();
        order30.setTotalQuantity((int) (short) 10);
        com.shittu24.ecommerce.entity.Customer customer37 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order38 = null;
        customer37.add(order38);
        com.shittu24.ecommerce.entity.Order order40 = new com.shittu24.ecommerce.entity.Order();
        customer37.add(order40);
        java.util.Date date42 = order40.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem43 = null;
        order40.add(orderItem43);
        com.shittu24.ecommerce.entity.Address address45 = null;
        order40.setShippingAddress(address45);
        com.shittu24.ecommerce.entity.OrderItem orderItem47 = new com.shittu24.ecommerce.entity.OrderItem();
        int int48 = orderItem47.getQuantity();
        java.lang.Long long49 = orderItem47.getProductId();
        order40.add(orderItem47);
        orderItem47.setProductId((java.lang.Long) 10L);
        java.lang.String str53 = orderItem47.getImageUrl();
        int int54 = orderItem47.getQuantity();
        order30.add(orderItem47);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet56 = order30.getOrderItems();
        order19.setOrderItems(orderItemSet56);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(orderItemSet32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(long34);
        org.junit.Assert.assertNull(date42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(long49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(orderItemSet56);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        address0.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order9 = address0.getOrder();
        java.lang.String str10 = address0.getStreet();
        java.lang.String str11 = address0.getStreet();
        address0.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        address0.setOrder(order2);
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.math.BigDecimal bigDecimal9 = null;
        orderItem7.setUnitPrice(bigDecimal9);
        orderItem7.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal13 = null;
        orderItem7.setUnitPrice(bigDecimal13);
        order2.add(orderItem7);
        java.math.BigDecimal bigDecimal16 = orderItem7.getUnitPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(bigDecimal16);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.lang.String str18 = order15.getStatus();
        java.util.Date date19 = order15.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str21 = customer20.getFirstName();
        java.lang.Long long22 = customer20.getId();
        order15.setCustomer(customer20);
        boolean boolean24 = product0.equals((java.lang.Object) order15);
        java.lang.String str25 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str25, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.math.BigDecimal bigDecimal6 = product0.getUnitPrice();
        java.util.Date date7 = product0.getDateCreated();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setActive(true);
        java.lang.String str9 = product0.getSku();
        java.lang.String str10 = product0.toString();
        java.lang.String str11 = product0.getSku();
        java.lang.Long long12 = product0.getId();
        java.util.Date date13 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.lang.String str12 = order3.getStatus();
        order3.setId((java.lang.Long) 1L);
        java.lang.String str15 = order3.getOrderTrackingNumber();
        order3.setStatus("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.Object obj9 = null;
        boolean boolean10 = product0.equals(obj9);
        java.util.Date date11 = product0.getLastUpdated();
        java.math.BigDecimal bigDecimal12 = null;
        product0.setUnitPrice(bigDecimal12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order1 = orderItem0.getOrder();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order3 = null;
        customer2.add(order3);
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        customer2.add(order5);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet7 = order5.getOrderItems();
        java.lang.String str8 = order5.getStatus();
        java.util.Date date9 = order5.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address10 = null;
        order5.setShippingAddress(address10);
        orderItem0.setOrder(order5);
        java.lang.Long long13 = orderItem0.getId();
        com.shittu24.ecommerce.entity.Order order14 = orderItem0.getOrder();
        orderItem0.setId((java.lang.Long) (-1L));
        orderItem0.setQuantity((-1));
        com.shittu24.ecommerce.entity.Order order19 = orderItem0.getOrder();
        order19.setStatus("Product(id=null, category=null, sku=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNotNull(order14);
        org.junit.Assert.assertNotNull(order19);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Date date11 = order9.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem12 = null;
        order9.add(orderItem12);
        orderItem0.setOrder(order9);
        order9.setOrderTrackingNumber("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Address address17 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str18 = address17.getCity();
        address17.setCountry("hi!");
        address17.setState("hi!");
        java.lang.String str23 = address17.getStreet();
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order25 = null;
        customer24.add(order25);
        com.shittu24.ecommerce.entity.Order order27 = new com.shittu24.ecommerce.entity.Order();
        customer24.add(order27);
        order27.setId((java.lang.Long) 0L);
        address17.setOrder(order27);
        com.shittu24.ecommerce.entity.Order order32 = address17.getOrder();
        com.shittu24.ecommerce.entity.Order order33 = address17.getOrder();
        java.lang.String str34 = address17.getState();
        java.lang.String str35 = address17.getStreet();
        address17.setCity("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address17.setStreet("Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order9.setShippingAddress(address17);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(order32);
        org.junit.Assert.assertNotNull(order33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getLastName();
        customer0.setEmail("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str4 = customer0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        boolean boolean9 = product0.isActive();
        java.util.Date date10 = product0.getDateCreated();
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.ProductCategory productCategory13 = null;
        product0.setCategory(productCategory13);
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setState("");
        address15.setCountry("hi!");
        java.lang.String str22 = address15.getCity();
        java.lang.Long long23 = address15.getId();
        boolean boolean24 = product0.equals((java.lang.Object) long23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer0.add(order2);
        customer0.setLastName("hi!");
        java.lang.String str6 = customer0.getFirstName();
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        java.util.Date date16 = order12.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address18 = order17.getBillingAddress();
        order17.setOrderTrackingNumber("");
        java.util.Date date21 = null;
        order17.setLastUpdated(date21);
        com.shittu24.ecommerce.entity.Address address23 = new com.shittu24.ecommerce.entity.Address();
        order17.setBillingAddress(address23);
        address23.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order12.setBillingAddress(address23);
        com.shittu24.ecommerce.entity.Order order28 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address29 = order28.getBillingAddress();
        order28.setOrderTrackingNumber("");
        java.util.Date date32 = null;
        order28.setLastUpdated(date32);
        com.shittu24.ecommerce.entity.Address address34 = new com.shittu24.ecommerce.entity.Address();
        order28.setBillingAddress(address34);
        java.lang.String str36 = address34.getState();
        address34.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address34.setZipCode("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str41 = address34.getCity();
        address34.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order12.setShippingAddress(address34);
        customer0.add(order12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(address29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        boolean boolean10 = product0.equals((java.lang.Object) 1.0f);
        java.util.Date date11 = product0.getLastUpdated();
        java.lang.String str12 = product0.getImageUrl();
        product0.setDescription("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date15 = product0.getLastUpdated();
        product0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order3.setCustomer(customer7);
        java.lang.String str13 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCountry();
        java.lang.Long long17 = address15.getId();
        address15.setZipCode("hi!");
        address15.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order22 = address15.getOrder();
        order3.setBillingAddress(address15);
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer26.getOrders();
        customer24.setOrders(orderSet27);
        customer24.setLastName("");
        order3.setCustomer(customer24);
        java.util.Date date32 = null;
        order3.setLastUpdated(date32);
        com.shittu24.ecommerce.entity.Customer customer34 = order3.getCustomer();
        java.lang.Long long35 = customer34.getId();
        com.shittu24.ecommerce.entity.OrderItem orderItem36 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long37 = orderItem36.getProductId();
        orderItem36.setImageUrl("");
        java.lang.Long long40 = orderItem36.getId();
        java.lang.Long long41 = orderItem36.getProductId();
        com.shittu24.ecommerce.entity.Customer customer42 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order43 = null;
        customer42.add(order43);
        com.shittu24.ecommerce.entity.Order order45 = new com.shittu24.ecommerce.entity.Order();
        customer42.add(order45);
        java.util.Date date47 = order45.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem48 = null;
        order45.add(orderItem48);
        orderItem36.setOrder(order45);
        customer34.add(order45);
        java.lang.String str52 = customer34.getLastName();
        java.lang.String str53 = customer34.getEmail();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet27);
        org.junit.Assert.assertNotNull(customer34);
        org.junit.Assert.assertNull(long35);
        org.junit.Assert.assertNull(long37);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNull(long41);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.lang.String str6 = product0.getDescription();
        java.lang.String str7 = product0.getDescription();
        int int8 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        int int2 = order0.getTotalQuantity();
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer3.add(order4);
        com.shittu24.ecommerce.entity.Order order6 = new com.shittu24.ecommerce.entity.Order();
        customer3.add(order6);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet8 = order6.getOrderItems();
        java.math.BigDecimal bigDecimal9 = null;
        order6.setTotalPrice(bigDecimal9);
        java.lang.String str11 = order6.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order6.getOrderItems();
        com.shittu24.ecommerce.entity.Address address13 = order6.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet17 = customer14.getOrders();
        order6.setCustomer(customer14);
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str20 = customer19.getFirstName();
        customer19.setFirstName("");
        java.lang.String str23 = customer19.getEmail();
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet29 = customer26.getOrders();
        customer24.setOrders(orderSet29);
        customer19.setOrders(orderSet29);
        customer14.setOrders(orderSet29);
        order0.setCustomer(customer14);
        java.lang.String str34 = customer14.getFirstName();
        com.shittu24.ecommerce.entity.Address address35 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str36 = address35.getCountry();
        java.lang.Long long37 = address35.getId();
        address35.setState("");
        address35.setCountry("hi!");
        java.lang.String str42 = address35.getCountry();
        com.shittu24.ecommerce.entity.Product product43 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean45 = product43.equals((java.lang.Object) 1.0f);
        product43.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory48 = product43.getCategory();
        product43.setName("hi!");
        product43.setId((java.lang.Long) 10L);
        java.util.Date date53 = product43.getDateCreated();
        java.lang.String str54 = product43.toString();
        com.shittu24.ecommerce.entity.Customer customer55 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order56 = null;
        customer55.add(order56);
        com.shittu24.ecommerce.entity.Order order58 = new com.shittu24.ecommerce.entity.Order();
        customer55.add(order58);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet60 = order58.getOrderItems();
        java.lang.String str61 = order58.getStatus();
        java.util.Date date62 = order58.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer63 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str64 = customer63.getFirstName();
        java.lang.Long long65 = customer63.getId();
        order58.setCustomer(customer63);
        boolean boolean67 = product43.equals((java.lang.Object) order58);
        address35.setOrder(order58);
        customer14.add(order58);
        com.shittu24.ecommerce.entity.Customer customer70 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order71 = null;
        customer70.add(order71);
        com.shittu24.ecommerce.entity.Order order73 = new com.shittu24.ecommerce.entity.Order();
        customer70.add(order73);
        java.util.Date date75 = order73.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem76 = null;
        order73.add(orderItem76);
        order73.setOrderTrackingNumber("");
        java.util.Date date80 = order73.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet81 = order73.getOrderItems();
        java.lang.Long long82 = order73.getId();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet83 = order73.getOrderItems();
        order58.setOrderItems(orderItemSet83);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNotNull(orderSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(long37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(productCategory48);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str54, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(date62);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(long65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(date75);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNotNull(orderItemSet81);
        org.junit.Assert.assertNull(long82);
        org.junit.Assert.assertNotNull(orderItemSet83);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.String str6 = orderItem0.getImageUrl();
        com.shittu24.ecommerce.entity.Order order7 = orderItem0.getOrder();
        java.lang.String str8 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer7.add(order9);
        java.lang.Long long11 = customer7.getId();
        order3.setCustomer(customer7);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        order3.add(orderItem13);
        order3.setId((java.lang.Long) 100L);
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str19 = customer18.getFirstName();
        java.lang.String str20 = customer18.getEmail();
        order3.setCustomer(customer18);
        customer18.setEmail("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str24 = customer18.getEmail();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str24, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str9 = customer8.getFirstName();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer8.add(order10);
        customer8.setLastName("hi!");
        order3.setCustomer(customer8);
        customer8.setEmail("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str9 = customer8.getFirstName();
        java.lang.Long long10 = customer8.getId();
        order3.setCustomer(customer8);
        java.lang.String str12 = customer8.getFirstName();
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str14 = order13.getStatus();
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str16 = customer15.getFirstName();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer15.add(order17);
        customer15.setLastName("hi!");
        order13.setCustomer(customer15);
        java.math.BigDecimal bigDecimal22 = null;
        order13.setTotalPrice(bigDecimal22);
        java.util.Date date24 = order13.getDateCreated();
        customer8.add(order13);
        customer8.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long6 = address0.getId();
        com.shittu24.ecommerce.entity.Order order7 = address0.getOrder();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray8 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet9, orderItemArray8);
        order3.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet9);
        order3.setTotalQuantity(0);
        com.shittu24.ecommerce.entity.Address address14 = order3.getShippingAddress();
        com.shittu24.ecommerce.entity.Address address15 = order3.getShippingAddress();
        int int16 = order3.getTotalQuantity();
        java.lang.String str17 = order3.getStatus();
        com.shittu24.ecommerce.entity.Address address18 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str19 = address18.getCity();
        com.shittu24.ecommerce.entity.Order order20 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date21 = null;
        order20.setLastUpdated(date21);
        java.math.BigDecimal bigDecimal23 = order20.getTotalPrice();
        address18.setOrder(order20);
        order3.setShippingAddress(address18);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(bigDecimal23);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.lang.Long long4 = orderItem0.getId();
        com.shittu24.ecommerce.entity.Order order5 = orderItem0.getOrder();
        orderItem0.setQuantity((int) ' ');
        orderItem0.setProductId((java.lang.Long) 10L);
        java.math.BigDecimal bigDecimal10 = null;
        orderItem0.setUnitPrice(bigDecimal10);
        java.lang.Long long12 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setActive(true);
        java.lang.String str9 = product0.getSku();
        java.lang.String str10 = product0.toString();
        java.util.Date date11 = null;
        product0.setDateCreated(date11);
        java.math.BigDecimal bigDecimal13 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(bigDecimal13);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address12 = order11.getBillingAddress();
        order11.setOrderTrackingNumber("");
        java.util.Date date15 = null;
        order11.setLastUpdated(date15);
        com.shittu24.ecommerce.entity.Address address17 = new com.shittu24.ecommerce.entity.Address();
        order11.setBillingAddress(address17);
        java.lang.String str19 = address17.getState();
        java.lang.String str20 = address17.getCountry();
        java.lang.String str21 = address17.getCountry();
        java.lang.String str22 = address17.getCity();
        java.lang.String str23 = address17.getCity();
        order3.setBillingAddress(address17);
        java.lang.String str25 = address17.getState();
        java.lang.String str26 = address17.getStreet();
        java.lang.String str27 = address17.getState();
        java.lang.String str28 = address17.getCity();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.Long long6 = orderItem0.getId();
        java.lang.Long long7 = orderItem0.getProductId();
        java.lang.Long long8 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal4 = null;
        orderItem0.setUnitPrice(bigDecimal4);
        orderItem0.setId((java.lang.Long) 0L);
        orderItem0.setProductId((java.lang.Long) 100L);
        java.lang.String str10 = orderItem0.getImageUrl();
        com.shittu24.ecommerce.entity.Order order11 = orderItem0.getOrder();
        orderItem0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        orderItem0.setQuantity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Customer customer5 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order6 = null;
        customer5.add(order6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        customer5.add(order8);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order8.getOrderItems();
        java.util.Date date11 = order8.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str13 = customer12.getFirstName();
        com.shittu24.ecommerce.entity.Order order14 = null;
        customer12.add(order14);
        java.lang.Long long16 = customer12.getId();
        order8.setCustomer(customer12);
        com.shittu24.ecommerce.entity.OrderItem orderItem18 = new com.shittu24.ecommerce.entity.OrderItem();
        int int19 = orderItem18.getQuantity();
        order8.add(orderItem18);
        com.shittu24.ecommerce.entity.Product product21 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str22 = product21.getSku();
        java.lang.Long long23 = product21.getId();
        product21.setUnitsInStock((int) (byte) -1);
        product21.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int28 = product21.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer29 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order30 = null;
        customer29.add(order30);
        com.shittu24.ecommerce.entity.Order order32 = new com.shittu24.ecommerce.entity.Order();
        customer29.add(order32);
        java.util.Date date34 = order32.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem35 = null;
        order32.add(orderItem35);
        java.util.Date date37 = null;
        order32.setLastUpdated(date37);
        boolean boolean39 = product21.equals((java.lang.Object) order32);
        orderItem18.setOrder(order32);
        com.shittu24.ecommerce.entity.Address address41 = order32.getBillingAddress();
        address0.setOrder(order32);
        java.util.Date date43 = null;
        order32.setDateCreated(date43);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(address41);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal3 = null;
        orderItem0.setUnitPrice(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = orderItem0.getUnitPrice();
        java.lang.String str6 = orderItem0.getImageUrl();
        orderItem0.setProductId((java.lang.Long) (-1L));
        java.math.BigDecimal bigDecimal9 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date1 = null;
        order0.setLastUpdated(date1);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer3.add(order4);
        com.shittu24.ecommerce.entity.Order order6 = new com.shittu24.ecommerce.entity.Order();
        customer3.add(order6);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet8 = order6.getOrderItems();
        java.math.BigDecimal bigDecimal9 = null;
        order6.setTotalPrice(bigDecimal9);
        java.lang.String str11 = order6.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order6.getOrderItems();
        order0.setOrderItems(orderItemSet12);
        com.shittu24.ecommerce.entity.Address address14 = order0.getShippingAddress();
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address14);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        customer3.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.toString();
        int int12 = product0.getUnitsInStock();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = product0.toString();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setName("");
        product0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order6 = null;
        orderItem0.setOrder(order6);
        orderItem0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        orderItem0.setId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.lang.String str18 = order15.getStatus();
        java.util.Date date19 = order15.getLastUpdated();
        java.lang.Long long20 = order15.getId();
        com.shittu24.ecommerce.entity.Address address21 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str22 = address21.getCity();
        address21.setCountry("hi!");
        address21.setState("hi!");
        java.lang.String str27 = address21.getStreet();
        address21.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order15.setBillingAddress(address21);
        orderItem0.setOrder(order15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        java.lang.Long long10 = order3.getId();
        int int11 = order3.getTotalQuantity();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        com.shittu24.ecommerce.entity.Address address18 = new com.shittu24.ecommerce.entity.Address();
        address18.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address18.getZipCode();
        java.lang.String str22 = address18.getZipCode();
        com.shittu24.ecommerce.entity.Order order23 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address24 = order23.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address25 = order23.getShippingAddress();
        address18.setOrder(order23);
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order28 = null;
        customer27.add(order28);
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        customer27.add(order30);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet32 = order30.getOrderItems();
        java.lang.String str33 = order30.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet34 = order30.getOrderItems();
        order23.setOrderItems(orderItemSet34);
        order15.setOrderItems(orderItemSet34);
        com.shittu24.ecommerce.entity.Order order37 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address38 = order37.getBillingAddress();
        order37.setOrderTrackingNumber("");
        java.util.Date date41 = null;
        order37.setLastUpdated(date41);
        com.shittu24.ecommerce.entity.Address address43 = new com.shittu24.ecommerce.entity.Address();
        order37.setBillingAddress(address43);
        java.lang.String str45 = address43.getState();
        java.lang.String str46 = address43.getCountry();
        order15.setShippingAddress(address43);
        order3.setShippingAddress(address43);
        order3.setStatus("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setTotalQuantity((int) (byte) 10);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(address24);
        org.junit.Assert.assertNull(address25);
        org.junit.Assert.assertNotNull(orderItemSet32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(orderItemSet34);
        org.junit.Assert.assertNull(address38);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date1 = null;
        order0.setLastUpdated(date1);
        java.math.BigDecimal bigDecimal3 = order0.getTotalPrice();
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        java.util.Date date6 = order0.getLastUpdated();
        order0.setTotalQuantity((int) 'a');
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order0.getOrderItems();
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(orderItemSet9);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.Object obj9 = null;
        boolean boolean10 = product0.equals(obj9);
        product0.setName("hi!");
        java.lang.Class<?> wildcardClass13 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.lang.Long long9 = orderItem7.getProductId();
        com.shittu24.ecommerce.entity.Order order10 = orderItem7.getOrder();
        order3.add(orderItem7);
        java.lang.String str12 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order3.getOrderItems();
        java.util.Date date14 = order3.getLastUpdated();
        order3.setStatus("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.lang.String str12 = order3.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order3.getOrderItems();
        order3.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Address address16 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str17 = address16.getCity();
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date19 = null;
        order18.setLastUpdated(date19);
        java.math.BigDecimal bigDecimal21 = order18.getTotalPrice();
        address16.setOrder(order18);
        order3.setShippingAddress(address16);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(bigDecimal21);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setLastUpdated(date7);
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        java.util.Date date16 = order12.getLastUpdated();
        java.lang.Long long17 = order12.getId();
        com.shittu24.ecommerce.entity.Address address18 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str19 = address18.getCity();
        address18.setCountry("hi!");
        address18.setState("hi!");
        java.lang.String str24 = address18.getStreet();
        address18.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order12.setBillingAddress(address18);
        address18.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str30 = address18.getCity();
        boolean boolean31 = product0.equals((java.lang.Object) address18);
        address18.setId((java.lang.Long) (-1L));
        java.lang.String str34 = address18.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str30, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.toString();
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        java.lang.String str12 = product0.toString();
        java.util.Date date13 = product0.getLastUpdated();
        product0.setImageUrl("");
        product0.setUnitsInStock((int) (byte) 1);
        java.util.Date date18 = product0.getDateCreated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        product0.setUnitsInStock((int) 'a');
        product0.setDescription("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str16 = product0.getSku();
        java.lang.String str17 = product0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str17, "Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = orderItem0.getUnitPrice();
        java.math.BigDecimal bigDecimal5 = orderItem0.getUnitPrice();
        java.math.BigDecimal bigDecimal6 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setUnitsInStock(10);
        java.util.Date date6 = product0.getDateCreated();
        java.lang.String str7 = product0.getSku();
        com.shittu24.ecommerce.entity.ProductCategory productCategory8 = product0.getCategory();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(productCategory8);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.String str6 = orderItem0.getImageUrl();
        java.lang.String str7 = orderItem0.getImageUrl();
        int int8 = orderItem0.getQuantity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray8 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet9, orderItemArray8);
        order3.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet9);
        order3.setTotalQuantity(0);
        com.shittu24.ecommerce.entity.Address address14 = order3.getShippingAddress();
        java.math.BigDecimal bigDecimal15 = null;
        order3.setTotalPrice(bigDecimal15);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(address14);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order14 = orderItem13.getOrder();
        boolean boolean15 = product0.equals((java.lang.Object) orderItem13);
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order19.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order19.getOrderItems();
        com.shittu24.ecommerce.entity.Address address23 = order19.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address24 = order19.getBillingAddress();
        java.util.Date date25 = null;
        order19.setLastUpdated(date25);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet27 = order19.getOrderItems();
        orderItem13.setOrder(order19);
        com.shittu24.ecommerce.entity.Customer customer29 = null;
        order19.setCustomer(customer29);
        order19.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(address23);
        org.junit.Assert.assertNull(address24);
        org.junit.Assert.assertNotNull(orderItemSet27);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.toString();
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        product0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        java.lang.String str3 = customer0.getEmail();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setFirstName("");
        java.lang.Long long8 = customer0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        boolean boolean8 = product0.isActive();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order12.getOrderItems();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = new com.shittu24.ecommerce.entity.OrderItem();
        int int17 = orderItem16.getQuantity();
        java.lang.Long long18 = orderItem16.getProductId();
        com.shittu24.ecommerce.entity.Order order19 = orderItem16.getOrder();
        order12.add(orderItem16);
        boolean boolean21 = product0.equals((java.lang.Object) orderItem16);
        java.math.BigDecimal bigDecimal22 = orderItem16.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(bigDecimal22);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet7 = customer0.getOrders();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet8 = customer0.getOrders();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderSet7);
        org.junit.Assert.assertNotNull(orderSet8);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setBillingAddress(address8);
        com.shittu24.ecommerce.entity.Address address10 = null;
        order3.setShippingAddress(address10);
        java.util.Date date12 = order3.getLastUpdated();
        java.util.Date date13 = order3.getLastUpdated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        java.lang.Long long10 = order3.getId();
        java.util.Date date11 = null;
        order3.setLastUpdated(date11);
        order3.setOrderTrackingNumber("hi!");
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Date date20 = order18.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem21 = null;
        order18.add(orderItem21);
        com.shittu24.ecommerce.entity.Address address23 = null;
        order18.setShippingAddress(address23);
        com.shittu24.ecommerce.entity.Customer customer25 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str26 = customer25.getFirstName();
        customer25.setId((java.lang.Long) 0L);
        order18.setCustomer(customer25);
        order3.setCustomer(customer25);
        java.lang.String str31 = customer25.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str34 = customer33.getFirstName();
        customer33.setFirstName("");
        java.lang.String str37 = customer33.getEmail();
        com.shittu24.ecommerce.entity.Customer customer38 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str39 = customer38.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer40 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order41 = null;
        customer40.add(order41);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet43 = customer40.getOrders();
        customer38.setOrders(orderSet43);
        customer33.setOrders(orderSet43);
        customer32.setOrders(orderSet43);
        customer25.setOrders(orderSet43);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(orderSet43);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.util.Date date1 = null;
        product0.setDateCreated(date1);
        java.util.Date date3 = product0.getLastUpdated();
        int int4 = product0.getUnitsInStock();
        java.math.BigDecimal bigDecimal5 = null;
        product0.setUnitPrice(bigDecimal5);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        java.util.Date date8 = null;
        order3.setLastUpdated(date8);
        java.lang.String str10 = order3.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer11 = order3.getCustomer();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(customer11);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setFirstName("");
        java.lang.String str4 = customer0.getEmail();
        com.shittu24.ecommerce.entity.Customer customer5 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str6 = customer5.getFirstName();
        java.lang.Long long7 = customer5.getId();
        customer5.setFirstName("");
        customer5.setId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.math.BigDecimal bigDecimal18 = null;
        order15.setTotalPrice(bigDecimal18);
        com.shittu24.ecommerce.entity.Order order20 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address21 = order20.getBillingAddress();
        order20.setOrderTrackingNumber("");
        java.util.Date date24 = null;
        order20.setLastUpdated(date24);
        com.shittu24.ecommerce.entity.Address address26 = new com.shittu24.ecommerce.entity.Address();
        order20.setBillingAddress(address26);
        java.lang.String str28 = address26.getState();
        java.lang.String str29 = address26.getCountry();
        java.lang.String str30 = address26.getState();
        order15.setBillingAddress(address26);
        java.lang.String str32 = order15.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet36 = customer33.getOrders();
        customer33.setEmail("");
        customer33.setEmail("");
        java.lang.Long long41 = customer33.getId();
        com.shittu24.ecommerce.entity.Order order42 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date43 = null;
        order42.setLastUpdated(date43);
        java.math.BigDecimal bigDecimal45 = order42.getTotalPrice();
        customer33.add(order42);
        order15.setCustomer(customer33);
        com.shittu24.ecommerce.entity.Customer customer48 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order49 = null;
        customer48.add(order49);
        com.shittu24.ecommerce.entity.Order order51 = new com.shittu24.ecommerce.entity.Order();
        customer48.add(order51);
        java.util.Date date53 = order51.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem54 = null;
        order51.add(orderItem54);
        com.shittu24.ecommerce.entity.Address address56 = null;
        order51.setShippingAddress(address56);
        com.shittu24.ecommerce.entity.OrderItem orderItem58 = new com.shittu24.ecommerce.entity.OrderItem();
        int int59 = orderItem58.getQuantity();
        java.lang.Long long60 = orderItem58.getProductId();
        order51.add(orderItem58);
        orderItem58.setProductId((java.lang.Long) 10L);
        java.lang.String str64 = orderItem58.getImageUrl();
        java.lang.String str65 = orderItem58.getImageUrl();
        order15.add(orderItem58);
        com.shittu24.ecommerce.entity.Customer customer67 = order15.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet68 = customer67.getOrders();
        customer5.setOrders(orderSet68);
        customer0.setOrders(orderSet68);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(address21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(orderSet36);
        org.junit.Assert.assertNull(long41);
        org.junit.Assert.assertNull(bigDecimal45);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(long60);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(customer67);
        org.junit.Assert.assertNotNull(orderSet68);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        orderItem0.setProductId((java.lang.Long) 100L);
        int int7 = orderItem0.getQuantity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order7.getOrderItems();
        java.lang.String str10 = order7.getStatus();
        java.util.Date date11 = order7.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray12 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet13, orderItemArray12);
        order7.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet13);
        order7.setTotalQuantity(0);
        com.shittu24.ecommerce.entity.Address address18 = order7.getShippingAddress();
        com.shittu24.ecommerce.entity.Address address19 = order7.getShippingAddress();
        orderItem0.setOrder(order7);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address22 = order21.getBillingAddress();
        order21.setOrderTrackingNumber("");
        java.util.Date date25 = null;
        order21.setLastUpdated(date25);
        com.shittu24.ecommerce.entity.Address address27 = new com.shittu24.ecommerce.entity.Address();
        order21.setBillingAddress(address27);
        java.lang.String str29 = address27.getState();
        java.lang.String str30 = address27.getCountry();
        java.lang.String str31 = address27.getState();
        java.lang.Long long32 = address27.getId();
        com.shittu24.ecommerce.entity.Order order33 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address34 = order33.getBillingAddress();
        order33.setOrderTrackingNumber("");
        order33.setOrderTrackingNumber("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address27.setOrder(order33);
        order7.setShippingAddress(address27);
        java.lang.String str41 = address27.getZipCode();
        address27.setId((java.lang.Long) 10L);
        address27.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(orderItemArray12);
        org.junit.Assert.assertArrayEquals(orderItemArray12, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(address19);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNull(address34);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        com.shittu24.ecommerce.entity.ProductCategory productCategory2 = product0.getCategory();
        int int3 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.OrderItem orderItem4 = new com.shittu24.ecommerce.entity.OrderItem();
        int int5 = orderItem4.getQuantity();
        java.math.BigDecimal bigDecimal6 = null;
        orderItem4.setUnitPrice(bigDecimal6);
        orderItem4.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order13.getOrderItems();
        java.math.BigDecimal bigDecimal16 = null;
        order13.setTotalPrice(bigDecimal16);
        orderItem4.setOrder(order13);
        order13.setOrderTrackingNumber("hi!");
        boolean boolean21 = product0.equals((java.lang.Object) order13);
        product0.setSku("hi!");
        java.lang.Long long24 = product0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(productCategory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(long24);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.lang.String str3 = customer0.getLastName();
        java.lang.String str4 = customer0.getEmail();
        java.lang.String str5 = customer0.getLastName();
        java.lang.Long long6 = customer0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        com.shittu24.ecommerce.entity.Order order6 = orderItem0.getOrder();
        orderItem0.setId((java.lang.Long) 1L);
        int int9 = orderItem0.getQuantity();
        java.lang.Long long10 = orderItem0.getProductId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.lang.Long long12 = orderItem10.getProductId();
        order3.add(orderItem10);
        java.lang.String str14 = orderItem10.getImageUrl();
        orderItem10.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        java.lang.String str9 = address0.getCountry();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = null;
        order13.add(orderItem16);
        com.shittu24.ecommerce.entity.Address address18 = null;
        order13.setShippingAddress(address18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order13.getOrderItems();
        order13.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setOrder(order13);
        java.math.BigDecimal bigDecimal24 = order13.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address25 = null;
        order13.setBillingAddress(address25);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(bigDecimal24);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getCountry();
        java.lang.String str10 = address6.getCountry();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Date date16 = order14.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem17 = null;
        order14.add(orderItem17);
        java.lang.String str19 = order14.getStatus();
        address6.setOrder(order14);
        java.lang.String str21 = address6.getStreet();
        address6.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.lang.String str3 = customer0.getLastName();
        java.lang.String str4 = customer0.getEmail();
        java.lang.String str5 = customer0.getLastName();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order9.getOrderItems();
        java.math.BigDecimal bigDecimal12 = null;
        order9.setTotalPrice(bigDecimal12);
        java.lang.String str14 = order9.getStatus();
        customer0.add(order9);
        java.lang.Long long16 = order9.getId();
        com.shittu24.ecommerce.entity.Customer customer17 = order9.getCustomer();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNotNull(customer17);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        com.shittu24.ecommerce.entity.Customer customer1 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer1.add(order2);
        com.shittu24.ecommerce.entity.Order order4 = new com.shittu24.ecommerce.entity.Order();
        customer1.add(order4);
        java.util.Date date6 = order4.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = null;
        order4.add(orderItem7);
        com.shittu24.ecommerce.entity.Address address9 = null;
        order4.setShippingAddress(address9);
        com.shittu24.ecommerce.entity.OrderItem orderItem11 = new com.shittu24.ecommerce.entity.OrderItem();
        int int12 = orderItem11.getQuantity();
        java.lang.Long long13 = orderItem11.getProductId();
        order4.add(orderItem11);
        orderItem11.setProductId((java.lang.Long) 10L);
        java.lang.String str17 = orderItem11.getImageUrl();
        java.lang.Long long18 = orderItem11.getId();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = null;
        order22.add(orderItem25);
        com.shittu24.ecommerce.entity.Address address27 = null;
        order22.setShippingAddress(address27);
        com.shittu24.ecommerce.entity.OrderItem orderItem29 = new com.shittu24.ecommerce.entity.OrderItem();
        int int30 = orderItem29.getQuantity();
        java.lang.Long long31 = orderItem29.getProductId();
        order22.add(orderItem29);
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        com.shittu24.ecommerce.entity.Order order36 = new com.shittu24.ecommerce.entity.Order();
        customer33.add(order36);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet38 = order36.getOrderItems();
        java.lang.String str39 = order36.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet40 = order36.getOrderItems();
        order22.setOrderItems(orderItemSet40);
        java.math.BigDecimal bigDecimal42 = order22.getTotalPrice();
        orderItem11.setOrder(order22);
        address0.setOrder(order22);
        java.util.Date date45 = null;
        order22.setDateCreated(date45);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(orderItemSet38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(orderItemSet40);
        org.junit.Assert.assertNull(bigDecimal42);
    }
}

