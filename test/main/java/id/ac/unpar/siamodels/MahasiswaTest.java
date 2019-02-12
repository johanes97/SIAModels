/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

import id.ac.unpar.siamodels.Dosen;
import id.ac.unpar.siamodels.JadwalKuliah;
import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.MataKuliahFactory;
import id.ac.unpar.siamodels.TahunSemester;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i16070
 */
public class MahasiswaTest {
    
    private Mahasiswa instance;
    
    public MahasiswaTest(){
        instance=new Mahasiswa("2016730070");
        instance.setNama("Irvan H");
        MataKuliah pbo,asd,daa,mibd,pbw,adbo,psc;
        Dosen dosenPBO1,dosenASD1,dosenDAA1,dosenMIBD1,dosenPBW1,dosenADBO1;
        JadwalKuliah jadkulDAA,jadkulASD,jadkulPBO;
        
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        asd = mkf.createMataKuliah("AIF103",4,"Algoritma dan Struktur Data");
        daa = mkf.createMataKuliah("AIF204",4,"Desain dan Analisis Algoritma");
        mibd = mkf.createMataKuliah("AIF205",4,"Manajemen Informasi dan Basis Data");
        pbw = mkf.createMataKuliah("AIF206", 2, "Pemrograman Berbasis Web");
        adbo = mkf.createMataKuliah("AIF301", 4, "Analisis dan Desain Berorientasi Objek");
        psc = mkf.createMataKuliah("AIF302",4,"Pengantar Sistem Cerdas");
        
        dosenPBO1 = new Dosen ("1234","Bobo");
        dosenASD1= new Dosen("10293","Bibi");
        dosenDAA1=new Dosen("1256","Bubu");
        dosenMIBD1=new Dosen("1236","Didi");
        dosenPBW1=new Dosen("7479","Dudu");
        dosenADBO1=new Dosen("9087","Dede");
        
        jadkulDAA = new JadwalKuliah(daa, 'A', dosenDAA1, "Selasa", "07:00-09:00", "10317");
        jadkulASD = new JadwalKuliah(asd,'B',dosenASD1,"Selasa","09:00-11:00","10316");
        jadkulPBO = new JadwalKuliah(pbo,'C',dosenPBO1,"Selasa","09:00-11:00","10317");
        
        TahunSemester thnSemester1 = new TahunSemester("161");
        TahunSemester thnSemester2 = new TahunSemester("162");
        TahunSemester thnSemester3 = new TahunSemester("171");
        TahunSemester thnSemester4 = new TahunSemester("172");
        TahunSemester thnSemester5 = new TahunSemester("181");
        
        List<Mahasiswa.Nilai> listNilai = new ArrayList<Mahasiswa.Nilai>();
        Mahasiswa.Nilai nilaiPBO = new Mahasiswa.Nilai(thnSemester1, pbo, "A");
        Mahasiswa.Nilai nilaiASD = new Mahasiswa.Nilai(thnSemester2,asd,"B");
        Mahasiswa.Nilai nilaiADBO = new Mahasiswa.Nilai(thnSemester3,adbo,"B");
        Mahasiswa.Nilai nilaiMIBD = new Mahasiswa.Nilai(thnSemester3,mibd,"B");
        Mahasiswa.Nilai nilaiDAA = new Mahasiswa.Nilai(thnSemester4,daa,"A");
        Mahasiswa.Nilai nilaiPBW = new Mahasiswa.Nilai(thnSemester4,pbw,"C");//tempuh 24 total poin 80
        Mahasiswa.Nilai nilaiPSC = new Mahasiswa.Nilai(thnSemester4,psc,"E");
        Mahasiswa.Nilai nilaiPSC2 = new Mahasiswa.Nilai(thnSemester5,psc,"A");
        
        instance.getRiwayatNilai().add(nilaiPBO);
        instance.getRiwayatNilai().add(nilaiASD);
        instance.getRiwayatNilai().add(nilaiADBO);
        instance.getRiwayatNilai().add(nilaiMIBD);
        instance.getRiwayatNilai().add(nilaiDAA);
        instance.getRiwayatNilai().add(nilaiPBW);
        instance.getRiwayatNilai().add(nilaiPSC);
        instance.getRiwayatNilai().add(nilaiPSC2);
    }
    
    @BeforeClass
    public static void setUpClass(){
        
    }
    
    @AfterClass
    public static void tearDownClass(){
        
    }
    
    @Before
    public void setUp(){
        
    }
    
    @After
    public void tearDown(){
        
    }
    
    @Test
    public void testCalculateIPKumulatif(){
        Double expectedResult = 3.0;
        Double result = instance.calculateIPKumulatif();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testCalculateIPLulus(){
        Double expectedResult = 96.0/28.0;
        Double result = instance.calculateIPLulus();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testCalculateIPS(){
        Double expectedResult  = 4.0;
        Double result = instance.calculateIPS();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testCalculateIPTempuhTrue(){
        Double expectedResult = 96/28.0;
        Double result = instance.calculateIPTempuh(true);
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testCalculateIPTempuhFalse(){
        Double expectedResult = 96/28.0;
        Double result = instance.calculateIPTempuh(false);
        assertEquals(expectedResult, result);
    }
    @Test
    public void testCalculateSKSLulus(){
        int expectedResult = 28;
        int result = instance.calculateSKSLulus();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testCalculateSKSTempuhTrue(){
        int expectedResult = 28;
        int result = instance.calculateSKSTempuh(true);
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testCalculateSKSTempuhFalse(){
        int expectedResult = 28;
        int result = instance.calculateSKSTempuh(false);
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testCalculateTahunSemesterAktif(){
        TahunSemester thnSemester1 = new TahunSemester("161");
        TahunSemester thnSemester2 = new TahunSemester("162");
        TahunSemester thnSemester3 = new TahunSemester("171");
        TahunSemester thnSemester4 = new TahunSemester("172");
        TahunSemester thnSemester5 = new TahunSemester("181");
        Set<TahunSemester> expectedResult = new TreeSet<TahunSemester>();
        expectedResult.add(thnSemester1);
        expectedResult.add(thnSemester2);
        expectedResult.add(thnSemester3);
        expectedResult.add(thnSemester4);
        expectedResult.add(thnSemester5);
        Set<TahunSemester> result = instance.calculateTahunSemesterAktif();
        assertEquals(result,expectedResult);
    }
    
    @Test
    public void testHasLulusMataKuliah(){
        List<Mahasiswa.Nilai> l = instance.getRiwayatNilai();
        for (Mahasiswa.Nilai n : l) {
            System.out.printf("%f %s %f %n",n.getAngkaAkhir(),n.getMataKuliah().getNama(),n.getAngkaAkhir());
        }
        assertEquals(true,instance.hasLulusKuliah("AIF101"));
        assertEquals(true,instance.hasLulusKuliah("AIF103"));
        assertEquals(true,instance.hasLulusKuliah("AIF204"));
        assertEquals(true,instance.hasLulusKuliah("AIF205"));
        assertEquals(true,instance.hasLulusKuliah("AIF206"));
        assertEquals(true,instance.hasLulusKuliah("AIF301"));
        assertEquals(true,instance.hasLulusKuliah("AIF302"));
    }
    
    public void testHasTempuhMataKuliah(){
        assertEquals(true,instance.hasTempuhKuliah("AIF101"));
        assertEquals(true,instance.hasTempuhKuliah("AIF103"));
        assertEquals(true,instance.hasTempuhKuliah("AIF204"));
        assertEquals(true,instance.hasTempuhKuliah("AIF205"));
        assertEquals(true,instance.hasTempuhKuliah("AIF206"));
        assertEquals(true,instance.hasTempuhKuliah("AIF301"));
        assertEquals(true,instance.hasTempuhKuliah("AIF302"));
    }
}
