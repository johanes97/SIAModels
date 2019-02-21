package id.ac.unpar.siamodels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import id.ac.unpar.siamodels.Dosen;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class DosenTest {
    
    public DosenTest() {
    }

    /**
     * Test of getNik method, tes untuk mendapatkan NIK.
     */
    @Test
    public void testGetNik() {
        Dosen instance = new Dosen("123","ABC");
        String expResult = "123";
        String result = instance.getNik();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNik method, tes untuk set nik.
     */
    @Test
    public void testSetNik() {
        String nik = "321";
        Dosen instance = new Dosen("123","ABC");
        instance.setNik(nik);
    }

    /**
     * Test of getNama method, tes untuk mendapatkan nama.
     */
    @Test
    public void testGetNama() {
        Dosen instance = new Dosen("123","ABC");
        String expResult = "ABC";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, tes nama dari dosen.
     */
    @Test
    public void testSetNama() {
        String nama = "CBA";
        Dosen instance = new Dosen("123","ABC");
        instance.setNama(nama);
    }

    /**
     * Test of equals method, men compare dosen yang sama.
     */
    @Test
    public void testEqualsTrue() {
        Object obj = new Dosen("123","ABC");
        Dosen instance = new Dosen("123","ABC");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, tes men compare yang null.
     */
    @Test
    public void testEqualsNull() {
        try{
            Object obj = new Dosen(null,null);
            Dosen instance = new Dosen(null,null);
            boolean expResult = true;
            boolean result = instance.equals(obj);
            assertEquals(expResult, result);
        }
        catch(Exception e){}
    }
    
    /**
     * Test of equals method, tes menggunakan objek yang sama.
     */
    @Test
    public void testEqualsThisObj() {
        try{
            Object obj = new Dosen("123","ABC");
            Dosen instance = (Dosen)obj;
            boolean expResult = true;
            boolean result = obj.equals(instance);
            assertEquals(expResult, result);
        }
        catch(Exception e){}
    }
    
    /**
     * Test of equals method, tes menggunakan objek null.
     */
    @Test
    public void testEqualsThisObjNull() {
        try{
            Object obj = null;
            Dosen instance = new Dosen("123","ABC");
            boolean expResult = false;
            boolean result = instance.equals(obj);
            assertEquals(expResult, result);
        }
        catch(Exception e){}
    }
    
    /**
     * Test of equals method, tes objek yang berbeda.
     */
    @Test
    public void testEqualsGetClassDifferentObject() {
        try{
            Object obj = new Object();
            Dosen instance = new Dosen("123","ABC");
            boolean expResult = false;
            boolean result = instance.equals(obj);
            assertEquals(expResult, result);
        }
        catch(Exception e){}
    }
    
    /**
     * Test of equals method, NIK tidak null.
     */
    @Test
    public void testEqualsNIKNotNull() {
        try{
            Dosen dosenTest = new Dosen("123","ABC");
            Dosen instance = new Dosen("123","ABC");
            boolean expResult = true;
            boolean result = instance.equals(dosenTest);
            assertEquals(expResult, result);
        }
        catch(Exception e){}
    }
    
    /**
     * Test of equals method, yang namanya tidak null.
     */
    @Test
    public void testEqualsNamaNotNull() {
        try{
            Dosen dosenTest = new Dosen(null,"ABC");
            Dosen instance = new Dosen(null,"ABC");
            boolean expResult = true;
            boolean result = instance.equals(dosenTest);
            assertEquals(expResult, result);
        }
        catch(Exception e){}
    }
    
    /**
     * Test of equals method, yang false dan berbeda dosennya.
     */
    @Test
    public void testEqualsFalse() {
        try{
            Dosen dosenTest = new Dosen(null,"ABC");
            Dosen instance = new Dosen("123",null);
            boolean expResult = false;
            boolean result = instance.equals(dosenTest);
            assertEquals(expResult, result);
        }
        catch(Exception e){}
    }
}
