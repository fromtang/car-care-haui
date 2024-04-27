/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

/**
 *
 * @author tangnd
 */
public interface Controller {
        
    public void writeToFile(Object obj, String fileName);
    
    public Object readDataFromFile(String fileName);   
}
