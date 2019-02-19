/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.prodi.teknikinformatika;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.MataKuliahFactory;
import id.ac.unpar.siamodels.TahunSemester;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johanes Irwan NPM:2016730004
 */
public class KelulusanTest {
    /**
     * Test of checkPrasyarat1 method dimana mahasiswa lulus mata kuliah agama katolik, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat1() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2016730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF11111", 4, "ADBO");
        MataKuliah mk2 = mkf.createMataKuliah("MKU180370", 2, "Agama Katolik");
        TahunSemester ts = new TahunSemester("161");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"A");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        int skor = 400;
        tupel.put(id,skor);
        mahasiswa.setNilaiTOEFL(tupel);
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda baru lulus 4 SKS, masih kurang 140 SKS lagi untuk mencapai 140.");
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat2 method dimana mahasiswa belum lulus mata kuliah agama katolik, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat2() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2016730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF11111", 4, "ADBO");
        MataKuliah mk2 = mkf.createMataKuliah("MKU180370", 2, "Agama Katolik");
        TahunSemester ts = new TahunSemester("161");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        int skor = 400;
        tupel.put(id,skor);
        mahasiswa.setNilaiTOEFL(tupel);
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda baru lulus 4 SKS, masih kurang 140 SKS lagi untuk mencapai 140.");
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat3 method dimana mahasiswa lulus mata kuliah fenomenologi, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat3() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2016730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF11111", 4, "ADBO");
        MataKuliah mk2 = mkf.createMataKuliah("MKU130003", 2, "Pancasila");
        TahunSemester ts = new TahunSemester("161");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"A");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        int skor = 400;
        tupel.put(id,skor);
        mahasiswa.setNilaiTOEFL(tupel);
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda baru lulus 4 SKS, masih kurang 140 SKS lagi untuk mencapai 140.");
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat4 method dimana mahasiswa tidak lulus mata kuliah fenomenologi, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat4() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2016730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF11111", 4, "ADBO");
        MataKuliah mk2 = mkf.createMataKuliah("MKU130003", 2, "Pancasila");
        TahunSemester ts = new TahunSemester("161");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"A");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        int skor = 400;
        tupel.put(id,skor);
        mahasiswa.setNilaiTOEFL(tupel);
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda baru lulus 4 SKS, masih kurang 140 SKS lagi untuk mencapai 140.");
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat5 method dimana mahasiswa mengambil mata kuliah kewarganegaraan, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat5() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2016730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("MKU180250", 2, "kewarganegaraan");
        MataKuliah mk2 = mkf.createMataKuliah("MKU130003", 2, "Pancasila");
        TahunSemester ts = new TahunSemester("161");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        int skor = 400;
        tupel.put(id,skor);
        mahasiswa.setNilaiTOEFL(tupel);
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda baru lulus 4 SKS, masih kurang 140 SKS lagi untuk mencapai 140.");
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat6 method dimana mahasiswa angkatan 2018 mengambil mata kuliah kewarganegaraan dan pancasila, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat6() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2019730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("MKU180250", 2, "kewarganegaraan");
        MataKuliah mk2 = mkf.createMataKuliah("MKU130003", 2, "Pancasila");
        TahunSemester ts = new TahunSemester("191");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        int skor = 400;
        tupel.put(id,skor);
        mahasiswa.setNilaiTOEFL(tupel);
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda baru lulus 4 SKS, masih kurang 140 SKS lagi untuk mencapai 140.");
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat7 method dimana mahasiswa angkatan 2017 mengambil mata kuliah kewarganegaraan dan pancasila, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat7() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2017730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("MKU180250", 2, "kewarganegaraan");
        MataKuliah mk2 = mkf.createMataKuliah("MKU130003", 2, "Pancasila");
        TahunSemester ts = new TahunSemester("171");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        int skor = 400;
        tupel.put(id,skor);
        mahasiswa.setNilaiTOEFL(tupel);
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda baru lulus 4 SKS, masih kurang 140 SKS lagi untuk mencapai 140.");
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat8 method dimana mahasiswa angkatan 2014 belum mengambil toefl , of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat8() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2014730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF181103", 3, "pemodelan untuk komputasi");
        MataKuliah mk2 = mkf.createMataKuliah("AIF181105", 3, "matriks dan ruang vektor");
        TahunSemester ts = new TahunSemester("141");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        int skor = 500;
        tupel.put(id,skor);
        mahasiswa.setNilaiTOEFL(tupel);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda belum lulus MK wajib " + mk);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat9 method dimana mahasiswa angkatan 2014 mengambil mata kuliah kewarganegaraan dan pancasila , of class Kelulusan.
     */
    @Test (expected = NullPointerException.class)
    public void testCheckPrasyarat9() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2014730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("MKU180250", 2, "kewarganegaraan");
        MataKuliah mk2 = mkf.createMataKuliah("MKU130003", 2, "Pancasila");
        TahunSemester ts = new TahunSemester("141");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        mahasiswa.setNilaiTOEFL(null);
        mahasiswa.getRiwayatNilai().add(nilai);
        mahasiswa.getRiwayatNilai().add(nilai2);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda baru lulus 4 SKS, masih kurang 140 SKS lagi untuk mencapai 140.");
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat10 method dimana mahasiswa angkatan 2014 sudah mengambil toefl lebih dari 8 kali dan pengambilan toefl terakhir lulus, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat10() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2014730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF181103", 3, "pemodelan untuk komputasi");
        MataKuliah mk2 = mkf.createMataKuliah("AIF181105", 3, "matriks dan ruang vektor");
        TahunSemester ts = new TahunSemester("141");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        LocalDate id2 = LocalDate.parse("2019-03-12");
        LocalDate id3 = LocalDate.parse("2019-04-12");
        LocalDate id4 = LocalDate.parse("2019-05-12");
        LocalDate id5 = LocalDate.parse("2019-06-12");
        LocalDate id6 = LocalDate.parse("2019-07-12");
        LocalDate id7 = LocalDate.parse("2019-08-12");
        LocalDate id8 = LocalDate.parse("2019-09-12");
        LocalDate id9 = LocalDate.parse("2019-10-12");
        int skor = 400;
        int skor2 = 300;
        int skor3 = 250;
        int skor4 = 380;
        int skor5 = 390;
        int skor6 = 100;
        int skor7 = 90;
        int skor8 = 399;
        int skor9 = 450;
        tupel.put(id,skor);
        tupel.put(id2,skor2);
        tupel.put(id3,skor3);
        tupel.put(id4,skor4);
        tupel.put(id5,skor5);
        tupel.put(id6,skor6);
        tupel.put(id7,skor7);
        tupel.put(id8,skor8);
        tupel.put(id9,skor9);
        mahasiswa.setNilaiTOEFL(tupel);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda belum lulus MK wajib " + mk);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrasyarat11 method dimana mahasiswa angkatan 2014 sudah mengambil toefl lebih dari 8 kali dan belum lulus, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat11() {
        System.out.println("checkPrasyarat");
        Mahasiswa mahasiswa = new Mahasiswa("2014730004");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mk = mkf.createMataKuliah("AIF181103", 3, "pemodelan untuk komputasi");
        MataKuliah mk2 = mkf.createMataKuliah("AIF181105", 3, "matriks dan ruang vektor");
        TahunSemester ts = new TahunSemester("141");
        Mahasiswa.Nilai nilai = new Mahasiswa.Nilai(ts, mk,"E");
        Mahasiswa.Nilai nilai2 = new Mahasiswa.Nilai(ts, mk2,"E");
        TreeMap<LocalDate,Integer> tupel = new TreeMap<>();
        LocalDate id = LocalDate.parse("2019-02-12");
        LocalDate id2 = LocalDate.parse("2019-03-12");
        LocalDate id3 = LocalDate.parse("2019-04-12");
        LocalDate id4 = LocalDate.parse("2019-05-12");
        LocalDate id5 = LocalDate.parse("2019-06-12");
        LocalDate id6 = LocalDate.parse("2019-07-12");
        LocalDate id7 = LocalDate.parse("2019-08-12");
        LocalDate id8 = LocalDate.parse("2019-09-12");
        LocalDate id9 = LocalDate.parse("2019-10-12");
        int skor = 400;
        int skor2 = 300;
        int skor3 = 250;
        int skor4 = 380;
        int skor5 = 390;
        int skor6 = 100;
        int skor7 = 90;
        int skor8 = 399;
        int skor9 = 385;
        tupel.put(id,skor);
        tupel.put(id2,skor2);
        tupel.put(id3,skor3);
        tupel.put(id4,skor4);
        tupel.put(id5,skor5);
        tupel.put(id6,skor6);
        tupel.put(id7,skor7);
        tupel.put(id8,skor8);
        tupel.put(id9,skor9);
        mahasiswa.setNilaiTOEFL(tupel);
        List<String> reasonsContainer = new LinkedList<String>();
        reasonsContainer.add("Anda belum lulus MK wajib " + mk);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    /**
     * Test of getMkEkevalensi method, of class Kelulusan.
     */
    @Test
    public void testGetMkEkevalensi() {
        System.out.println("getMkEkevalensi");
        Kelulusan instance = new Kelulusan();
        Map<String, String> expResult = null;
        Map<String, String> result = instance.getMkEkevalensi();
        assertEquals(expResult, result);
    }
    
}
