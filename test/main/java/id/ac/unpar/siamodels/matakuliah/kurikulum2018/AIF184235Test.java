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
public class AIF184235Test {
    
    public AIF184235Test() {
        new AIF184235();//layananBerbasisWeb
    }

    /**
     * Tes cek method cek prasyarat yang berhasil dari kelas AIF184235.
     */
    @Test
    public void testCheckPrasyaratYangBerhasil() {
        AIF182204 pbw = new AIF182204();
        AIF182302 mibd = new AIF182302();
        AIF183204 jarkom = new AIF183204();
        AIF184235 layananBerbasisWeb = new AIF184235();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182204", 3, "pbw");
        MataKuliah mk2 = mkf.createMataKuliah("AIF182302", 4, "mibd");
        MataKuliah mk3 = mkf.createMataKuliah("AIF183204", 2, "jarkom");
        TahunSemester ts = new TahunSemester("181");

        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2, "A");
        Mahasiswa.Nilai nilai3 = new Mahasiswa.Nilai(ts, mk3, "A");
        
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        mahasiswa.getRiwayatNilai().add(nilai3);
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = layananBerbasisWeb.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
    
    /**
     * Tes cek method cek prasyarat yang gagal dari kelas AIF184235.
     */
    @Test
    public void testCheckPrasyaratYangGagal() {
        AIF184235 layananBerbasisWeb = new AIF184235();
        
        Mahasiswa mahasiswa = new Mahasiswa("2018730079");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("181");
        
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = layananBerbasisWeb.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    
}
