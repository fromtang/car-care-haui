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
public class LoginTest {

    /**
     * Test of getTenDangNhap method, of class Login.
     */
    @Test
    public void testGetTenDangNhap() {

        Login instance = new Login();
        String expResult = "admin";
        String result = instance.getTenDangNhap();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTenDangNhap method, of class Login.
     */
    @Test
    public void testSetTenDangNhap() {

        String tenDangNhap = "admin";
        Login instance = new Login();
        instance.setTenDangNhap(tenDangNhap);
        String expected = "admin";
        assertEquals(expected, instance.getTenDangNhap());
    }

    /**
     * Test of getMatKhau method, of class Login.
     */
    @Test
    public void testGetMatKhau() {

        Login instance = new Login();
        String expResult = "admin";
        String result = instance.getMatKhau();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMatKhau method, of class Login.
     */
    @Test
    public void testSetMatKhau() {
        
        String matKhau = "123456";
        
        Login instance = new Login();
        instance.setMatKhau(matKhau);
        
        String expected = "123456";
        assertEquals(expected, instance.getMatKhau());
      
    }

}
