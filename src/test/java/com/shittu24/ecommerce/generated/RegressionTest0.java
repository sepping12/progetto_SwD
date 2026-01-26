package com.shittu24.ecommerce.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer0.add(order2);
        java.lang.Long long4 = customer0.getId();
        java.lang.String str5 = customer0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        java.lang.Long long8 = customer0.getId();
        customer0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
        order3.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        int int8 = order3.getTotalQuantity();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        order0.setOrderTrackingNumber("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
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
        orderItem10.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        java.lang.Object obj3 = null;
        boolean boolean4 = product0.equals(obj3);
        java.lang.String str5 = product0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
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
        com.shittu24.ecommerce.entity.Address address25 = order15.getBillingAddress();
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
        org.junit.Assert.assertNull(address25);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
        java.util.Date date10 = order3.getDateCreated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
        java.util.Date date14 = null;
        order0.setDateCreated(date14);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.math.BigDecimal bigDecimal6 = null;
        order3.setTotalPrice(bigDecimal6);
        java.math.BigDecimal bigDecimal8 = order3.getTotalPrice();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getShippingAddress();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setFirstName("");
        java.lang.String str4 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        boolean boolean9 = product0.isActive();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        java.lang.String str11 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        customer0.setFirstName("");
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setProductId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setActive(true);
        java.lang.String str9 = product0.getSku();
        java.lang.String str10 = product0.toString();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order1 = orderItem0.getOrder();
        orderItem0.setQuantity(10);
        org.junit.Assert.assertNull(order1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        java.math.BigDecimal bigDecimal8 = order3.getTotalPrice();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        product0.setActive(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getState();
        address0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setUnitsInStock((int) (short) 0);
        boolean boolean6 = product0.isActive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        java.lang.Class<?> wildcardClass6 = product0.getClass();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        customer11.setFirstName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        java.util.Date date10 = order3.getDateCreated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setStatus("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
        java.math.BigDecimal bigDecimal13 = null;
        product0.setUnitPrice(bigDecimal13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        com.shittu24.ecommerce.entity.Address address8 = order3.getBillingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        java.util.Date date7 = product0.getDateCreated();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        orderItem0.setProductId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet6 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address7 = order3.getBillingAddress();
        order3.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        address9.setCountry("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        order3.setStatus("");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        com.shittu24.ecommerce.entity.Address address12 = order3.getShippingAddress();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.lang.String str9 = product0.toString();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.lang.String str5 = product0.getSku();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str7 = address6.getCity();
        address6.setCountry("hi!");
        boolean boolean10 = product0.equals((java.lang.Object) address6);
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.math.BigDecimal bigDecimal17 = null;
        order14.setTotalPrice(bigDecimal17);
        java.lang.String str19 = order14.getStatus();
        boolean boolean20 = product0.equals((java.lang.Object) str19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str11 = product0.getImageUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        java.lang.String str10 = customer7.getEmail();
        customer7.setFirstName("hi!");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        customer0.setId((java.lang.Long) 0L);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet9 = customer8.getOrders();
        customer8.setEmail("");
        customer8.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet14 = customer8.getOrders();
        customer0.setOrders(orderSet14);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNotNull(orderSet9);
        org.junit.Assert.assertNotNull(orderSet14);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        java.lang.Long long8 = customer0.getId();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet9 = customer0.getOrders();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNotNull(orderSet9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer2.getOrders();
        customer0.setOrders(orderSet3);
        customer0.setLastName("");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet7 = customer0.getOrders();
        java.lang.String str8 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNotNull(orderSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        order0.setTotalQuantity((int) (byte) 10);
        org.junit.Assert.assertNull(address1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        order3.setTotalQuantity(100);
        order3.setTotalQuantity((int) (byte) 10);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        java.lang.Class<?> wildcardClass18 = orderItemSet16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        customer11.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer0.add(order2);
        java.lang.String str4 = customer0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        orderItem0.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        orderItem10.setQuantity((int) '#');
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        int int7 = order3.getTotalQuantity();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet8 = order3.getOrderItems();
        order3.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(orderItemSet8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        java.lang.Class<?> wildcardClass14 = customer0.getClass();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        address16.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        java.lang.String str2 = address0.getZipCode();
        java.lang.Long long3 = address0.getId();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Class<?> wildcardClass6 = address0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        customer7.setEmail("");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        java.lang.String str12 = address6.getCity();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        java.lang.String str10 = order3.getOrderTrackingNumber();
        java.util.Date date11 = null;
        order3.setLastUpdated(date11);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        java.lang.Long long27 = customer20.getId();
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        com.shittu24.ecommerce.entity.ProductCategory productCategory16 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(productCategory16);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        com.shittu24.ecommerce.entity.ProductCategory productCategory2 = product0.getCategory();
        java.lang.Long long3 = product0.getId();
        product0.setActive(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(productCategory2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long3 = address0.getId();
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        java.util.Date date15 = null;
        product0.setDateCreated(date15);
        product0.setActive(true);
        java.math.BigDecimal bigDecimal19 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(bigDecimal19);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        java.util.Date date17 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        java.lang.String str4 = address0.getCountry();
        address0.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        java.lang.Class<?> wildcardClass20 = orderItem10.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet6 = customer0.getOrders();
        java.lang.Class<?> wildcardClass7 = orderSet6.getClass();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNotNull(orderSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date1 = null;
        order0.setLastUpdated(date1);
        com.shittu24.ecommerce.entity.Address address3 = order0.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order7.getOrderItems();
        java.util.Date date10 = order7.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer11 = order7.getCustomer();
        order7.setTotalQuantity((int) (byte) 0);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order7.getOrderItems();
        order0.setOrderItems(orderItemSet14);
        java.util.Date date16 = null;
        order0.setLastUpdated(date16);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNotNull(orderItemSet14);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        orderItem0.setProductId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.lang.String str3 = customer0.getLastName();
        java.lang.String str4 = customer0.getEmail();
        customer0.setFirstName("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet4 = customer0.getOrders();
        java.lang.Class<?> wildcardClass5 = customer0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setFirstName("");
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Date date9 = order7.getDateCreated();
        java.lang.Long long10 = order7.getId();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        order7.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Customer customer17 = order7.getCustomer();
        customer0.add(order7);
        java.lang.String str19 = order7.getOrderTrackingNumber();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(customer17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getImageUrl();
        int int5 = product0.getUnitsInStock();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 100L);
        com.shittu24.ecommerce.entity.ProductCategory productCategory6 = null;
        product0.setCategory(productCategory6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getBillingAddress();
        java.util.Date date7 = null;
        order0.setLastUpdated(date7);
        com.shittu24.ecommerce.entity.Address address9 = order0.getShippingAddress();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.String str6 = orderItem0.getImageUrl();
        com.shittu24.ecommerce.entity.Order order7 = orderItem0.getOrder();
        orderItem0.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal4 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        java.util.Date date14 = null;
        order3.setDateCreated(date14);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        java.math.BigDecimal bigDecimal21 = order3.getTotalPrice();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNull(bigDecimal21);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.toString();
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.util.Date date10 = null;
        order3.setDateCreated(date10);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        address0.setZipCode("hi!");
        java.lang.String str7 = address0.getStreet();
        address0.setCountry("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        int int19 = order8.getTotalQuantity();
        com.shittu24.ecommerce.entity.Address address20 = order8.getBillingAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(address20);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        java.util.Date date13 = order3.getDateCreated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        java.lang.Long long17 = orderItem10.getId();
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
        com.shittu24.ecommerce.entity.OrderItem orderItem28 = new com.shittu24.ecommerce.entity.OrderItem();
        int int29 = orderItem28.getQuantity();
        java.lang.Long long30 = orderItem28.getProductId();
        order21.add(orderItem28);
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer32.add(order33);
        com.shittu24.ecommerce.entity.Order order35 = new com.shittu24.ecommerce.entity.Order();
        customer32.add(order35);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet37 = order35.getOrderItems();
        java.lang.String str38 = order35.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet39 = order35.getOrderItems();
        order21.setOrderItems(orderItemSet39);
        java.math.BigDecimal bigDecimal41 = order21.getTotalPrice();
        orderItem10.setOrder(order21);
        order21.setTotalQuantity((int) 'a');
        com.shittu24.ecommerce.entity.Customer customer45 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order46 = null;
        customer45.add(order46);
        com.shittu24.ecommerce.entity.Order order48 = new com.shittu24.ecommerce.entity.Order();
        customer45.add(order48);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet50 = order48.getOrderItems();
        java.util.Date date51 = order48.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer52 = order48.getCustomer();
        customer52.setId((java.lang.Long) 1L);
        order21.setCustomer(customer52);
        com.shittu24.ecommerce.entity.Address address56 = order21.getBillingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNotNull(orderItemSet37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(orderItemSet39);
        org.junit.Assert.assertNull(bigDecimal41);
        org.junit.Assert.assertNotNull(orderItemSet50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertNotNull(customer52);
        org.junit.Assert.assertNull(address56);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.lang.Long long21 = address12.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(long21);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        com.shittu24.ecommerce.entity.Address address10 = order3.getBillingAddress();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(address10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        product0.setUnitsInStock((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        orderItem0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        address20.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str33 = address20.getZipCode();
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
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        java.lang.String str8 = customer0.getFirstName();
        customer0.setLastName("hi!");
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        java.lang.Long long30 = address24.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(long30);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.Long long1 = customer0.getId();
        customer0.setLastName("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        product0.setActive(false);
        product0.setName("hi!");
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        java.math.BigDecimal bigDecimal12 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(bigDecimal12);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        java.lang.Long long4 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        java.lang.String str18 = product0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.math.BigDecimal bigDecimal9 = null;
        product0.setUnitPrice(bigDecimal9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        com.shittu24.ecommerce.entity.OrderItem orderItem11 = new com.shittu24.ecommerce.entity.OrderItem();
        int int12 = orderItem11.getQuantity();
        orderItem11.setId((java.lang.Long) 10L);
        java.lang.String str15 = orderItem11.getImageUrl();
        boolean boolean16 = product0.equals((java.lang.Object) orderItem11);
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        product0.setId((java.lang.Long) (-1L));
        boolean boolean11 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.math.BigDecimal bigDecimal16 = null;
        order3.setTotalPrice(bigDecimal16);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        customer0.setEmail("hi!");
        customer0.setId((java.lang.Long) 1L);
        java.lang.String str12 = customer0.getLastName();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        java.math.BigDecimal bigDecimal29 = null;
        orderItem20.setUnitPrice(bigDecimal29);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.Long long12 = order3.getId();
        java.lang.String str13 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        int int14 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        java.util.Date date15 = null;
        order10.setLastUpdated(date15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.String str2 = customer0.getEmail();
        java.lang.String str3 = customer0.getFirstName();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str8 = customer0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order15.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order15.getOrderItems();
        orderItem0.setOrder(order15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNotNull(orderItemSet18);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        customer7.setEmail("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = customer7.getEmail();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        java.lang.Long long5 = orderItem0.getId();
        orderItem0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer2.getOrders();
        customer0.setOrders(orderSet3);
        customer0.setLastName("");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet7 = customer0.getOrders();
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
        java.lang.String str20 = order11.getOrderTrackingNumber();
        customer0.add(order11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNotNull(orderSet7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.lang.Long long4 = orderItem0.getId();
        orderItem0.setQuantity(0);
        java.math.BigDecimal bigDecimal7 = null;
        orderItem0.setUnitPrice(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        order3.setStatus("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        product0.setActive(true);
        int int3 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str6 = customer0.getFirstName();
        java.lang.String str7 = customer0.getEmail();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        address16.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.Long long6 = orderItem0.getId();
        java.lang.Long long7 = orderItem0.getProductId();
        java.lang.String str8 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getDescription();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        java.util.Date date9 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.lang.String str10 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        address9.setZipCode("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        orderItem10.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        java.lang.String str3 = customer0.getEmail();
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Date date9 = order7.getDateCreated();
        java.lang.Long long10 = order7.getId();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        order7.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet20 = customer17.getOrders();
        customer17.setEmail("");
        customer17.setId((java.lang.Long) 10L);
        java.lang.String str25 = customer17.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet26 = customer17.getOrders();
        customer11.setOrders(orderSet26);
        customer0.setOrders(orderSet26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(orderSet20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(orderSet26);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setLastUpdated(date7);
        product0.setSku("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        com.shittu24.ecommerce.entity.Order order44 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address45 = order44.getBillingAddress();
        order44.setOrderTrackingNumber("");
        java.util.Date date48 = null;
        order44.setLastUpdated(date48);
        com.shittu24.ecommerce.entity.Address address50 = new com.shittu24.ecommerce.entity.Address();
        order44.setBillingAddress(address50);
        java.lang.String str52 = address50.getState();
        java.lang.String str53 = address50.getCountry();
        java.lang.String str54 = address50.getCountry();
        java.lang.String str55 = address50.getCity();
        order27.setShippingAddress(address50);
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
        org.junit.Assert.assertNull(address45);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet41 = order39.getOrderItems();
        com.shittu24.ecommerce.entity.Address address42 = new com.shittu24.ecommerce.entity.Address();
        address42.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str45 = address42.getZipCode();
        java.lang.String str46 = address42.getZipCode();
        com.shittu24.ecommerce.entity.Order order47 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address48 = order47.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address49 = order47.getShippingAddress();
        address42.setOrder(order47);
        com.shittu24.ecommerce.entity.Customer customer51 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order52 = null;
        customer51.add(order52);
        com.shittu24.ecommerce.entity.Order order54 = new com.shittu24.ecommerce.entity.Order();
        customer51.add(order54);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet56 = order54.getOrderItems();
        java.lang.String str57 = order54.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet58 = order54.getOrderItems();
        order47.setOrderItems(orderItemSet58);
        order39.setOrderItems(orderItemSet58);
        order3.setOrderItems(orderItemSet58);
        order3.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderSet24);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(bigDecimal33);
        org.junit.Assert.assertNotNull(orderItemSet41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(address48);
        org.junit.Assert.assertNull(address49);
        org.junit.Assert.assertNotNull(orderItemSet56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(orderItemSet58);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        java.lang.Long long36 = address16.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(long36);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        java.math.BigDecimal bigDecimal5 = null;
        product0.setUnitPrice(bigDecimal5);
        product0.setActive(true);
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        java.util.Date date11 = order3.getDateCreated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        order3.setTotalQuantity(35);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        customer0.setId((java.lang.Long) 10L);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        product0.setDescription("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        java.lang.String str13 = customer12.getEmail();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNotNull(customer12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        boolean boolean9 = product0.isActive();
        java.util.Date date10 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.Product product11 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str12 = product11.getSku();
        java.lang.Long long13 = product11.getId();
        product11.setUnitsInStock((int) (byte) -1);
        product11.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int18 = product11.getUnitsInStock();
        product11.setActive(false);
        boolean boolean21 = product0.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass22 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        order3.setTotalQuantity((int) (short) 0);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        java.lang.String str8 = customer0.getEmail();
        customer0.setId((java.lang.Long) 10L);
        customer0.setLastName("");
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        int int7 = product0.getUnitsInStock();
        java.util.Date date8 = null;
        product0.setDateCreated(date8);
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        java.util.Date date12 = null;
        product0.setDateCreated(date12);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        java.math.BigDecimal bigDecimal11 = null;
        order3.setTotalPrice(bigDecimal11);
        java.util.Date date13 = null;
        order3.setDateCreated(date13);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(customer10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        java.util.Date date6 = null;
        order2.setLastUpdated(date6);
        address0.setOrder(order2);
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        java.lang.String str12 = customer9.getLastName();
        java.lang.String str13 = customer9.getEmail();
        java.lang.String str14 = customer9.getLastName();
        order2.setCustomer(customer9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.util.Date date10 = null;
        order3.setLastUpdated(date10);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        address6.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str13 = address6.getStreet();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        product0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.Long long26 = address0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(long26);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        order3.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(orderItemSet11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.math.BigDecimal bigDecimal4 = orderItem0.getUnitPrice();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        customer0.setEmail("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        product0.setDescription("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        com.shittu24.ecommerce.entity.Customer customer40 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order41 = null;
        customer40.add(order41);
        com.shittu24.ecommerce.entity.Order order43 = new com.shittu24.ecommerce.entity.Order();
        customer40.add(order43);
        java.util.Date date45 = order43.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem46 = null;
        order43.add(orderItem46);
        java.lang.String str48 = order43.getStatus();
        customer20.add(order43);
        java.lang.String str50 = customer20.getEmail();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setUnitsInStock(10);
        java.util.Date date6 = null;
        product0.setLastUpdated(date6);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.math.BigDecimal bigDecimal11 = null;
        order3.setTotalPrice(bigDecimal11);
        order3.setOrderTrackingNumber("hi!");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(customer10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        int int6 = orderItem0.getQuantity();
        int int7 = orderItem0.getQuantity();
        java.lang.Long long8 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        order3.setId((java.lang.Long) 1L);
        order3.setOrderTrackingNumber("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.util.Date date9 = product0.getDateCreated();
        java.util.Date date10 = product0.getDateCreated();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str13 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        java.lang.Long long3 = customer0.getId();
        customer0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        address0.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        java.lang.String str8 = customer0.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet9 = customer0.getOrders();
        java.lang.String str10 = customer0.getFirstName();
        java.lang.String str11 = customer0.getFirstName();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(orderSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.util.Date date9 = product0.getDateCreated();
        java.util.Date date10 = product0.getDateCreated();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long13 = product0.getId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        com.shittu24.ecommerce.entity.ProductCategory productCategory13 = null;
        product0.setCategory(productCategory13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        java.math.BigDecimal bigDecimal10 = product0.getUnitPrice();
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.toString();
        java.lang.String str9 = product0.getImageUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        orderItem10.setQuantity((int) 'a');
        orderItem10.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order6 = null;
        orderItem0.setOrder(order6);
        java.math.BigDecimal bigDecimal8 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.math.BigDecimal bigDecimal12 = null;
        order3.setTotalPrice(bigDecimal12);
        order3.setTotalQuantity((int) 'a');
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal2 = orderItem0.getUnitPrice();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(bigDecimal2);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        customer7.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order6 = address0.getOrder();
        java.lang.String str7 = address0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        java.math.BigDecimal bigDecimal5 = null;
        product0.setUnitPrice(bigDecimal5);
        java.lang.String str7 = product0.toString();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)" + "'", str7, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        com.shittu24.ecommerce.entity.ProductCategory productCategory4 = product0.getCategory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = productCategory4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(productCategory4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setActive(true);
        java.lang.String str9 = product0.getSku();
        java.lang.String str10 = product0.toString();
        com.shittu24.ecommerce.entity.ProductCategory productCategory11 = null;
        product0.setCategory(productCategory11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        com.shittu24.ecommerce.entity.ProductCategory productCategory25 = product0.getCategory();
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
        org.junit.Assert.assertNull(productCategory25);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order3 = address0.getOrder();
        java.lang.String str4 = address0.getState();
        com.shittu24.ecommerce.entity.Customer customer5 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order6 = null;
        customer5.add(order6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        customer5.add(order8);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order8.getOrderItems();
        java.math.BigDecimal bigDecimal11 = null;
        order8.setTotalPrice(bigDecimal11);
        java.lang.String str13 = order8.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order8.getOrderItems();
        com.shittu24.ecommerce.entity.Address address15 = order8.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet19 = customer16.getOrders();
        order8.setCustomer(customer16);
        com.shittu24.ecommerce.entity.Address address21 = null;
        order8.setShippingAddress(address21);
        address0.setOrder(order8);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertNotNull(orderSet19);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setDescription("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(productCategory7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        java.lang.String str13 = product0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setQuantity(1);
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order7.getOrderItems();
        java.math.BigDecimal bigDecimal10 = null;
        order7.setTotalPrice(bigDecimal10);
        orderItem0.setOrder(order7);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(orderItemSet9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(productCategory10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.lang.Long long14 = address6.getId();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        java.lang.String str16 = orderItem10.getImageUrl();
        java.lang.Long long17 = orderItem10.getProductId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        orderItem7.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.String str9 = product0.toString();
        java.lang.Class<?> wildcardClass10 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal5 = null;
        orderItem0.setUnitPrice(bigDecimal5);
        java.lang.String str7 = orderItem0.getImageUrl();
        java.math.BigDecimal bigDecimal8 = null;
        orderItem0.setUnitPrice(bigDecimal8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.String str30 = order15.getOrderTrackingNumber();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(orderSet11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        customer14.setId((java.lang.Long) 0L);
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
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.String str19 = address9.getZipCode();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.String str25 = customer11.getLastName();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet15 = customer14.getOrders();
        customer14.setEmail("");
        customer14.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str20 = customer14.getFirstName();
        order3.setCustomer(customer14);
        com.shittu24.ecommerce.entity.Customer customer22 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order23 = null;
        customer22.add(order23);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        customer22.add(order25);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet27 = order25.getOrderItems();
        com.shittu24.ecommerce.entity.Address address28 = new com.shittu24.ecommerce.entity.Address();
        address28.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str31 = address28.getZipCode();
        java.lang.String str32 = address28.getZipCode();
        com.shittu24.ecommerce.entity.Order order33 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address34 = order33.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address35 = order33.getShippingAddress();
        address28.setOrder(order33);
        com.shittu24.ecommerce.entity.Customer customer37 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order38 = null;
        customer37.add(order38);
        com.shittu24.ecommerce.entity.Order order40 = new com.shittu24.ecommerce.entity.Order();
        customer37.add(order40);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet42 = order40.getOrderItems();
        java.lang.String str43 = order40.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet44 = order40.getOrderItems();
        order33.setOrderItems(orderItemSet44);
        order25.setOrderItems(orderItemSet44);
        com.shittu24.ecommerce.entity.Order order47 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address48 = order47.getBillingAddress();
        order47.setOrderTrackingNumber("");
        java.util.Date date51 = null;
        order47.setLastUpdated(date51);
        com.shittu24.ecommerce.entity.Address address53 = new com.shittu24.ecommerce.entity.Address();
        order47.setBillingAddress(address53);
        java.lang.String str55 = address53.getState();
        java.lang.String str56 = address53.getCountry();
        order25.setShippingAddress(address53);
        address53.setState("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setShippingAddress(address53);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
        org.junit.Assert.assertNotNull(orderSet15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(address34);
        org.junit.Assert.assertNull(address35);
        org.junit.Assert.assertNotNull(orderItemSet42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(orderItemSet44);
        org.junit.Assert.assertNull(address48);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        java.lang.String str16 = orderItem13.getImageUrl();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        com.shittu24.ecommerce.entity.Customer customer25 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order26 = null;
        customer25.add(order26);
        com.shittu24.ecommerce.entity.Order order28 = new com.shittu24.ecommerce.entity.Order();
        customer25.add(order28);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet30 = order28.getOrderItems();
        java.math.BigDecimal bigDecimal31 = null;
        order28.setTotalPrice(bigDecimal31);
        com.shittu24.ecommerce.entity.Order order33 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address34 = order33.getBillingAddress();
        order33.setOrderTrackingNumber("");
        java.util.Date date37 = null;
        order33.setLastUpdated(date37);
        com.shittu24.ecommerce.entity.Address address39 = new com.shittu24.ecommerce.entity.Address();
        order33.setBillingAddress(address39);
        java.lang.String str41 = address39.getState();
        java.lang.String str42 = address39.getCountry();
        java.lang.String str43 = address39.getState();
        order28.setBillingAddress(address39);
        com.shittu24.ecommerce.entity.Customer customer45 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str46 = customer45.getFirstName();
        java.lang.String str47 = customer45.getEmail();
        customer45.setEmail("");
        java.lang.Long long50 = customer45.getId();
        order28.setCustomer(customer45);
        customer45.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order54 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address55 = order54.getBillingAddress();
        order54.setOrderTrackingNumber("");
        java.util.Date date58 = null;
        order54.setLastUpdated(date58);
        com.shittu24.ecommerce.entity.Address address60 = new com.shittu24.ecommerce.entity.Address();
        order54.setBillingAddress(address60);
        customer45.add(order54);
        customer45.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet65 = customer45.getOrders();
        order19.setCustomer(customer45);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(orderItemSet30);
        org.junit.Assert.assertNull(address34);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(long50);
        org.junit.Assert.assertNull(address55);
        org.junit.Assert.assertNotNull(orderSet65);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        order3.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(productCategory7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        com.shittu24.ecommerce.entity.OrderItem orderItem11 = new com.shittu24.ecommerce.entity.OrderItem();
        int int12 = orderItem11.getQuantity();
        orderItem11.setId((java.lang.Long) 10L);
        java.lang.String str15 = orderItem11.getImageUrl();
        boolean boolean16 = product0.equals((java.lang.Object) orderItem11);
        java.util.Date date17 = product0.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address18 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str19 = address18.getCountry();
        java.lang.Long long20 = address18.getId();
        address18.setZipCode("hi!");
        address18.setZipCode("hi!");
        boolean boolean25 = product0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        address0.setCountry("hi!");
        java.lang.Long long9 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet10 = customer7.getOrders();
        java.lang.Class<?> wildcardClass11 = orderSet10.getClass();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        customer3.setLastName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.util.Date date25 = product0.getDateCreated();
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
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        java.lang.Class<?> wildcardClass24 = order3.getClass();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        address6.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = address6.getStreet();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        com.shittu24.ecommerce.entity.Customer customer40 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order41 = null;
        customer40.add(order41);
        com.shittu24.ecommerce.entity.Order order43 = new com.shittu24.ecommerce.entity.Order();
        customer40.add(order43);
        java.util.Date date45 = order43.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem46 = null;
        order43.add(orderItem46);
        com.shittu24.ecommerce.entity.Address address48 = null;
        order43.setShippingAddress(address48);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet50 = order43.getOrderItems();
        order43.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer53 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet54 = customer53.getOrders();
        customer53.setEmail("");
        java.lang.String str57 = customer53.getFirstName();
        customer53.setFirstName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order43.setCustomer(customer53);
        com.shittu24.ecommerce.entity.Customer customer61 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order62 = null;
        customer61.add(order62);
        com.shittu24.ecommerce.entity.Order order64 = new com.shittu24.ecommerce.entity.Order();
        customer61.add(order64);
        java.util.Date date66 = order64.getDateCreated();
        java.lang.Long long67 = order64.getId();
        com.shittu24.ecommerce.entity.Customer customer68 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order69 = null;
        customer68.add(order69);
        com.shittu24.ecommerce.entity.Order order71 = new com.shittu24.ecommerce.entity.Order();
        customer68.add(order71);
        order64.setCustomer(customer68);
        com.shittu24.ecommerce.entity.Customer customer74 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order75 = null;
        customer74.add(order75);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet77 = customer74.getOrders();
        customer74.setEmail("");
        customer74.setId((java.lang.Long) 10L);
        java.lang.String str82 = customer74.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet83 = customer74.getOrders();
        customer68.setOrders(orderSet83);
        customer53.setOrders(orderSet83);
        customer20.setOrders(orderSet83);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNotNull(orderItemSet50);
        org.junit.Assert.assertNotNull(orderSet54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNotNull(orderSet77);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(orderSet83);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        java.lang.String str4 = orderItem0.getImageUrl();
        java.lang.Long long5 = orderItem0.getProductId();
        int int6 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal7 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(bigDecimal7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        java.lang.String str9 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.lang.String str17 = address0.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str17, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        java.lang.String str17 = address9.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getCity();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.util.Date date6 = product0.getLastUpdated();
        boolean boolean7 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getEmail();
        java.lang.String str2 = customer0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        address6.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setZipCode("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long13 = address6.getId();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.String str18 = product0.getImageUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        address14.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.Long long1 = customer0.getId();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str4 = customer0.getFirstName();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        java.math.BigDecimal bigDecimal18 = order3.getTotalPrice();
        java.util.Date date19 = order3.getDateCreated();
        java.util.Date date20 = order3.getDateCreated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(bigDecimal18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        boolean boolean12 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(productCategory10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        java.lang.Long long6 = product0.getId();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet10 = customer7.getOrders();
        customer7.setLastName("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderSet10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.util.Date date12 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        address6.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.util.Date date17 = order14.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer18 = order14.getCustomer();
        address6.setOrder(order14);
        address6.setZipCode("hi!");
        java.lang.String str22 = address6.getZipCode();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(customer18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        product0.setActive(true);
        java.util.Date date3 = product0.getDateCreated();
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setDescription("");
        product0.setName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.String str16 = product0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        java.lang.String str3 = customer0.getEmail();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setFirstName("");
        customer0.setFirstName("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.OrderItem orderItem1 = new com.shittu24.ecommerce.entity.OrderItem();
        int int2 = orderItem1.getQuantity();
        orderItem1.setId((java.lang.Long) 10L);
        java.lang.String str5 = orderItem1.getImageUrl();
        boolean boolean6 = product0.equals((java.lang.Object) orderItem1);
        java.math.BigDecimal bigDecimal7 = orderItem1.getUnitPrice();
        java.lang.String str8 = orderItem1.getImageUrl();
        java.math.BigDecimal bigDecimal9 = orderItem1.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str14 = customer13.getFirstName();
        java.lang.String str15 = customer13.getEmail();
        java.lang.String str16 = customer13.getFirstName();
        customer13.setLastName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setCustomer(customer13);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getStreet();
        com.shittu24.ecommerce.entity.Order order7 = address0.getOrder();
        address0.setCity("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.lang.String str17 = order14.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order14.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = null;
        order22.add(orderItem25);
        order22.setOrderTrackingNumber("");
        java.util.Date date29 = order22.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet30 = order22.getOrderItems();
        order14.setOrderItems(orderItemSet30);
        order3.setOrderItems(orderItemSet30);
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        com.shittu24.ecommerce.entity.Order order36 = new com.shittu24.ecommerce.entity.Order();
        customer33.add(order36);
        java.util.Date date38 = order36.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem39 = null;
        order36.add(orderItem39);
        com.shittu24.ecommerce.entity.Address address41 = null;
        order36.setShippingAddress(address41);
        com.shittu24.ecommerce.entity.OrderItem orderItem43 = new com.shittu24.ecommerce.entity.OrderItem();
        int int44 = orderItem43.getQuantity();
        java.lang.Long long45 = orderItem43.getProductId();
        order36.add(orderItem43);
        com.shittu24.ecommerce.entity.Customer customer47 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order48 = null;
        customer47.add(order48);
        com.shittu24.ecommerce.entity.Order order50 = new com.shittu24.ecommerce.entity.Order();
        customer47.add(order50);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet52 = order50.getOrderItems();
        java.lang.String str53 = order50.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet54 = order50.getOrderItems();
        order36.setOrderItems(orderItemSet54);
        order3.setOrderItems(orderItemSet54);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNotNull(orderItemSet30);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(long45);
        org.junit.Assert.assertNotNull(orderItemSet52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(orderItemSet54);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.OrderItem orderItem1 = new com.shittu24.ecommerce.entity.OrderItem();
        int int2 = orderItem1.getQuantity();
        orderItem1.setId((java.lang.Long) 10L);
        java.lang.String str5 = orderItem1.getImageUrl();
        boolean boolean6 = product0.equals((java.lang.Object) orderItem1);
        product0.setName("hi!");
        java.lang.String str9 = product0.getName();
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet11 = customer8.getOrders();
        customer8.setEmail("");
        customer8.setEmail("");
        java.lang.Long long16 = customer8.getId();
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date18 = null;
        order17.setLastUpdated(date18);
        java.math.BigDecimal bigDecimal20 = order17.getTotalPrice();
        customer8.add(order17);
        order17.setStatus("hi!");
        customer0.add(order17);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNotNull(orderSet11);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(bigDecimal20);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        com.shittu24.ecommerce.entity.ProductCategory productCategory33 = null;
        product0.setCategory(productCategory33);
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getBillingAddress();
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address8 = order7.getBillingAddress();
        order7.setOrderTrackingNumber("");
        java.util.Date date11 = null;
        order7.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.Address address13 = new com.shittu24.ecommerce.entity.Address();
        order7.setBillingAddress(address13);
        java.lang.String str15 = address13.getState();
        java.lang.String str16 = address13.getCountry();
        java.lang.String str17 = address13.getState();
        java.lang.Long long18 = address13.getId();
        order0.setBillingAddress(address13);
        java.lang.Class<?> wildcardClass20 = order0.getClass();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        address0.setState("");
        java.lang.String str19 = address0.getStreet();
        address0.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str22 = address0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.lang.String str15 = orderItem0.getImageUrl();
        java.lang.Long long16 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order3 = null;
        customer2.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer2.getOrders();
        customer0.setOrders(orderSet5);
        java.lang.String str7 = customer0.getEmail();
        customer0.setEmail("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long10 = customer0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        customer0.setFirstName("hi!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        java.lang.String str8 = address0.getZipCode();
        java.lang.Long long9 = address0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        order3.setTotalQuantity((int) (short) 10);
        java.lang.String str10 = order3.getStatus();
        java.util.Date date11 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Long long15 = orderItem0.getId();
        java.lang.Long long16 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        customer20.setFirstName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str31 = customer20.getEmail();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        product0.setId((java.lang.Long) 0L);
        product0.setActive(false);
        java.util.Date date9 = product0.getLastUpdated();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order21 = null;
        customer20.add(order21);
        com.shittu24.ecommerce.entity.Order order23 = new com.shittu24.ecommerce.entity.Order();
        customer20.add(order23);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet25 = order23.getOrderItems();
        java.util.Date date26 = order23.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str28 = customer27.getFirstName();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer27.add(order29);
        java.lang.Long long31 = customer27.getId();
        order23.setCustomer(customer27);
        com.shittu24.ecommerce.entity.OrderItem orderItem33 = new com.shittu24.ecommerce.entity.OrderItem();
        int int34 = orderItem33.getQuantity();
        order23.add(orderItem33);
        com.shittu24.ecommerce.entity.Product product36 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str37 = product36.getSku();
        java.lang.Long long38 = product36.getId();
        product36.setUnitsInStock((int) (byte) -1);
        product36.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int43 = product36.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer44 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order45 = null;
        customer44.add(order45);
        com.shittu24.ecommerce.entity.Order order47 = new com.shittu24.ecommerce.entity.Order();
        customer44.add(order47);
        java.util.Date date49 = order47.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem50 = null;
        order47.add(orderItem50);
        java.util.Date date52 = null;
        order47.setLastUpdated(date52);
        boolean boolean54 = product36.equals((java.lang.Object) order47);
        orderItem33.setOrder(order47);
        com.shittu24.ecommerce.entity.Customer customer56 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order57 = null;
        customer56.add(order57);
        com.shittu24.ecommerce.entity.Order order59 = new com.shittu24.ecommerce.entity.Order();
        customer56.add(order59);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet61 = order59.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet62 = order59.getOrderItems();
        order47.setOrderItems(orderItemSet62);
        order3.setOrderItems(orderItemSet62);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(orderItemSet25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(orderItemSet61);
        org.junit.Assert.assertNotNull(orderItemSet62);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        java.util.Date date15 = null;
        product0.setDateCreated(date15);
        java.util.Date date17 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        product0.setActive(false);
        java.lang.String str20 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str20, "Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = new com.shittu24.ecommerce.entity.Address();
        order0.setShippingAddress(address1);
        order0.setId((java.lang.Long) 0L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        address6.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.lang.String str17 = order14.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order14.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = null;
        order22.add(orderItem25);
        order22.setOrderTrackingNumber("");
        java.util.Date date29 = order22.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet30 = order22.getOrderItems();
        order14.setOrderItems(orderItemSet30);
        address6.setOrder(order14);
        address6.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNotNull(orderItemSet30);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.util.Date date16 = null;
        order3.setLastUpdated(date16);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        order3.setTotalQuantity((int) (short) 10);
        order3.setStatus("");
        com.shittu24.ecommerce.entity.Address address12 = new com.shittu24.ecommerce.entity.Address();
        address12.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str15 = address12.getZipCode();
        java.lang.String str16 = address12.getZipCode();
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address18 = order17.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address19 = order17.getShippingAddress();
        address12.setOrder(order17);
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet26 = order24.getOrderItems();
        java.lang.String str27 = order24.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet28 = order24.getOrderItems();
        order17.setOrderItems(orderItemSet28);
        com.shittu24.ecommerce.entity.Customer customer30 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order31 = null;
        customer30.add(order31);
        com.shittu24.ecommerce.entity.Order order33 = new com.shittu24.ecommerce.entity.Order();
        customer30.add(order33);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet35 = order33.getOrderItems();
        com.shittu24.ecommerce.entity.Address address36 = new com.shittu24.ecommerce.entity.Address();
        address36.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str39 = address36.getZipCode();
        java.lang.String str40 = address36.getZipCode();
        com.shittu24.ecommerce.entity.Order order41 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address42 = order41.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address43 = order41.getShippingAddress();
        address36.setOrder(order41);
        com.shittu24.ecommerce.entity.Customer customer45 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order46 = null;
        customer45.add(order46);
        com.shittu24.ecommerce.entity.Order order48 = new com.shittu24.ecommerce.entity.Order();
        customer45.add(order48);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet50 = order48.getOrderItems();
        java.lang.String str51 = order48.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet52 = order48.getOrderItems();
        order41.setOrderItems(orderItemSet52);
        order33.setOrderItems(orderItemSet52);
        order17.setOrderItems(orderItemSet52);
        order3.setOrderItems(orderItemSet52);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(address19);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(orderItemSet28);
        org.junit.Assert.assertNotNull(orderItemSet35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(address42);
        org.junit.Assert.assertNull(address43);
        org.junit.Assert.assertNotNull(orderItemSet50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(orderItemSet52);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getStreet();
        address0.setCity("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        address9.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address9.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        product0.setUnitsInStock((int) (byte) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        java.lang.String str13 = product0.getImageUrl();
        java.lang.String str14 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        product0.setLastUpdated(date19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.lang.Class<?> wildcardClass14 = orderItem10.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        int int9 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        int int11 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(productCategory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.util.Date date20 = product6.getDateCreated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(productCategory11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        orderItem0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = product0.getLastUpdated();
        java.math.BigDecimal bigDecimal10 = product0.getUnitPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        product0.setSku("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        customer0.setEmail("hi!");
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet3);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        com.shittu24.ecommerce.entity.Address address22 = order7.getBillingAddress();
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.Long long17 = orderItem10.getId();
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
        com.shittu24.ecommerce.entity.OrderItem orderItem28 = new com.shittu24.ecommerce.entity.OrderItem();
        int int29 = orderItem28.getQuantity();
        java.lang.Long long30 = orderItem28.getProductId();
        order21.add(orderItem28);
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer32.add(order33);
        com.shittu24.ecommerce.entity.Order order35 = new com.shittu24.ecommerce.entity.Order();
        customer32.add(order35);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet37 = order35.getOrderItems();
        java.lang.String str38 = order35.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet39 = order35.getOrderItems();
        order21.setOrderItems(orderItemSet39);
        java.math.BigDecimal bigDecimal41 = order21.getTotalPrice();
        orderItem10.setOrder(order21);
        order21.setTotalQuantity((int) 'a');
        com.shittu24.ecommerce.entity.Customer customer45 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order46 = null;
        customer45.add(order46);
        com.shittu24.ecommerce.entity.Order order48 = new com.shittu24.ecommerce.entity.Order();
        customer45.add(order48);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet50 = order48.getOrderItems();
        java.util.Date date51 = order48.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer52 = order48.getCustomer();
        customer52.setId((java.lang.Long) 1L);
        order21.setCustomer(customer52);
        java.lang.Long long56 = order21.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNotNull(orderItemSet37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(orderItemSet39);
        org.junit.Assert.assertNull(bigDecimal41);
        org.junit.Assert.assertNotNull(orderItemSet50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertNotNull(customer52);
        org.junit.Assert.assertNull(long56);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address26 = order25.getBillingAddress();
        order25.setOrderTrackingNumber("");
        java.util.Date date29 = null;
        order25.setLastUpdated(date29);
        com.shittu24.ecommerce.entity.Address address31 = new com.shittu24.ecommerce.entity.Address();
        order25.setBillingAddress(address31);
        java.lang.String str33 = address31.getState();
        java.lang.String str34 = address31.getCountry();
        java.lang.String str35 = address31.getCountry();
        java.lang.String str36 = address31.getCity();
        java.lang.String str37 = address31.getCity();
        order17.setBillingAddress(address31);
        com.shittu24.ecommerce.entity.Order order39 = address31.getOrder();
        order9.setShippingAddress(address31);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(address26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(order39);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        order3.setStatus("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        java.lang.String str8 = address0.getCountry();
        java.lang.String str9 = address0.getCountry();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        java.util.Date date7 = order3.getDateCreated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.lang.String str38 = order29.getOrderTrackingNumber();
        java.lang.String str39 = order29.getStatus();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        order9.setOrderTrackingNumber("hi!");
        java.util.Date date17 = null;
        order9.setDateCreated(date17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setLastUpdated(date7);
        product0.setSku("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Class<?> wildcardClass11 = product0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getEmail();
        customer0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        java.util.Date date8 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.Customer customer9 = order3.getCustomer();
        java.lang.Long long10 = customer9.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(customer9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        customer0.setFirstName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.util.Date date15 = null;
        product0.setDateCreated(date15);
        product0.setActive(true);
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setUnitsInStock(10);
        java.util.Date date6 = product0.getDateCreated();
        int int7 = product0.getUnitsInStock();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        order3.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Address address7 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order11.getOrderItems();
        java.lang.String str14 = order11.getStatus();
        java.lang.Long long15 = order11.getId();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order19.getOrderItems();
        java.lang.String str22 = order19.getStatus();
        java.util.Date date23 = order19.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer24 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str25 = customer24.getFirstName();
        java.lang.Long long26 = customer24.getId();
        order19.setCustomer(customer24);
        com.shittu24.ecommerce.entity.Address address28 = new com.shittu24.ecommerce.entity.Address();
        address28.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str31 = address28.getZipCode();
        java.lang.String str32 = address28.getZipCode();
        order19.setBillingAddress(address28);
        java.lang.String str34 = address28.getStreet();
        address28.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order11.setShippingAddress(address28);
        address28.setId((java.lang.Long) 10L);
        order3.setShippingAddress(address28);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getState();
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.lang.Long long10 = address0.getId();
        java.lang.String str11 = address0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal3 = null;
        orderItem0.setUnitPrice(bigDecimal3);
        orderItem0.setId((java.lang.Long) 1L);
        orderItem0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        boolean boolean9 = product0.isActive();
        java.util.Date date10 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.Product product11 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str12 = product11.getSku();
        java.lang.Long long13 = product11.getId();
        product11.setUnitsInStock((int) (byte) -1);
        product11.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int18 = product11.getUnitsInStock();
        product11.setActive(false);
        boolean boolean21 = product0.equals((java.lang.Object) false);
        boolean boolean22 = product0.isActive();
        product0.setSku("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.lang.Long long7 = order3.getId();
        java.util.Date date8 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.Customer customer9 = order3.getCustomer();
        order3.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(customer9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getState();
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.lang.Long long10 = address0.getId();
        java.lang.String str11 = address0.getCity();
        java.lang.String str12 = address0.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        product0.setUnitsInStock((int) (byte) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        customer11.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        orderItem10.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setStatus("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date4 = order0.getLastUpdated();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        com.shittu24.ecommerce.entity.Order order25 = orderItem13.getOrder();
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
        org.junit.Assert.assertNull(order25);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        orderItem10.setProductId((java.lang.Long) 0L);
        orderItem10.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address13 = order3.getShippingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address13);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.String str2 = customer0.getEmail();
        java.lang.String str3 = customer0.getFirstName();
        customer0.setEmail("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.math.BigDecimal bigDecimal14 = product0.getUnitPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bigDecimal14);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setActive(true);
        java.math.BigDecimal bigDecimal9 = null;
        product0.setUnitPrice(bigDecimal9);
        java.util.Date date11 = product0.getDateCreated();
        java.lang.String str12 = product0.toString();
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date15 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.Long long7 = product0.getId();
        java.util.Date date8 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getStreet();
        java.lang.String str7 = address0.getCity();
        address0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getStreet();
        java.lang.String str7 = address0.getCity();
        java.lang.String str8 = address0.getCountry();
        com.shittu24.ecommerce.entity.Order order9 = address0.getOrder();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        java.lang.Long long3 = customer0.getId();
        customer0.setLastName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        address9.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address9.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long23 = address9.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(long23);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long8 = order3.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.String str13 = customer8.getFirstName();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = null;
        product0.setCategory(productCategory10);
        java.lang.Class<?> wildcardClass12 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setImageUrl("hi!");
        java.lang.String str9 = product0.getSku();
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        java.math.BigDecimal bigDecimal12 = null;
        product0.setUnitPrice(bigDecimal12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory9 = null;
        product0.setCategory(productCategory9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        com.shittu24.ecommerce.entity.Order order6 = orderItem0.getOrder();
        orderItem0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        address6.setCountry("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.lang.Long long21 = address16.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNull(long21);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        order5.setOrderTrackingNumber("hi!");
        java.util.Date date11 = order5.getLastUpdated();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = date11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.lang.String str3 = customer0.getLastName();
        java.lang.String str4 = customer0.getEmail();
        java.lang.Long long5 = customer0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        orderItem10.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        product0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str8 = order7.getStatus();
        int int9 = order7.getTotalQuantity();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order13.getOrderItems();
        java.math.BigDecimal bigDecimal16 = null;
        order13.setTotalPrice(bigDecimal16);
        java.lang.String str18 = order13.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet19 = order13.getOrderItems();
        com.shittu24.ecommerce.entity.Address address20 = order13.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet24 = customer21.getOrders();
        order13.setCustomer(customer21);
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str27 = customer26.getFirstName();
        customer26.setFirstName("");
        java.lang.String str30 = customer26.getEmail();
        com.shittu24.ecommerce.entity.Customer customer31 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str32 = customer31.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order34 = null;
        customer33.add(order34);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet36 = customer33.getOrders();
        customer31.setOrders(orderSet36);
        customer26.setOrders(orderSet36);
        customer21.setOrders(orderSet36);
        order7.setCustomer(customer21);
        customer21.setFirstName("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet43 = customer21.getOrders();
        boolean boolean44 = product0.equals((java.lang.Object) orderSet43);
        java.util.Date date45 = product0.getDateCreated();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(address20);
        org.junit.Assert.assertNotNull(orderSet24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(orderSet36);
        org.junit.Assert.assertNotNull(orderSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(date45);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.OrderItem orderItem1 = new com.shittu24.ecommerce.entity.OrderItem();
        int int2 = orderItem1.getQuantity();
        orderItem1.setId((java.lang.Long) 10L);
        java.lang.String str5 = orderItem1.getImageUrl();
        boolean boolean6 = product0.equals((java.lang.Object) orderItem1);
        product0.setName("hi!");
        java.lang.String str9 = product0.getSku();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        java.math.BigDecimal bigDecimal5 = null;
        product0.setUnitPrice(bigDecimal5);
        product0.setActive(true);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date10 = null;
        order9.setLastUpdated(date10);
        boolean boolean12 = product0.equals((java.lang.Object) date10);
        java.lang.Long long13 = product0.getId();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        java.lang.Object obj3 = null;
        boolean boolean4 = product0.equals(obj3);
        product0.setName("hi!");
        product0.setSku("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("");
        product0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.lang.String str32 = customer24.getFirstName();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderSet27);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.util.Date date10 = null;
        order3.setLastUpdated(date10);
        com.shittu24.ecommerce.entity.Address address12 = order3.getBillingAddress();
        order3.setStatus("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        customer0.setId((java.lang.Long) 100L);
        java.lang.String str6 = customer0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal7 = product0.getUnitPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(bigDecimal7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        orderItem13.setQuantity((int) (short) 0);
        java.lang.String str18 = orderItem13.getImageUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        com.shittu24.ecommerce.entity.Customer customer38 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order39 = null;
        customer38.add(order39);
        com.shittu24.ecommerce.entity.Order order41 = new com.shittu24.ecommerce.entity.Order();
        customer38.add(order41);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet43 = order41.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet44 = order41.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer45 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str46 = customer45.getFirstName();
        order41.setCustomer(customer45);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet48 = customer45.getOrders();
        customer20.setOrders(orderSet48);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNotNull(orderItemSet43);
        org.junit.Assert.assertNotNull(orderItemSet44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(orderSet48);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Date date10 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.lang.String str17 = order14.getStatus();
        java.lang.Long long18 = order14.getId();
        java.util.Date date19 = order14.getDateCreated();
        order14.setTotalQuantity(100);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order14.getOrderItems();
        order3.setOrderItems(orderItemSet22);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(orderItemSet22);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal4 = null;
        orderItem0.setUnitPrice(bigDecimal4);
        orderItem0.setId((java.lang.Long) 0L);
        java.lang.Long long8 = orderItem0.getProductId();
        java.lang.Long long9 = orderItem0.getProductId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order3 = address0.getOrder();
        java.lang.String str4 = address0.getState();
        com.shittu24.ecommerce.entity.Customer customer5 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order6 = null;
        customer5.add(order6);
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        customer5.add(order8);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order8.getOrderItems();
        java.lang.String str11 = order8.getStatus();
        java.util.Date date12 = order8.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str14 = customer13.getFirstName();
        java.lang.Long long15 = customer13.getId();
        order8.setCustomer(customer13);
        com.shittu24.ecommerce.entity.Address address17 = new com.shittu24.ecommerce.entity.Address();
        address17.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str20 = address17.getZipCode();
        java.lang.String str21 = address17.getZipCode();
        order8.setBillingAddress(address17);
        address0.setOrder(order8);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setActive(false);
        product0.setActive(false);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.util.Date date5 = null;
        product0.setDateCreated(date5);
        product0.setActive(true);
        java.lang.String str9 = product0.getSku();
        java.lang.String str10 = product0.toString();
        java.lang.String str11 = product0.getSku();
        java.lang.String str12 = product0.getImageUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        int int10 = product0.getUnitsInStock();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.lang.String str17 = address0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.String str6 = orderItem0.getImageUrl();
        com.shittu24.ecommerce.entity.Order order7 = orderItem0.getOrder();
        java.lang.Class<?> wildcardClass8 = orderItem0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order11.getOrderItems();
        java.lang.String str14 = order11.getStatus();
        java.lang.Long long15 = order11.getId();
        java.util.Date date16 = null;
        order11.setLastUpdated(date16);
        java.math.BigDecimal bigDecimal18 = null;
        order11.setTotalPrice(bigDecimal18);
        address0.setOrder(order11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        int int4 = orderItem0.getQuantity();
        orderItem0.setProductId((java.lang.Long) 0L);
        orderItem0.setQuantity(100);
        orderItem0.setQuantity(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        order3.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        orderItem13.setQuantity((int) (short) 0);
        java.lang.Long long18 = orderItem13.getProductId();
        java.math.BigDecimal bigDecimal19 = null;
        orderItem13.setUnitPrice(bigDecimal19);
        orderItem13.setProductId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        com.shittu24.ecommerce.entity.ProductCategory productCategory4 = product0.getCategory();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(productCategory4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        address9.setZipCode("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        java.lang.Long long5 = address0.getId();
        address0.setId((java.lang.Long) 10L);
        address0.setZipCode("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        java.lang.String str4 = product0.getImageUrl();
        java.util.Date date5 = null;
        product0.setLastUpdated(date5);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Date date17 = order15.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem18 = null;
        order15.add(orderItem18);
        order15.setOrderTrackingNumber("");
        java.util.Date date22 = order15.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order23 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address24 = order23.getBillingAddress();
        order23.setOrderTrackingNumber("");
        java.util.Date date27 = null;
        order23.setLastUpdated(date27);
        com.shittu24.ecommerce.entity.Address address29 = new com.shittu24.ecommerce.entity.Address();
        order23.setBillingAddress(address29);
        java.lang.String str31 = address29.getState();
        java.lang.String str32 = address29.getCountry();
        java.lang.String str33 = address29.getCountry();
        java.lang.String str34 = address29.getCity();
        java.lang.String str35 = address29.getCity();
        order15.setBillingAddress(address29);
        address29.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setBillingAddress(address29);
        com.shittu24.ecommerce.entity.Address address40 = new com.shittu24.ecommerce.entity.Address();
        address40.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str43 = address40.getZipCode();
        address40.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str46 = address40.getStreet();
        com.shittu24.ecommerce.entity.Order order47 = address40.getOrder();
        order3.setBillingAddress(address40);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(address24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(order47);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        java.lang.String str8 = customer0.getEmail();
        customer0.setId((java.lang.Long) 10L);
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        java.lang.String str5 = address0.getCountry();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str5, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        orderItem0.setProductId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setImageUrl("hi!");
        java.lang.String str9 = product0.getDescription();
        java.lang.String str10 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.lang.Long long4 = order0.getId();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order0.getOrderItems();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(orderItemSet5);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        customer11.setLastName("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(orderSet17);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setQuantity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        com.shittu24.ecommerce.entity.Order order55 = orderItem46.getOrder();
        java.math.BigDecimal bigDecimal56 = null;
        orderItem46.setUnitPrice(bigDecimal56);
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
        org.junit.Assert.assertNotNull(order55);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.String str17 = product0.getImageUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str17, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.util.Date date17 = null;
        order3.setDateCreated(date17);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setId((java.lang.Long) (-1L));
        product0.setUnitsInStock((int) (short) 100);
        product0.setActive(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        java.lang.String str3 = customer0.getEmail();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        product0.setId((java.lang.Long) 0L);
        product0.setActive(false);
        java.lang.String str9 = product0.getSku();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        java.lang.String str13 = product0.getImageUrl();
        java.math.BigDecimal bigDecimal14 = product0.getUnitPrice();
        com.shittu24.ecommerce.entity.Product product15 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean17 = product15.equals((java.lang.Object) 1.0f);
        product15.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory20 = product15.getCategory();
        product15.setName("hi!");
        product15.setId((java.lang.Long) 10L);
        java.util.Date date25 = product15.getDateCreated();
        product15.setActive(true);
        java.lang.String str28 = product15.getName();
        boolean boolean29 = product0.equals((java.lang.Object) str28);
        java.math.BigDecimal bigDecimal30 = null;
        product0.setUnitPrice(bigDecimal30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(productCategory20);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        java.lang.String str13 = product0.getImageUrl();
        java.math.BigDecimal bigDecimal14 = product0.getUnitPrice();
        com.shittu24.ecommerce.entity.Product product15 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean17 = product15.equals((java.lang.Object) 1.0f);
        product15.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory20 = product15.getCategory();
        product15.setName("hi!");
        product15.setId((java.lang.Long) 10L);
        java.util.Date date25 = product15.getDateCreated();
        product15.setActive(true);
        java.lang.String str28 = product15.getName();
        boolean boolean29 = product0.equals((java.lang.Object) str28);
        int int30 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(productCategory20);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.math.BigDecimal bigDecimal12 = null;
        order3.setTotalPrice(bigDecimal12);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setImageUrl("hi!");
        product0.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setQuantity(1);
        int int4 = orderItem0.getQuantity();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setUnitsInStock((int) (short) 0);
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.math.BigDecimal bigDecimal8 = null;
        product0.setUnitPrice(bigDecimal8);
        com.shittu24.ecommerce.entity.Product product10 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean12 = product10.equals((java.lang.Object) 1.0f);
        product10.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory15 = product10.getCategory();
        int int16 = product10.getUnitsInStock();
        product10.setName("");
        java.lang.Object obj19 = null;
        boolean boolean20 = product10.equals(obj19);
        java.math.BigDecimal bigDecimal21 = product10.getUnitPrice();
        com.shittu24.ecommerce.entity.ProductCategory productCategory22 = product10.getCategory();
        boolean boolean23 = product0.equals((java.lang.Object) productCategory22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(productCategory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNull(productCategory22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        com.shittu24.ecommerce.entity.Address address12 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str13 = address12.getCountry();
        java.lang.Long long14 = address12.getId();
        address12.setState("");
        address12.setCountry("hi!");
        order3.setBillingAddress(address12);
        com.shittu24.ecommerce.entity.Order order20 = address12.getOrder();
        java.lang.Long long21 = address12.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(order20);
        org.junit.Assert.assertNull(long21);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal3 = null;
        orderItem0.setUnitPrice(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = orderItem0.getUnitPrice();
        int int6 = orderItem0.getQuantity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address2 = order0.getShippingAddress();
        order0.setTotalQuantity((int) '4');
        java.math.BigDecimal bigDecimal5 = order0.getTotalPrice();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.util.Date date14 = null;
        order3.setLastUpdated(date14);
        int int16 = order3.getTotalQuantity();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        boolean boolean4 = product0.isActive();
        java.lang.String str5 = product0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str16 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str16, "Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.math.BigDecimal bigDecimal9 = null;
        product0.setUnitPrice(bigDecimal9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order3.getOrderItems();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem6 = null;
        order3.add(orderItem6);
        order3.setOrderTrackingNumber("");
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order3.getOrderItems();
        java.lang.Long long11 = order3.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        order10.setTotalQuantity(35);
        java.lang.Long long40 = order10.getId();
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
        org.junit.Assert.assertNull(long40);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.math.BigDecimal bigDecimal14 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(bigDecimal14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        address6.setState("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long11 = address6.getId();
        address6.setCity("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.util.Date date31 = null;
        order3.setDateCreated(date31);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.lang.Long long16 = customer15.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(customer15);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.math.BigDecimal bigDecimal1 = null;
        order0.setTotalPrice(bigDecimal1);
        com.shittu24.ecommerce.entity.Customer customer3 = order0.getCustomer();
        org.junit.Assert.assertNull(customer3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer2.getOrders();
        customer0.setOrders(orderSet3);
        customer0.setLastName("");
        java.lang.String str7 = customer0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal3 = null;
        orderItem0.setUnitPrice(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = orderItem0.getUnitPrice();
        java.lang.String str6 = orderItem0.getImageUrl();
        int int7 = orderItem0.getQuantity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        customer12.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNotNull(customer12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        address0.setOrder(order2);
        com.shittu24.ecommerce.entity.Address address7 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str8 = address7.getCity();
        address7.setCountry("hi!");
        address7.setState("hi!");
        java.lang.String str13 = address7.getStreet();
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order15 = null;
        customer14.add(order15);
        com.shittu24.ecommerce.entity.Order order17 = new com.shittu24.ecommerce.entity.Order();
        customer14.add(order17);
        order17.setId((java.lang.Long) 0L);
        address7.setOrder(order17);
        address7.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address7.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order2.setBillingAddress(address7);
        java.lang.String str27 = address7.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str27, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.lang.Long long11 = customer7.getId();
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str13 = customer12.getFirstName();
        customer12.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet16 = customer12.getOrders();
        customer12.setFirstName("hi!");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet19 = customer12.getOrders();
        customer7.setOrders(orderSet19);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderSet16);
        org.junit.Assert.assertNotNull(orderSet19);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        product0.setName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer4.getOrders();
        customer4.setEmail("");
        customer4.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet10 = customer4.getOrders();
        customer0.setOrders(orderSet10);
        customer0.setFirstName("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNotNull(orderSet10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.ProductCategory productCategory21 = null;
        product0.setCategory(productCategory21);
        product0.setImageUrl("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.Long long12 = order3.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        int int9 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        java.lang.String str11 = product0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(productCategory10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.lang.String str5 = product0.getSku();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str7 = address6.getCity();
        address6.setCountry("hi!");
        boolean boolean10 = product0.equals((java.lang.Object) address6);
        java.lang.Class<?> wildcardClass11 = product0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        java.lang.String str8 = address6.getState();
        java.lang.String str9 = address6.getState();
        address6.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        java.lang.String str12 = address6.getStreet();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal6 = orderItem0.getUnitPrice();
        int int7 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal8 = orderItem0.getUnitPrice();
        java.lang.Long long9 = orderItem0.getId();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order3 = null;
        customer2.add(order3);
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        customer2.add(order5);
        java.util.Date date7 = order5.getDateCreated();
        java.lang.Long long8 = order5.getId();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        order5.setCustomer(customer9);
        java.lang.String str15 = order5.getOrderTrackingNumber();
        orderItem0.setOrder(order5);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        orderItem13.setQuantity((int) (short) 0);
        java.lang.Long long18 = orderItem13.getProductId();
        orderItem13.setQuantity(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        java.util.Date date8 = product0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        address0.setStreet("");
        address0.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setCity("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        int int18 = orderItem13.getQuantity();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order4 = address0.getOrder();
        java.lang.String str5 = address0.getZipCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        address9.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address9.getCity();
        address9.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address8 = null;
        order3.setShippingAddress(address8);
        java.util.Date date10 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address11 = order3.getShippingAddress();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order6 = null;
        orderItem0.setOrder(order6);
        orderItem0.setProductId((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass10 = orderItem0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.math.BigDecimal bigDecimal19 = null;
        order3.setTotalPrice(bigDecimal19);
        java.lang.String str21 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = address0.getOrder();
        address0.setState("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.util.Date date17 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.lang.String str5 = product0.toString();
        java.util.Date date6 = product0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str5, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Date date17 = order15.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem18 = null;
        order15.add(orderItem18);
        order15.setOrderTrackingNumber("");
        java.util.Date date22 = order15.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order23 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address24 = order23.getBillingAddress();
        order23.setOrderTrackingNumber("");
        java.util.Date date27 = null;
        order23.setLastUpdated(date27);
        com.shittu24.ecommerce.entity.Address address29 = new com.shittu24.ecommerce.entity.Address();
        order23.setBillingAddress(address29);
        java.lang.String str31 = address29.getState();
        java.lang.String str32 = address29.getCountry();
        java.lang.String str33 = address29.getCountry();
        java.lang.String str34 = address29.getCity();
        java.lang.String str35 = address29.getCity();
        order15.setBillingAddress(address29);
        address29.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setBillingAddress(address29);
        java.math.BigDecimal bigDecimal40 = null;
        order3.setTotalPrice(bigDecimal40);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(address24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        int int11 = order3.getTotalQuantity();
        java.util.Date date12 = order3.getDateCreated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.util.Date date20 = order18.getDateCreated();
        java.lang.Long long21 = order18.getId();
        com.shittu24.ecommerce.entity.Customer customer22 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order23 = null;
        customer22.add(order23);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        customer22.add(order25);
        order18.setCustomer(customer22);
        java.lang.String str28 = order18.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer29 = order18.getCustomer();
        orderItem0.setOrder(order18);
        order18.setTotalQuantity((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(customer29);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.lang.String str9 = product0.getImageUrl();
        java.lang.String str10 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setId((java.lang.Long) 1L);
        java.lang.String str8 = product0.getImageUrl();
        product0.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        java.lang.Long long21 = order14.getId();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(long21);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        address0.setState("");
        java.lang.String str19 = address0.getCity();
        java.lang.Long long20 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(long20);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        java.lang.String str2 = address0.getZipCode();
        java.lang.Long long3 = address0.getId();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long6 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        com.shittu24.ecommerce.entity.Order order38 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address39 = order38.getBillingAddress();
        order38.setOrderTrackingNumber("");
        java.util.Date date42 = null;
        order38.setLastUpdated(date42);
        com.shittu24.ecommerce.entity.Address address44 = new com.shittu24.ecommerce.entity.Address();
        order38.setBillingAddress(address44);
        order29.setBillingAddress(address44);
        com.shittu24.ecommerce.entity.Customer customer47 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order48 = null;
        customer47.add(order48);
        com.shittu24.ecommerce.entity.Order order50 = new com.shittu24.ecommerce.entity.Order();
        customer47.add(order50);
        java.util.Date date52 = order50.getDateCreated();
        java.lang.Long long53 = order50.getId();
        com.shittu24.ecommerce.entity.Customer customer54 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order55 = null;
        customer54.add(order55);
        com.shittu24.ecommerce.entity.Order order57 = new com.shittu24.ecommerce.entity.Order();
        customer54.add(order57);
        order50.setCustomer(customer54);
        com.shittu24.ecommerce.entity.Customer customer60 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order61 = null;
        customer60.add(order61);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet63 = customer60.getOrders();
        customer60.setEmail("");
        customer60.setId((java.lang.Long) 10L);
        java.lang.String str68 = customer60.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet69 = customer60.getOrders();
        customer54.setOrders(orderSet69);
        customer54.setLastName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer54.setEmail("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order29.setCustomer(customer54);
        java.lang.String str76 = customer54.getFirstName();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNull(address39);
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertNull(long53);
        org.junit.Assert.assertNotNull(orderSet63);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(orderSet69);
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setUnitsInStock((int) 'a');
        java.util.Date date9 = null;
        product0.setLastUpdated(date9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        com.shittu24.ecommerce.entity.Order order16 = orderItem7.getOrder();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(order16);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.toString();
        java.util.Date date10 = null;
        product0.setDateCreated(date10);
        int int12 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.String str2 = customer0.getEmail();
        customer0.setEmail("");
        customer0.setFirstName("hi!");
        java.lang.String str7 = customer0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        address0.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order9 = address0.getOrder();
        java.lang.String str10 = address0.getStreet();
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setImageUrl("hi!");
        java.lang.String str9 = product0.getName();
        boolean boolean10 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.util.Date date30 = order3.getLastUpdated();
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
        org.junit.Assert.assertNull(date30);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        java.math.BigDecimal bigDecimal9 = null;
        order0.setTotalPrice(bigDecimal9);
        java.util.Date date11 = order0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        java.lang.String str13 = product0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        int int7 = product0.getUnitsInStock();
        product0.setActive(true);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        orderItem13.setQuantity((int) (short) 0);
        java.math.BigDecimal bigDecimal18 = null;
        orderItem13.setUnitPrice(bigDecimal18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        product0.setActive(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.String str6 = orderItem0.getImageUrl();
        orderItem0.setId((java.lang.Long) 0L);
        orderItem0.setProductId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.math.BigDecimal bigDecimal31 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(orderItemSet28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(bigDecimal31);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        int int30 = order3.getTotalQuantity();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        com.shittu24.ecommerce.entity.Order order38 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address39 = order38.getBillingAddress();
        order38.setOrderTrackingNumber("");
        java.util.Date date42 = null;
        order38.setLastUpdated(date42);
        com.shittu24.ecommerce.entity.Address address44 = new com.shittu24.ecommerce.entity.Address();
        order38.setBillingAddress(address44);
        order29.setBillingAddress(address44);
        address44.setState("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNull(address39);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        address6.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str21 = customer20.getFirstName();
        customer20.setId((java.lang.Long) 0L);
        order13.setCustomer(customer20);
        order13.setTotalQuantity((int) (short) -1);
        java.math.BigDecimal bigDecimal27 = null;
        order13.setTotalPrice(bigDecimal27);
        address6.setOrder(order13);
        order13.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order13.setTotalQuantity((int) (byte) 1);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        address20.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str33 = address20.getStreet();
        java.lang.Long long34 = address20.getId();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str33, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long34);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        java.math.BigDecimal bigDecimal15 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(bigDecimal15);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.math.BigDecimal bigDecimal13 = null;
        product0.setUnitPrice(bigDecimal13);
        java.util.Date date15 = product0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setLastName("");
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str7 = customer0.getFirstName();
        java.lang.String str8 = customer0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str7, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        int int6 = orderItem0.getQuantity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        java.lang.Long long8 = order3.getId();
        order3.setStatus("hi!");
        java.math.BigDecimal bigDecimal11 = null;
        order3.setTotalPrice(bigDecimal11);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.Long long14 = orderItem10.getProductId();
        orderItem10.setQuantity((int) (byte) 100);
        java.math.BigDecimal bigDecimal17 = orderItem10.getUnitPrice();
        java.lang.Long long18 = orderItem10.getProductId();
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
        java.math.BigDecimal bigDecimal40 = order22.getTotalPrice();
        orderItem10.setOrder(order22);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(bigDecimal17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNotNull(orderItemSet24);
        org.junit.Assert.assertNull(address28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(bigDecimal40);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.String str2 = address0.getCountry();
        java.lang.String str3 = address0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
        java.lang.String str5 = customer0.getLastName();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        customer0.setEmail("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setLastName("");
        java.lang.Class<?> wildcardClass5 = customer0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.String str2 = orderItem0.getImageUrl();
        java.lang.String str3 = orderItem0.getImageUrl();
        java.lang.Long long4 = orderItem0.getId();
        java.lang.String str5 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        java.lang.String str10 = product0.toString();
        java.lang.String str11 = product0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        java.lang.String str4 = orderItem0.getImageUrl();
        java.math.BigDecimal bigDecimal5 = null;
        orderItem0.setUnitPrice(bigDecimal5);
        java.lang.Long long7 = orderItem0.getProductId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setId((java.lang.Long) 100L);
        address0.setStreet("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        address9.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str21 = address9.getStreet();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        address0.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setState("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.util.Date date9 = product0.getDateCreated();
        java.util.Date date10 = product0.getDateCreated();
        int int11 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
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
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer20.add(order22);
        customer20.setLastName("hi!");
        order15.setCustomer(customer20);
        java.util.Date date27 = order15.getLastUpdated();
        boolean boolean28 = product0.equals((java.lang.Object) date27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.OrderItem orderItem1 = new com.shittu24.ecommerce.entity.OrderItem();
        int int2 = orderItem1.getQuantity();
        orderItem1.setId((java.lang.Long) 10L);
        java.lang.String str5 = orderItem1.getImageUrl();
        boolean boolean6 = product0.equals((java.lang.Object) orderItem1);
        product0.setName("hi!");
        java.lang.String str9 = product0.getName();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = null;
        product0.setCategory(productCategory10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        com.shittu24.ecommerce.entity.Order order6 = orderItem0.getOrder();
        orderItem0.setId((java.lang.Long) 1L);
        int int9 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str11 = product0.getName();
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
        java.lang.String str32 = address26.getStreet();
        address26.setCountry("");
        address26.setStreet("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean37 = product0.equals((java.lang.Object) "Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setUnitsInStock(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(address21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        order3.setStatus("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(address14);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.util.Date date1 = product0.getDateCreated();
        int int2 = product0.getUnitsInStock();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.String str17 = address9.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        order3.setTotalQuantity((-1));
        order3.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(address10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getCity();
        java.lang.String str7 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order9 = null;
        customer8.add(order9);
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        customer8.add(order11);
        java.util.Date date13 = order11.getDateCreated();
        java.lang.Long long14 = order11.getId();
        int int15 = order11.getTotalQuantity();
        com.shittu24.ecommerce.entity.Order order16 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date17 = null;
        order16.setLastUpdated(date17);
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet24 = order22.getOrderItems();
        java.math.BigDecimal bigDecimal25 = null;
        order22.setTotalPrice(bigDecimal25);
        java.lang.String str27 = order22.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet28 = order22.getOrderItems();
        order16.setOrderItems(orderItemSet28);
        order11.setOrderItems(orderItemSet28);
        address0.setOrder(order11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(orderItemSet24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(orderItemSet28);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        order3.setTotalQuantity(100);
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
        com.shittu24.ecommerce.entity.Customer customer40 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order41 = null;
        customer40.add(order41);
        com.shittu24.ecommerce.entity.Order order43 = new com.shittu24.ecommerce.entity.Order();
        customer40.add(order43);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet45 = order43.getOrderItems();
        java.lang.String str46 = order43.getStatus();
        java.lang.Long long47 = order43.getId();
        order43.setTotalQuantity((int) (short) 10);
        com.shittu24.ecommerce.entity.Customer customer50 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order51 = null;
        customer50.add(order51);
        com.shittu24.ecommerce.entity.Order order53 = new com.shittu24.ecommerce.entity.Order();
        customer50.add(order53);
        java.util.Date date55 = order53.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem56 = null;
        order53.add(orderItem56);
        com.shittu24.ecommerce.entity.Address address58 = null;
        order53.setShippingAddress(address58);
        com.shittu24.ecommerce.entity.OrderItem orderItem60 = new com.shittu24.ecommerce.entity.OrderItem();
        int int61 = orderItem60.getQuantity();
        java.lang.Long long62 = orderItem60.getProductId();
        order53.add(orderItem60);
        orderItem60.setProductId((java.lang.Long) 10L);
        java.lang.String str66 = orderItem60.getImageUrl();
        int int67 = orderItem60.getQuantity();
        order43.add(orderItem60);
        address30.setOrder(order43);
        order3.setShippingAddress(address30);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
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
        org.junit.Assert.assertNotNull(orderItemSet45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(long47);
        org.junit.Assert.assertNull(date55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(long62);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        int int7 = product0.getUnitsInStock();
        java.util.Date date8 = null;
        product0.setDateCreated(date8);
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        java.util.Date date12 = product0.getLastUpdated();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getBillingAddress();
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address8 = order7.getBillingAddress();
        order7.setOrderTrackingNumber("");
        java.util.Date date11 = null;
        order7.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.Address address13 = new com.shittu24.ecommerce.entity.Address();
        order7.setBillingAddress(address13);
        java.lang.String str15 = address13.getState();
        java.lang.String str16 = address13.getCountry();
        java.lang.String str17 = address13.getState();
        java.lang.Long long18 = address13.getId();
        order0.setBillingAddress(address13);
        address13.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer22 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order23 = null;
        customer22.add(order23);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        customer22.add(order25);
        java.util.Date date27 = order25.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem28 = null;
        order25.add(orderItem28);
        com.shittu24.ecommerce.entity.Address address30 = null;
        order25.setShippingAddress(address30);
        com.shittu24.ecommerce.entity.OrderItem orderItem32 = new com.shittu24.ecommerce.entity.OrderItem();
        int int33 = orderItem32.getQuantity();
        java.lang.Long long34 = orderItem32.getProductId();
        order25.add(orderItem32);
        orderItem32.setProductId((java.lang.Long) 10L);
        java.lang.String str38 = orderItem32.getImageUrl();
        java.lang.Long long39 = orderItem32.getId();
        com.shittu24.ecommerce.entity.Customer customer40 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order41 = null;
        customer40.add(order41);
        com.shittu24.ecommerce.entity.Order order43 = new com.shittu24.ecommerce.entity.Order();
        customer40.add(order43);
        java.util.Date date45 = order43.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem46 = null;
        order43.add(orderItem46);
        com.shittu24.ecommerce.entity.Address address48 = null;
        order43.setShippingAddress(address48);
        com.shittu24.ecommerce.entity.OrderItem orderItem50 = new com.shittu24.ecommerce.entity.OrderItem();
        int int51 = orderItem50.getQuantity();
        java.lang.Long long52 = orderItem50.getProductId();
        order43.add(orderItem50);
        com.shittu24.ecommerce.entity.Customer customer54 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order55 = null;
        customer54.add(order55);
        com.shittu24.ecommerce.entity.Order order57 = new com.shittu24.ecommerce.entity.Order();
        customer54.add(order57);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet59 = order57.getOrderItems();
        java.lang.String str60 = order57.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet61 = order57.getOrderItems();
        order43.setOrderItems(orderItemSet61);
        java.math.BigDecimal bigDecimal63 = order43.getTotalPrice();
        orderItem32.setOrder(order43);
        java.lang.Long long65 = order43.getId();
        address13.setOrder(order43);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(long34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(long39);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(long52);
        org.junit.Assert.assertNotNull(orderItemSet59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(orderItemSet61);
        org.junit.Assert.assertNull(bigDecimal63);
        org.junit.Assert.assertNull(long65);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        customer0.setId((java.lang.Long) 100L);
        customer0.setEmail("");
        java.lang.String str8 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order3.getOrderItems();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(orderItemSet13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order14 = null;
        customer13.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet16 = customer13.getOrders();
        customer13.setEmail("");
        customer13.setId((java.lang.Long) 10L);
        java.lang.String str21 = customer13.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet22 = customer13.getOrders();
        customer7.setOrders(orderSet22);
        com.shittu24.ecommerce.entity.OrderItem orderItem24 = new com.shittu24.ecommerce.entity.OrderItem();
        int int25 = orderItem24.getQuantity();
        java.math.BigDecimal bigDecimal26 = null;
        orderItem24.setUnitPrice(bigDecimal26);
        orderItem24.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer30 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order31 = null;
        customer30.add(order31);
        com.shittu24.ecommerce.entity.Order order33 = new com.shittu24.ecommerce.entity.Order();
        customer30.add(order33);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet35 = order33.getOrderItems();
        java.math.BigDecimal bigDecimal36 = null;
        order33.setTotalPrice(bigDecimal36);
        orderItem24.setOrder(order33);
        com.shittu24.ecommerce.entity.Customer customer39 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order40 = null;
        customer39.add(order40);
        com.shittu24.ecommerce.entity.Order order42 = new com.shittu24.ecommerce.entity.Order();
        customer39.add(order42);
        java.util.Date date44 = order42.getDateCreated();
        java.lang.Long long45 = order42.getId();
        com.shittu24.ecommerce.entity.Customer customer46 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order47 = null;
        customer46.add(order47);
        com.shittu24.ecommerce.entity.Order order49 = new com.shittu24.ecommerce.entity.Order();
        customer46.add(order49);
        order42.setCustomer(customer46);
        java.lang.String str52 = order42.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer53 = order42.getCustomer();
        orderItem24.setOrder(order42);
        com.shittu24.ecommerce.entity.Customer customer55 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str56 = customer55.getFirstName();
        com.shittu24.ecommerce.entity.Order order57 = null;
        customer55.add(order57);
        java.lang.Long long59 = customer55.getId();
        customer55.setFirstName("hi!");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet62 = customer55.getOrders();
        order42.setCustomer(customer55);
        customer7.add(order42);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(orderSet16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(orderSet22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(orderItemSet35);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNull(long45);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(customer53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(long59);
        org.junit.Assert.assertNotNull(orderSet62);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        java.lang.String str8 = address0.getCountry();
        java.lang.String str9 = address0.getCity();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        java.util.Date date12 = product0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(productCategory11);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.util.Date date9 = product0.getDateCreated();
        java.lang.String str10 = product0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        product0.setName("");
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setDescription("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        customer21.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderSet24);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(bigDecimal33);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        product0.setId((java.lang.Long) (-1L));
        product0.setDescription("");
        java.util.Date date13 = null;
        product0.setDateCreated(date13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        com.shittu24.ecommerce.entity.Address address12 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str13 = address12.getCountry();
        java.lang.Long long14 = address12.getId();
        address12.setState("");
        address12.setCountry("hi!");
        order3.setBillingAddress(address12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = null;
        order3.setOrderItems(orderItemSet20);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        java.lang.String str2 = address0.getZipCode();
        address0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal3 = null;
        orderItem0.setUnitPrice(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = orderItem0.getUnitPrice();
        orderItem0.setImageUrl("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setLastUpdated(date7);
        java.util.Date date9 = null;
        product0.setLastUpdated(date9);
        java.util.Date date11 = product0.getDateCreated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order3.getOrderItems();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNotNull(orderItemSet15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.String str15 = address0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal3 = null;
        orderItem0.setUnitPrice(bigDecimal3);
        orderItem0.setId((java.lang.Long) 1L);
        orderItem0.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        customer20.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(address30);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        int int7 = product0.getUnitsInStock();
        java.util.Date date8 = null;
        product0.setDateCreated(date8);
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setUnitsInStock((int) (short) 0);
        java.util.Date date14 = product0.getLastUpdated();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.Long long6 = orderItem0.getId();
        orderItem0.setProductId((java.lang.Long) (-1L));
        java.lang.Long long9 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        order38.setId((java.lang.Long) 100L);
        order38.setTotalQuantity(10);
        com.shittu24.ecommerce.entity.Customer customer50 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order51 = null;
        customer50.add(order51);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet53 = customer50.getOrders();
        customer50.setEmail("");
        customer50.setId((java.lang.Long) 10L);
        java.lang.String str58 = customer50.getEmail();
        customer50.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order38.setCustomer(customer50);
        java.lang.String str62 = order38.getOrderTrackingNumber();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(bigDecimal41);
        org.junit.Assert.assertNotNull(orderSet53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        address20.setState("");
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
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        order3.setTotalQuantity((int) (byte) 0);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.lang.String str17 = order14.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order14.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem25 = null;
        order22.add(orderItem25);
        order22.setOrderTrackingNumber("");
        java.util.Date date29 = order22.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet30 = order22.getOrderItems();
        order14.setOrderItems(orderItemSet30);
        order3.setOrderItems(orderItemSet30);
        java.math.BigDecimal bigDecimal33 = order3.getTotalPrice();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNotNull(orderItemSet30);
        org.junit.Assert.assertNull(bigDecimal33);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        com.shittu24.ecommerce.entity.Customer customer8 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet9 = customer8.getOrders();
        customer8.setEmail("");
        customer8.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str14 = customer8.getFirstName();
        java.lang.String str15 = customer8.getLastName();
        order0.setCustomer(customer8);
        customer8.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNotNull(orderSet9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.util.Date date15 = null;
        product0.setDateCreated(date15);
        product0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.util.Date date10 = product0.getDateCreated();
        product0.setActive(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        orderItem20.setProductId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        address6.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str21 = customer20.getFirstName();
        customer20.setId((java.lang.Long) 0L);
        order13.setCustomer(customer20);
        order13.setTotalQuantity((int) (short) -1);
        java.math.BigDecimal bigDecimal27 = null;
        order13.setTotalPrice(bigDecimal27);
        address6.setOrder(order13);
        com.shittu24.ecommerce.entity.Order order30 = address6.getOrder();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(order30);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.util.Date date6 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        boolean boolean9 = product0.isActive();
        product0.setSku("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean12 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.String str13 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        order10.setStatus("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(customer15);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet12 = customer11.getOrders();
        customer10.setOrders(orderSet12);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNotNull(orderSet12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.util.Date date10 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.math.BigDecimal bigDecimal17 = null;
        order14.setTotalPrice(bigDecimal17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address20 = order19.getBillingAddress();
        order19.setOrderTrackingNumber("");
        java.util.Date date23 = null;
        order19.setLastUpdated(date23);
        com.shittu24.ecommerce.entity.Address address25 = new com.shittu24.ecommerce.entity.Address();
        order19.setBillingAddress(address25);
        java.lang.String str27 = address25.getState();
        java.lang.String str28 = address25.getCountry();
        java.lang.String str29 = address25.getState();
        order14.setBillingAddress(address25);
        java.lang.String str31 = order14.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer32 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer32.add(order33);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet35 = customer32.getOrders();
        customer32.setEmail("");
        customer32.setEmail("");
        java.lang.Long long40 = customer32.getId();
        com.shittu24.ecommerce.entity.Order order41 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date42 = null;
        order41.setLastUpdated(date42);
        java.math.BigDecimal bigDecimal44 = order41.getTotalPrice();
        customer32.add(order41);
        order14.setCustomer(customer32);
        com.shittu24.ecommerce.entity.Customer customer47 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order48 = null;
        customer47.add(order48);
        com.shittu24.ecommerce.entity.Order order50 = new com.shittu24.ecommerce.entity.Order();
        customer47.add(order50);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet52 = order50.getOrderItems();
        com.shittu24.ecommerce.entity.Address address53 = new com.shittu24.ecommerce.entity.Address();
        address53.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str56 = address53.getZipCode();
        java.lang.String str57 = address53.getZipCode();
        com.shittu24.ecommerce.entity.Order order58 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address59 = order58.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address60 = order58.getShippingAddress();
        address53.setOrder(order58);
        com.shittu24.ecommerce.entity.Customer customer62 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order63 = null;
        customer62.add(order63);
        com.shittu24.ecommerce.entity.Order order65 = new com.shittu24.ecommerce.entity.Order();
        customer62.add(order65);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet67 = order65.getOrderItems();
        java.lang.String str68 = order65.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet69 = order65.getOrderItems();
        order58.setOrderItems(orderItemSet69);
        order50.setOrderItems(orderItemSet69);
        order14.setOrderItems(orderItemSet69);
        order3.setOrderItems(orderItemSet69);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(address20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(orderSet35);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNull(bigDecimal44);
        org.junit.Assert.assertNotNull(orderItemSet52);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(address59);
        org.junit.Assert.assertNull(address60);
        org.junit.Assert.assertNotNull(orderItemSet67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(orderItemSet69);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setImageUrl("hi!");
        product0.setSku("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getZipCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.ProductCategory productCategory1 = product0.getCategory();
        product0.setUnitsInStock(100);
        java.lang.String str4 = product0.toString();
        org.junit.Assert.assertNull(productCategory1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)" + "'", str4, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        java.lang.String str5 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal5 = null;
        orderItem0.setUnitPrice(bigDecimal5);
        orderItem0.setQuantity((int) (byte) -1);
        java.lang.String str9 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getState();
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.lang.Long long10 = address0.getId();
        java.lang.String str11 = address0.getCity();
        java.lang.String str12 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date1 = null;
        order0.setLastUpdated(date1);
        com.shittu24.ecommerce.entity.Address address3 = order0.getBillingAddress();
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        java.util.Date date6 = order0.getLastUpdated();
        com.shittu24.ecommerce.entity.Address address7 = order0.getShippingAddress();
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        int int7 = order3.getTotalQuantity();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet8 = order3.getOrderItems();
        java.lang.String str9 = order3.getStatus();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        java.util.Date date2 = null;
        product0.setDateCreated(date2);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        order14.setTotalQuantity((int) 'a');
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNotNull(order14);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
        customer0.setId((java.lang.Long) 1L);
        java.lang.String str7 = customer0.getEmail();
        customer0.setLastName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        java.util.Date date6 = null;
        order2.setLastUpdated(date6);
        address0.setOrder(order2);
        java.math.BigDecimal bigDecimal9 = null;
        order2.setTotalPrice(bigDecimal9);
        java.util.Date date11 = null;
        order2.setDateCreated(date11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setFirstName("");
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        com.shittu24.ecommerce.entity.Order order7 = new com.shittu24.ecommerce.entity.Order();
        customer4.add(order7);
        java.util.Date date9 = order7.getDateCreated();
        java.lang.Long long10 = order7.getId();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        order7.setCustomer(customer11);
        com.shittu24.ecommerce.entity.Customer customer17 = order7.getCustomer();
        customer0.add(order7);
        com.shittu24.ecommerce.entity.Customer customer19 = order7.getCustomer();
        order7.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(customer17);
        org.junit.Assert.assertNotNull(customer19);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.lang.String str13 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str13);
    }
}

