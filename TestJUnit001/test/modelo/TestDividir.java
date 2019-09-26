package modelo;

import static org.junit.Assert.assertTrue;

public class TestDividir {
     @org.junit.Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora instance = new Calculadora(8,2);
         assertTrue(instance.Dividir()==4);
    }
}
