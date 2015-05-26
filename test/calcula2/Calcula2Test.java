/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rfernandezgonzalez
 */
public class Calcula2Test {
    
    public Calcula2Test() {
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
     * Test of main method, of class Calcula2.
     */
    

    /**
     * Test of realizarOperacion method, of class Calcula2.
     */
    @Test
    public void testRealizarOperacionSuma() {
        System.out.println("realizarOperacion");
        float num1 = 1.0F;
        float num2 = 2.0F;
        int op = 1;
        float expResult = 3.0F;
        float result = Calcula2.realizarOperacion(num1, num2, op);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }
    
    @Test
    public void testRealizarOperacionResta() {
        System.out.println("realizarOperacion");
        float num1 = 9.0F;
        float num2 = 10.0F;
        int op = 2;
        float expResult = -1.0F;
        float result = Calcula2.realizarOperacion(num1, num2, op);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }
    //Este método da error de forma intencionada
    @Test
    public void testRealizarOperacionMultiplicar() {
        System.out.println("realizarOperacion");
        float num1 = 5.0F;
        float num2 = 0.0F;
        int op = 3;
        float expResult = 1.0F;
        float result = Calcula2.realizarOperacion(num1, num2, op);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }
    
    @Test
    public void testRealizarOperacionDividir() {
        System.out.println("realizarOperacion");
        float num1 = 3.0F;
        float num2 = 2.0F;
        int op = 4;
        float expResult = 1.5F;
        float result = Calcula2.realizarOperacion(num1, num2, op);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }
}
