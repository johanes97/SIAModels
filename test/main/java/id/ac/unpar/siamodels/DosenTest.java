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
     * Test of getNik method, of class Dosen.
     */
    @Test
    public void testGetNik() {
        Dosen instance = new Dosen("123","ABC");
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
        Dosen instance = new Dosen("123","ABC");
        instance.setNik(nik);
    }

    /**
     * Test of getNama method, of class Dosen.
     */
    @Test
    public void testGetNama() {
        Dosen instance = new Dosen("123","ABC");
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
        Dosen instance = new Dosen("123","ABC");
        instance.setNama(nama);
    }

    /**
     * Test of equals method, of class Dosen.
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
     * Test of equals method, of class Dosen.
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
     * Test of equals method, of class Dosen.
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
     * Test of equals method, of class Dosen.
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
     * Test of equals method, of class Dosen.
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
     * Test of equals method, of class Dosen.
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
     * Test of equals method, of class Dosen.
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
     * Test of equals method, of class Dosen.
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
