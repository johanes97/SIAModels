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
public class AIF183333Test {
    
    public AIF183333Test() {
        new AIF183333();//metodologiSI_1
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari kelas AIF183333.
     */
    @Test
    public void testCheckPrasyaratYangBerhasil() {
        AIF182308 psi = new AIF182308();
        AIF183333 metodologiSI_1 = new AIF183333();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182308", 3, "psi");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = metodologiSI_1.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    
    /**
     * Tes cek method cek prasyarat yang gagal dari kelas AIF183333.
     */
    @Test
    public void testCheckPrasyaratYangGagal() {
        AIF183333 metodologiSI_1 = new AIF183333();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("181");
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = metodologiSI_1.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
}
