package id.ac.unpar.siamodels;

import org.junit.Test;
import static org.junit.Assert.*;

public class DosenTest {

    public DosenTest() {
    }

    /**
     * Test of getNik method, of class Dosen.
     */
    @Test
    public void testGetNik() {
        Dosen instance = new Dosen("123", "ABC");
        String expResult = "123";
        String result = instance.getNik();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNik method, of class Dosen.
     */
    @Test
    public void testSetNik() {
        String nik = "321";
        Dosen instance = new Dosen("123", "ABC");
        instance.setNik(nik);
    }

    /**
     * Test of getNama method, of class Dosen.
     */
    @Test
    public void testGetNama() {
        Dosen instance = new Dosen("123", "ABC");
        String expResult = "ABC";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, of class Dosen.
     */
    @Test
    public void testSetNama() {
        String nama = "CBA";
        Dosen instance = new Dosen("123", "ABC");
        instance.setNama(nama);
    }

    /**
     * Test of equals method, of class Dosen.
     */
    @Test
    public void testEquals() {
        Object obj = new Dosen("123", "ABC");
        Dosen instance = new Dosen("123", "ABC");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

}
