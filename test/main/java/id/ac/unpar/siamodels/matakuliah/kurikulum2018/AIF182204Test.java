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
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author User
 */
public class AIF182204Test {
    /**
     * method testCheckPrasyarat ini untuk mengetes jika mahasiswa boleh mengambil matakuliah Pemrograman Berbasis Web
     */
    @Test
    public void testCheckPrasyarat() {
        AIF182302 mibd = new AIF182302();
        AIF182204 pbw = new AIF182204();
        Mahasiswa mahasiswa = new Mahasiswa("2018730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182302", 4, "Manajemen Informasi dan Basis Data");
        TahunSemester ts = new TahunSemester("181");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        mahasiswa.getRiwayatNilai().add(nilai);
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = pbw.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    /**
     * method testCheckPrasyarat2 ini untuk mengetes jika mahasiswa belum boleh mengambil matakuliah Pemrograman Berbasis Web
     */
    @Test
    public void testCheckPrasyarat2() {
        AIF182204 pbw = new AIF182204();
        Mahasiswa mahasiswa = new Mahasiswa("2018730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("181");
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = pbw.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
}
