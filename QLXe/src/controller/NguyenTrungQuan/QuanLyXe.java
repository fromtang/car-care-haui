/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NguyenTrungQuan;

import controller.ControllerFile;
import java.util.ArrayList;
import java.util.Comparator;
import model.NguyenTrungQuan.XeStore;

/**
 *
 * @author Admin
 */
public class QuanLyXe extends ControllerFile {

   public void sortByNgayNhap(ArrayList<XeStore> x) {
        x.sort((XeStore o1, XeStore o2) -> o2.getNgayNhap().compareTo(o1.getNgayNhap()));
    }
   
    public void sortByLoaiXe(ArrayList<XeStore> x){
        x.sort((XeStore o1, XeStore o2) -> o1.getCar().getLoaiXe().compareTo(o2.getCar().getLoaiXe()));
    }
    public void sortByGiaNhap(ArrayList<XeStore> x){
        x.sort((XeStore o1, XeStore o2) -> Double.compare(o1.getGiaNhap(),o2.getGiaNhap()));
    }
    
}
