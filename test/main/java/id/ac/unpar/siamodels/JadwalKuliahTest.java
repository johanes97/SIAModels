package id.ac.unpar.siamodels;

import java.time.DayOfWeek;
import java.time.LocalTime;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JadwalKuliahTest {

    JadwalKuliah jadwal1, jadwal2, jadwal3;
    MataKuliah pbo, asd, daa;

    @Before
    public void setUp() {
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        pbo = mkf.createMataKuliah("AIF101", 6, "Pemrograman Berorientasi Objek");
        asd = mkf.createMataKuliah("AIF103", 4, "Algoritma dan Struktur Data");
        daa = mkf.createMataKuliah("AIF204", 4, "Desain dan Analisis Algoritma");
        Dosen dosenPBO1, dosenASD1, dosenDAA1;
        dosenPBO1 = new Dosen("1234", "Bobo");
        dosenASD1 = new Dosen("10293", "Bibi");
        dosenDAA1 = new Dosen("1256", "Bubu");
        jadwal1 = new JadwalKuliah(pbo, 'A', dosenPBO1, "Senin", "07.00-09.00", "9017");
    }

	/**
     * test method MataKuliah getMataKuliah() pada kelas JadwalKuliah
     */
    @Test
    public void testGetMataKuliah() {
        MataKuliah expectedResult = pbo;
        MataKuliah result = jadwal1.getMataKuliah();
        assertEquals(expectedResult, result);
    }

	/**
     * test method void setMataKuliah(MataKuliah mataKuliah) pada kelas
     * JadwalKuliah
     */
    @Test
    public void testSetMataKuliah() {
        jadwal1.setMataKuliah(pbo);
    }

	/**
     * test method Character getKelas() pada kelas JadwalKuliah
     */
    @Test
    public void testGetKelas() {
        Character expectedResult = 'A';
        Character result = jadwal1.getKelas();
        assertEquals(expectedResult, result);
    }

	/**
     * test method void setKelas(Character kelas) pada kelas JadwalKuliah
     */
    @Test
    public void testSetKelas() {
        jadwal1.setKelas('B');
    }

	/**
     * test method DayOfWeek getHari() pada kelas JadwalKuliah
     */
    @Test
    public void testGetHari() {
        DayOfWeek expectedResult = DayOfWeek.MONDAY;
        DayOfWeek result = jadwal1.getHari();
        assertEquals(expectedResult, result);
    }

	/**
     * test method void setHari(DayOfWeek hari) pada kelas JadwalKuliah
     */
    @Test
    public void testSetHari() {
        jadwal1.setHari(DayOfWeek.FRIDAY);
    }

    @Test
    /**
     * test method LocalTime getWaktuMulai() pada kelas JadwalKuliah
     */
    public void testGetWaktuMulai() {
        LocalTime expectedResult = LocalTime.parse("07:00");
        LocalTime result = jadwal1.getWaktuMulai();
        assertEquals(expectedResult, result);
    }

	/**
     * test method void setWaktuMulai(LocalTime waktuMulai) pada kelas
     * JadwalKuliah
     */
    @Test
    public void testSetWaktuMulai() {
        jadwal1.setWaktuMulai(LocalTime.parse("07:00"));
    }

	/**
     * test method LocalTime getWaktuSelesai() pada kelas JadwalKuliah
     */
    @Test
    public void testGetWaktuSelesai() {
        LocalTime expectedResult = LocalTime.parse("09:00");
        LocalTime result = jadwal1.getWaktuSelesai();
        assertEquals(expectedResult, result);
    }

	/**
     * test method void setWaktuSelesai(LocalTime waktuSelesai) pada kelas
     * JadwalKuliah
     */
    @Test  
    public void testSetWaktuSelesai() {
        jadwal1.setWaktuSelesai(LocalTime.parse("09:00"));
    }

	/**
     * mengetes method String getLokasi() pada kelas JadwalKuliah
     */
    @Test
    public void testGetLokasi() {
        String expectedResult = "9017";
        String result = jadwal1.getLokasi();
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method void setLokasi(String lokasi) pada kelas JadwalKuliah
     */
    @Test
    public void testSetLokasi() {
        jadwal1.setLokasi("9017");
    }

	/**
     * mengetes method Dosen getPengajar() pada kelas JadwalKuliah
     */
    @Test
    public void testGetPengajar() {
        Dosen expectedResult = new Dosen("1234", "Bobo");
        Dosen result = jadwal1.getPengajar();
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method void setPengajar(Dosen pengajar) pada kelas JadwalKuliah
     */
    @Test
    public void testSetPengajar() {
        jadwal1.setPengajar(new Dosen("1234", "Bobo"));
    }

	/**
     * mengetes method String getWaktuString() pada kelas JadwalKuliah
     */
    @Test
    public void testGetWaktuString() {
        String expectedResult = "07:00-09:00";
        String result = jadwal1.getWaktuString();
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string
     * "senin" dan return value (yang diharapkan) DayOfWeek.MONDAY pada kelas
     * JadwalKuliah
     */
    @Test
    public void testIndonesianToDayOfWeekSenin() {
        DayOfWeek expectedResult = DayOfWeek.MONDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("senin");
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string
     * "selasa" dan return value (yang diharapkan) DayOfWeek.TUESDAY pada kelas
     * JadwalKuliah
     */
    @Test
    public void testIndonesianToDayOfWeekSelasa() {
        DayOfWeek expectedResult = DayOfWeek.TUESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("selasa");
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string
     * "rabu" dan return value (yang diharapkan) DayOfWeek.WEDNESDAY pada kelas
     * JadwalKuliah
     */
    @Test
    public void testIndonesianToDayOfWeekRabu() {
        DayOfWeek expectedResult = DayOfWeek.WEDNESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("rabu");
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string
     * "kamis" dan return value (yang diharapkan) DayOfWeek.THURSDAY pada kelas
     * JadwalKuliah
     */
    @Test
    public void testIndonesianToDayOfWeekKamis() {
        DayOfWeek expectedResult = DayOfWeek.THURSDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("kamis");
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string
     * "jumat" dan return value (yang diharapkan) DayOfWeek.FRIDAY pada kelas
     * JadwalKuliah
     */
    @Test
    public void testIndonesianToDayOfWeekJumat() {
        DayOfWeek expectedResult = DayOfWeek.FRIDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("jumat");
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string
     * "sabtu" dan return value (yang diharapkan) DayOfWeek.SATURDAY pada kelas
     * JadwalKuliah
     */
    @Test
    public void testIndonesianToDayOfWeekSabtu() {
        DayOfWeek expectedResult = DayOfWeek.SATURDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("sabtu");
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string
     * "minggu" dan return value (yang diharapkan) DayOfWeek.SUNDAY pada kelas
     * JadwalKuliah
     */
    @Test
    public void testIndonesianToDayOfWeekMinggu() {
        DayOfWeek expectedResult = DayOfWeek.SUNDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("minggu");
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes method DayOfWeek indonesianToDayOfWeek() dengan parameter string
     * selain senin,selasa,rabu,kamis,jumat,sabtu,minggu dan return value (yang
     * diharapkan) null pada kelas JadwalKuliah
     */
    @Test
    public void testIndonesianToDayOfWeekNull() {
        DayOfWeek expectedResult = null;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek("ahad");
        assertEquals(expectedResult, result);
    }

	/**
     * mengetes konstruktor kosong pada kelas JadwalKuliah
     */
    @Test
    public void testNewJadwalKuliah() {
        jadwal2 = new JadwalKuliah();
    }
}
