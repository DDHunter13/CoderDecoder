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
    
    /**
     * Test of encode method, of class Rot13.
     */
    @Test
    public void testEncode() {
        Rot13 instance = new Rot13();
        assertEquals("Uryyb Jbeyq", instance.encode("Hello World", "13"));
        assertEquals("Vainyvq Xrl", instance.encode("Invalid Key", "13"));
        assertEquals("Xckpaxs Ztn", instance.encode("Invalid Key", "15"));
    }

    /**
     * Test of decode method, of class Rot13.
     */
    @Test
    public void testDecode() {
        Rot13 instance = new Rot13();
        assertEquals("Hello World", instance.decode("Uryyb Jbeyq", "13"));
        assertEquals("Invalid Key", instance.decode("Vainyvq Xrl", "13"));
        assertEquals("Invalid Key", instance.decode("Xckpaxs Ztn", "15"));
    }
    
}
