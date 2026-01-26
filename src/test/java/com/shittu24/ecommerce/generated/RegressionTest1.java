package com.shittu24.ecommerce.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.Address address9 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str10 = address9.getCity();
        address9.setCountry("hi!");
        address9.setState("hi!");
        java.lang.String str15 = address9.getStreet();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        order19.setId((java.lang.Long) 0L);
        address9.setOrder(order19);
        com.shittu24.ecommerce.entity.Order order24 = address9.getOrder();
        com.shittu24.ecommerce.entity.Order order25 = address9.getOrder();
        address9.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean28 = product0.equals((java.lang.Object) "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date29 = null;
        product0.setLastUpdated(date29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(order24);
        org.junit.Assert.assertNotNull(order25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order18.getOrderItems();
        java.lang.String str21 = order18.getStatus();
        java.lang.Long long22 = order18.getId();
        java.util.Date date23 = null;
        order18.setLastUpdated(date23);
        java.lang.String str25 = order18.getStatus();
        com.shittu24.ecommerce.entity.Order order26 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address27 = order26.getBillingAddress();
        order26.setOrderTrackingNumber("");
        java.util.Date date30 = null;
        order26.setLastUpdated(date30);
        com.shittu24.ecommerce.entity.Address address32 = new com.shittu24.ecommerce.entity.Address();
        order26.setBillingAddress(address32);
        java.lang.String str34 = address32.getState();
        java.lang.String str35 = address32.getCountry();
        java.lang.String str36 = address32.getCountry();
        java.lang.String str37 = address32.getCity();
        java.lang.String str38 = address32.getCity();
        order18.setShippingAddress(address32);
        address9.setOrder(order18);
        java.lang.String str41 = address9.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(address27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setUnitsInStock((int) (short) 0);
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        product0.setDescription("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal4 = null;
        orderItem0.setUnitPrice(bigDecimal4);
        com.shittu24.ecommerce.entity.Order order6 = orderItem0.getOrder();
        java.lang.String str7 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        boolean boolean19 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        product0.setUnitsInStock(0);
        com.shittu24.ecommerce.entity.ProductCategory productCategory12 = null;
        product0.setCategory(productCategory12);
        java.math.BigDecimal bigDecimal14 = null;
        product0.setUnitPrice(bigDecimal14);
        int int16 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        com.shittu24.ecommerce.entity.ProductCategory productCategory22 = product0.getCategory();
        java.util.Date date23 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(productCategory22);
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date1 = null;
        order0.setLastUpdated(date1);
        java.math.BigDecimal bigDecimal3 = order0.getTotalPrice();
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        order0.setTotalQuantity(100);
        org.junit.Assert.assertNull(bigDecimal3);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.util.Date date32 = order24.getLastUpdated();
        java.util.Date date33 = null;
        order24.setLastUpdated(date33);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(date32);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        java.lang.String str24 = address6.getState();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        product0.setActive(true);
        java.util.Date date27 = null;
        product0.setLastUpdated(date27);
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
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        java.math.BigDecimal bigDecimal27 = product0.getUnitPrice();
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
        org.junit.Assert.assertNull(bigDecimal27);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        java.lang.String str20 = address14.getStreet();
        address14.setCountry("");
        address14.setStreet("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address14.setCountry("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address14.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        java.lang.String str25 = address17.getZipCode();
        java.lang.Long long26 = address17.getId();
        java.lang.Long long27 = address17.getId();
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(long27);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.Long long8 = product0.getId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setId((java.lang.Long) 0L);
        customer0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderSet1);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date1 = null;
        order0.setLastUpdated(date1);
        java.math.BigDecimal bigDecimal3 = order0.getTotalPrice();
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        java.util.Date date6 = order0.getLastUpdated();
        order0.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer9 = order0.getCustomer();
        java.lang.String str10 = order0.getOrderTrackingNumber();
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(customer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        customer0.setEmail("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet3);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        com.shittu24.ecommerce.entity.Address address16 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address17 = order3.getShippingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(address17);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order3.getOrderItems();
        java.util.Date date22 = order3.getDateCreated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        java.lang.String str20 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order1 = orderItem0.getOrder();
        com.shittu24.ecommerce.entity.Order order2 = orderItem0.getOrder();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        int int9 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(productCategory10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        address6.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address6.getZipCode();
        java.lang.String str10 = address6.getZipCode();
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address12 = order11.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address13 = order11.getShippingAddress();
        address6.setOrder(order11);
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order18.getOrderItems();
        java.lang.String str21 = order18.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order18.getOrderItems();
        order11.setOrderItems(orderItemSet22);
        order3.setOrderItems(orderItemSet22);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address26 = order25.getBillingAddress();
        order25.setOrderTrackingNumber("");
        java.util.Date date29 = null;
        order25.setLastUpdated(date29);
        com.shittu24.ecommerce.entity.Address address31 = new com.shittu24.ecommerce.entity.Address();
        order25.setBillingAddress(address31);
        java.lang.String str33 = address31.getState();
        java.lang.String str34 = address31.getCountry();
        order3.setShippingAddress(address31);
        order3.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(address26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setId((java.lang.Long) 100L);
        java.lang.String str6 = address0.getCity();
        address0.setZipCode("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        java.lang.Long long16 = orderItem10.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.lang.String str15 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        java.lang.Long long6 = customer0.getId();
        customer0.setFirstName("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        com.shittu24.ecommerce.entity.Address address16 = order3.getBillingAddress();
        java.math.BigDecimal bigDecimal17 = null;
        order3.setTotalPrice(bigDecimal17);
        com.shittu24.ecommerce.entity.Product product19 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean21 = product19.equals((java.lang.Object) 1.0f);
        product19.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory24 = product19.getCategory();
        int int25 = product19.getUnitsInStock();
        product19.setName("");
        java.lang.Object obj28 = null;
        boolean boolean29 = product19.equals(obj28);
        java.math.BigDecimal bigDecimal30 = product19.getUnitPrice();
        com.shittu24.ecommerce.entity.ProductCategory productCategory31 = product19.getCategory();
        com.shittu24.ecommerce.entity.OrderItem orderItem32 = new com.shittu24.ecommerce.entity.OrderItem();
        int int33 = orderItem32.getQuantity();
        java.lang.Long long34 = orderItem32.getProductId();
        com.shittu24.ecommerce.entity.Order order35 = orderItem32.getOrder();
        java.math.BigDecimal bigDecimal36 = null;
        orderItem32.setUnitPrice(bigDecimal36);
        orderItem32.setId((java.lang.Long) 0L);
        orderItem32.setProductId((java.lang.Long) 100L);
        java.lang.String str42 = orderItem32.getImageUrl();
        boolean boolean43 = product19.equals((java.lang.Object) orderItem32);
        order3.add(orderItem32);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(productCategory24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(bigDecimal30);
        org.junit.Assert.assertNull(productCategory31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(long34);
        org.junit.Assert.assertNull(order35);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order9.getOrderItems();
        com.shittu24.ecommerce.entity.Address address16 = order9.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet20 = customer17.getOrders();
        order9.setCustomer(customer17);
        com.shittu24.ecommerce.entity.Address address22 = order9.getBillingAddress();
        java.math.BigDecimal bigDecimal23 = null;
        order9.setTotalPrice(bigDecimal23);
        order9.setId((java.lang.Long) 1L);
        customer0.add(order9);
        customer0.setId((java.lang.Long) 100L);
        customer0.setFirstName("");
        customer0.setEmail("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNotNull(orderSet20);
        org.junit.Assert.assertNull(address22);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        address0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setUnitsInStock((int) 'a');
        java.lang.String str9 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str12 = customer11.getFirstName();
        java.lang.String str13 = customer11.getEmail();
        java.lang.String str14 = customer11.getFirstName();
        order3.setCustomer(customer11);
        java.util.Date date16 = null;
        order3.setDateCreated(date16);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.math.BigDecimal bigDecimal3 = null;
        product0.setUnitPrice(bigDecimal3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        java.lang.Long long6 = orderItem0.getId();
        int int7 = orderItem0.getQuantity();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal3 = null;
        orderItem0.setUnitPrice(bigDecimal3);
        orderItem0.setId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal7 = orderItem0.getUnitPrice();
        orderItem0.setId((java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal10 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str6 = customer0.getFirstName();
        java.lang.String str7 = customer0.getLastName();
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = customer0.getLastName();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        orderItem0.setQuantity((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet56 = customer55.getOrders();
        java.lang.Long long57 = customer55.getId();
        customer55.setId((java.lang.Long) 100L);
        customer55.setId((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(orderSet56);
        org.junit.Assert.assertNull(long57);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        boolean boolean9 = product0.isActive();
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.String str2 = customer0.getEmail();
        java.lang.String str3 = customer0.getFirstName();
        java.lang.Long long4 = customer0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.util.Date date24 = order22.getDateCreated();
        java.lang.Long long25 = order22.getId();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        customer26.add(order29);
        order22.setCustomer(customer26);
        com.shittu24.ecommerce.entity.Customer customer32 = order22.getCustomer();
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet34 = customer33.getOrders();
        customer33.setEmail("");
        customer33.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str39 = customer33.getFirstName();
        order22.setCustomer(customer33);
        orderItem13.setOrder(order22);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNotNull(customer32);
        org.junit.Assert.assertNotNull(orderSet34);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.toString();
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        java.math.BigDecimal bigDecimal12 = null;
        product0.setUnitPrice(bigDecimal12);
        java.lang.Long long14 = product0.getId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        java.lang.Long long6 = orderItem0.getId();
        java.lang.Long long7 = orderItem0.getProductId();
        orderItem0.setProductId((java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal10 = null;
        orderItem0.setUnitPrice(bigDecimal10);
        com.shittu24.ecommerce.entity.Order order12 = orderItem0.getOrder();
        orderItem0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal6 = null;
        orderItem0.setUnitPrice(bigDecimal6);
        orderItem0.setId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal10 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        address6.setCountry("");
        java.lang.String str10 = address6.getState();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        java.lang.String str9 = customer2.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet10 = customer2.getOrders();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(orderSet10);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setUnitsInStock((int) (short) -1);
        java.lang.String str9 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        java.util.Date date17 = null;
        order16.setLastUpdated(date17);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setId((java.lang.Long) 100L);
        product0.setActive(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet12 = order10.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order10.getOrderItems();
        customer0.add(order10);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet15 = customer0.getOrders();
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNotNull(orderSet15);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        order3.setId((java.lang.Long) 100L);
        java.util.Date date14 = order3.getDateCreated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long11 = product0.getId();
        java.lang.String str12 = product0.getSku();
        java.util.Date date13 = null;
        product0.setDateCreated(date13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        order3.setId((java.lang.Long) 0L);
        java.util.Date date7 = order3.getLastUpdated();
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        java.math.BigDecimal bigDecimal16 = null;
        orderItem0.setUnitPrice(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.lang.String str7 = product0.getName();
        product0.setImageUrl("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str12 = customer11.getFirstName();
        java.lang.String str13 = customer11.getEmail();
        java.lang.String str14 = customer11.getFirstName();
        order3.setCustomer(customer11);
        order3.setTotalQuantity(0);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.util.Date date9 = product0.getDateCreated();
        java.util.Date date10 = product0.getDateCreated();
        java.util.Date date11 = null;
        product0.setDateCreated(date11);
        java.util.Date date13 = product0.getLastUpdated();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal16 = null;
        product0.setUnitPrice(bigDecimal16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.lang.String str13 = product0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        java.util.Date date11 = null;
        product0.setDateCreated(date11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        int int7 = order3.getTotalQuantity();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet8 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.Long long10 = customer9.getId();
        customer9.setLastName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setCustomer(customer9);
        java.lang.String str14 = customer9.getFirstName();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        int int4 = orderItem0.getQuantity();
        orderItem0.setQuantity((int) (byte) -1);
        java.lang.String str7 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet23 = customer22.getOrders();
        customer22.setEmail("");
        java.lang.String str26 = customer22.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet27 = customer22.getOrders();
        customer22.setEmail("");
        order3.setCustomer(customer22);
        com.shittu24.ecommerce.entity.Address address31 = order3.getShippingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
        org.junit.Assert.assertNotNull(orderSet15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderSet23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(orderSet27);
        org.junit.Assert.assertNull(address31);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        order9.setStatus("hi!");
        java.lang.String str16 = order9.getOrderTrackingNumber();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.util.Date date1 = null;
        product0.setDateCreated(date1);
        java.util.Date date3 = product0.getLastUpdated();
        int int4 = product0.getUnitsInStock();
        boolean boolean5 = product0.isActive();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        product0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        com.shittu24.ecommerce.entity.Customer customer23 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order24 = null;
        customer23.add(order24);
        com.shittu24.ecommerce.entity.Order order26 = new com.shittu24.ecommerce.entity.Order();
        customer23.add(order26);
        java.util.Date date28 = order26.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem29 = null;
        order26.add(orderItem29);
        order26.setOrderTrackingNumber("");
        java.util.Date date33 = order26.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet34 = order26.getOrderItems();
        java.lang.String str35 = order26.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet36 = order26.getOrderItems();
        address9.setOrder(order26);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNotNull(orderItemSet34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(orderItemSet36);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str10 = customer9.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet12 = customer11.getOrders();
        customer9.setOrders(orderSet12);
        customer9.setLastName("");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet16 = customer9.getOrders();
        customer2.setOrders(orderSet16);
        customer2.setLastName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str20 = customer2.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(orderSet12);
        org.junit.Assert.assertNotNull(orderSet16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        java.lang.String str4 = address0.getCountry();
        java.lang.Long long5 = address0.getId();
        java.lang.String str6 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.String str17 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str17, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setOrderTrackingNumber("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        order3.setId((java.lang.Long) 100L);
        java.lang.String str14 = order3.getStatus();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("hi!");
        customer0.setFirstName("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet1);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        java.lang.String str11 = address6.getCity();
        java.lang.String str12 = address6.getCity();
        address6.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        com.shittu24.ecommerce.entity.Address address16 = order3.getBillingAddress();
        java.math.BigDecimal bigDecimal17 = null;
        order3.setTotalPrice(bigDecimal17);
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        java.lang.Long long25 = order22.getId();
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        customer26.add(order29);
        order22.setCustomer(customer26);
        java.lang.String str32 = order22.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer33 = order22.getCustomer();
        com.shittu24.ecommerce.entity.Address address34 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str35 = address34.getCountry();
        java.lang.Long long36 = address34.getId();
        address34.setZipCode("hi!");
        address34.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order41 = address34.getOrder();
        order22.setBillingAddress(address34);
        com.shittu24.ecommerce.entity.Customer customer43 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order44 = null;
        customer43.add(order44);
        com.shittu24.ecommerce.entity.Order order46 = new com.shittu24.ecommerce.entity.Order();
        customer43.add(order46);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet48 = order46.getOrderItems();
        java.math.BigDecimal bigDecimal49 = null;
        order46.setTotalPrice(bigDecimal49);
        java.lang.String str51 = order46.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet52 = order46.getOrderItems();
        com.shittu24.ecommerce.entity.Address address53 = order46.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer54 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order55 = null;
        customer54.add(order55);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet57 = customer54.getOrders();
        order46.setCustomer(customer54);
        com.shittu24.ecommerce.entity.Address address59 = order46.getBillingAddress();
        java.math.BigDecimal bigDecimal60 = null;
        order46.setTotalPrice(bigDecimal60);
        address34.setOrder(order46);
        order3.setShippingAddress(address34);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(customer33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNull(order41);
        org.junit.Assert.assertNotNull(orderItemSet48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(orderItemSet52);
        org.junit.Assert.assertNull(address53);
        org.junit.Assert.assertNotNull(orderSet57);
        org.junit.Assert.assertNull(address59);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        product0.setUnitsInStock((int) (byte) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(productCategory11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(long20);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order18.getOrderItems();
        java.lang.String str21 = order18.getStatus();
        java.lang.Long long22 = order18.getId();
        java.util.Date date23 = null;
        order18.setLastUpdated(date23);
        java.lang.String str25 = order18.getStatus();
        com.shittu24.ecommerce.entity.Order order26 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address27 = order26.getBillingAddress();
        order26.setOrderTrackingNumber("");
        java.util.Date date30 = null;
        order26.setLastUpdated(date30);
        com.shittu24.ecommerce.entity.Address address32 = new com.shittu24.ecommerce.entity.Address();
        order26.setBillingAddress(address32);
        java.lang.String str34 = address32.getState();
        java.lang.String str35 = address32.getCountry();
        java.lang.String str36 = address32.getCountry();
        java.lang.String str37 = address32.getCity();
        java.lang.String str38 = address32.getCity();
        order18.setShippingAddress(address32);
        address9.setOrder(order18);
        java.util.Date date41 = null;
        order18.setLastUpdated(date41);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(address27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.Long long1 = customer0.getId();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setLastName("Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        java.util.Date date6 = null;
        order2.setLastUpdated(date6);
        address0.setOrder(order2);
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long11 = address0.getId();
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str13 = order12.getStatus();
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str15 = customer14.getFirstName();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer14.add(order16);
        customer14.setLastName("hi!");
        order12.setCustomer(customer14);
        java.lang.String str21 = customer14.getEmail();
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
        order43.setTotalQuantity((int) 'a');
        com.shittu24.ecommerce.entity.Customer customer67 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order68 = null;
        customer67.add(order68);
        com.shittu24.ecommerce.entity.Order order70 = new com.shittu24.ecommerce.entity.Order();
        customer67.add(order70);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet72 = order70.getOrderItems();
        java.util.Date date73 = order70.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer74 = order70.getCustomer();
        customer74.setId((java.lang.Long) 1L);
        order43.setCustomer(customer74);
        customer14.add(order43);
        address0.setOrder(order43);
        int int80 = order43.getTotalQuantity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
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
        org.junit.Assert.assertNotNull(orderItemSet72);
        org.junit.Assert.assertNull(date73);
        org.junit.Assert.assertNotNull(customer74);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 97 + "'", int80 == 97);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet8 = customer7.getOrders();
        customer7.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNotNull(orderSet8);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getStreet();
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        address0.setState("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str4 = address0.getZipCode();
        address0.setCountry("hi!");
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        java.util.Date date12 = order10.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = null;
        order10.add(orderItem13);
        java.util.Date date15 = null;
        order10.setDateCreated(date15);
        order10.setStatus("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str19 = order10.getStatus();
        address0.setOrder(order10);
        java.lang.Long long21 = order10.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str19, "Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long21);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        java.util.Date date27 = null;
        product0.setLastUpdated(date27);
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
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.lang.String str22 = customer14.getFirstName();
        java.lang.String str23 = customer14.getEmail();
        java.lang.String str24 = customer14.getEmail();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
        org.junit.Assert.assertNotNull(orderSet15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        java.lang.Long long9 = address0.getId();
        address0.setCountry("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        product0.setActive(false);
        product0.setName("hi!");
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        java.util.Date date12 = null;
        product0.setLastUpdated(date12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        com.shittu24.ecommerce.entity.OrderItem orderItem21 = new com.shittu24.ecommerce.entity.OrderItem();
        int int22 = orderItem21.getQuantity();
        java.math.BigDecimal bigDecimal23 = null;
        orderItem21.setUnitPrice(bigDecimal23);
        com.shittu24.ecommerce.entity.Order order25 = orderItem21.getOrder();
        int int26 = orderItem21.getQuantity();
        java.lang.Long long27 = orderItem21.getId();
        order11.add(orderItem21);
        orderItem21.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(order25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(long27);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.String str6 = address0.getStreet();
        address0.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        order3.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        product0.setSku("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        java.math.BigDecimal bigDecimal18 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(bigDecimal18);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order6 = null;
        orderItem0.setOrder(order6);
        orderItem0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        orderItem0.setId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal12 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(bigDecimal12);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = product0.getUnitPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        customer3.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        java.math.BigDecimal bigDecimal17 = orderItem10.getUnitPrice();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(bigDecimal17);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        com.shittu24.ecommerce.entity.Address address30 = order15.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer31 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str32 = customer31.getFirstName();
        com.shittu24.ecommerce.entity.Order order33 = null;
        customer31.add(order33);
        customer31.setLastName("hi!");
        order15.setCustomer(customer31);
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
        java.lang.Long long48 = customer45.getId();
        java.lang.String str49 = customer45.getFirstName();
        order15.setCustomer(customer45);
        orderItem7.setOrder(order15);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNotNull(orderSet26);
        org.junit.Assert.assertNull(address30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(orderItemSet43);
        org.junit.Assert.assertNotNull(orderItemSet44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(long48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        address0.setOrder(order2);
        java.lang.String str7 = address0.getState();
        java.lang.String str8 = address0.getState();
        java.lang.String str9 = address0.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal4 = null;
        orderItem0.setUnitPrice(bigDecimal4);
        com.shittu24.ecommerce.entity.Order order6 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal7 = orderItem0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(bigDecimal7);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal6 = product0.getUnitPrice();
        int int7 = product0.getUnitsInStock();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.Long long15 = customer8.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        int int6 = orderItem0.getQuantity();
        int int7 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        int int14 = order5.getTotalQuantity();
        java.util.Date date15 = order5.getDateCreated();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        java.lang.String str23 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str23, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        int int6 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal7 = null;
        orderItem0.setUnitPrice(bigDecimal7);
        java.lang.Long long9 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        int int4 = orderItem0.getQuantity();
        orderItem0.setQuantity((int) (byte) -1);
        java.lang.Long long7 = orderItem0.getProductId();
        java.lang.String str8 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        order3.setTotalQuantity(35);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(long26);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        address0.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        com.shittu24.ecommerce.entity.Address address10 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str11 = address10.getCountry();
        java.lang.Long long12 = address10.getId();
        address10.setState("");
        address10.setCountry("hi!");
        com.shittu24.ecommerce.entity.Order order17 = address10.getOrder();
        order3.setShippingAddress(address10);
        java.lang.Class<?> wildcardClass19 = address10.getClass();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(customer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(order17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        com.shittu24.ecommerce.entity.Customer customer80 = order12.getCustomer();
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
        org.junit.Assert.assertNull(customer80);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        product0.setName("");
        java.util.Date date12 = null;
        product0.setLastUpdated(date12);
        product0.setActive(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.String str20 = address6.getCity();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(customer18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        java.lang.Long long18 = orderItem10.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        java.lang.String str9 = customer2.getEmail();
        java.lang.String str10 = customer2.getLastName();
        customer2.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        int int9 = product0.getUnitsInStock();
        product0.setImageUrl("");
        java.util.Date date12 = null;
        product0.setDateCreated(date12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        address0.setOrder(order2);
        order2.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet9 = order2.getOrderItems();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNotNull(orderItemSet9);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order6 = null;
        orderItem0.setOrder(order6);
        com.shittu24.ecommerce.entity.Order order8 = orderItem0.getOrder();
        int int9 = orderItem0.getQuantity();
        orderItem0.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = product0.getDateCreated();
        java.lang.String str10 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        java.math.BigDecimal bigDecimal4 = null;
        orderItem0.setUnitPrice(bigDecimal4);
        com.shittu24.ecommerce.entity.Order order6 = orderItem0.getOrder();
        com.shittu24.ecommerce.entity.Order order7 = orderItem0.getOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.lang.String str9 = product0.getImageUrl();
        java.util.Date date10 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.toString();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = null;
        product0.setCategory(productCategory10);
        boolean boolean12 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        com.shittu24.ecommerce.entity.Address address16 = order3.getBillingAddress();
        java.math.BigDecimal bigDecimal17 = order3.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address18 = order3.getShippingAddress();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(bigDecimal17);
        org.junit.Assert.assertNull(address18);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setUnitsInStock((int) 'a');
        java.util.Date date9 = product0.getDateCreated();
        java.lang.String str10 = product0.getDescription();
        com.shittu24.ecommerce.entity.ProductCategory productCategory11 = null;
        product0.setCategory(productCategory11);
        java.lang.String str13 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        address0.setCountry("hi!");
        address0.setCountry("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long11 = address0.getId();
        java.lang.String str12 = address0.getCountry();
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal6 = orderItem0.getUnitPrice();
        int int7 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal8 = orderItem0.getUnitPrice();
        com.shittu24.ecommerce.entity.Order order9 = orderItem0.getOrder();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Date date16 = order14.getDateCreated();
        java.lang.Long long17 = order14.getId();
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        order14.setCustomer(customer18);
        java.lang.String str24 = order14.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer25 = order14.getCustomer();
        com.shittu24.ecommerce.entity.Address address26 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str27 = address26.getCountry();
        java.lang.Long long28 = address26.getId();
        address26.setZipCode("hi!");
        address26.setZipCode("hi!");
        com.shittu24.ecommerce.entity.Order order33 = address26.getOrder();
        order14.setBillingAddress(address26);
        com.shittu24.ecommerce.entity.Customer customer35 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order36 = null;
        customer35.add(order36);
        com.shittu24.ecommerce.entity.Order order38 = new com.shittu24.ecommerce.entity.Order();
        customer35.add(order38);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet40 = order38.getOrderItems();
        java.math.BigDecimal bigDecimal41 = null;
        order38.setTotalPrice(bigDecimal41);
        java.lang.String str43 = order38.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet44 = order38.getOrderItems();
        com.shittu24.ecommerce.entity.Address address45 = order38.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer46 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order47 = null;
        customer46.add(order47);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet49 = customer46.getOrders();
        order38.setCustomer(customer46);
        com.shittu24.ecommerce.entity.Address address51 = order38.getBillingAddress();
        java.math.BigDecimal bigDecimal52 = null;
        order38.setTotalPrice(bigDecimal52);
        address26.setOrder(order38);
        order3.setBillingAddress(address26);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(customer25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(order33);
        org.junit.Assert.assertNotNull(orderItemSet40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(orderItemSet44);
        org.junit.Assert.assertNull(address45);
        org.junit.Assert.assertNotNull(orderSet49);
        org.junit.Assert.assertNull(address51);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setImageUrl("hi!");
        java.lang.String str9 = product0.getDescription();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(productCategory10);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.String str14 = product0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        java.math.BigDecimal bigDecimal15 = order10.getTotalPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(bigDecimal15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        product0.setActive(false);
        java.lang.Long long8 = product0.getId();
        java.lang.String str9 = product0.getImageUrl();
        java.util.Date date10 = product0.getDateCreated();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        java.lang.String str8 = product0.toString();
        boolean boolean9 = product0.isActive();
        java.math.BigDecimal bigDecimal10 = null;
        product0.setUnitPrice(bigDecimal10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        orderItem10.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setCountry("");
        address0.setZipCode("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setFirstName("");
        java.lang.String str4 = customer0.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        java.lang.Long long6 = customer0.getId();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str8 = customer7.getFirstName();
        customer7.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet11 = customer7.getOrders();
        customer0.setOrders(orderSet11);
        java.lang.String str13 = customer0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderSet11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.lang.String str5 = order3.getStatus();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str7 = address6.getCity();
        address6.setCountry("hi!");
        address6.setState("hi!");
        address6.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address6.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str16 = address6.getZipCode();
        order3.setShippingAddress(address6);
        com.shittu24.ecommerce.entity.Order order18 = address6.getOrder();
        java.lang.Long long19 = address6.getId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertNull(long19);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        java.util.Date date56 = null;
        order55.setLastUpdated(date56);
        com.shittu24.ecommerce.entity.Address address58 = order55.getBillingAddress();
        java.lang.Long long59 = address58.getId();
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
        org.junit.Assert.assertNotNull(address58);
        org.junit.Assert.assertNull(long59);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer0.add(order2);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet4 = customer0.getOrders();
        java.lang.String str5 = customer0.getFirstName();
        java.lang.String str6 = customer0.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet7 = customer0.getOrders();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderSet7);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        java.lang.String str8 = address0.getCountry();
        address0.setState("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.util.Date date61 = null;
        product0.setLastUpdated(date61);
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.lang.String str5 = product0.getSku();
        java.lang.String str6 = product0.toString();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(productCategory7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str1 = order0.getStatus();
        com.shittu24.ecommerce.entity.Customer customer2 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str3 = customer2.getFirstName();
        com.shittu24.ecommerce.entity.Order order4 = null;
        customer2.add(order4);
        customer2.setLastName("hi!");
        order0.setCustomer(customer2);
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str10 = customer9.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet12 = customer11.getOrders();
        customer9.setOrders(orderSet12);
        customer9.setLastName("");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet16 = customer9.getOrders();
        customer2.setOrders(orderSet16);
        java.lang.String str18 = customer2.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(orderSet12);
        org.junit.Assert.assertNotNull(orderSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.lang.Long long20 = orderItem10.getProductId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(long20);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.lang.String str13 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        product0.setSku("hi!");
        product0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        java.lang.String str6 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        orderItem13.setProductId((java.lang.Long) (-1L));
        orderItem13.setProductId((java.lang.Long) 100L);
        orderItem13.setProductId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        address20.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.util.Date date9 = product0.getDateCreated();
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.getDescription();
        product0.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        address0.setOrder(order2);
        order2.setTotalQuantity(1);
        com.shittu24.ecommerce.entity.Address address9 = order2.getBillingAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        customer10.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        int int10 = product0.getUnitsInStock();
        java.math.BigDecimal bigDecimal11 = product0.getUnitPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Address address8 = order3.getBillingAddress();
        java.util.Date date9 = order3.getDateCreated();
        com.shittu24.ecommerce.entity.Address address10 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str11 = address10.getCountry();
        java.lang.String str12 = address10.getCountry();
        order3.setBillingAddress(address10);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.ProductCategory productCategory1 = product0.getCategory();
        product0.setUnitsInStock(100);
        java.lang.String str4 = product0.getName();
        java.util.Date date5 = product0.getDateCreated();
        org.junit.Assert.assertNull(productCategory1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        customer12.setEmail("hi!");
        customer12.setLastName("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNotNull(customer12);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        customer0.setId((java.lang.Long) 100L);
        customer0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.util.Date date11 = null;
        order5.setDateCreated(date11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        int int5 = product0.getUnitsInStock();
        java.lang.String str6 = product0.toString();
        java.lang.String str7 = product0.toString();
        product0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)" + "'", str7, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order6 = null;
        orderItem0.setOrder(order6);
        com.shittu24.ecommerce.entity.Order order8 = orderItem0.getOrder();
        java.lang.String str9 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.util.Date date9 = product0.getDateCreated();
        java.util.Date date10 = product0.getDateCreated();
        java.lang.String str11 = product0.getDescription();
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        com.shittu24.ecommerce.entity.Customer customer38 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order39 = null;
        customer38.add(order39);
        com.shittu24.ecommerce.entity.Order order41 = new com.shittu24.ecommerce.entity.Order();
        customer38.add(order41);
        java.util.Date date43 = order41.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem44 = null;
        order41.add(orderItem44);
        com.shittu24.ecommerce.entity.Address address46 = null;
        order41.setShippingAddress(address46);
        com.shittu24.ecommerce.entity.OrderItem orderItem48 = new com.shittu24.ecommerce.entity.OrderItem();
        int int49 = orderItem48.getQuantity();
        java.lang.Long long50 = orderItem48.getProductId();
        order41.add(orderItem48);
        java.util.Date date52 = null;
        order41.setLastUpdated(date52);
        com.shittu24.ecommerce.entity.Address address54 = new com.shittu24.ecommerce.entity.Address();
        address54.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str57 = address54.getZipCode();
        java.lang.String str58 = address54.getZipCode();
        com.shittu24.ecommerce.entity.Order order59 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address60 = order59.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address61 = order59.getShippingAddress();
        address54.setOrder(order59);
        com.shittu24.ecommerce.entity.Customer customer63 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order64 = null;
        customer63.add(order64);
        com.shittu24.ecommerce.entity.Order order66 = new com.shittu24.ecommerce.entity.Order();
        customer63.add(order66);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet68 = order66.getOrderItems();
        java.lang.String str69 = order66.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet70 = order66.getOrderItems();
        order59.setOrderItems(orderItemSet70);
        order41.setOrderItems(orderItemSet70);
        order3.setOrderItems(orderItemSet70);
        java.lang.Class<?> wildcardClass74 = order3.getClass();
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
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(long50);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(address60);
        org.junit.Assert.assertNull(address61);
        org.junit.Assert.assertNotNull(orderItemSet68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(orderItemSet70);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        java.lang.String str16 = address0.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        int int6 = orderItem0.getQuantity();
        java.lang.Long long7 = orderItem0.getProductId();
        orderItem0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        java.lang.String str20 = order12.getOrderTrackingNumber();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str20, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = new com.shittu24.ecommerce.entity.OrderItem();
        int int17 = orderItem16.getQuantity();
        orderItem16.setId((java.lang.Long) 10L);
        java.lang.String str20 = orderItem16.getImageUrl();
        orderItem16.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int23 = orderItem16.getQuantity();
        order3.add(orderItem16);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemArray8);
        org.junit.Assert.assertArrayEquals(orderItemArray8, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        com.shittu24.ecommerce.entity.Address address16 = order3.getShippingAddress();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(address16);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getSku();
        product0.setUnitsInStock((int) '#');
        java.lang.String str11 = product0.getName();
        int int12 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        customer0.setLastName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setUnitsInStock((int) (short) 0);
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        product0.setDescription("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setUnitsInStock((int) (byte) 100);
        boolean boolean12 = product0.isActive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        java.lang.Long long15 = orderItem10.getId();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        order0.setOrderTrackingNumber("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date6 = null;
        order0.setDateCreated(date6);
        org.junit.Assert.assertNull(address1);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        com.shittu24.ecommerce.entity.Order order7 = address0.getOrder();
        com.shittu24.ecommerce.entity.Order order8 = address0.getOrder();
        address0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        int int17 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        int int19 = order9.getTotalQuantity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.math.BigDecimal bigDecimal9 = null;
        orderItem7.setUnitPrice(bigDecimal9);
        com.shittu24.ecommerce.entity.Order order11 = orderItem7.getOrder();
        int int12 = orderItem7.getQuantity();
        com.shittu24.ecommerce.entity.Order order13 = orderItem7.getOrder();
        orderItem7.setProductId((java.lang.Long) 100L);
        order3.add(orderItem7);
        java.util.Date date17 = null;
        order3.setDateCreated(date17);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        java.util.Date date2 = null;
        order0.setDateCreated(date2);
        com.shittu24.ecommerce.entity.Address address4 = order0.getShippingAddress();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address4);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        java.lang.Long long5 = address0.getId();
        address0.setId((java.lang.Long) 10L);
        java.lang.String str8 = address0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order3.getOrderItems();
        java.util.Date date12 = null;
        order3.setLastUpdated(date12);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(orderItemSet11);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        address0.setCountry("");
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet26 = order24.getOrderItems();
        order24.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Address address29 = order24.getBillingAddress();
        java.util.Date date30 = order24.getDateCreated();
        address0.setOrder(order24);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(address29);
        org.junit.Assert.assertNull(date30);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        orderItem0.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal6 = null;
        orderItem0.setUnitPrice(bigDecimal6);
        orderItem0.setQuantity(0);
        com.shittu24.ecommerce.entity.Order order10 = orderItem0.getOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.lang.Long long18 = orderItem0.getId();
        java.lang.Class<?> wildcardClass19 = orderItem0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.util.Date date11 = order3.getDateCreated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        address0.setZipCode("");
        java.lang.Long long9 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        product0.setActive(false);
        product0.setUnitsInStock((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.math.BigDecimal bigDecimal9 = null;
        orderItem7.setUnitPrice(bigDecimal9);
        com.shittu24.ecommerce.entity.Order order11 = orderItem7.getOrder();
        int int12 = orderItem7.getQuantity();
        com.shittu24.ecommerce.entity.Order order13 = orderItem7.getOrder();
        orderItem7.setProductId((java.lang.Long) 100L);
        order3.add(orderItem7);
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        com.shittu24.ecommerce.entity.Order order20 = new com.shittu24.ecommerce.entity.Order();
        customer17.add(order20);
        java.util.Date date22 = order20.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem23 = null;
        order20.add(orderItem23);
        com.shittu24.ecommerce.entity.Address address25 = null;
        order20.setShippingAddress(address25);
        com.shittu24.ecommerce.entity.OrderItem orderItem27 = new com.shittu24.ecommerce.entity.OrderItem();
        int int28 = orderItem27.getQuantity();
        java.lang.Long long29 = orderItem27.getProductId();
        order20.add(orderItem27);
        orderItem27.setProductId((java.lang.Long) 10L);
        java.lang.String str33 = orderItem27.getImageUrl();
        int int34 = orderItem27.getQuantity();
        order3.add(orderItem27);
        orderItem27.setProductId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        order3.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Address address7 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address8 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str9 = address8.getCity();
        address8.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str12 = address8.getZipCode();
        address8.setCountry("hi!");
        order3.setBillingAddress(address8);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        int int14 = orderItem10.getQuantity();
        orderItem10.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        customer7.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        customer26.add(order29);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet31 = order29.getOrderItems();
        java.util.Date date32 = order29.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer33 = order29.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet34 = customer33.getOrders();
        customer7.setOrders(orderSet34);
        customer7.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str38 = customer7.getFirstName();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(orderSet16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(orderSet22);
        org.junit.Assert.assertNotNull(orderItemSet31);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(customer33);
        org.junit.Assert.assertNotNull(orderSet34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str38, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        com.shittu24.ecommerce.entity.ProductCategory productCategory15 = null;
        product0.setCategory(productCategory15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bigDecimal14);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        java.lang.String str8 = address0.getZipCode();
        address0.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        java.lang.String str9 = product0.toString();
        product0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.ProductCategory productCategory1 = product0.getCategory();
        product0.setUnitsInStock(100);
        java.lang.String str4 = product0.getName();
        boolean boolean5 = product0.isActive();
        org.junit.Assert.assertNull(productCategory1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.math.BigDecimal bigDecimal32 = product0.getUnitPrice();
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
        org.junit.Assert.assertNull(bigDecimal32);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.util.Date date1 = null;
        product0.setDateCreated(date1);
        java.util.Date date3 = product0.getLastUpdated();
        int int4 = product0.getUnitsInStock();
        java.lang.String str5 = product0.toString();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str5, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.lang.Long long21 = order3.getId();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = null;
        order3.setOrderItems(orderItemSet22);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNull(long21);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        boolean boolean13 = product0.isActive();
        boolean boolean14 = product0.isActive();
        int int15 = product0.getUnitsInStock();
        java.lang.Long long16 = product0.getId();
        java.math.BigDecimal bigDecimal17 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(bigDecimal17);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.math.BigDecimal bigDecimal10 = product0.getUnitPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.String str2 = address0.getCountry();
        java.lang.String str3 = address0.getCity();
        address0.setZipCode("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.math.BigDecimal bigDecimal26 = orderItem17.getUnitPrice();
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
        org.junit.Assert.assertNull(bigDecimal26);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long9 = product0.getId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        com.shittu24.ecommerce.entity.Address address21 = order3.getShippingAddress();
        java.lang.Long long22 = order3.getId();
        java.lang.Long long23 = order3.getId();
        java.math.BigDecimal bigDecimal24 = null;
        order3.setTotalPrice(bigDecimal24);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(address21);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(long23);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        order43.setTotalQuantity((-1));
        java.lang.String str52 = order43.getStatus();
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
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        java.util.Date date13 = order11.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem14 = null;
        order11.add(orderItem14);
        order11.setOrderTrackingNumber("");
        java.util.Date date18 = order11.getLastUpdated();
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address20 = order19.getBillingAddress();
        order19.setOrderTrackingNumber("");
        java.util.Date date23 = null;
        order19.setLastUpdated(date23);
        com.shittu24.ecommerce.entity.Address address25 = new com.shittu24.ecommerce.entity.Address();
        order19.setBillingAddress(address25);
        java.lang.String str27 = address25.getState();
        java.lang.String str28 = address25.getCountry();
        java.lang.String str29 = address25.getCountry();
        java.lang.String str30 = address25.getCity();
        java.lang.String str31 = address25.getCity();
        order11.setBillingAddress(address25);
        java.lang.String str33 = address25.getState();
        order3.setShippingAddress(address25);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(address20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.util.Date date14 = null;
        order0.setLastUpdated(date14);
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(orderItemSet12);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        com.shittu24.ecommerce.entity.Customer customer15 = order9.getCustomer();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Date date21 = order19.getDateCreated();
        java.lang.Long long22 = order19.getId();
        com.shittu24.ecommerce.entity.Customer customer23 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order24 = null;
        customer23.add(order24);
        com.shittu24.ecommerce.entity.Order order26 = new com.shittu24.ecommerce.entity.Order();
        customer23.add(order26);
        order19.setCustomer(customer23);
        com.shittu24.ecommerce.entity.Customer customer29 = order19.getCustomer();
        com.shittu24.ecommerce.entity.Customer customer30 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet31 = customer30.getOrders();
        customer30.setEmail("");
        customer30.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str36 = customer30.getFirstName();
        order19.setCustomer(customer30);
        java.lang.String str38 = customer30.getFirstName();
        order9.setCustomer(customer30);
        customer30.setEmail("Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(customer15);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNotNull(customer29);
        org.junit.Assert.assertNotNull(orderSet31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        java.lang.String str21 = address0.getCountry();
        java.lang.String str22 = address0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order15);
        org.junit.Assert.assertNotNull(order16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setStatus("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str4 = order0.getOrderTrackingNumber();
        java.lang.Long long5 = order0.getId();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.math.BigDecimal bigDecimal16 = orderItem13.getUnitPrice();
        java.math.BigDecimal bigDecimal17 = null;
        orderItem13.setUnitPrice(bigDecimal17);
        orderItem13.setQuantity((int) (short) 100);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(bigDecimal16);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        java.util.Date date20 = order8.getDateCreated();
        java.util.Date date21 = order8.getDateCreated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.lang.Long long56 = customer55.getId();
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
        org.junit.Assert.assertNull(long56);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        com.shittu24.ecommerce.entity.ProductCategory productCategory22 = product0.getCategory();
        java.lang.String str23 = product0.getImageUrl();
        java.util.Date date24 = null;
        product0.setLastUpdated(date24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(productCategory22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        com.shittu24.ecommerce.entity.Address address9 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str10 = address9.getCity();
        address9.setCountry("hi!");
        address9.setState("hi!");
        java.lang.String str15 = address9.getStreet();
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        order19.setId((java.lang.Long) 0L);
        address9.setOrder(order19);
        com.shittu24.ecommerce.entity.Order order24 = address9.getOrder();
        com.shittu24.ecommerce.entity.Order order25 = address9.getOrder();
        address9.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean28 = product0.equals((java.lang.Object) "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str29 = product0.getSku();
        product0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(order24);
        org.junit.Assert.assertNotNull(order25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.ProductCategory productCategory1 = product0.getCategory();
        java.lang.String str2 = product0.toString();
        product0.setDescription("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(productCategory1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str2, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        address6.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address6.getZipCode();
        java.lang.String str10 = address6.getZipCode();
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address12 = order11.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address13 = order11.getShippingAddress();
        address6.setOrder(order11);
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order18.getOrderItems();
        java.lang.String str21 = order18.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order18.getOrderItems();
        order11.setOrderItems(orderItemSet22);
        order3.setOrderItems(orderItemSet22);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address26 = order25.getBillingAddress();
        order25.setOrderTrackingNumber("");
        java.util.Date date29 = null;
        order25.setLastUpdated(date29);
        com.shittu24.ecommerce.entity.Address address31 = new com.shittu24.ecommerce.entity.Address();
        order25.setBillingAddress(address31);
        java.lang.String str33 = address31.getState();
        java.lang.String str34 = address31.getCountry();
        order3.setShippingAddress(address31);
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet37 = customer36.getOrders();
        customer36.setEmail("");
        customer36.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet42 = customer36.getOrders();
        order3.setCustomer(customer36);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(address26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(orderSet37);
        org.junit.Assert.assertNotNull(orderSet42);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        int int4 = orderItem0.getQuantity();
        orderItem0.setProductId((java.lang.Long) 0L);
        java.math.BigDecimal bigDecimal7 = null;
        orderItem0.setUnitPrice(bigDecimal7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = null;
        product0.setCategory(productCategory5);
        java.util.Date date7 = product0.getDateCreated();
        java.lang.String str8 = product0.getImageUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        java.lang.String str26 = address17.getState();
        java.lang.String str27 = address17.getCity();
        address17.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order30 = address17.getOrder();
        address17.setId((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(order30);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.math.BigDecimal bigDecimal14 = null;
        order0.setTotalPrice(bigDecimal14);
        java.util.Date date16 = order0.getDateCreated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order0.getOrderItems();
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(orderItemSet17);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.lang.String str5 = product0.getSku();
        int int6 = product0.getUnitsInStock();
        boolean boolean7 = product0.isActive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.lang.String str9 = product0.getImageUrl();
        product0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        com.shittu24.ecommerce.entity.Customer customer35 = order3.getCustomer();
        java.lang.Long long36 = customer35.getId();
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
        org.junit.Assert.assertNotNull(customer35);
        org.junit.Assert.assertNull(long36);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet56 = order21.getOrderItems();
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
        org.junit.Assert.assertNotNull(orderItemSet56);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        java.math.BigDecimal bigDecimal15 = orderItem0.getUnitPrice();
        java.lang.Long long16 = orderItem0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(bigDecimal15);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        java.util.Date date13 = order3.getLastUpdated();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(orderItemSet10);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        boolean boolean13 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long6 = address0.getId();
        java.lang.String str7 = address0.getZipCode();
        address0.setZipCode("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.util.Date date1 = null;
        product0.setDateCreated(date1);
        java.util.Date date3 = product0.getLastUpdated();
        int int4 = product0.getUnitsInStock();
        java.lang.String str5 = product0.getSku();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        com.shittu24.ecommerce.entity.Order order43 = orderItem10.getOrder();
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
        org.junit.Assert.assertNotNull(order43);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        java.lang.String str8 = customer0.getEmail();
        customer0.setId((java.lang.Long) 10L);
        java.lang.String str11 = customer0.getFirstName();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        order10.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.math.BigDecimal bigDecimal20 = null;
        order12.setTotalPrice(bigDecimal20);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        address9.setCountry("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        int int5 = product0.getUnitsInStock();
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str8 = product0.getDescription();
        java.lang.String str9 = product0.getSku();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str6 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        customer7.setEmail("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.util.Date date6 = order3.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer7 = order3.getCustomer();
        customer7.setId((java.lang.Long) 1L);
        customer7.setEmail("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        com.shittu24.ecommerce.entity.Address address21 = order3.getShippingAddress();
        java.lang.Long long22 = order3.getId();
        java.lang.String str23 = order3.getOrderTrackingNumber();
        java.math.BigDecimal bigDecimal24 = null;
        order3.setTotalPrice(bigDecimal24);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(address21);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        int int14 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getBillingAddress();
        java.util.Date date7 = order0.getLastUpdated();
        java.util.Date date8 = null;
        order0.setLastUpdated(date8);
        java.util.Date date10 = order0.getDateCreated();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        product0.setActive(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.String str2 = orderItem0.getImageUrl();
        java.lang.String str3 = orderItem0.getImageUrl();
        java.lang.String str4 = orderItem0.getImageUrl();
        java.lang.Long long5 = orderItem0.getProductId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        orderItem10.setProductId((java.lang.Long) 100L);
        java.lang.Long long20 = orderItem10.getId();
        orderItem10.setProductId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(long20);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        address6.setZipCode("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet13 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address14 = order3.getShippingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet13);
        org.junit.Assert.assertNull(address14);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        customer26.add(order29);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet31 = order29.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet32 = order29.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer33 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str34 = customer33.getFirstName();
        order29.setCustomer(customer33);
        java.lang.Long long36 = customer33.getId();
        java.lang.String str37 = customer33.getFirstName();
        order3.setCustomer(customer33);
        customer33.setEmail("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet31);
        org.junit.Assert.assertNotNull(orderItemSet32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getLastName();
        customer0.setEmail("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str6, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        java.lang.String str4 = orderItem0.getImageUrl();
        orderItem0.setImageUrl("hi!");
        java.lang.String str7 = orderItem0.getImageUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        java.math.BigDecimal bigDecimal15 = orderItem0.getUnitPrice();
        orderItem0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(bigDecimal15);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order1 = orderItem0.getOrder();
        int int2 = orderItem0.getQuantity();
        java.lang.Long long3 = orderItem0.getId();
        orderItem0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        java.lang.Long long38 = order10.getId();
        java.math.BigDecimal bigDecimal39 = null;
        order10.setTotalPrice(bigDecimal39);
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
        org.junit.Assert.assertNull(long38);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order9.getOrderItems();
        com.shittu24.ecommerce.entity.Address address16 = order9.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet20 = customer17.getOrders();
        order9.setCustomer(customer17);
        com.shittu24.ecommerce.entity.Address address22 = order9.getBillingAddress();
        java.math.BigDecimal bigDecimal23 = null;
        order9.setTotalPrice(bigDecimal23);
        order9.setId((java.lang.Long) 1L);
        customer0.add(order9);
        com.shittu24.ecommerce.entity.Customer customer28 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer28.add(order29);
        com.shittu24.ecommerce.entity.Order order31 = new com.shittu24.ecommerce.entity.Order();
        customer28.add(order31);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet33 = order31.getOrderItems();
        java.math.BigDecimal bigDecimal34 = null;
        order31.setTotalPrice(bigDecimal34);
        java.lang.String str36 = order31.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet37 = order31.getOrderItems();
        com.shittu24.ecommerce.entity.Address address38 = order31.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer39 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order40 = null;
        customer39.add(order40);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet42 = customer39.getOrders();
        order31.setCustomer(customer39);
        com.shittu24.ecommerce.entity.Address address44 = null;
        order31.setShippingAddress(address44);
        com.shittu24.ecommerce.entity.Address address46 = order31.getBillingAddress();
        com.shittu24.ecommerce.entity.Customer customer47 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str48 = customer47.getFirstName();
        com.shittu24.ecommerce.entity.Order order49 = null;
        customer47.add(order49);
        customer47.setLastName("hi!");
        order31.setCustomer(customer47);
        order9.setCustomer(customer47);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNotNull(orderSet20);
        org.junit.Assert.assertNull(address22);
        org.junit.Assert.assertNotNull(orderItemSet33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(orderItemSet37);
        org.junit.Assert.assertNull(address38);
        org.junit.Assert.assertNotNull(orderSet42);
        org.junit.Assert.assertNull(address46);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        address17.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        java.lang.String str36 = customer0.getLastName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet37 = customer0.getOrders();
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
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(orderSet37);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.util.Date date8 = null;
        product0.setDateCreated(date8);
        java.lang.String str10 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        java.lang.String str13 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        customer7.setFirstName("");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        int int16 = orderItem10.getQuantity();
        orderItem10.setProductId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.util.Date date15 = product0.getDateCreated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        com.shittu24.ecommerce.entity.Address address21 = order3.getShippingAddress();
        java.lang.String str22 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(address21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = order3.getStatus();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        int int7 = product0.getUnitsInStock();
        java.util.Date date8 = null;
        product0.setDateCreated(date8);
        java.lang.String str10 = product0.getImageUrl();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.lang.String str12 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order6 = null;
        orderItem0.setOrder(order6);
        orderItem0.setProductId((java.lang.Long) 10L);
        orderItem0.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        com.shittu24.ecommerce.entity.Order order15 = new com.shittu24.ecommerce.entity.Order();
        customer12.add(order15);
        java.util.Date date17 = order15.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem18 = null;
        order15.add(orderItem18);
        com.shittu24.ecommerce.entity.Address address20 = null;
        order15.setShippingAddress(address20);
        com.shittu24.ecommerce.entity.OrderItem orderItem22 = new com.shittu24.ecommerce.entity.OrderItem();
        int int23 = orderItem22.getQuantity();
        java.lang.Long long24 = orderItem22.getProductId();
        order15.add(orderItem22);
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        customer26.add(order29);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet31 = order29.getOrderItems();
        java.lang.String str32 = order29.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet33 = order29.getOrderItems();
        order15.setOrderItems(orderItemSet33);
        java.math.BigDecimal bigDecimal35 = order15.getTotalPrice();
        com.shittu24.ecommerce.entity.Address address36 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str37 = address36.getCountry();
        java.lang.Long long38 = address36.getId();
        address36.setState("");
        order15.setBillingAddress(address36);
        java.util.Date date42 = order15.getLastUpdated();
        int int43 = order15.getTotalQuantity();
        orderItem0.setOrder(order15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertNotNull(orderItemSet31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(orderItemSet33);
        org.junit.Assert.assertNull(bigDecimal35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNull(date42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setActive(false);
        java.lang.Long long5 = product0.getId();
        com.shittu24.ecommerce.entity.ProductCategory productCategory6 = null;
        product0.setCategory(productCategory6);
        boolean boolean8 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        boolean boolean13 = product0.isActive();
        boolean boolean14 = product0.isActive();
        int int15 = product0.getUnitsInStock();
        java.lang.Long long16 = product0.getId();
        java.util.Date date17 = product0.getDateCreated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        boolean boolean9 = product0.isActive();
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        java.lang.String str12 = product0.getSku();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet12 = customer11.getOrders();
        customer11.setEmail("");
        java.lang.String str15 = customer11.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet16 = customer11.getOrders();
        java.lang.Long long17 = customer11.getId();
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order19 = null;
        customer18.add(order19);
        com.shittu24.ecommerce.entity.Order order21 = new com.shittu24.ecommerce.entity.Order();
        customer18.add(order21);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet23 = order21.getOrderItems();
        java.math.BigDecimal bigDecimal24 = null;
        order21.setTotalPrice(bigDecimal24);
        com.shittu24.ecommerce.entity.Order order26 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address27 = order26.getBillingAddress();
        order26.setOrderTrackingNumber("");
        java.util.Date date30 = null;
        order26.setLastUpdated(date30);
        com.shittu24.ecommerce.entity.Address address32 = new com.shittu24.ecommerce.entity.Address();
        order26.setBillingAddress(address32);
        java.lang.String str34 = address32.getState();
        java.lang.String str35 = address32.getCountry();
        java.lang.String str36 = address32.getState();
        order21.setBillingAddress(address32);
        com.shittu24.ecommerce.entity.Customer customer38 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str39 = customer38.getFirstName();
        java.lang.String str40 = customer38.getEmail();
        customer38.setEmail("");
        java.lang.Long long43 = customer38.getId();
        order21.setCustomer(customer38);
        int int45 = order21.getTotalQuantity();
        customer11.add(order21);
        com.shittu24.ecommerce.entity.Customer customer47 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str48 = customer47.getFirstName();
        customer47.setFirstName("");
        java.lang.String str51 = customer47.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet52 = customer47.getOrders();
        java.lang.Long long53 = customer47.getId();
        com.shittu24.ecommerce.entity.Customer customer54 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str55 = customer54.getFirstName();
        customer54.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet58 = customer54.getOrders();
        customer47.setOrders(orderSet58);
        customer11.setOrders(orderSet58);
        customer11.setFirstName("");
        order2.setCustomer(customer11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNotNull(orderSet12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(orderSet16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNotNull(orderItemSet23);
        org.junit.Assert.assertNull(address27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(long43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(orderSet52);
        org.junit.Assert.assertNull(long53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(orderSet58);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        address0.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setStreet("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        java.lang.String str7 = product0.getName();
        java.lang.String str8 = product0.getDescription();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str11 = product0.getName();
        java.lang.Class<?> wildcardClass12 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        java.util.Date date13 = null;
        product0.setLastUpdated(date13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setId((java.lang.Long) 10L);
        java.util.Date date10 = product0.getDateCreated();
        product0.setActive(true);
        java.math.BigDecimal bigDecimal13 = product0.getUnitPrice();
        product0.setImageUrl("hi!");
        java.lang.Class<?> wildcardClass16 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(bigDecimal13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        order3.setId((java.lang.Long) 100L);
        com.shittu24.ecommerce.entity.Customer customer14 = order3.getCustomer();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(customer14);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.String str2 = customer0.getEmail();
        java.lang.String str3 = customer0.getFirstName();
        customer0.setEmail("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setId((java.lang.Long) 10L);
        customer0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        address6.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str9 = address6.getZipCode();
        java.lang.String str10 = address6.getZipCode();
        com.shittu24.ecommerce.entity.Order order11 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address12 = order11.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address13 = order11.getShippingAddress();
        address6.setOrder(order11);
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        com.shittu24.ecommerce.entity.Order order18 = new com.shittu24.ecommerce.entity.Order();
        customer15.add(order18);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order18.getOrderItems();
        java.lang.String str21 = order18.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order18.getOrderItems();
        order11.setOrderItems(orderItemSet22);
        order3.setOrderItems(orderItemSet22);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address26 = order25.getBillingAddress();
        order25.setOrderTrackingNumber("");
        java.util.Date date29 = null;
        order25.setLastUpdated(date29);
        com.shittu24.ecommerce.entity.Address address31 = new com.shittu24.ecommerce.entity.Address();
        order25.setBillingAddress(address31);
        java.lang.String str33 = address31.getState();
        java.lang.String str34 = address31.getCountry();
        order3.setShippingAddress(address31);
        java.util.Date date36 = null;
        order3.setDateCreated(date36);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(address26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        com.shittu24.ecommerce.entity.Customer customer41 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order42 = null;
        customer41.add(order42);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet44 = customer41.getOrders();
        customer41.setEmail("");
        customer41.setEmail("");
        java.lang.String str49 = customer41.getEmail();
        order7.setCustomer(customer41);
        java.lang.Long long51 = order7.getId();
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
        org.junit.Assert.assertNotNull(orderSet44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(long51);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        address0.setId((java.lang.Long) 100L);
        java.lang.String str17 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.lang.String str13 = product0.getSku();
        java.lang.String str14 = product0.getImageUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(productCategory12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        java.lang.Long long9 = product0.getId();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        product0.setActive(false);
        java.lang.Long long8 = product0.getId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        order3.setStatus("hi!");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        address0.setOrder(order2);
        order2.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = order2.getDateCreated();
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Date date15 = order13.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem16 = null;
        order13.add(orderItem16);
        order13.setOrderTrackingNumber("");
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet20 = order13.getOrderItems();
        order2.setOrderItems(orderItemSet20);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderItemSet20);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        com.shittu24.ecommerce.entity.ProductCategory productCategory13 = product0.getCategory();
        com.shittu24.ecommerce.entity.ProductCategory productCategory14 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(productCategory13);
        org.junit.Assert.assertNull(productCategory14);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        int int2 = product0.getUnitsInStock();
        java.lang.Long long3 = product0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        address9.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date1 = null;
        order0.setLastUpdated(date1);
        java.math.BigDecimal bigDecimal3 = order0.getTotalPrice();
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        order0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(bigDecimal3);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        java.lang.Object obj17 = null;
        boolean boolean18 = product0.equals(obj17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.lang.Long long11 = order3.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer0.add(order2);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet4 = customer0.getOrders();
        java.lang.String str5 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order7 = null;
        customer6.add(order7);
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        customer6.add(order9);
        java.util.Date date11 = order9.getDateCreated();
        java.lang.Long long12 = order9.getId();
        com.shittu24.ecommerce.entity.Customer customer13 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order14 = null;
        customer13.add(order14);
        com.shittu24.ecommerce.entity.Order order16 = new com.shittu24.ecommerce.entity.Order();
        customer13.add(order16);
        order9.setCustomer(customer13);
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet22 = customer19.getOrders();
        customer19.setEmail("");
        customer19.setId((java.lang.Long) 10L);
        java.lang.String str27 = customer19.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet28 = customer19.getOrders();
        customer13.setOrders(orderSet28);
        customer0.setOrders(orderSet28);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderSet22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(orderSet28);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        java.math.BigDecimal bigDecimal16 = product0.getUnitPrice();
        int int17 = product0.getUnitsInStock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        order0.setId((java.lang.Long) 100L);
        com.shittu24.ecommerce.entity.Address address36 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str37 = address36.getCity();
        address36.setCountry("hi!");
        address36.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str42 = address36.getCity();
        java.lang.String str43 = address36.getZipCode();
        order0.setBillingAddress(address36);
        int int45 = order0.getTotalQuantity();
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
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        java.util.Date date17 = order3.getDateCreated();
        order3.setId((java.lang.Long) 1L);
        java.util.Date date20 = order3.getLastUpdated();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        product0.setId((java.lang.Long) 0L);
        int int7 = product0.getUnitsInStock();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        int int17 = orderItem13.getQuantity();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        customer0.setEmail("hi!");
        java.lang.Long long10 = customer0.getId();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long13 = customer0.getId();
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        product0.setName("");
        java.lang.String str12 = product0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.lang.String str32 = address18.getZipCode();
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        com.shittu24.ecommerce.entity.OrderItem orderItem7 = new com.shittu24.ecommerce.entity.OrderItem();
        int int8 = orderItem7.getQuantity();
        java.math.BigDecimal bigDecimal9 = null;
        orderItem7.setUnitPrice(bigDecimal9);
        com.shittu24.ecommerce.entity.Order order11 = orderItem7.getOrder();
        int int12 = orderItem7.getQuantity();
        com.shittu24.ecommerce.entity.Order order13 = orderItem7.getOrder();
        orderItem7.setProductId((java.lang.Long) 100L);
        order3.add(orderItem7);
        java.util.Date date17 = null;
        order3.setLastUpdated(date17);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        product0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        com.shittu24.ecommerce.entity.Address address16 = order3.getBillingAddress();
        java.math.BigDecimal bigDecimal17 = order3.getTotalPrice();
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
        orderItem28.setImageUrl("hi!");
        java.math.BigDecimal bigDecimal34 = null;
        orderItem28.setUnitPrice(bigDecimal34);
        orderItem28.setId((java.lang.Long) 10L);
        java.math.BigDecimal bigDecimal38 = null;
        orderItem28.setUnitPrice(bigDecimal38);
        orderItem28.setImageUrl("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        orderItem28.setId((java.lang.Long) 1L);
        order3.add(orderItem28);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(bigDecimal17);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(long30);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.Object obj9 = null;
        boolean boolean10 = product0.equals(obj9);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        product0.setActive(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        java.util.Date date31 = order3.getDateCreated();
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        com.shittu24.ecommerce.entity.OrderItem orderItem10 = new com.shittu24.ecommerce.entity.OrderItem();
        int int11 = orderItem10.getQuantity();
        java.math.BigDecimal bigDecimal12 = null;
        orderItem10.setUnitPrice(bigDecimal12);
        orderItem10.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        customer16.add(order19);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet21 = order19.getOrderItems();
        java.math.BigDecimal bigDecimal22 = null;
        order19.setTotalPrice(bigDecimal22);
        orderItem10.setOrder(order19);
        int int25 = orderItem10.getQuantity();
        order3.add(orderItem10);
        int int27 = order3.getTotalQuantity();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.util.Date date30 = null;
        order13.setDateCreated(date30);
        java.math.BigDecimal bigDecimal32 = order13.getTotalPrice();
        java.util.Date date33 = null;
        order13.setDateCreated(date33);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(bigDecimal32);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        address0.setState("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        int int6 = product0.getUnitsInStock();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        com.shittu24.ecommerce.entity.Address address14 = order3.getBillingAddress();
        java.lang.String str15 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        com.shittu24.ecommerce.entity.Product product14 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str15 = product14.getSku();
        java.lang.Long long16 = product14.getId();
        product14.setUnitsInStock((int) (byte) -1);
        product14.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int21 = product14.getUnitsInStock();
        com.shittu24.ecommerce.entity.Customer customer22 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order23 = null;
        customer22.add(order23);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        customer22.add(order25);
        java.util.Date date27 = order25.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem28 = null;
        order25.add(orderItem28);
        java.util.Date date30 = null;
        order25.setLastUpdated(date30);
        boolean boolean32 = product14.equals((java.lang.Object) order25);
        java.util.Date date33 = null;
        order25.setDateCreated(date33);
        customer13.add(order25);
        com.shittu24.ecommerce.entity.Address address36 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str37 = address36.getCity();
        address36.setCountry("hi!");
        address36.setState("hi!");
        java.lang.String str42 = address36.getStreet();
        com.shittu24.ecommerce.entity.Customer customer43 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order44 = null;
        customer43.add(order44);
        com.shittu24.ecommerce.entity.Order order46 = new com.shittu24.ecommerce.entity.Order();
        customer43.add(order46);
        order46.setId((java.lang.Long) 0L);
        address36.setOrder(order46);
        customer13.add(order46);
        java.math.BigDecimal bigDecimal52 = order46.getTotalPrice();
        java.lang.Class<?> wildcardClass53 = order46.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(bigDecimal52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        order7.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(orderItemArray12);
        org.junit.Assert.assertArrayEquals(orderItemArray12, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(address19);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        com.shittu24.ecommerce.entity.Customer customer41 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order42 = null;
        customer41.add(order42);
        com.shittu24.ecommerce.entity.Order order44 = new com.shittu24.ecommerce.entity.Order();
        customer41.add(order44);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet46 = order44.getOrderItems();
        java.lang.String str47 = order44.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet48 = order44.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer49 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order50 = null;
        customer49.add(order50);
        com.shittu24.ecommerce.entity.Order order52 = new com.shittu24.ecommerce.entity.Order();
        customer49.add(order52);
        java.util.Date date54 = order52.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem55 = null;
        order52.add(orderItem55);
        order52.setOrderTrackingNumber("");
        java.util.Date date59 = order52.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet60 = order52.getOrderItems();
        order44.setOrderItems(orderItemSet60);
        customer20.add(order44);
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
        org.junit.Assert.assertNotNull(orderItemSet46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(orderItemSet48);
        org.junit.Assert.assertNull(date54);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertNotNull(orderItemSet60);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setImageUrl("hi!");
        java.lang.String str9 = product0.getSku();
        product0.setUnitsInStock((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order5.getOrderItems();
        com.shittu24.ecommerce.entity.Address address12 = order5.getBillingAddress();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        com.shittu24.ecommerce.entity.Customer customer22 = order3.getCustomer();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(customer22);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet16 = customer15.getOrders();
        customer15.setEmail("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setCustomer(customer15);
        java.lang.Class<?> wildcardClass20 = customer15.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(orderSet16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setActive(false);
        java.lang.Long long5 = product0.getId();
        java.util.Date date6 = product0.getLastUpdated();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = date6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getCountry();
        com.shittu24.ecommerce.entity.Product product8 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean10 = product8.equals((java.lang.Object) 1.0f);
        product8.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory13 = product8.getCategory();
        product8.setName("hi!");
        product8.setId((java.lang.Long) 10L);
        java.util.Date date18 = product8.getDateCreated();
        java.lang.String str19 = product8.toString();
        com.shittu24.ecommerce.entity.Customer customer20 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order21 = null;
        customer20.add(order21);
        com.shittu24.ecommerce.entity.Order order23 = new com.shittu24.ecommerce.entity.Order();
        customer20.add(order23);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet25 = order23.getOrderItems();
        java.lang.String str26 = order23.getStatus();
        java.util.Date date27 = order23.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer28 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str29 = customer28.getFirstName();
        java.lang.Long long30 = customer28.getId();
        order23.setCustomer(customer28);
        boolean boolean32 = product8.equals((java.lang.Object) order23);
        address0.setOrder(order23);
        order23.setTotalQuantity((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(productCategory13);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str19, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = product0.getSku();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        address6.setCity("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet3 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setEmail("");
        java.lang.String str8 = customer0.getEmail();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer0.setEmail("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.lang.String str12 = order3.getOrderTrackingNumber();
        order3.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.OrderItem orderItem15 = null;
        order3.add(orderItem15);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        com.shittu24.ecommerce.entity.Order order2 = null;
        customer0.add(order2);
        java.lang.Long long4 = customer0.getId();
        customer0.setFirstName("hi!");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet7 = customer0.getOrders();
        java.lang.String str8 = customer0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(orderSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setImageUrl("");
        java.lang.Long long4 = orderItem0.getId();
        java.lang.Long long5 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal6 = orderItem0.getUnitPrice();
        int int7 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal8 = null;
        orderItem0.setUnitPrice(bigDecimal8);
        com.shittu24.ecommerce.entity.Customer customer10 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order11 = null;
        customer10.add(order11);
        com.shittu24.ecommerce.entity.Order order13 = new com.shittu24.ecommerce.entity.Order();
        customer10.add(order13);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet15 = order13.getOrderItems();
        java.lang.String str16 = order13.getStatus();
        java.util.Date date17 = order13.getLastUpdated();
        java.lang.Long long18 = order13.getId();
        orderItem0.setOrder(order13);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(orderItemSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        customer0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        com.shittu24.ecommerce.entity.Address address26 = order3.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address27 = null;
        order3.setBillingAddress(address27);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderItemSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet21);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(address26);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.Customer customer7 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order8 = null;
        customer7.add(order8);
        com.shittu24.ecommerce.entity.Order order10 = new com.shittu24.ecommerce.entity.Order();
        customer7.add(order10);
        order10.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Address address14 = new com.shittu24.ecommerce.entity.Address();
        address14.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str17 = address14.getZipCode();
        java.lang.String str18 = address14.getZipCode();
        com.shittu24.ecommerce.entity.Order order19 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address20 = order19.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address21 = order19.getShippingAddress();
        address14.setOrder(order19);
        com.shittu24.ecommerce.entity.Customer customer23 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order24 = null;
        customer23.add(order24);
        com.shittu24.ecommerce.entity.Order order26 = new com.shittu24.ecommerce.entity.Order();
        customer23.add(order26);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet28 = order26.getOrderItems();
        java.lang.String str29 = order26.getStatus();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet30 = order26.getOrderItems();
        order19.setOrderItems(orderItemSet30);
        order10.setOrderItems(orderItemSet30);
        boolean boolean33 = product0.equals((java.lang.Object) orderItemSet30);
        java.math.BigDecimal bigDecimal34 = null;
        product0.setUnitPrice(bigDecimal34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(address20);
        org.junit.Assert.assertNull(address21);
        org.junit.Assert.assertNotNull(orderItemSet28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(orderItemSet30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        int int13 = product0.getUnitsInStock();
        java.lang.String str14 = product0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        product0.setName("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long11 = product0.getId();
        java.math.BigDecimal bigDecimal12 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(bigDecimal12);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = product0.getLastUpdated();
        java.math.BigDecimal bigDecimal10 = null;
        product0.setUnitPrice(bigDecimal10);
        int int12 = product0.getUnitsInStock();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        customer0.setLastName("hi!");
        java.lang.String str3 = customer0.getEmail();
        customer0.setLastName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        java.lang.String str9 = product0.getSku();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.ProductCategory productCategory12 = null;
        product0.setCategory(productCategory12);
        java.util.Date date14 = null;
        product0.setDateCreated(date14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        customer52.setFirstName("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = order0.getBillingAddress();
        java.util.Date date7 = order0.getLastUpdated();
        java.util.Date date8 = null;
        order0.setDateCreated(date8);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.lang.String str5 = customer0.getEmail();
        java.lang.String str6 = customer0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        java.lang.Class<?> wildcardClass19 = product0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setId((java.lang.Long) 1L);
        java.lang.String str8 = product0.getImageUrl();
        product0.setSku("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        product0.setSku("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getCity();
        java.lang.String str7 = address0.getZipCode();
        java.lang.String str8 = address0.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        orderItem10.setId((java.lang.Long) 1L);
        orderItem10.setImageUrl("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.String str10 = customer9.getLastName();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(customer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(customer9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.lang.String str26 = address0.getStreet();
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderItemSet20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str26, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        java.lang.Long long18 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        java.util.Date date13 = product0.getDateCreated();
        java.lang.String str14 = product0.toString();
        product0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str14, "Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        int int7 = product0.getUnitsInStock();
        java.util.Date date8 = product0.getDateCreated();
        java.lang.Long long9 = product0.getId();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        int int6 = product0.getUnitsInStock();
        product0.setName("");
        java.lang.Object obj9 = null;
        boolean boolean10 = product0.equals(obj9);
        product0.setName("hi!");
        java.util.Date date13 = null;
        product0.setLastUpdated(date13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet7 = customer4.getOrders();
        customer4.setEmail("");
        customer4.setId((java.lang.Long) 10L);
        java.lang.String str12 = customer4.getEmail();
        customer4.setId((java.lang.Long) 10L);
        com.shittu24.ecommerce.entity.Customer customer15 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer15.add(order16);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet18 = customer15.getOrders();
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet20 = customer19.getOrders();
        customer19.setEmail("");
        customer19.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet25 = customer19.getOrders();
        customer15.setOrders(orderSet25);
        customer4.setOrders(orderSet25);
        customer0.setOrders(orderSet25);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(orderSet18);
        org.junit.Assert.assertNotNull(orderSet20);
        org.junit.Assert.assertNotNull(orderSet25);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet34 = customer10.getOrders();
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
        org.junit.Assert.assertNotNull(orderSet34);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        com.shittu24.ecommerce.entity.Address address13 = new com.shittu24.ecommerce.entity.Address();
        address13.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order16 = address13.getOrder();
        java.lang.String str17 = address13.getState();
        java.lang.String str18 = address13.getZipCode();
        order3.setBillingAddress(address13);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        orderItem13.setProductId((java.lang.Long) (-1L));
        orderItem13.setProductId((java.lang.Long) 100L);
        orderItem13.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        product0.setUnitsInStock(100);
        boolean boolean11 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        com.shittu24.ecommerce.entity.Address address15 = order10.getShippingAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(address15);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        com.shittu24.ecommerce.entity.Address address15 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str16 = address15.getCity();
        address15.setCountry("hi!");
        address15.setState("hi!");
        java.lang.String str21 = address15.getStreet();
        address15.setCity("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order24 = address15.getOrder();
        java.lang.String str25 = address15.getStreet();
        com.shittu24.ecommerce.entity.Order order26 = address15.getOrder();
        order3.setBillingAddress(address15);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(order24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(order26);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setId((java.lang.Long) 0L);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet4 = customer0.getOrders();
        java.lang.String str5 = customer0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(orderSet4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        java.lang.Long long13 = order3.getId();
        java.lang.String str14 = order3.getOrderTrackingNumber();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNotNull(customer12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setActive(true);
        java.lang.String str10 = product0.getDescription();
        int int11 = product0.getUnitsInStock();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        com.shittu24.ecommerce.entity.ProductCategory productCategory1 = product0.getCategory();
        java.math.BigDecimal bigDecimal2 = product0.getUnitPrice();
        org.junit.Assert.assertNull(productCategory1);
        org.junit.Assert.assertNull(bigDecimal2);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer6 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str7 = customer6.getFirstName();
        customer6.setFirstName("");
        java.lang.String str10 = customer6.getEmail();
        java.lang.String str11 = customer6.getLastName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet12 = customer6.getOrders();
        customer0.setOrders(orderSet12);
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(orderSet12);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        java.math.BigDecimal bigDecimal6 = null;
        product0.setUnitPrice(bigDecimal6);
        java.lang.String str8 = product0.getImageUrl();
        boolean boolean10 = product0.equals((java.lang.Object) 1.0f);
        java.lang.String str11 = product0.getDescription();
        java.math.BigDecimal bigDecimal12 = null;
        product0.setUnitPrice(bigDecimal12);
        java.util.Date date14 = product0.getDateCreated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        com.shittu24.ecommerce.entity.Address address20 = order3.getBillingAddress();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNotNull(address20);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order3 = address0.getOrder();
        java.lang.String str4 = address0.getZipCode();
        java.lang.String str5 = address0.getZipCode();
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order19 = address0.getOrder();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(order19);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getState();
        java.lang.String str8 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        orderItem0.setQuantity(1);
        java.lang.Long long4 = orderItem0.getProductId();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        orderItem0.setId((java.lang.Long) 10L);
        orderItem0.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Order order6 = null;
        orderItem0.setOrder(order6);
        com.shittu24.ecommerce.entity.Order order8 = orderItem0.getOrder();
        int int9 = orderItem0.getQuantity();
        orderItem0.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        java.util.Date date18 = order4.getDateCreated();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        com.shittu24.ecommerce.entity.Customer customer12 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order13 = null;
        customer12.add(order13);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet15 = customer12.getOrders();
        customer12.setEmail("");
        customer12.setId((java.lang.Long) 10L);
        customer12.setLastName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order3.setCustomer(customer12);
        order3.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNotNull(orderItemSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(orderSet15);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.util.Date date12 = null;
        order4.setLastUpdated(date12);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(orderItemSet11);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        orderItem13.setQuantity((-1));
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
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setUnitsInStock((int) (short) 0);
        product0.setName("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.toString();
        java.util.Date date10 = null;
        product0.setLastUpdated(date10);
        java.math.BigDecimal bigDecimal12 = null;
        product0.setUnitPrice(bigDecimal12);
        java.util.Date date14 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
        customer0.setId((java.lang.Long) 1L);
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
        java.lang.String str27 = order10.getOrderTrackingNumber();
        com.shittu24.ecommerce.entity.Customer customer28 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer28.add(order29);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet31 = customer28.getOrders();
        customer28.setEmail("");
        customer28.setEmail("");
        java.lang.Long long36 = customer28.getId();
        com.shittu24.ecommerce.entity.Order order37 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date38 = null;
        order37.setLastUpdated(date38);
        java.math.BigDecimal bigDecimal40 = order37.getTotalPrice();
        customer28.add(order37);
        order10.setCustomer(customer28);
        com.shittu24.ecommerce.entity.Customer customer43 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order44 = null;
        customer43.add(order44);
        com.shittu24.ecommerce.entity.Order order46 = new com.shittu24.ecommerce.entity.Order();
        customer43.add(order46);
        java.util.Date date48 = order46.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem49 = null;
        order46.add(orderItem49);
        com.shittu24.ecommerce.entity.Address address51 = null;
        order46.setShippingAddress(address51);
        com.shittu24.ecommerce.entity.OrderItem orderItem53 = new com.shittu24.ecommerce.entity.OrderItem();
        int int54 = orderItem53.getQuantity();
        java.lang.Long long55 = orderItem53.getProductId();
        order46.add(orderItem53);
        orderItem53.setProductId((java.lang.Long) 10L);
        java.lang.String str59 = orderItem53.getImageUrl();
        java.lang.String str60 = orderItem53.getImageUrl();
        order10.add(orderItem53);
        com.shittu24.ecommerce.entity.Customer customer62 = order10.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet63 = customer62.getOrders();
        customer0.setOrders(orderSet63);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet65 = customer0.getOrders();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(orderSet31);
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNull(bigDecimal40);
        org.junit.Assert.assertNull(date48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(long55);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(customer62);
        org.junit.Assert.assertNotNull(orderSet63);
        org.junit.Assert.assertNotNull(orderSet65);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        customer0.setId((java.lang.Long) 1L);
        java.lang.String str17 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = null;
        order0.setLastUpdated(date4);
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        order0.setBillingAddress(address6);
        address6.setZipCode("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = address6.getCity();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        java.lang.String str3 = customer0.getLastName();
        com.shittu24.ecommerce.entity.Customer customer4 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order5 = null;
        customer4.add(order5);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet7 = customer4.getOrders();
        customer4.setEmail("");
        customer4.setId((java.lang.Long) 10L);
        java.lang.String str12 = customer4.getEmail();
        customer4.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        customer4.setId((java.lang.Long) 10L);
        com.shittu24.ecommerce.entity.Customer customer17 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order18 = null;
        customer17.add(order18);
        com.shittu24.ecommerce.entity.Order order20 = new com.shittu24.ecommerce.entity.Order();
        customer17.add(order20);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet22 = order20.getOrderItems();
        java.math.BigDecimal bigDecimal23 = null;
        order20.setTotalPrice(bigDecimal23);
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address26 = order25.getBillingAddress();
        order25.setOrderTrackingNumber("");
        java.util.Date date29 = null;
        order25.setLastUpdated(date29);
        com.shittu24.ecommerce.entity.Address address31 = new com.shittu24.ecommerce.entity.Address();
        order25.setBillingAddress(address31);
        java.lang.String str33 = address31.getState();
        java.lang.String str34 = address31.getCountry();
        java.lang.String str35 = address31.getState();
        order20.setBillingAddress(address31);
        com.shittu24.ecommerce.entity.Customer customer37 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str38 = customer37.getFirstName();
        java.lang.String str39 = customer37.getEmail();
        customer37.setEmail("");
        java.lang.Long long42 = customer37.getId();
        order20.setCustomer(customer37);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet44 = customer37.getOrders();
        customer4.setOrders(orderSet44);
        customer0.setOrders(orderSet44);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(orderSet7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(orderItemSet22);
        org.junit.Assert.assertNull(address26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertNotNull(orderSet44);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        int int5 = product0.getUnitsInStock();
        product0.setSku("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str8 = product0.getDescription();
        product0.setDescription("hi!");
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.String str10 = order3.getOrderTrackingNumber();
        order3.setStatus("hi!");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        int int6 = orderItem0.getQuantity();
        int int7 = orderItem0.getQuantity();
        orderItem0.setProductId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        customer0.setFirstName("");
        java.lang.String str4 = customer0.getEmail();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        java.lang.String str6 = customer0.getLastName();
        customer0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        orderItem46.setImageUrl("Product(id=null, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setActive(false);
        java.lang.Long long5 = product0.getId();
        com.shittu24.ecommerce.entity.ProductCategory productCategory6 = null;
        product0.setCategory(productCategory6);
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        com.shittu24.ecommerce.entity.Order order2 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date3 = null;
        order2.setLastUpdated(date3);
        java.math.BigDecimal bigDecimal5 = order2.getTotalPrice();
        java.util.Date date6 = null;
        order2.setLastUpdated(date6);
        address0.setOrder(order2);
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long11 = address0.getId();
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str13 = order12.getStatus();
        com.shittu24.ecommerce.entity.Customer customer14 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str15 = customer14.getFirstName();
        com.shittu24.ecommerce.entity.Order order16 = null;
        customer14.add(order16);
        customer14.setLastName("hi!");
        order12.setCustomer(customer14);
        java.lang.String str21 = customer14.getEmail();
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
        order43.setTotalQuantity((int) 'a');
        com.shittu24.ecommerce.entity.Customer customer67 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order68 = null;
        customer67.add(order68);
        com.shittu24.ecommerce.entity.Order order70 = new com.shittu24.ecommerce.entity.Order();
        customer67.add(order70);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet72 = order70.getOrderItems();
        java.util.Date date73 = order70.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer74 = order70.getCustomer();
        customer74.setId((java.lang.Long) 1L);
        order43.setCustomer(customer74);
        customer14.add(order43);
        address0.setOrder(order43);
        java.lang.String str80 = address0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
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
        org.junit.Assert.assertNotNull(orderItemSet72);
        org.junit.Assert.assertNull(date73);
        org.junit.Assert.assertNotNull(customer74);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        java.lang.String str5 = product0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.math.BigDecimal bigDecimal14 = null;
        order3.setTotalPrice(bigDecimal14);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        int int4 = product0.getUnitsInStock();
        int int5 = product0.getUnitsInStock();
        java.lang.String str6 = product0.getImageUrl();
        java.util.Date date7 = null;
        product0.setDateCreated(date7);
        com.shittu24.ecommerce.entity.Customer customer9 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order10 = null;
        customer9.add(order10);
        com.shittu24.ecommerce.entity.Order order12 = new com.shittu24.ecommerce.entity.Order();
        customer9.add(order12);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet14 = order12.getOrderItems();
        java.lang.String str15 = order12.getStatus();
        java.util.Date date16 = order12.getLastUpdated();
        com.shittu24.ecommerce.entity.OrderItem[] orderItemArray17 = new com.shittu24.ecommerce.entity.OrderItem[] {};
        java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = new java.util.LinkedHashSet<com.shittu24.ecommerce.entity.OrderItem>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet18, orderItemArray17);
        order12.setOrderItems((java.util.Set<com.shittu24.ecommerce.entity.OrderItem>) orderItemSet18);
        order12.setTotalQuantity(0);
        com.shittu24.ecommerce.entity.OrderItem orderItem23 = null;
        order12.add(orderItem23);
        boolean boolean25 = product0.equals((java.lang.Object) orderItem23);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(orderItemArray17);
        org.junit.Assert.assertArrayEquals(orderItemArray17, new com.shittu24.ecommerce.entity.OrderItem[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        boolean boolean13 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setName("");
        java.lang.String str10 = product0.getImageUrl();
        java.math.BigDecimal bigDecimal11 = null;
        product0.setUnitPrice(bigDecimal11);
        java.lang.String str13 = product0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str13, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        order43.setTotalQuantity((-1));
        order43.setTotalQuantity((int) (byte) -1);
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
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.lang.Long long2 = orderItem0.getProductId();
        com.shittu24.ecommerce.entity.Order order3 = orderItem0.getOrder();
        orderItem0.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        order3.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet11);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setStreet("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str19 = address0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        java.lang.Long long12 = customer2.getId();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet13 = customer2.getOrders();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(orderSet13);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        customer11.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(orderSet17);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setName("");
        java.lang.String str10 = product0.getImageUrl();
        java.lang.Long long11 = product0.getId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        com.shittu24.ecommerce.entity.Product product11 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str12 = product11.getSku();
        java.lang.Long long13 = product11.getId();
        product11.setUnitsInStock((int) (byte) -1);
        product11.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product11.setImageUrl("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.util.Date date20 = product11.getLastUpdated();
        java.math.BigDecimal bigDecimal21 = null;
        product11.setUnitPrice(bigDecimal21);
        boolean boolean23 = product0.equals((java.lang.Object) product11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.shittu24.ecommerce.entity.Order order0 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address1 = order0.getBillingAddress();
        order0.setOrderTrackingNumber("");
        java.util.Date date4 = order0.getDateCreated();
        int int5 = order0.getTotalQuantity();
        java.lang.Long long6 = order0.getId();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.lang.String str13 = product0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        order10.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        order10.setStatus("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int20 = order10.getTotalQuantity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        java.lang.String str9 = address0.getCountry();
        address0.setCountry("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setCountry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        product0.setSku("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        customer7.setFirstName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(orderSet18);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setLastName("");
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str7 = customer0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        java.lang.Long long34 = order0.getId();
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
        org.junit.Assert.assertNull(long34);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        java.lang.Long long6 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        address0.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer19 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order20 = null;
        customer19.add(order20);
        com.shittu24.ecommerce.entity.Order order22 = new com.shittu24.ecommerce.entity.Order();
        customer19.add(order22);
        java.util.Date date24 = order22.getDateCreated();
        java.lang.Long long25 = order22.getId();
        int int26 = order22.getTotalQuantity();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet27 = order22.getOrderItems();
        com.shittu24.ecommerce.entity.Address address28 = order22.getBillingAddress();
        address0.setOrder(order22);
        address0.setStreet("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(orderItemSet27);
        org.junit.Assert.assertNull(address28);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.lang.String str40 = order3.getOrderTrackingNumber();
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
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = orderItem0.getUnitPrice();
        java.lang.Long long5 = orderItem0.getProductId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.util.Date date56 = null;
        order55.setLastUpdated(date56);
        java.lang.Long long58 = order55.getId();
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
        org.junit.Assert.assertNull(long58);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        java.math.BigDecimal bigDecimal26 = order9.getTotalPrice();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str21, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(bigDecimal26);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        java.util.Date date17 = order2.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Date date5 = order3.getDateCreated();
        java.lang.Long long6 = order3.getId();
        int int7 = order3.getTotalQuantity();
        int int8 = order3.getTotalQuantity();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        java.math.BigDecimal bigDecimal15 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(bigDecimal15);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        java.math.BigDecimal bigDecimal10 = null;
        order3.setTotalPrice(bigDecimal10);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        java.lang.String str5 = address0.getCity();
        java.lang.Long long6 = address0.getId();
        java.lang.String str7 = address0.getZipCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        order27.setTotalQuantity((int) (short) 1);
        com.shittu24.ecommerce.entity.Order order46 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address47 = order46.getBillingAddress();
        order46.setOrderTrackingNumber("");
        java.util.Date date50 = null;
        order46.setLastUpdated(date50);
        com.shittu24.ecommerce.entity.Address address52 = new com.shittu24.ecommerce.entity.Address();
        order46.setBillingAddress(address52);
        java.lang.String str54 = address52.getState();
        java.lang.String str55 = address52.getCountry();
        java.lang.String str56 = address52.getCountry();
        com.shittu24.ecommerce.entity.Customer customer57 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order58 = null;
        customer57.add(order58);
        com.shittu24.ecommerce.entity.Order order60 = new com.shittu24.ecommerce.entity.Order();
        customer57.add(order60);
        java.util.Date date62 = order60.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem63 = null;
        order60.add(orderItem63);
        java.lang.String str65 = order60.getStatus();
        address52.setOrder(order60);
        java.lang.String str67 = address52.getCountry();
        java.lang.String str68 = address52.getCountry();
        java.lang.String str69 = address52.getZipCode();
        java.lang.String str70 = address52.getZipCode();
        order27.setShippingAddress(address52);
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
        org.junit.Assert.assertNull(address47);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(date62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setStreet("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long6 = address0.getId();
        java.lang.String str7 = address0.getZipCode();
        address0.setState("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.math.BigDecimal bigDecimal19 = null;
        product0.setUnitPrice(bigDecimal19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        java.util.Date date12 = order10.getDateCreated();
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = null;
        order10.add(orderItem13);
        order10.setOrderTrackingNumber("");
        java.util.Date date17 = order10.getLastUpdated();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet18 = order10.getOrderItems();
        address0.setOrder(order10);
        java.lang.Long long20 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(long20);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        java.lang.Long long22 = order3.getId();
        com.shittu24.ecommerce.entity.Customer customer23 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet24 = customer23.getOrders();
        customer23.setEmail("");
        java.lang.String str27 = customer23.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet28 = customer23.getOrders();
        order3.setCustomer(customer23);
        customer23.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        java.lang.String str32 = customer23.getFirstName();
        customer23.setLastName("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
        org.junit.Assert.assertNotNull(orderSet15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNotNull(orderSet24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(orderSet28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)" + "'", str32, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.String str2 = customer0.getEmail();
        customer0.setEmail("");
        java.lang.Long long5 = customer0.getId();
        customer0.setEmail("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        customer0.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
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
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        product0.setSku("hi!");
        java.util.Date date9 = null;
        product0.setDateCreated(date9);
        java.lang.String str11 = product0.getName();
        java.math.BigDecimal bigDecimal12 = product0.getUnitPrice();
        product0.setImageUrl("Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.ProductCategory productCategory15 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNull(productCategory15);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.lang.String str4 = product0.getName();
        int int5 = product0.getUnitsInStock();
        java.lang.String str6 = product0.getDescription();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        java.lang.String str5 = product0.getName();
        product0.setActive(false);
        product0.setName("hi!");
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        java.lang.String str12 = product0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)" + "'", str12, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        java.lang.String str5 = address0.getCity();
        java.lang.Long long6 = address0.getId();
        com.shittu24.ecommerce.entity.Order order7 = address0.getOrder();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.lang.String str15 = order14.getOrderTrackingNumber();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNotNull(orderItemSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNotNull(order14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        address9.setStreet("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
        order25.setId((java.lang.Long) 10L);
        address9.setOrder(order25);
        java.lang.String str43 = address9.getCountry();
        java.lang.Long long44 = address9.getId();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str19, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(orderItemSet31);
        org.junit.Assert.assertNull(address32);
        org.junit.Assert.assertNotNull(orderSet36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNull(long44);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet11 = order5.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer12 = order5.getCustomer();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(customer12);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        java.lang.String str4 = customer0.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        product0.setDescription("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.math.BigDecimal bigDecimal35 = product0.getUnitPrice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(orderItemSet28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(bigDecimal35);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order1 = null;
        customer0.add(order1);
        com.shittu24.ecommerce.entity.Order order3 = new com.shittu24.ecommerce.entity.Order();
        customer0.add(order3);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet5 = order3.getOrderItems();
        java.lang.String str6 = order3.getStatus();
        java.util.Date date7 = order3.getLastUpdated();
        order3.setTotalQuantity(100);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet10 = order3.getOrderItems();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(orderItemSet10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        com.shittu24.ecommerce.entity.Address address16 = order9.getBillingAddress();
        java.util.Date date17 = order9.getDateCreated();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        java.lang.String str23 = address6.getState();
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        java.util.Date date20 = null;
        order3.setLastUpdated(date20);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(bigDecimal18);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
        java.lang.String str5 = customer0.getLastName();
        java.lang.String str6 = customer0.getFirstName();
        java.lang.String str7 = customer0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        java.lang.String str19 = order10.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(customer15);
        org.junit.Assert.assertNotNull(orderItemSet18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.util.Date date14 = order0.getLastUpdated();
        java.math.BigDecimal bigDecimal15 = order0.getTotalPrice();
        org.junit.Assert.assertNotNull(orderItemSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(orderItemSet12);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(bigDecimal15);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        int int1 = orderItem0.getQuantity();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        com.shittu24.ecommerce.entity.Order order4 = orderItem0.getOrder();
        int int5 = orderItem0.getQuantity();
        com.shittu24.ecommerce.entity.Order order6 = orderItem0.getOrder();
        java.lang.Long long7 = orderItem0.getProductId();
        orderItem0.setQuantity((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        int int20 = orderItem10.getQuantity();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        java.lang.String str9 = product0.toString();
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = null;
        product0.setCategory(productCategory10);
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int7 = product0.getUnitsInStock();
        product0.setActive(false);
        java.util.Date date10 = product0.getDateCreated();
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        java.lang.Long long13 = product0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory7 = product0.getCategory();
        java.util.Date date8 = product0.getLastUpdated();
        java.util.Date date9 = product0.getDateCreated();
        java.util.Date date10 = product0.getDateCreated();
        java.util.Date date11 = null;
        product0.setDateCreated(date11);
        java.lang.String str13 = product0.getDescription();
        com.shittu24.ecommerce.entity.Product product14 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean16 = product14.equals((java.lang.Object) 1.0f);
        product14.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory19 = product14.getCategory();
        product14.setName("hi!");
        java.util.Date date22 = product14.getDateCreated();
        product14.setActive(true);
        java.util.Date date25 = null;
        product14.setLastUpdated(date25);
        com.shittu24.ecommerce.entity.OrderItem orderItem27 = new com.shittu24.ecommerce.entity.OrderItem();
        com.shittu24.ecommerce.entity.Order order28 = orderItem27.getOrder();
        boolean boolean29 = product14.equals((java.lang.Object) orderItem27);
        boolean boolean30 = product14.isActive();
        product14.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean33 = product0.equals((java.lang.Object) "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(productCategory7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(productCategory19);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(order28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        java.lang.String str4 = address0.getZipCode();
        com.shittu24.ecommerce.entity.Order order5 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address6 = order5.getBillingAddress();
        com.shittu24.ecommerce.entity.Address address7 = order5.getShippingAddress();
        address0.setOrder(order5);
        java.lang.Long long9 = address0.getId();
        com.shittu24.ecommerce.entity.Order order10 = address0.getOrder();
        java.math.BigDecimal bigDecimal11 = order10.getTotalPrice();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNotNull(order10);
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        java.lang.String str5 = address0.getState();
        address0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        address0.setZipCode("hi!");
        address0.setCity("Product(id=null, category=null, sku=null, name=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        java.lang.String str30 = product0.getDescription();
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
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        java.lang.String str20 = address6.getState();
        com.shittu24.ecommerce.entity.Customer customer21 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order22 = null;
        customer21.add(order22);
        com.shittu24.ecommerce.entity.Order order24 = new com.shittu24.ecommerce.entity.Order();
        customer21.add(order24);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet26 = order24.getOrderItems();
        java.math.BigDecimal bigDecimal27 = null;
        order24.setTotalPrice(bigDecimal27);
        java.lang.String str29 = order24.getStatus();
        order24.setStatus("");
        address6.setOrder(order24);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(customer18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(orderItemSet26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.util.Date date22 = product0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(productCategory11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.String str12 = customer9.getLastName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet13 = customer9.getOrders();
        customer0.setOrders(orderSet13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(orderSet13);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setZipCode("hi!");
        java.lang.Long long5 = address0.getId();
        com.shittu24.ecommerce.entity.Address address6 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str7 = address6.getCity();
        com.shittu24.ecommerce.entity.Order order8 = new com.shittu24.ecommerce.entity.Order();
        java.util.Date date9 = null;
        order8.setLastUpdated(date9);
        java.math.BigDecimal bigDecimal11 = order8.getTotalPrice();
        address6.setOrder(order8);
        com.shittu24.ecommerce.entity.OrderItem orderItem13 = new com.shittu24.ecommerce.entity.OrderItem();
        int int14 = orderItem13.getQuantity();
        java.math.BigDecimal bigDecimal15 = null;
        orderItem13.setUnitPrice(bigDecimal15);
        orderItem13.setProductId((java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal19 = null;
        orderItem13.setUnitPrice(bigDecimal19);
        order8.add(orderItem13);
        address0.setOrder(order8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        address6.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(address1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        address0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str9, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        customer7.setId((java.lang.Long) 0L);
        com.shittu24.ecommerce.entity.Customer customer26 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order27 = null;
        customer26.add(order27);
        com.shittu24.ecommerce.entity.Order order29 = new com.shittu24.ecommerce.entity.Order();
        customer26.add(order29);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet31 = order29.getOrderItems();
        java.util.Date date32 = order29.getLastUpdated();
        com.shittu24.ecommerce.entity.Customer customer33 = order29.getCustomer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet34 = customer33.getOrders();
        customer7.setOrders(orderSet34);
        customer7.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(orderSet16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(orderSet22);
        org.junit.Assert.assertNotNull(orderItemSet31);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(customer33);
        org.junit.Assert.assertNotNull(orderSet34);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.lang.String str18 = address12.getCountry();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str18, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.lang.String str26 = customer19.getFirstName();
        java.lang.String str27 = customer19.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet28 = customer19.getOrders();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(address18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(orderSet28);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        int int31 = orderItem13.getQuantity();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.String str7 = product0.getSku();
        java.lang.String str8 = product0.getImageUrl();
        product0.setUnitsInStock(100);
        product0.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        product0.setName("");
        java.lang.String str10 = product0.getImageUrl();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        int int15 = product0.getUnitsInStock();
        java.util.Date date16 = product0.getLastUpdated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.lang.String str31 = order28.getStatus();
        java.lang.Long long32 = order28.getId();
        java.util.Date date33 = order28.getDateCreated();
        order28.setTotalQuantity(100);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet36 = order28.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet37 = order28.getOrderItems();
        order19.setOrderItems(orderItemSet37);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(orderItemSet30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNotNull(orderItemSet36);
        org.junit.Assert.assertNotNull(orderItemSet37);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setActive(false);
        java.util.Date date7 = null;
        product0.setLastUpdated(date7);
        java.util.Date date9 = null;
        product0.setLastUpdated(date9);
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
        address11.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        boolean boolean28 = product0.equals((java.lang.Object) address11);
        java.lang.Long long29 = address11.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(long29);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.lang.Long long2 = product0.getId();
        product0.setUnitsInStock((int) (byte) -1);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        product0.setActive(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        int int7 = product0.getUnitsInStock();
        java.util.Date date8 = product0.getLastUpdated();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        com.shittu24.ecommerce.entity.Order order19 = orderItem10.getOrder();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNotNull(order19);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setActive(false);
        java.math.BigDecimal bigDecimal5 = null;
        product0.setUnitPrice(bigDecimal5);
        product0.setDescription("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order9 = new com.shittu24.ecommerce.entity.Order();
        com.shittu24.ecommerce.entity.Address address10 = order9.getBillingAddress();
        order9.setOrderTrackingNumber("");
        java.util.Date date13 = null;
        order9.setLastUpdated(date13);
        boolean boolean15 = product0.equals((java.lang.Object) order9);
        com.shittu24.ecommerce.entity.Customer customer16 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order17 = null;
        customer16.add(order17);
        java.lang.String str19 = customer16.getLastName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet20 = customer16.getOrders();
        order9.setCustomer(customer16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(orderSet20);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        com.shittu24.ecommerce.entity.Customer customer11 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order12 = null;
        customer11.add(order12);
        com.shittu24.ecommerce.entity.Order order14 = new com.shittu24.ecommerce.entity.Order();
        customer11.add(order14);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet16 = order14.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet17 = order14.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer18 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str19 = customer18.getFirstName();
        order14.setCustomer(customer18);
        com.shittu24.ecommerce.entity.OrderItem orderItem21 = new com.shittu24.ecommerce.entity.OrderItem();
        int int22 = orderItem21.getQuantity();
        java.math.BigDecimal bigDecimal23 = null;
        orderItem21.setUnitPrice(bigDecimal23);
        orderItem21.setProductId((java.lang.Long) 1L);
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order28 = null;
        customer27.add(order28);
        com.shittu24.ecommerce.entity.Order order30 = new com.shittu24.ecommerce.entity.Order();
        customer27.add(order30);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet32 = order30.getOrderItems();
        java.math.BigDecimal bigDecimal33 = null;
        order30.setTotalPrice(bigDecimal33);
        orderItem21.setOrder(order30);
        int int36 = orderItem21.getQuantity();
        order14.add(orderItem21);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet38 = order14.getOrderItems();
        order3.setOrderItems(orderItemSet38);
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(orderItemSet16);
        org.junit.Assert.assertNotNull(orderItemSet17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(orderItemSet32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(orderItemSet38);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.shittu24.ecommerce.entity.OrderItem orderItem0 = new com.shittu24.ecommerce.entity.OrderItem();
        java.lang.Long long1 = orderItem0.getProductId();
        java.math.BigDecimal bigDecimal2 = null;
        orderItem0.setUnitPrice(bigDecimal2);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        java.math.BigDecimal bigDecimal31 = null;
        product0.setUnitPrice(bigDecimal31);
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        customer10.setEmail("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str14 = customer10.getEmail();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNotNull(orderSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str14, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        com.shittu24.ecommerce.entity.Address address39 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str40 = address39.getCity();
        java.lang.String str41 = address39.getZipCode();
        java.lang.Long long42 = address39.getId();
        java.lang.String str43 = address39.getStreet();
        order29.setBillingAddress(address39);
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getCity();
        java.lang.String str8 = address0.getZipCode();
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
        java.lang.String str11 = address0.getZipCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=100, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str1 = customer0.getFirstName();
        java.lang.Long long2 = customer0.getId();
        customer0.setFirstName("");
        java.lang.String str5 = customer0.getLastName();
        java.lang.String str6 = customer0.getFirstName();
        java.lang.Long long7 = customer0.getId();
        java.lang.String str8 = customer0.getFirstName();
        java.lang.String str9 = customer0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        address20.setCountry("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
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
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        boolean boolean7 = product0.isActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setState("hi!");
        address0.setId((java.lang.Long) 10L);
        com.shittu24.ecommerce.entity.Order order8 = address0.getOrder();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        address0.setCountry("hi!");
        address0.setZipCode("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Order order6 = address0.getOrder();
        java.lang.String str7 = address0.getCity();
        address0.setCity("Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = address0.getCity();
        java.lang.String str11 = address0.getStreet();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=hi!, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        product0.setSku("hi!");
        int int21 = product0.getUnitsInStock();
        com.shittu24.ecommerce.entity.ProductCategory productCategory22 = product0.getCategory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str11, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(productCategory22);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        boolean boolean16 = product0.isActive();
        product0.setImageUrl("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.ProductCategory productCategory19 = null;
        product0.setCategory(productCategory19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        java.lang.String str6 = product0.getImageUrl();
        java.lang.Long long7 = product0.getId();
        com.shittu24.ecommerce.entity.Product product8 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean10 = product8.equals((java.lang.Object) 1.0f);
        product8.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory13 = product8.getCategory();
        java.lang.String str14 = product8.getImageUrl();
        com.shittu24.ecommerce.entity.ProductCategory productCategory15 = product8.getCategory();
        java.util.Date date16 = product8.getLastUpdated();
        java.util.Date date17 = null;
        product8.setDateCreated(date17);
        boolean boolean19 = product0.equals((java.lang.Object) date17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(productCategory13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(productCategory15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.math.BigDecimal bigDecimal16 = null;
        orderItem0.setUnitPrice(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderItemSet11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        order3.setStatus("Product(id=null, category=null, sku=hi!, name=, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(address18);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("Product(id=1, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str4 = customer0.getLastName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet5 = customer0.getOrders();
        customer0.setEmail("");
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(orderSet5);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        java.math.BigDecimal bigDecimal67 = order31.getTotalPrice();
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
        org.junit.Assert.assertNull(bigDecimal67);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        java.lang.String str2 = address0.getZipCode();
        java.lang.Long long3 = address0.getId();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        address0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.shittu24.ecommerce.entity.Customer customer0 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet1 = customer0.getOrders();
        customer0.setEmail("");
        customer0.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = customer0.getFirstName();
        java.lang.String str7 = customer0.getLastName();
        customer0.setFirstName("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNotNull(orderSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str7, "Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal13 = null;
        product0.setUnitPrice(bigDecimal13);
        java.util.Date date15 = product0.getLastUpdated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        com.shittu24.ecommerce.entity.Customer customer11 = order3.getCustomer();
        java.lang.String str12 = customer11.getLastName();
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        com.shittu24.ecommerce.entity.Customer customer35 = order3.getCustomer();
        order3.setOrderTrackingNumber("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.Long long38 = order3.getId();
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
        org.junit.Assert.assertNotNull(customer35);
        org.junit.Assert.assertNull(long38);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        com.shittu24.ecommerce.entity.Customer customer3 = new com.shittu24.ecommerce.entity.Customer();
        customer3.setLastName("hi!");
        boolean boolean6 = product0.equals((java.lang.Object) customer3);
        product0.setImageUrl("hi!");
        java.lang.String str9 = product0.getDescription();
        java.util.Date date10 = product0.getDateCreated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        com.shittu24.ecommerce.entity.Address address22 = order3.getBillingAddress();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(customer13);
        org.junit.Assert.assertNotNull(orderSet15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(address22);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        java.lang.Long long18 = orderItem0.getId();
        java.math.BigDecimal bigDecimal19 = null;
        orderItem0.setUnitPrice(bigDecimal19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.Long long1 = product0.getId();
        product0.setUnitsInStock((int) '#');
        java.util.Date date4 = null;
        product0.setDateCreated(date4);
        java.lang.String str6 = product0.getName();
        int int7 = product0.getUnitsInStock();
        java.util.Date date8 = null;
        product0.setDateCreated(date8);
        com.shittu24.ecommerce.entity.ProductCategory productCategory10 = product0.getCategory();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(productCategory10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCity();
        java.lang.String str2 = address0.getZipCode();
        java.lang.Long long3 = address0.getId();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getZipCode();
        java.lang.Long long7 = address0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        java.lang.String str1 = address0.getCountry();
        java.lang.Long long2 = address0.getId();
        address0.setState("");
        address0.setCountry("hi!");
        java.lang.String str7 = address0.getCity();
        java.lang.Long long8 = address0.getId();
        address0.setCountry("");
        address0.setStreet("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.util.Date date11 = null;
        product0.setLastUpdated(date11);
        com.shittu24.ecommerce.entity.ProductCategory productCategory13 = null;
        product0.setCategory(productCategory13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.util.Date date16 = order0.getDateCreated();
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNotNull(orderItemSet14);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        boolean boolean2 = product0.equals((java.lang.Object) 1.0f);
        product0.setName("");
        com.shittu24.ecommerce.entity.ProductCategory productCategory5 = product0.getCategory();
        product0.setName("hi!");
        java.util.Date date8 = product0.getDateCreated();
        product0.setActive(true);
        java.math.BigDecimal bigDecimal11 = null;
        product0.setUnitPrice(bigDecimal11);
        product0.setDescription("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(productCategory5);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        com.shittu24.ecommerce.entity.Order order25 = new com.shittu24.ecommerce.entity.Order();
        java.lang.String str26 = order25.getStatus();
        com.shittu24.ecommerce.entity.Customer customer27 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str28 = customer27.getFirstName();
        com.shittu24.ecommerce.entity.Order order29 = null;
        customer27.add(order29);
        customer27.setLastName("hi!");
        order25.setCustomer(customer27);
        java.lang.String str34 = customer27.getEmail();
        java.lang.String str35 = customer27.getLastName();
        com.shittu24.ecommerce.entity.Customer customer36 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order37 = null;
        customer36.add(order37);
        com.shittu24.ecommerce.entity.Order order39 = new com.shittu24.ecommerce.entity.Order();
        customer36.add(order39);
        java.util.Date date41 = order39.getDateCreated();
        java.lang.Long long42 = order39.getId();
        com.shittu24.ecommerce.entity.Customer customer43 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order44 = null;
        customer43.add(order44);
        com.shittu24.ecommerce.entity.Order order46 = new com.shittu24.ecommerce.entity.Order();
        customer43.add(order46);
        order39.setCustomer(customer43);
        com.shittu24.ecommerce.entity.Customer customer49 = order39.getCustomer();
        com.shittu24.ecommerce.entity.Customer customer50 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet51 = customer50.getOrders();
        customer50.setEmail("");
        customer50.setLastName("Product(id=null, category=null, sku=null, name=, description=null, unitPrice=null, imageUrl=null, active=true, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str56 = customer50.getFirstName();
        order39.setCustomer(customer50);
        java.lang.Long long58 = order39.getId();
        com.shittu24.ecommerce.entity.Customer customer59 = new com.shittu24.ecommerce.entity.Customer();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet60 = customer59.getOrders();
        customer59.setEmail("");
        java.lang.String str63 = customer59.getFirstName();
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet64 = customer59.getOrders();
        order39.setCustomer(customer59);
        customer59.setFirstName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=35, dateCreated=null, lastUpdated=null)");
        com.shittu24.ecommerce.entity.Customer customer68 = new com.shittu24.ecommerce.entity.Customer();
        com.shittu24.ecommerce.entity.Order order69 = null;
        customer68.add(order69);
        com.shittu24.ecommerce.entity.Order order71 = new com.shittu24.ecommerce.entity.Order();
        customer68.add(order71);
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet73 = order71.getOrderItems();
        java.util.Set<com.shittu24.ecommerce.entity.OrderItem> orderItemSet74 = order71.getOrderItems();
        com.shittu24.ecommerce.entity.Customer customer75 = new com.shittu24.ecommerce.entity.Customer();
        java.lang.String str76 = customer75.getFirstName();
        order71.setCustomer(customer75);
        java.util.Set<com.shittu24.ecommerce.entity.Order> orderSet78 = customer75.getOrders();
        customer59.setOrders(orderSet78);
        customer27.setOrders(orderSet78);
        customer11.setOrders(orderSet78);
        customer11.setLastName("");
        org.junit.Assert.assertNotNull(orderItemSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(orderItemSet9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(orderSet14);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertNotNull(customer49);
        org.junit.Assert.assertNotNull(orderSet51);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(long58);
        org.junit.Assert.assertNotNull(orderSet60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(orderSet64);
        org.junit.Assert.assertNotNull(orderItemSet73);
        org.junit.Assert.assertNotNull(orderItemSet74);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(orderSet78);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str6 = address0.getStreet();
        java.lang.String str7 = address0.getCity();
        java.lang.String str8 = address0.getState();
        java.lang.Long long9 = address0.getId();
        address0.setState("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.shittu24.ecommerce.entity.Address address0 = new com.shittu24.ecommerce.entity.Address();
        address0.setCountry("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str3 = address0.getZipCode();
        address0.setState("Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        address0.setZipCode("");
        java.lang.String str8 = address0.getCountry();
        com.shittu24.ecommerce.entity.Order order9 = address0.getOrder();
        java.lang.Long long10 = address0.getId();
        address0.setCountry("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str8, "Product(id=10, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.shittu24.ecommerce.entity.Product product0 = new com.shittu24.ecommerce.entity.Product();
        java.lang.String str1 = product0.getSku();
        java.util.Date date2 = product0.getDateCreated();
        java.lang.String str3 = product0.getDescription();
        product0.setId((java.lang.Long) 1L);
        product0.setActive(false);
        product0.setImageUrl("Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        java.lang.String str10 = product0.getImageUrl();
        product0.setName("Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
        java.math.BigDecimal bigDecimal13 = null;
        product0.setUnitPrice(bigDecimal13);
        java.lang.String str15 = product0.getName();
        product0.setSku("Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)" + "'", str10, "Product(id=10, category=null, sku=null, name=Product(id=null, category=null, sku=null, name=hi!, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null), description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=0, dateCreated=null, lastUpdated=null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)" + "'", str15, "Product(id=null, category=null, sku=null, name=null, description=null, unitPrice=null, imageUrl=null, active=false, unitsInStock=-1, dateCreated=null, lastUpdated=null)");
    }
}

