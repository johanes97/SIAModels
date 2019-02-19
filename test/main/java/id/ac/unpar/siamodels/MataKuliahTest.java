package id.ac.unpar.siamodels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MataKuliahTest {

    String kode = "123";
    int sks = 2;
    String nama = "ABC";

    public MataKuliahTest() {
        this.kode = "123";
        this.sks = 2;
        this.nama = "ABC";
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getKode method, of class MataKuliah.
     */
    @Test
    public void testGetKode() {
        MataKuliahFactory mf = new MataKuliahFactory();
        MataKuliah instance = mf.createMataKuliah("AIF101",sks,nama);
        String expResult = "AIF101";
        String result = instance.getKode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNama method, of class MataKuliah.
     */
    @Test
    public void testGetNama() {
        MataKuliahFactory mf = new MataKuliahFactory();
        MataKuliah instance2 = new MataKuliah(){}; //anonymous, ato ga bikin kelas yg nge extends, trs super
        String expResult = null;
        String result = instance2.getNama();
        assertEquals(expResult, result);
    }

     /**
     * Test of getSks method, of class MataKuliah.
     */
    @Test
    public void testGetSks() {
        MataKuliahFactory mf = new MataKuliahFactory();
        MataKuliah instance = mf.createMataKuliah(kode, sks, nama);
        Integer expResult = sks;
        Integer result = instance.getSks();
        assertEquals(expResult, result);
    }
}
