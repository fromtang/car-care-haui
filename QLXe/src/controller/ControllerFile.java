/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author tangnd
 */

public class ControllerFile implements Controller{
    @Override
    public void writeToFile(Object obj, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(obj);
            }
        } catch (IOException ex) {
        }
    }
    
    @Override
    public Object readDataFromFile(String fileName) {
        Object kq = null;
        File file = new File(fileName);
        if (file.length() > 0) {
            try {
                file.createNewFile();
                try (FileInputStream fos = new FileInputStream(file); ObjectInputStream oos = new ObjectInputStream(fos)) {
                    kq = oos.readObject();
                }
            } catch (IOException | ClassNotFoundException ex) {
            }
        }
        return kq;
    }
}
