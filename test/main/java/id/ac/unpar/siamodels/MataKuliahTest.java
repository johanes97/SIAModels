package id.ac.unpar.siamodels;

import id.ac.unpar.siamodels.matakuliah.AIF101;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MataKuliahTest {

    protected String kode;
    protected int sks;
    protected String nama;

    @Before
    public void setUp() {
        this.kode = "123";
        this.sks = 5;
        this.nama = "ABC";
    }

    /**
     * Test of getKode method, of class MataKuliah.
     */
    @Test
    public void testGetKode() {
        MataKuliahFactory mf = new MataKuliahFactory();
        MataKuliah instance = mf.createMataKuliah("AIF101", this.sks, this.nama);
        MataKuliah expRes = new AIF101();
        String expResult = expRes.getKode();
        String result = instance.getKode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNama method, of class MataKuliah.
     */
    @Test
    public void testGetNama() {
        MataKuliahFactory mf = new MataKuliahFactory();
        //MataKuliah instance = mf.createMataKuliah(kode, sks, nama);
        MataKuliah instance2 = new MataKuliah() {
        }; //anonymous, ato ga bikin kelas yg nge extends, trs super
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
        MataKuliah instance = mf.createMataKuliah(this.kode, this.sks, this.nama);
        Integer expResult = this.sks;
        Integer result = instance.getSks();
        assertEquals(expResult, result);
    }
}
