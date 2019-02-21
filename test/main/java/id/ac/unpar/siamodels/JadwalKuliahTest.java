/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
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
public class JadwalKuliahTest {
    JadwalKuliah jadwal1,jadwal2,jadwal3;
    MataKuliah pbo,asd,daa;
     @BeforeClass
    public static void setUpClass(){
        
    }
    
    @AfterClass
    public static void tearDownClass(){
        
    }
    
    @Before
    public void setUp(){
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        asd = mkf.createMataKuliah("AIF103",4,"Algoritma dan Struktur Data");
        daa = mkf.createMataKuliah("AIF204",4,"Desain dan Analisis Algoritma");
        Dosen dosenPBO1,dosenASD1,dosenDAA1;
        dosenPBO1 = new Dosen ("1234","Bobo");
        dosenASD1= new Dosen("10293","Bibi");
        dosenDAA1=new Dosen("1256","Bubu");
        jadwal1 = new JadwalKuliah(pbo,'A',dosenPBO1,"Senin","07.00-09.00","9017");
    }
    
    @After
    public void tearDown(){
        
    }
    
    @Test
    /**
     * test method MataKuliah getMataKuliah() pada kelas JadwalKuliah
     */
    public void testGetMataKuliah(){
        MataKuliah expectedResult = pbo;
        MataKuliah result = jadwal1.getMataKuliah();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * test method void setMataKuliah(MataKuliah mataKuliah) pada kelas JadwalKuliah
     */
    public void testSetMataKuliah(){
        jadwal1.setMataKuliah(pbo);
    }
    
    @Test
    /**
     * test method Character getKelas() pada kelas JadwalKuliah
     */
    public void testGetKelas(){
        Character expectedResult = 'A';
        Character result = jadwal1.getKelas();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * test method void setKelas(Character kelas) pada kelas JadwalKuliah
     */
    public void testSetKelas(){
        jadwal1.setKelas('B');
    }
    
    @Test
    /**
     * test method DayOfWeek getHari() pada kelas JadwalKuliah
     */
    public void testGetHari(){
        DayOfWeek expectedResult = DayOfWeek.MONDAY;
        DayOfWeek result = jadwal1.getHari();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * test method void setHari(DayOfWeek hari) pada kelas JadwalKuliah
     */
    public void testSetHari(){
        jadwal1.setHari(DayOfWeek.FRIDAY);
    }
    
    @Test
    /**
     * test method LocalTime getWaktuMulai() pada kelas JadwalKuliah
     */
    public void testGetWaktuMulai(){
        LocalTime expectedResult = LocalTime.parse("07:00");
        LocalTime result = jadwal1.getWaktuMulai();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * test method void setWaktuMulai(LocalTime waktuMulai) pada kelas JadwalKuliah
     */
    public void testSetWaktuMulai(){
        jadwal1.setWaktuMulai(LocalTime.parse("07:00"));
    }
    
    @Test
    /**
     * test method LocalTime getWaktuSelesai() pada kelas JadwalKuliah
     */
    public void testGetWaktuSelesai(){
        LocalTime expectedResult = LocalTime.parse("09:00");
        LocalTime result = jadwal1.getWaktuSelesai();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * test method void setWaktuSelesai(LocalTime waktuSelesai) pada kelas JadwalKuliah
     */
    public void testSetWaktuSelesai(){
        jadwal1.setWaktuSelesai(LocalTime.parse("09:00"));
    }
    
    @Test
    /**
     * mengetes method String getLokasi() pada kelas JadwalKuliah
     */
    public void testGetLokasi(){
        String expectedResult="9017";
        String result = jadwal1.getLokasi();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method void setLokasi(String lokasi) pada kelas JadwalKuliah
     */
    public void testSetLokasi(){
        jadwal1.setLokasi("9017");
    }
    
    @Test
    /**
     * mengetes method Dosen getPengajar() pada kelas JadwalKuliah
     */
    public void testGetPengajar(){
        Dosen expectedResult = new Dosen ("1234","Bobo");
        Dosen result = jadwal1.getPengajar();
        assertEquals(expectedResult,result);
    }
    
    @Test
    /**
     * mengetes method void setPengajar(Dosen pengajar) pada kelas JadwalKuliah
     */
    public void testSetPengajar(){
        jadwal1.setPengajar(new Dosen ("1234","Bobo"));
    }
    
    @Test
    /**
     * mengetes method String getWaktuString() pada kelas JadwalKuliah
     */
    public void testGetWaktuString(){
        String expectedResult = "07:00-09:00";
        String result = jadwal1.getWaktuString();
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string "senin"
     * dan return value (yang diharapkan) DayOfWeek.MONDAY pada kelas JadwalKuliah
     */
    public void testIndonesianToDayOfWeekSenin(){
        DayOfWeek expectedResult = DayOfWeek.MONDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("senin");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string "selasa"
     * dan return value (yang diharapkan) DayOfWeek.TUESDAY pada kelas JadwalKuliah
     */
    public void testIndonesianToDayOfWeekSelasa(){
        DayOfWeek expectedResult = DayOfWeek.TUESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("selasa");
        assertEquals(expectedResult, result);
    }
    
    @Test
     /**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string "rabu"
     * dan return value (yang diharapkan) DayOfWeek.WEDNESDAY pada kelas JadwalKuliah
     */
    public void testIndonesianToDayOfWeekRabu(){
        DayOfWeek expectedResult = DayOfWeek.WEDNESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("rabu");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string "kamis"
     * dan return value (yang diharapkan) DayOfWeek.THURSDAY pada kelas JadwalKuliah
     */
    public void testIndonesianToDayOfWeekKamis(){
        DayOfWeek expectedResult = DayOfWeek.THURSDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("kamis");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string "jumat"
     * dan return value (yang diharapkan) DayOfWeek.FRIDAY pada kelas JadwalKuliah
     */
    public void testIndonesianToDayOfWeekJumat(){
        DayOfWeek expectedResult = DayOfWeek.FRIDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("jumat");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string "sabtu"
     * dan return value (yang diharapkan) DayOfWeek.SATURDAY pada kelas JadwalKuliah
     */
    public void testIndonesianToDayOfWeekSabtu(){
        DayOfWeek expectedResult = DayOfWeek.SATURDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("sabtu");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string "minggu"
     * dan return value (yang diharapkan) DayOfWeek.SUNDAY pada kelas JadwalKuliah
     */
    public void testIndonesianToDayOfWeekMinggu(){
        DayOfWeek expectedResult = DayOfWeek.SUNDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("minggu");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string selain senin,selasa,rabu,kamis,jumat,sabtu,minggu
     * dan return value (yang diharapkan) null pada kelas JadwalKuliah
     */
    public void testIndonesianToDayOfWeekNull(){
        DayOfWeek expectedResult = null;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("ahad");
        assertEquals(expectedResult, result);
    }
    
    @Test
    /**
     * mengetes konstruktor kosong pada kelas JadwalKuliah
     */
    public void testNewJadwalKuliah(){
        jadwal2 = new JadwalKuliah();
    }
}
