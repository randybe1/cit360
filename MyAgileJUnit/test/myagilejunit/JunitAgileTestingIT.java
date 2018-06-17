/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myagilejunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Randy Beckford
 */
public class JunitAgileTestingIT {
    
    public JunitAgileTestingIT() {
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
     * Test of add method, of class JunitAgileTesting.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "4";
        String s2 = "4";
        JunitAgileTesting instance = new JunitAgileTesting();
        int expResult = 8;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "5";
        String s2 = "4";
        JunitAgileTesting instance = new JunitAgileTesting();
        int expResult = 9;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
               
    }
     @Test(expected =NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String s1 = "foo";
        String s2 = "4";
        JunitAgileTesting instance = new JunitAgileTesting();
        int expResult = 0;
        int result = instance.add(s1, s2);
        
    }
}
