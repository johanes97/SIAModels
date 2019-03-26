package id.ac.unpar.siamodels;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johanes Irwan NPM:2016730004
 */
public class TahunSemesterTest {
    /**
     * Test of getSemester method untuk mengetes jika mahasiswa angkatan 2016 yang berada pada semester Ganjil, of class TahunSemester.
     */
    @Test
    public void testGetSemester() {
        TahunSemester instance = new TahunSemester(2016,Semester.GANJIL);
        TahunSemester instance2 = new TahunSemester(2016,'1');
        Semester expResult = Semester.GANJIL;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    /**
     * Test of getSemester method untuk mengetes jika mahasiswa angkatan 2016 yang berada pada semester Genap, of class TahunSemester.
     */
    @Test
    public void testGetSemester2() {
        TahunSemester instance = new TahunSemester(2016,Semester.GENAP);
        Semester expResult = Semester.GENAP;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    /**
     * Test of getSemester method untuk mengetes jika mahasiswa angkatan 2016 yang berada pada semester Pendek, of class TahunSemester.
     */
    @Test
    public void testGetSemester3() {
        TahunSemester instance = new TahunSemester(2016,Semester.PENDEK);
        Semester expResult = Semester.PENDEK;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    /**
     * Test of getSemester method untuk mengetes jika mahasiswa angkatan 2016 yang tidak berada pada semester apapun, of class TahunSemester.
     */
    @Test
    public void testGetSemester4() {
        TahunSemester instance = new TahunSemester(2016,Semester.UNKNOWN5);
        Semester expResult = Semester.UNKNOWN5;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    /**
     * Test of getSemester method untuk mengetes jika mahasiswa angkatan 2016 yang transfer, of class TahunSemester.
     */
    @Test
    public void testGetSemester5() {
        TahunSemester instance = new TahunSemester(2016,Semester.TRANSFER);
        Semester expResult = Semester.TRANSFER;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    /**
     * Test of getSemester method untuk mengetes jika mahasiswa angkatan 2016 tidak mengambil semester, of class TahunSemester.
     */
    @Test (expected=NullPointerException.class)
    public void testGetSemester6() {
        TahunSemester instance = new TahunSemester(2016,null);
        Semester expResult = null;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    /**
     * Test of getTahun method, of class TahunSemester.
     */
    @Test
    public void testGetTahun() {
        TahunSemester instance = new TahunSemester(2016,Semester.GANJIL);
        int expResult = 2016;
        int result = instance.getTahun();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getKodeDPS method, of class TahunSemester.
     */
    @Test
    public void testGetKodeDPS1() {
        TahunSemester instance = new TahunSemester("161");
        String expResult = "161";
        String result = instance.getKodeDPS();
        assertEquals(expResult, result);
    }
    /**
     * Test of getKodeDPS method, of class TahunSemester.
     */
    @Test (expected=IllegalArgumentException.class)
    public void testGetKodeDPS2() {
        TahunSemester instance = new TahunSemester("167");
        String expResult = null;
        String result = instance.getKodeDPS();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getKodeDPS method, of class TahunSemester.
     */
    @Test (expected=NullPointerException.class)
    public void testGetKodeDPS3() {
        TahunSemester instance = new TahunSemester(null);
        String expResult = null;
        String result = instance.getKodeDPS();
        assertEquals(expResult, result);
    }
    /**
     * Test of compareTo method, of class TahunSemester.
     */
    @Test
    public void testCompareTo() {
        TahunSemester o = new TahunSemester(2016,Semester.GANJIL);
        TahunSemester instance = new TahunSemester(2015,Semester.GANJIL);
        int expResult = -1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    /**
     * Test of compareTo method, of class TahunSemester.
     */
    @Test
    public void testCompareTo2() {
        TahunSemester o = new TahunSemester(2016,Semester.GANJIL);
        TahunSemester instance = new TahunSemester(2015,Semester.GANJIL);
        int expResult = -1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class TahunSemester.
     */
    @Test
    public void testEquals() {
        Object obj = new TahunSemester(2016,Semester.GANJIL);
        TahunSemester instance = new TahunSemester(2016,Semester.GANJIL);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class TahunSemester.
     */
    @Test
    public void testToString() {
        TahunSemester instance = new TahunSemester(2016,Semester.GANJIL);
        String expResult = "TahunSemester [2016/GANJIL]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}