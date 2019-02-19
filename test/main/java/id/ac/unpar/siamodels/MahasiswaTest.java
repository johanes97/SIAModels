/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
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
        
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        asd = mkf.createMataKuliah("AIF103",4,"Algoritma dan Struktur Data");
        daa = mkf.createMataKuliah("AIF204",4,"Desain dan Analisis Algoritma");
        mibd = mkf.createMataKuliah("AIF205",4,"Manajemen Informasi dan Basis Data");
        pbw = mkf.createMataKuliah("AIF206", 2, "Pemrograman Berbasis Web");
        adbo = mkf.createMataKuliah("AIF301", 4, "Analisis dan Desain Berorientasi Objek");
        psc = mkf.createMataKuliah("AIF302",4,"Pengantar Sistem Cerdas");
        
        TreeMap<LocalDate,Integer> toefl = new TreeMap<>();
        LocalDate tanggal = LocalDate.parse("2018-09-02");
        int skor = 100;
        toefl.put(tanggal, skor);
        
        
        dosenPBO1 = new Dosen ("1234","Bobo");
        dosenASD1= new Dosen("10293","Bibi");
        dosenDAA1=new Dosen("1256","Bubu");
        dosenMIBD1=new Dosen("1236","Didi");
        dosenPBW1=new Dosen("7479","Dudu");
        dosenADBO1=new Dosen("9087","Dede");
        
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
    
    @Test(expected = NumberFormatException.class)
    /**
     * mengetes exception jika saat instansiasi Mahasiswa NPM yang dimasukan tidak valid
     */
    public void testMahasiswaNumberFormatException(){
        Mahasiswa test = new Mahasiswa("01asdj-123");
    }
    
    @Test
    /**
     * mengetest method: void setPhotoPath(String photoPath)
     */
    public void testSetPhotoPath(){
        Mahasiswa test = new Mahasiswa("2016730070");
        test.setPhotoPath("https://studentportal.unpar.ac.id/user/2016730070/photo/image.jpg");
    }
    
    @Test
    /**
     * Mengetes method: String getPhotoPath()
     */
    public void testGetPhotoPath(){
        Mahasiswa test = new Mahasiswa("2016730070");
        test.setPhotoPath("https://studentportal.unpar.ac.id/user/2016730070/photo/image.jpg");
        String expectedResult = "https://studentportal.unpar.ac.id/user/2016730070/photo/image.jpg";
        String result = test.getPhotoPath();
        assertEquals(expectedResult, result);
    }
    
    private List<JadwalKuliah> getDummyJadwalKuliah(){
        MataKuliah pbo,asd,daa;
        Dosen dosenPBO1,dosenASD1,dosenDAA1;
        JadwalKuliah jadkulDAA,jadkulASD,jadkulPBO;
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        asd = mkf.createMataKuliah("AIF103",4,"Algoritma dan Struktur Data");
        daa = mkf.createMataKuliah("AIF204",4,"Desain dan Analisis Algoritma");
        
        dosenPBO1 = new Dosen ("1234","Bobo");
        dosenASD1= new Dosen("10293","Bibi");
        dosenDAA1=new Dosen("1256","Bubu");
        
        jadkulDAA = new JadwalKuliah(daa, 'A', dosenDAA1, "Selasa", "07:00-09:00", "10317");
        jadkulASD = new JadwalKuliah(asd,'B',dosenASD1,"Selasa","09:00-11:00","10316");
        jadkulPBO = new JadwalKuliah(pbo,'C',dosenPBO1,"Selasa","09:00-11:00","10317");
        
        List<JadwalKuliah> list = new LinkedList<>();
        
        list.add(jadkulDAA);
        list.add(jadkulPBO);
        list.add(jadkulASD);
        return list;
    }
    @Test
    /**
     * mengetes method : void setJadwalKuliahList(List<JadwalKuliah> jadwalKuliahList)
     */
    public void testSetJadwalKuliahList(){
        Mahasiswa test = new Mahasiswa("2016730070");
        test.setJadwalKuliahList(this.getDummyJadwalKuliah());
    }
   
    @Test
    /**
     * 
     */
    public void testGetJadwalKuliahList(){
        Mahasiswa test = new Mahasiswa("2016730070");        
        List<JadwalKuliah> expectedResult = this.getDummyJadwalKuliah();       
        test.setJadwalKuliahList(expectedResult);
        List<JadwalKuliah> result = test.getJadwalKuliahList();
        assertEquals(expectedResult, result);
    }
    @Test
    /**
     * mengetes konversi NPM ke tahun angkatan
     */
    public void testGetTahunAngkatan(){
        Mahasiswa instance = new Mahasiswa("2016730070");
        int expectedResult = 2016;
        int result = instance.getTahunAngkatan();
        assertEquals(expectedResult, result);
    }
    
    
    private SortedMap<LocalDate,Integer> getDummyTOEFLData(){
        LocalDate tanggalTest1 = LocalDate.parse("2018-09-01");
        LocalDate tanggalTest2 = LocalDate.parse("2018-08-09");
        int nilaiTest1 = 200;
        int nilaiTest2 = 300;
        SortedMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<>();
        nilaiTOEFL.put(tanggalTest1, nilaiTest1);
        nilaiTOEFL.put(tanggalTest2, nilaiTest2);
        return nilaiTOEFL;
    }
    @Test
    /**
     * mengetes method setNilaiTOEFL(SortedMap<LocalDate, Integer>)
     */
    public void testSetNilaiTOEFL(){
        Mahasiswa instance = new Mahasiswa("2016730070");
        
        instance.setNilaiTOEFL(this.getDummyTOEFLData());
    }
    
    @Test
    /**
     * mengetes method SortedMap<LocalDate, Integer> getNilaiTOEFL()
     */
    public void testGetNilaiTOEFL(){
        Mahasiswa test = new Mahasiswa("2016730070");
        test.setNilaiTOEFL(this.getDummyTOEFLData());
        SortedMap<LocalDate,Integer> expectedResult = this.getDummyTOEFLData();
        SortedMap<LocalDate,Integer> result = test.getNilaiTOEFL();
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testGetNama(){
        Mahasiswa test = new Mahasiswa("2016730070");
        test.setNama("Irvan Hardyanto");
        assertEquals("Irvan Hardyanto",test.getNama());
    }
    
    @Test
    /**
     * mengetes method toString milik kelas Mahasiswa
     */
    public void testToString(){
        Mahasiswa test = new Mahasiswa("2016730070");
        test.setNama("Irvan Hardyanto");
        String expectedResult = "Mahasiswa [npm=2016730070, nama=Irvan Hardyanto]";
        String result = test.toString();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetes method getEmailAddress(): String
     * Pada mahasiswa angkatan 2016 ke bawah
     */
    public void testGetEmailAddress(){
        Mahasiswa test = new Mahasiswa("2016730070");
        String expectedResult = "7316070@student.unpar.ac.id";
        String result = test.getEmailAddress();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetes method getEmailAddress(): String
     * Pada mahasiswa angkatan 2017
     */
    public void testGetEmailAddress2017(){
        Mahasiswa test = new Mahasiswa("2017730070");
        String expectedResult = "2017730070@student.unpar.ac.id";
        String result = test.getEmailAddress();
    }
    
    @Test
    /**
     * Mengetes method calculateIPKumulatif 
     */
    public void testCalculateIPKumulatif(){
        Double expectedResult = 3.0;
        Double result = instance.calculateIPKumulatif();
        assertEquals(expectedResult,result);
    }
    
    @Test
    /**
     * Mengetes method calculate IPKumulatif
     * pada objek mahasiswa yang riwayat nilai nya kosong
     */
    public void testCalculateIPKumulatifNaN(){
        Mahasiswa test = new Mahasiswa("2016730070");
        Double expectedResult = Double.NaN;
        Double result = test.calculateIPKumulatif();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method calculateIPKumulatif pada objek mahasiswa
     * yang tidak memiliki nilai akhir
     */
    public void testCalculateIPKumulatifNull(){
        Mahasiswa test = new Mahasiswa("2016730070");
        List<Mahasiswa.Nilai> listNilai = new ArrayList<>();
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        MataKuliah pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        MataKuliah asd = mkf.createMataKuliah("AIF103",4,"Algoritma dan Struktur Data");
        
        TahunSemester thnSemester1 = new TahunSemester("161");
        TahunSemester thnSemester2 = new TahunSemester("162");
        
        Mahasiswa.Nilai nilaiPBO = new Mahasiswa.Nilai(thnSemester1, pbo, "");
        Mahasiswa.Nilai nilaiASD = new Mahasiswa.Nilai(thnSemester2,asd,"");
        
        test.getRiwayatNilai().add(nilaiASD);
        test.getRiwayatNilai().add(nilaiPBO);
        Double expectedResult = Double.NaN;
        Double result = test.calculateIPKumulatif();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetes method calculateIPLulus
     */
    public void testCalculateIPLulus(){
        Double expectedResult = 96.0/28.0;
        Double result = instance.calculateIPLulus();
        assertEquals(expectedResult,result);
    }
    
    @Test
    /**
     * Mengetes method calculateIPS
     */
    public void testCalculateIPS(){
        Double expectedResult  = 4.0;
        Double result = instance.calculateIPS();
        assertEquals(expectedResult,result);
    }
    
    
    @Test(expected= ArrayIndexOutOfBoundsException.class)
    /**
     * Mengetes method calculateIPS pada mahasiswa yang riwayat nilai nya kosong
     */
    public void testCalculateIPSErrorArrayOutOfBound(){
        Mahasiswa test = new Mahasiswa("2016730070");
        test.calculateIPS();
    }
    @Test
    /**
     * Mengetes method calculateIPTempuh(boolean lulusSaja)
     * dengan parameter lulusSaja bernilai true
     */
    public void testCalculateIPTempuhTrue(){
        Double expectedResult = 96/28.0;
        Double result = instance.calculateIPTempuh(true);
        assertEquals(expectedResult,result);
    }
    
    @Test
    /**
     * Mengetes method calculateIPTempuh(boolean lulusSaja)
     * dengan parameter lulusSaja bernilai false, pada mahasiswa yang tidak memiliki nilai akhir pada mata kuliah yang diambil
     */
    public void testCalculateIPTempuhNull(){
        Mahasiswa test = new Mahasiswa("2016730070");
        List<Mahasiswa.Nilai> listNilai = new ArrayList<>();
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        MataKuliah pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        MataKuliah asd = mkf.createMataKuliah("AIF103",4,"Algoritma dan Struktur Data");
        
        TahunSemester thnSemester1 = new TahunSemester("161");
        TahunSemester thnSemester2 = new TahunSemester("162");
        
        Mahasiswa.Nilai nilaiPBO = new Mahasiswa.Nilai(thnSemester1, pbo, "");
        Mahasiswa.Nilai nilaiASD = new Mahasiswa.Nilai(thnSemester2,asd,"");
        
        test.getRiwayatNilai().add(nilaiASD);
        test.getRiwayatNilai().add(nilaiPBO);
        Double expectedResult = Double.NaN;
        Double result = test.calculateIPTempuh(false);
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetes method calculateIPTempuh(boolean lulusSaja)
     * pada objek mahasiswa yang riwayat nilainya kosong.
     */
    public void testCalculateIPTempuhNaN(){
        Mahasiswa test = new Mahasiswa("2016730070");
        Double expectedResult = Double.NaN;
        Double result = test.calculateIPTempuh(false);
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetes method calculateIPTempuh(boolean lulusSaja)
     * dengan parameter lulusSaja bernilai false
     */
    public void testCalculateIPTempuhFalse(){
        Double expectedResult = 96/28.0;
        Double result = instance.calculateIPTempuh(false);
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetest method calculateSKSLulus
     */
    public void testCalculateSKSLulus(){
        int expectedResult = 28;
        int result = instance.calculateSKSLulus();
        assertEquals(expectedResult,result);
    }
    
    @Test
    /**
     * Mengetes method calculateSKSTempuh(boolean lulusSaja)
     * dengan parameter lulusSaja = true
     */
    public void testCalculateSKSTempuhTrue(){
        int expectedResult = 28;
        int result = instance.calculateSKSTempuh(true);
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetes method calculateSKSTempuh(boolean lulusSaja)
     * dengan parameter lulusSaja = false
     */
    public void testCalculateSKSTempuhFalse(){
        int expectedResult = 28;
        int result = instance.calculateSKSTempuh(false);
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetes method calculateSKSTempuh(boolean lulusSaja)
     * dengan parameter lulusSaja bernilai false
     * pada mahasiswa yang tidak memiliki nilai akhir di seluruh mata kuliah yang diambil
     */
    public void testCalculateSKSTempuhNull(){
        Mahasiswa test = new Mahasiswa("2016730070");
        List<Mahasiswa.Nilai> listNilai = new ArrayList<>();
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        MataKuliah pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        MataKuliah asd = mkf.createMataKuliah("AIF103",4,"Algoritma dan Struktur Data");
        
        TahunSemester thnSemester1 = new TahunSemester("161");
        TahunSemester thnSemester2 = new TahunSemester("162");
        
        Mahasiswa.Nilai nilaiPBO = new Mahasiswa.Nilai(thnSemester1, pbo, "");
        Mahasiswa.Nilai nilaiASD = new Mahasiswa.Nilai(thnSemester2,asd,"");
        
        test.getRiwayatNilai().add(nilaiASD);
        test.getRiwayatNilai().add(nilaiPBO);
        
        int expectedResult = 0;
        int result = test.calculateSKSTempuh(false);
        assertEquals(expectedResult, result);
    }
   
    @Test
    /**
     * Test method calculateTahunSemesterAktif():Set<TahunSemester> 
     */
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
    /**
     * test untuk mata kuliah yang sudah lulus
     */
    public void testHasLulusMataKuliahWithRiwayatNilai(){
        assertEquals(true,instance.hasLulusKuliah("AIF101"));
        assertEquals(true,instance.hasLulusKuliah("AIF103"));
        assertEquals(true,instance.hasLulusKuliah("AIF204"));
        assertEquals(true,instance.hasLulusKuliah("AIF205"));
        assertEquals(true,instance.hasLulusKuliah("AIF206"));
        assertEquals(true,instance.hasLulusKuliah("AIF301"));
        assertEquals(true,instance.hasLulusKuliah("AIF302"));
    }
    
    @Test
    /**
     * test dengan objek mahasiswa yang belum memiliki riwayat nilai
     */
    public void testHasLulusMataKuliahWithoutRiwayatNilai(){
        Mahasiswa instance = new Mahasiswa("2016730070");
        boolean expectedResult = false;
        boolean result = instance.hasLulusKuliah("AIF302");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * Mengetest method: boolean hasTempuhKuliah(String kodeMataKuliah) 
     */
    public void testHasTempuhMataKuliah(){
        assertEquals(true,instance.hasTempuhKuliah("AIF101"));
        assertEquals(true,instance.hasTempuhKuliah("AIF103"));
        assertEquals(true,instance.hasTempuhKuliah("AIF204"));
        assertEquals(true,instance.hasTempuhKuliah("AIF205"));
        assertEquals(true,instance.hasTempuhKuliah("AIF206"));
        assertEquals(true,instance.hasTempuhKuliah("AIF301"));
        assertEquals(true,instance.hasTempuhKuliah("AIF302"));
    }
    
    @Test
    /**
     * test method hasTempuhKuliah(String kodeMataKuliah)
     * pada objek mahasiswa yang belum memiliki riwayat nilai
     */
    public void testHasTempuhMataKuliahWithoutRiwayatNilai(){
        Mahasiswa test = new Mahasiswa("2016730070");
        boolean result = test.hasTempuhKuliah("AIF301");
        boolean expectedResult = false;
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * test dengan objek mahasiswa yang sudah memiliki riwayat nilai
     */
    public void testGetNilaiAkhirMataKuliahWithRiwayatNilai(){
        Double expectedResult = 0.00;
        Double result = instance.getNilaiAkhirMataKuliah("AIF302");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * test dengan objek mahasiswa yang BELUM memiliki riwayat nilai
     */
    public void testGetNilaiAkhirMataKuliahWithoutRiwayatNilai(){
        Mahasiswa instance = new Mahasiswa("2016730070");
        Double expectedResult = 0.0;
        Double result = instance.getNilaiAkhirMataKuliah("AIF302");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * test dengan objek mahasiswa yang BELUM memiliki riwayat nilai
     */
    public void testCalculateIPKLulus(){
        try{
            double temp = instance.calculateIPKLulus();
            double expect = 96/28.0;
            boolean tem = false;
            if(temp == expect) tem = true;
            assertEquals(true, tem);
        }
        catch(Exception e){}
    }
    
    @Test
    /**
     * test dengan objek mahasiswa yang BELUM memiliki riwayat nilai
     */
    public void testCalculateIPKTempuh(){
        try{
            double temp = instance.calculateIPKTempuh(true);
            double expect = 96/28.0;
            boolean tem = false;
            if(temp == expect) tem = true;
            assertEquals(true, tem);
        }
        catch(Exception e){}
    }
}