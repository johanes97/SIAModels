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
public class AIF184002Test {
    
    public AIF184002Test() {
        new AIF184002();//skripsi_2
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari kelas AIF184002.
     */
    @Test
    public void testCheckPrasyaratYangBerhasil() {
        AIF184001 skripsi_1 = new AIF184001();
        AIF182007 teknikPresentasi = new AIF182007();
        AIF184002 skripsi_2 = new AIF184002();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF184001", 3, "skripsi_1");
        MataKuliah mk2 = mkf.createMataKuliah("AIF182007", 2, "teknikPresentasi");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = skripsi_2.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    
    /**
     * Tes cek method cek prasyarat yang gagal dari kelas AIF184002.
     */
    @Test
    public void testCheckPrasyaratYangGagal() {
        AIF184001 skripsi_1 = new AIF184001();
        AIF182007 teknikPresentasi = new AIF182007();
        AIF184002 skripsi_2 = new AIF184002();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF184001", 3, "skripsi_1");
        MataKuliah mk2 = mkf.createMataKuliah("AIF182007", 2, "teknikPresentasi");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "E");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = skripsi_2.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    /**
     * Tes cek method cek prasyarat yang berhasil karena sks lebih dari 125 dari kelas AIF184002.
     */
    @Test
    public void testCheckPrasyaratYangBerhasilTapiSksLebihDari125() {
        AIF184002 skripsi_2 = new AIF184002();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF666779", 130, "ajaib3");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = skripsi_2.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
}
