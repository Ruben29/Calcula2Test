package calcula2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

/**
 *
 *
 * @author rfernandezgonzalez
 */
@RunWith(Parameterized.class)

public class TestParametrosLogicos {

    private Modelo contenedor;
    private float res;

    @Before
    public void initialize() {
    }

    public TestParametrosLogicos(Modelo contenedor, float res) {
        this.contenedor = contenedor;
        this.res = res;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {new Modelo(5, 5, 1, 10), 10}

        });
    }

    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + res);
        assertEquals(res, Controlador.realizaOperacion(contenedor), 0.0);
    }
}
