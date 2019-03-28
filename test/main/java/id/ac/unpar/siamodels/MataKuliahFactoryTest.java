package id.ac.unpar.siamodels;

import org.junit.Test;
import static org.junit.Assert.*;

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
        Integer tesSks = null;
        
        MataKuliahFactory instance = new MataKuliahFactory();
        MataKuliah result = instance.createMataKuliah(kode, sks, nama);
        
        boolean res = true;
        boolean expRes = true;
        if (!result.getKode().equalsIgnoreCase(kode) || result.getSks() != sks || !result.getNama().equalsIgnoreCase(nama)) {
            res = false;
        }
        assertEquals(res, expRes);
    }
    
    @Test
    public void testIfPertama(){
        String kode = "123";
        int sks = 2;
        String nama = "ABC";
        Integer sksNull = null;
        try {
            //case 1
            MataKuliahFactory tes = new MataKuliahFactory();
            tes.createMataKuliah(kode, 3, null);//3,null
            tes.createMataKuliah(kode, sks, nama);//sks,null (pas udah ga null mo ubah nilai)
            //case 2
            tes = new MataKuliahFactory();
            tes.createMataKuliah(kode, sksNull, nama);//null,nama
            tes.createMataKuliah(kode, sks, nama);
            //case 3
            tes = new MataKuliahFactory();
            tes.createMataKuliah(kode, sksNull, null);//null, null
            tes.createMataKuliah(kode, sks, nama);            
            //case 4
            tes = new MataKuliahFactory();
            tes.createMataKuliah(kode, 3, nama);//3,nama
            tes.createMataKuliah(kode, sks, nama); 
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testException(){
        String kode = "123";
        int sks = 2;
        String nama = "ABC";
        Integer sksNull = null;
        try {
            MataKuliahFactory tes = new MataKuliahFactory();
            tes.createMataKuliah(null,sksNull,null);
            
            
        } catch (Exception e) {
        }
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
        if (!result.getKode().equalsIgnoreCase(kode) || result.getSks() != sks || !result.getNama().equalsIgnoreCase(nama)) {
            res = false;
        }
        assertEquals(res, expRes);
    }
    
    
    @Test
    public void testIfPertama2(){
        String kode = "123";
        int sks = 2;
        String nama = "ABC";
        Integer sksNull = null;
        try {
            //case 1
            MataKuliahFactory tes = new MataKuliahFactory();
            tes.createMataKuliah(kode);
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testCobaCoba(){
        String kode = "123";
        int sks = 2;
        String nama = "ABC";
        Integer sksNull = null;
        try {
            //case 1
            MataKuliahFactory tes = MataKuliahFactory.getInstance();
            tes.createMataKuliah(kode);
        } catch (Exception e) {
        }
    }
}
