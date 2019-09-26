package modelo;

import static org.junit.Assert.assertTrue;

public class TestRestar {
   @org.junit.Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.Restar()==6);
    }  
}
