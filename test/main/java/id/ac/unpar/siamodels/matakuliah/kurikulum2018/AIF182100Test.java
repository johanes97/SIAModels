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
 * @author User
 */
public class AIF182100Test {
    /**
     * method testCheckPrasyarat ini untuk mengetes jika mahasiswa telah lulus matakuliah pemrograman berorientasi
     * objek
     */
    @Test
    public void testCheckPrasyarat() {
        AIF182105 pbo = new AIF182105();
        AIF182100 adpl = new AIF182100();
        Mahasiswa mahasiswa = new Mahasiswa("2018730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182105", 3, "Pemrograman Berorientasi Objek");
        TahunSemester ts = new TahunSemester("181");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        mahasiswa.getRiwayatNilai().add(nilai);
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = adpl.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    /**
     * method testCheckPrasyarat ini untuk mengetes jika mahasiswa belum lulus matakuliah pemrograman berorientasi
     * objek
     */
    @Test
    public void testCheckPrasyarat2() {
        AIF182105 pbo = new AIF182105();
        AIF182100 adpl = new AIF182100();
        Mahasiswa mahasiswa = new Mahasiswa("2018730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182105", 3, "Pemrograman Berorientasi Objek");
        TahunSemester ts = new TahunSemester("181");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "E");
        mahasiswa.getRiwayatNilai().add(nilai);
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = adpl.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
}
