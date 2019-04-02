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
public class AIF183106Test {
    
    public AIF183106Test() {
        new AIF183106();//proif
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari kelas AIF183106.
     */
    @Test
    public void testCheckPrasyaratYangBerhasil() {
        AIF183303 rpl = new AIF183303();
        AIF183305 manpro = new AIF183305();
        AIF183106 proif = new AIF183106();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF183303", 3, "rpl");
        MataKuliah mk2 = mkf.createMataKuliah("AIF183305", 2, "manpro");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = proif.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    
    /**
     * Tes cek method cek prasyarat yang gagal dari kelas AIF183106.
     */
    @Test
    public void testCheckPrasyaratYangGagal() {
        AIF183106 proif = new AIF183106();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("181");
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = proif.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
}
