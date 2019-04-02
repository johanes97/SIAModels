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
public class AIF183107Test {
    
    public AIF183107Test() {
        new AIF183107();//psc
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari kelas AIF183107.
     */
    @Test
    public void testCheckPrasyaratYangBerhasil() {
        AIF182106 daa = new AIF182106();
        AIF181104 logikaInformatika = new AIF181104();
        AIF183107 psc = new AIF183107();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182106", 3, "daa");
        MataKuliah mk2 = mkf.createMataKuliah("AIF181104", 3, "logikaInformatika");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = psc.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    
    /**
     * Tes cek method cek prasyarat yang gagal dari kelas AIF183107.
     */
    @Test
    public void testCheckPrasyaratYangGagal() {
        AIF183107 psc = new AIF183107();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("181");
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = psc.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
}
