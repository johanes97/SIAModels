package id.ac.unpar.siamodels;

import org.junit.Test;
import static org.junit.Assert.*;

public class SemesterTest {

    public SemesterTest() {
    }

    /**
     * Test of values method, of class Semester.
     */
    @Test
    public void testValues() {
        Semester[] expResult = Semester.values();
        Semester[] result = Semester.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Semester.
     */
    @Test
    public void testValueOf() {
        String name = "PENDEK";
        Semester expResult = Semester.PENDEK;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of fromString method, of class Semester.
     */
    @Test
    public void testFromString() {
        String text = "PENDEK";
        Semester expResult = Semester.PENDEK;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrder method, of class Semester.
     */
    @Test
    public void testGetOrder() {
        Semester instance = Semester.fromString("PENDEK");
        int expResult = 10;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

}
