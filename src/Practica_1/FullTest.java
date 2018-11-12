package Practica_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FullTest {


    @Test
    public void test() {
        Category testing = new Category("test1",0000);
        Product testProd = new Product(00,"Test", 9.99, true, testing);    
        User Testuser1 = new User(0, "TestUser", "qwrty");
        assertEquals(testProd.name(), "Test");
        assertEquals(testing.catId(), 0000);
        assertEquals(Testuser1.password(), "qwrty");
    }

}
