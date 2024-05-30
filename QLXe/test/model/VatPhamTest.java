/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class VatPhamTest {

    /**
     * Test of getTenVatPham method, of class VatPham.
     */
    @Test
    public void testGetTenVatPham() {

        VatPham instance = new VatPham("Vo xe", 3, 30000);
        String expResult = "Vo xe";
        String result = instance.getTenVatPham();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTenVatPham method, of class VatPham.
     */
    @Test
    public void testSetTenVatPham() throws Exception {
        String tenvatpham = "Vo xe";
        VatPham instance = new VatPham();
        instance.setTenVatPham(tenvatpham);

        String expected = "Vo xe";
        assertEquals(expected, instance.getTenVatPham());
    }

    /**
     * Test of getSoLuong method, of class VatPham.
     */
    @Test
    public void testGetSoLuong() {

        VatPham instance = new VatPham("Vo xe", 3, 30000);
        int expResult = 3;
        int result = instance.getSoLuong();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSoLuong method, of class VatPham.
     */
    @Test
    public void testSetSoLuong() throws Exception {

        int soLuong = 3;
        VatPham instance = new VatPham();
        instance.setSoLuong(soLuong);

        int expected = 3;
        assertEquals(expected, instance.getSoLuong());
    }

    /**
     * Test of getDonGia method, of class VatPham.
     */
    @Test
    public void testGetDonGia() {
        VatPham instance = new VatPham("Vo xe", 3, 30000);
        double expResult = 30000;
        double result = instance.getDonGia();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of setDonGia method, of class VatPham.
     */
    @Test
    public void testSetDonGia() throws Exception {

        double donGia = 550000;
        VatPham instance = new VatPham();
        instance.setDonGia(donGia);

        double expected = 550000;
        assertEquals(expected, instance.getDonGia(), 0);
    }

    /**
     * Test of tongTien method, of class VatPham.
     */
    @Test
    public void testTongTien() {
        VatPham instance = new VatPham("Vo xe", 3, 30000);

        double expResult = 90000;
        double result = instance.tongTien();
        assertEquals(expResult, result, 0);

    }
}
