package core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboTest {
    Combo combo;
    @BeforeEach
    void setUp() {
        combo = new Combo("SUPER MAX", 0.15);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addItem() {
        assertNotNull(combo);
        combo.addItem(new MenuProduct("rice with meat", 20000));
    }

    @Test
    void createBill() {
        addItem();
        assertNotNull(combo);
        assertEquals("rice with meat: 20000\ntotal: 17000", combo.createBill());
    }
}