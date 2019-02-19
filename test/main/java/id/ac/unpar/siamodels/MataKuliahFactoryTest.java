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
 * @author ASUS
 */
public class MataKuliahFactoryTest {

    public MataKuliahFactoryTest() {
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
     * Test of getInstance method, of class MataKuliahFactory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MataKuliahFactory expResult = MataKuliahFactory.getInstance();
        MataKuliahFactory result = MataKuliahFactory.getInstance();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3args() {
        String kode = "123";
        int sks = 2;
        String nama = "ABC";
        MataKuliahFactory instance = new MataKuliahFactory();
        MataKuliah result = instance.createMataKuliah(kode, sks, nama);
        MataKuliah tesCatch = instance.createMataKuliah("ZZZ123", sks, nama);
        //assertTrue(true); pass
        boolean res = true;
        boolean expRes = true;
        if(!result.getKode().equalsIgnoreCase(kode) || result.getSks() != sks || !result.getNama().equalsIgnoreCase(nama) ){
            res = false;
        }
        assertEquals(res,expRes);
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_String() {
        String kode = "123";
        int sks = 2;
        String nama = "ABC";
        MataKuliahFactory instance = new MataKuliahFactory();
        instance.createMataKuliah(kode, sks, nama);
        MataKuliah result = instance.createMataKuliah(kode);
        
        boolean res = true;
        boolean expRes = true;
        if(!result.getKode().equalsIgnoreCase(kode) || result.getSks() != sks || !result.getNama().equalsIgnoreCase(nama) ){
            res = false;
        }
        assertEquals(res,expRes);
    }

}
