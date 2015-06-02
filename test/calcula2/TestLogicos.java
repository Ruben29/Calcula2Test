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
public class TestLogicos {

    public TestLogicos() {
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
     * Test of realizarOperacion method, of class Calcula2.
     */
    @Test
    public void testRealizarOperacionSuma() {

        System.out.println("realizaOperacion");
        Modelo mod = new Modelo(5, 5, 1, 10);
        Controlador instance = new Controlador();
        float expResult = 10.0F;
        float result = instance.realizaOperacion(mod);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    @Test
    public void testRealizarOperacionResta() {

        System.out.println("realizaOperacion");
        Modelo mod = new Modelo(5, 5, 1, 10);
        Controlador instance = new Controlador();
        float expResult = 10.0F;
        float result = instance.realizaOperacion(mod);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    //Este método da error de forma intencionada

    @Test
    public void testRealizarOperacionMultiplicar() {

        System.out.println("realizaOperacion");
        Modelo mod = new Modelo(5, 3, 1, 10);
        Controlador instance = new Controlador();
        float expResult = 10.0F;
        float result = instance.realizaOperacion(mod);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    @Test
    public void testRealizarOperacionDividir() {

        System.out.println("realizaOperacion");
        Modelo mod = new Modelo(5, 5, 1, 10);
        Controlador instance = new Controlador();
        float expResult = 10.0F;
        float result = instance.realizaOperacion(mod);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }
}

