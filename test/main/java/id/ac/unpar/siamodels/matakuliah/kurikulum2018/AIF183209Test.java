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
public class AIF183209Test {
    
    public AIF183209Test() {
        new AIF183209();
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari kelas AIF183209.
     */
    @Test
    public void testCheckPrasyaratYangLulus() {
        AIF182100 adpl = new AIF182100();
        AIF182210 pjk = new AIF182210();
        AIF183209 p3b = new AIF183209();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182100", 4, "adpl");
        MataKuliah mk2 = mkf.createMataKuliah("AIF182210", 2, "pjk");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = p3b.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    /**
     * Tes cek method cek prasyarat yang gagal dari kelas AIF183209.
     */
    @Test
    public void testCheckPrasyaratYangFail() {
        AIF183209 p3b = new AIF183209();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        TahunSemester ts = new TahunSemester("181");
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = p3b.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
}
