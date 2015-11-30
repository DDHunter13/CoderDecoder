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

    /**
     * Test of encode method, of class No.
     */
    @Test
    public void testEncode() {
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
        No instance = new No();
        assertEquals("Hello World", instance.decode("Hello World", "13"));
        assertEquals("Invalid key", instance.decode("Invalid key", "13"));
        assertEquals("Invalid key", instance.decode("Invalid key", "15"));
    }
    
}
