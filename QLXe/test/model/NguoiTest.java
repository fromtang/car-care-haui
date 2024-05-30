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
public class NguoiTest {
    /**
     * Test of getHoTen method, of class Nguoi.
     */
    @Test
    public void testGetHoTen() {
       String hoten = "thanh thuan";
        Nguoi instance = new Nguoi(hoten);
        String expResult = "thanh thuan";
        String result = instance.getHoTen();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHoTen method, of class Nguoi.
     */
    @Test
    public void testSetHoTen() throws Exception {
       
        String hoTen = "thanh thuan";
        Nguoi instance = new Nguoi();
        instance.setHoTen(hoTen);
       
        String expResult = "thanh thuan";
        String result = instance.getHoTen();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getDiaChi method, of class Nguoi.
     */
    @Test
    public void testGetDiaChi()  throws Exception  {
       String diachi = "Ha Noi";
        Nguoi instance = new Nguoi();
        instance.setDiaChi(diachi);
        String expResult = "Ha Noi";
        String result = instance.getDiaChi();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDiaChi method, of class Nguoi.
     */
    @Test
    public void testSetDiaChi() throws Exception {
        String diachi = "Ha Noi";
      
        Nguoi instance = new Nguoi();
        instance.setDiaChi(diachi);
       String expected = "Ha Noi";
       
        assertEquals(expected, instance.getDiaChi());
    }

    /**
     * Test of getSdt method, of class Nguoi.
     */
    @Test
    public void testGetSdt() {
        Nguoi instance = new Nguoi("thanh thuan", "Ha noi", "0123456789");
        String expResult = "0123456789";
        String result = instance.getSdt();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSdt method, of class Nguoi.
     */
    @Test
    public void testSetSdt() throws Exception {
       String sdt = "0123456789";

        Nguoi instance = new Nguoi();
        instance.setSdt(sdt);
        String expected = "0123456789";
        
        assertEquals(expected, instance.getSdt());
    }   
}
