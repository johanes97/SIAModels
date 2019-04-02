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
public class AIF184001Test {
    
    public AIF184001Test() {
        new AIF184001(); //skripsi_1
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari angkatan baru setelah 2017 dari kelas AIF184001.
     */
    @Test
    public void testCheckPrasyaratYangAngkatanBaruSetelah2017() {
        AIF183002 penil = new AIF183002();
        AIF182007 teknikPresentasi = new AIF182007();
        AIF184001 skripsi_1 = new AIF184001();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF183002", 2, "penil");
        MataKuliah mk2 = mkf.createMataKuliah("AIF182007", 2, "teknikPresentasi");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = skripsi_1.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    /**
     * Tes cek method cek prasyarat yang berhasil dari angkatan sebelum 2017 dari kelas AIF184001.
     */
    @Test
    public void testCheckPrasyaratYangAngkatanSebelum2017() {
        AIF183002 penil = new AIF183002();
        AIF184001 skripsi_1 = new AIF184001();
        
        Mahasiswa mahasiswa = new Mahasiswa("2016730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF183002", 2, "penil");
        TahunSemester ts = new TahunSemester("161");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = skripsi_1.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    /**
     * Tes cek method cek prasyarat yang berhasil dari angkatan baru setelah 2017 yang gagal dari kelas AIF184001.
     */
    @Test
    public void testCheckPrasyaratYangAngkatanBaruSetelah2017YangFail() {
        AIF184001 skripsi_1 = new AIF184001();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("181");

        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = skripsi_1.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    /**
     * Tes cek method cek prasyarat yang berhasil dari angkatan baru setelah 2017 yang gagal dari kelas AIF184001.
     */
    @Test
    public void testCheckPrasyaratYangAngkatanSebelum2017YangFail() {
        AIF184001 skripsi_1 = new AIF184001();
        
        Mahasiswa mahasiswa = new Mahasiswa("2016730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("161");

        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = skripsi_1.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    /**
     * Tes cek method cek prasyarat yang berhasil dari angkatan baru setelah 2017 yang diatas 124 sks lulusnya dari kelas AIF184001.
     */
    @Test
    public void testCheckPrasyaratYangAngkatanSebelum2017YangDiatas108() {
        AIF184001 skripsi_1 = new AIF184001();
        
        Mahasiswa mahasiswa = new Mahasiswa("2016730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("161");
        
        MataKuliah mk = mkf.createMataKuliah("AIF666778", 110, "ajaib2");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        mahasiswa.getRiwayatNilai().add(nilai);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = skripsi_1.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
}
