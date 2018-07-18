/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemleveltesting;

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
public class shoppingCartViewIT {
    
    public shoppingCartViewIT() {
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
     * Test of newOrOldcart method, of class shoppingCartView.
     */
    @Test
    public void testNewOrOldcart() {
        System.out.println("newOrOldcart");
        shoppingCartView instance = new shoppingCartView();
        String expResult = "";
        String result = instance.newOrOldcart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of namingCart method, of class shoppingCartView.
     */
    @Test
    public void testNamingCart() {
        System.out.println("namingCart");
        shoppingCartView instance = new shoppingCartView();
        String expResult = "";
        String result = instance.namingCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addingStuff method, of class shoppingCartView.
     */
    @Test
    public void testAddingStuff() {
        System.out.println("addingStuff");
        shoppingCartView instance = new shoppingCartView();
        String expResult = "";
        String result = instance.addingStuff();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numOfItem method, of class shoppingCartView.
     */
    @Test
    public void testNumOfItem() {
        System.out.println("numOfItem");
        shoppingCartView instance = new shoppingCartView();
        String expResult = "";
        String result = instance.numOfItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
