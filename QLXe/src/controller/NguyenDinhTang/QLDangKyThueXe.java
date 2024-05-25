/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NguyenDinhTang;

import controller.ControllerFile;
import java.util.ArrayList;
import model.NguyenDinhTang.ThueXe;
/**
 *
 * @author tangnd
 */
public class QLDangKyThueXe extends ControllerFile{
    public void sortByHoTen(ArrayList<ThueXe> x){
        x.sort((ThueXe o1, ThueXe o2) -> o1.getHoTen().compareTo(o2.getHoTen()));
    }
    
    public void sortByNgayDky(ArrayList<ThueXe> x){
        x.sort((ThueXe o1, ThueXe o2) -> o1.getNgayThue().compareTo(o2.getNgayThue()));
    }
}
