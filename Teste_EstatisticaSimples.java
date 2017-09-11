/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class Estatistica_simplesTest {
    
    public Estatistica_simplesTest() {
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
     * Test of max method, of class Estatistica_simples.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        Estatistica_simples instance = new Estatistica_simples();
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(5);
         lista.add(9);
          lista.add(11);
           lista.add(7);
            lista.add(81);
        int expResult = 81;
        int result = instance.max(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class Estatistica_simples.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        Estatistica_simples instance = new Estatistica_simples();
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(5);
         lista.add(9);
          lista.add(11);
           lista.add(7);
            lista.add(81);
        int expResult = 5;
        int result = instance.min(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of media method, of class Estatistica_simples.
     */
    @Test
    public void testMedia() {
        System.out.println("media");
        Estatistica_simples instance = new Estatistica_simples();
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(5);
         lista.add(9);
          lista.add(11);
           lista.add(7);
            lista.add(81);
        double expResult = 22.6;
        double result = instance.media(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quantidade method, of class Estatistica_simples.
     */
    @Test
    public void testQuantidade() {
        System.out.println("quantidade");
        Estatistica_simples instance = new Estatistica_simples();
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(5);
         lista.add(9);
          lista.add(11);
           lista.add(7);
            lista.add(81);
        int expResult = 5;
        int result = instance.quantidade(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
