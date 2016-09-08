/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaactividad1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc-Gpr
 */
public class PruebaActividad1Test {
    
    public PruebaActividad1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class PruebaActividad1.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = PruebaActividad1.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class PruebaActividad1.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 0.0;
        int expResult = 0;
        int result = PruebaActividad1.factorial(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Raiz method, of class PruebaActividad1.
     */
    @Test
    public void testRaiz() {
        System.out.println("Raiz");
        int i = 0;
        int expResult = 0;
        int result = PruebaActividad1.Raiz(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pitagoras method, of class PruebaActividad1.
     */
    @Test
    public void testPitagoras() {
        System.out.println("pitagoras");
        double cateto1 = 0.0;
        double cateto2 = 0.0;
        double hypo = 0.0;
        double expResult = 0.0;
        double result = PruebaActividad1.pitagoras(cateto1, cateto2, hypo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
