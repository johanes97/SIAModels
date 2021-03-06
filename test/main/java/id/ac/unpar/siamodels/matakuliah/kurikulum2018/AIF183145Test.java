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
public class AIF183145Test {
    /**
     * method testCheckPrasyarat ini untuk mengetes jika mahasiswa boleh mengambil matakuliah Sertifikasi Dasar-dasar Java
     */
    @Test
    public void testCheckPrasyarat() {
        AIF182105 pbo = new AIF182105();
        AIF183145 serdas = new AIF183145();
        Mahasiswa mahasiswa = new Mahasiswa("2018730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF182105", 2, "Pemrograman Berorientasi Objek");
        TahunSemester ts = new TahunSemester("181");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk, "A");
        mahasiswa.getRiwayatNilai().add(nilai);
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = true;
        boolean res = serdas.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
    /**
     * method testCheckPrasyarat2 ini untuk mengetes jika mahasiswa belum boleh mengambil matakuliah Sertifikasi Dasar-dasar Java
     */
    @Test
    public void testCheckPrasyarat2() {
        AIF183145 serdas = new AIF183145();
        Mahasiswa mahasiswa = new Mahasiswa("2018730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        TahunSemester ts = new TahunSemester("181");
        List<String> reasonsContainer = new LinkedList<String>();
        boolean expRes = false;
        boolean res = serdas.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expRes, res);
    }
}
