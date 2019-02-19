package id.ac.unpar.siamodels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import id.ac.unpar.siamodels.MataKuliahFactory;
import id.ac.unpar.siamodels.matakuliah.AIF101;
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
    
    /**
     * Test of getInstance method, of class MataKuliahFactory.
     */
    @Test
    public void testGetInstance() {
        MataKuliahFactory expResult = MataKuliahFactory.getInstance();
        MataKuliahFactory result = MataKuliahFactory.getInstance();
        assertEquals(expResult, result);
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
        try{
            MataKuliahFactory tes = new MataKuliahFactory();
            MataKuliah tesCatch =new MataKuliahFactory().createMataKuliah("AIF202");
            MataKuliah tesCatch2 =new MataKuliahFactory().createMataKuliah(kode, sks, nama);
            MataKuliah tesCatch3 =new MataKuliahFactory().createMataKuliah("AXX");
            MataKuliah tesCatch4 =new MataKuliahFactory().createMataKuliah(kode, 100, nama);
            tes.createMataKuliah(kode, 3, null);
            tes.createMataKuliah(kode,sks,nama);
        }
        catch(Exception e){}
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
