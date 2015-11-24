/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class NoTest {
    
    public NoTest() {
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
     * Test of encode method, of class No.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        No instance = new No();
        assertEquals("Hello World", instance.encode("Hello World", "13"));
        assertEquals("Invalid key", instance.encode("Invalid key", "13"));
        assertEquals("Invalid key", instance.encode("Invalid key", "15"));
    }

    /**
     * Test of decode method, of class No.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        No instance = new No();
        assertEquals("Hello World", instance.decode("Hello World", "13"));
        assertEquals("Invalid key", instance.decode("Invalid key", "13"));
        assertEquals("Invalid key", instance.decode("Invalid key", "15"));
    }
    
}
