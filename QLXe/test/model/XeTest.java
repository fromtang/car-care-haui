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
public class XeTest {

    /**
     * Test of getBienSoXe method, of class Xe.
     */
    @Test
    public void testGetBienSoXe() {
        System.out.println("getBienSoXe");
        Xe instance = new Xe("loai xe", "bien so xe");
        String expResult = "loai xe";
        String result = instance.getBienSoXe();
        assertEquals(expResult, result);

    }

    /**
     * Test of setBienSoXe method, of class Xe.
     */
    @Test
    public void testSetBienSoXe() throws Exception {

        String bienSoXe = "bien so";
        Xe instance = new Xe("loai xe", "bien so");
        instance.setBienSoXe(bienSoXe);

        String expected = "bien so";
        assertEquals(expected, instance.getBienSoXe());
    }

    /**
     * Test of getLoaiXe method, of class Xe.
     */
    @Test
    public void testGetLoaiXe() {

        Xe instance = new Xe("bien so", "loai xe");
        String expResult = "loai xe";
        String result = instance.getLoaiXe();
        assertEquals(expResult, result);

    }

    /**
     * Test of setLoaiXe method, of class Xe.
     */
    @Test
    public void testSetLoaiXe() throws Exception {

        String loaiXe = "Xe may";
        Xe instance = new Xe();
        instance.setLoaiXe(loaiXe);
        assertEquals(loaiXe, instance.getLoaiXe());
    }

    /**
     * Test of getChuSoHuu method, of class Xe.
     */
    @Test
    public void testGetChuSoHuu() {
        Nguoi exp = new Nguoi("thanh thuan", "ha noi", "0123456789");
        Xe instance = new Xe();
        Nguoi expResult = new Nguoi("thanh thuan", "ha noi", "0123456789");
        instance.setChuSoHuu(exp);
        Nguoi result = instance.getChuSoHuu();
        assertEquals(expResult, result);

    }

    /**
     * Test of setChuSoHuu method, of class Xe.
     */
    @Test
    public void testSetChuSoHuu() {
        System.out.println("setChuSoHuu");
        Nguoi chuSoHuu = new Nguoi("thanh thuan", "ha noi", "0123456789");
        Xe instance = new Xe();
        instance.setChuSoHuu(chuSoHuu);
        Nguoi expected = new Nguoi("thanh thuan", "hanoi", "0123456789");

        assertEquals(expected.getHoTen(), chuSoHuu.getHoTen());
    }

}
