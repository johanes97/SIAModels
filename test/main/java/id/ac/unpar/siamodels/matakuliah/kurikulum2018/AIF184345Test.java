/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.MataKuliahFactory;
import id.ac.unpar.siamodels.TahunSemester;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class AIF184345Test {
    
    public AIF184345Test() {
        new AIF184345();//bigDataAndCloudComputing
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari kelas AIF184345.
     */
    @Test
    public void testCheckPrasyaratYangBerhasil() {
        AIF183300 tbd = new AIF183300();
        AIF183204 jarkom = new AIF183204();
        AIF184345 bigDataAndCloudComputing = new AIF184345();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF183300", 2, "tbd");
        MataKuliah mk2 = mkf.createMataKuliah("AIF183204", 2, "jarkom");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = bigDataAndCloudComputing.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    
    /**
     * Tes cek method cek prasyarat yang gagal dari kelas AIF184345.
     */
    @Test
    public void testCheckPrasyaratYangGagal() {
        AIF184345 bigDataAndCloudComputing = new AIF184345();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("181");
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = bigDataAndCloudComputing.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
}
