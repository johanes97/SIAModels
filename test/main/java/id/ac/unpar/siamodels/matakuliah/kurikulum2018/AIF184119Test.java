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
public class AIF184119Test {
    
    public AIF184119Test() {
        new AIF184119();//perancanganPermainanKomp
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari kelas AIF184119.
     */
    @Test
    public void testCheckPrasyaratYangBerhasil() {
        AIF182100 adpl = new AIF182100();
        AIF183120 pemogramanPermainanKomp = new AIF183120();
        AIF184119 perancanganPermainanKomp = new AIF184119();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182100", 4, "adpl");
        MataKuliah mk2 = mkf.createMataKuliah("AIF183120", 3, "pemogramanPermainanKomp");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = perancanganPermainanKomp.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    
    /**
     * Tes cek method cek prasyarat yang gagal dari kelas AIF184119.
     */
    @Test
    public void testCheckPrasyaratYangGagal() {
        AIF182100 adpl = new AIF182100();
        AIF183120 pemogramanPermainanKomp = new AIF183120();
        AIF184119 perancanganPermainanKomp = new AIF184119();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182100", 4, "adpl");
        MataKuliah mk2 = mkf.createMataKuliah("AIF183120", 3, "pemogramanPermainanKomp");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "E");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = perancanganPermainanKomp.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
}
