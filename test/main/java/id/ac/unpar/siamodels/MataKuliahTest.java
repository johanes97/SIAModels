package id.ac.unpar.siamodels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class MataKuliahTest {
    String kode = "123";
    int sks = 5;
    String nama = "ABC";
    
    public MataKuliahTest() {
        this.kode = "123";
        this.sks = 5;
        this.nama = "ABC";
    }

    /**
     * Test of getKode method, of class MataKuliah.
     */
    @Test
    public void testGetKode() {     
        MataKuliahFactory mf = new MataKuliahFactory();
        MataKuliah instance = mf.createMataKuliah("AIF101",sks,nama);
        String expResult = "AIF101";
        String result = instance.getKode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNama method, of class MataKuliah.
     */
    @Test
    public void testGetNama() {
        MataKuliahFactory mf = new MataKuliahFactory();
        MataKuliah instance = mf.createMataKuliah(kode, sks, nama);
        String expResult = nama;
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSks method, of class MataKuliah.
     */
    @Test
    public void testGetSks() {
        MataKuliahFactory mf = new MataKuliahFactory();
        MataKuliah instance = mf.createMataKuliah(kode, sks, nama);
        Integer expResult = sks;
        Integer result = instance.getSks();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MataKuliah.
     */
    @Test
    public void testEquals() {
        MataKuliahFactory mf = new MataKuliahFactory();
        MataKuliah instance = mf.createMataKuliah(kode, sks, nama);
        Object o = instance;
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
        
        new MataKuliah() {}; //anonymous, ato ga bikin kelas yg nge extends, trs super
        new AIF101();
    }
    
}
