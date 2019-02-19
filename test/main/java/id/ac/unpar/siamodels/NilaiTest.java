/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

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
public class NilaiTest {
    Mahasiswa.Nilai nilai1,nilai2,nilai3,nilai4,nilai5,nilai6,nilai7,nilai8,nilai9,nilai10,nilai11,nilai12,nilai13;
    @BeforeClass
    public static void setUpClass(){
        
    }
    
    @AfterClass
    public static void tearDownClass(){
        
    }
    
    @Before
    public void setUp(){
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        TahunSemester thnSemester1 = new TahunSemester("161");
        nilai1 = new Mahasiswa.Nilai(thnSemester1, pbo, "A");
        nilai2 = new Mahasiswa.Nilai(thnSemester1, pbo, "A-");
        nilai3 = new Mahasiswa.Nilai(thnSemester1, pbo, "B+");
        nilai4 = new Mahasiswa.Nilai(thnSemester1, pbo, "B");
        nilai5 = new Mahasiswa.Nilai(thnSemester1, pbo, "B-");
        nilai6 = new Mahasiswa.Nilai(thnSemester1, pbo, "C+");
        nilai7 = new Mahasiswa.Nilai(thnSemester1, pbo, "C");
        nilai8 = new Mahasiswa.Nilai(thnSemester1, pbo, "C-");
        nilai9 = new Mahasiswa.Nilai(thnSemester1, pbo, "D");
        nilai10 = new Mahasiswa.Nilai(thnSemester1, pbo, "E");
        nilai11 = new Mahasiswa.Nilai(thnSemester1, pbo, "K");
        nilai12 = new Mahasiswa.Nilai(thnSemester1, pbo, "");
        nilai13 = new Mahasiswa.Nilai(thnSemester1,pbo,"Z");
    }
    
    @After
    public void tearDown(){
        
    }
    
    @Test
    public void testGetAngkaAkhirA(){
        Double expectedResult = 4.0;
        Double result = nilai1.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirAMinus(){
        Double expectedResult = 3.67;
        Double result = nilai2.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirBPlus(){
        Double expectedResult = 3.33;
        Double result = nilai3.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirB(){
        Double expectedResult = 3.0;
        Double result = nilai4.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirBMinus(){
        Double expectedResult = 2.67;
        Double result = nilai5.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirCPlus(){
        Double expectedResult = 2.33;
        Double result = nilai6.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirC(){
        Double expectedResult = 2.0;
        Double result = nilai7.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirCMinus(){
        Double expectedResult = 1.67;
        Double result = nilai8.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirD(){
        Double expectedResult = 1.00;
        Double result = nilai9.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirE(){
        Double expectedResult = 0.0;
        Double result = nilai10.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirNull(){
        Double expectedResult = null;
        Double result = nilai11.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirEmpty(){
        Double expectedResult = null;
        Double result = nilai12.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetAngkaAkhirZ(){
        Double expectedResult = null;
        Double result = nilai13.getAngkaAkhir();
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testGetTahunAjaran(){
        int expectedResult = 2016;
        int result = nilai1.getTahunAjaran();
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testGetSemester(){
        Semester expectedResult = Semester.GANJIL;
        Semester result = nilai1.getSemester();
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testGetTahunSemester(){
        TahunSemester expectedResult = new TahunSemester("161");
        TahunSemester result = nilai1.getTahunSemester();
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testToString(){
        String temp = nilai1.toString();
        String temp2 = nilai1.toString();
        boolean bla = false;
        if(temp.compareTo(temp2)==0){ bla=true;
            assertEquals(true, bla);}
    }
    
    @Test
    public void testKronological(){
        Mahasiswa.Nilai.ChronologicalComparator mnc = new Mahasiswa.Nilai.ChronologicalComparator();
        int result = mnc.compare(nilai1, nilai1);
        assertEquals(0, result);
    }
}
