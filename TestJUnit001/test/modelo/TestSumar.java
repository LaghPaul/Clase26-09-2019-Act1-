package modelo;

import static org.junit.Assert.assertTrue;

public class TestSumar {

    public TestSumar() {
    }
    
     @org.junit.Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.Sumar()==10);
    }
}
