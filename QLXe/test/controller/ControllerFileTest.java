/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import java.io.File;
import java.io.IOException;
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
public class ControllerFileTest {
     private ControllerFile controllerFile;
    private final String testFileName = "testfile.dat";
    
    public ControllerFileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        controllerFile = new ControllerFile();
    }
    
    @After
    public void tearDown() {
         File file = new File(testFileName);
        if (file.exists()) {
            file.delete();
        }
    }

    /**
     * Test of writeToFile method, of class ControllerFile.
     */
    @Test
    public void testWriteToFile() {
        String data = "Hello, World!";
        controllerFile.writeToFile(data, testFileName);

        File file = new File(testFileName);
        assertTrue(file.exists());
        assertTrue(file.length() > 0);
    }

    /**
     * Test of readDataFromFile method, of class ControllerFile.
     */
    @Test
    public void testReadDataFromFile() {
         String data = "Hello, World!";
        controllerFile.writeToFile(data, testFileName);

        Object result = controllerFile.readDataFromFile(testFileName);
        assertNotNull(result);
        assertTrue(result instanceof String);
        assertEquals(data, result);
    }
    
    // Test 
     @Test
    public void testReadFromEmptyFile() {
        File file = new File(testFileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            fail("Could not create test file.");
        }

        Object result = controllerFile.readDataFromFile(testFileName);
        assertNull(result);
    }
    
}
