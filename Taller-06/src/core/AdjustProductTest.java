package core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AdjustProductTest {
    AdjustProduct adjustProduct;
    @BeforeEach
    void setUp() {
        adjustProduct = new AdjustProduct(new MenuProduct("rice with sauce", 15000));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addIngredient() {
        assertNotNull(adjustProduct);
        adjustProduct.addIngredient(new Ingredient("meat", 4000));
    }

    @Test
    void getIngredients() {
        addIngredient();
        assertInstanceOf(ArrayList.class, adjustProduct.getIngredients());
        assertEquals(1, adjustProduct.getIngredients().size());
        Ingredient expected = new Ingredient("meat", 4000);
        Ingredient actual = adjustProduct.getIngredients().get(0);
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getPrice(), actual.getPrice());
    }

    @Test
    void delIngredient() {
        assertNotNull(adjustProduct);
        adjustProduct.delIngredient(new Ingredient("meat", 4000));
        getIngredients();
    }

    @Test
    void createBill() {
        String actual = adjustProduct.createBill();
        assertEquals("total price: 15000", actual);
    }
}