package core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;

    @BeforeEach
    void setUp() {
        order = new Order("Logan Taurus", "dm.bm@outlook.com");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addProduct() {
        assertNotNull(order);
        order.addProduct(new Combo("rice with meat", 0.12d));
        order.addProduct(new AdjustProduct(new MenuProduct("roasted meat", 1000)));
    }


    @Test
    void getProducts() {
        assertNotNull(order);
        addProduct();
        assertInstanceOf(ArrayList.class, order.getProducts());
        assertEquals((new AdjustProduct(new MenuProduct("roasted meat", 1000)).getPrice()), order.getProducts().get(0).getPrice());
    }

    @Test
    void getID() {
        assertNotNull(order);
        getProducts();
        assertEquals(9, String.valueOf(order.getID()).length());
    }

    @Test
    void saveBill() {
        getProducts();
        try{
            order.saveBill(new File("src/orders/ORDER_" + order.getID() + ".txt"));
        }
        catch (IOException exception){
            fail("failed trying to process io package functions in 'Write' class");
        }
    }
}