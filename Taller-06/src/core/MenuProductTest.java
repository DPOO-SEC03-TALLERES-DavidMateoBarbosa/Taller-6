package core;

import org.junit.jupiter.api.*;

import static org.junit.gen5.api.Assertions.*;

class MenuProductTest {
    MenuProduct menuProduct;

    @BeforeEach
    void setUp() {
        menuProduct = new MenuProduct("potato with rice", 15000);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createBill() {
        assertEquals(String.valueOf(menuProduct.getPrice()), menuProduct.createBill(),"Error creating the bill");
    }
}