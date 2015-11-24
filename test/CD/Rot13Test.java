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
public class Rot13Test {
    
    public Rot13Test() {
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
     * Test of encode method, of class Rot13.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        Rot13 instance = new Rot13();
        assertEquals("Uryy|-d|yq", instance.encode("Hello World", "13"));
        assertEquals("V{nyvq-xr", instance.encode("Invalid key", "13"));
        assertEquals("X}p{xs/zt", instance.encode("Invalid key", "15"));
    }

    /**
     * Test of decode method, of class Rot13.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        Rot13 instance = new Rot13();
        assertEquals("Hello World", instance.decode("Uryy|-d|yq", "13"));
        assertEquals("Invalid key", instance.decode("V{nyvq-xr", "13"));
        assertEquals("Invalid key", instance.decode("X}p{xs/zt", "15"));
    }
    
}
