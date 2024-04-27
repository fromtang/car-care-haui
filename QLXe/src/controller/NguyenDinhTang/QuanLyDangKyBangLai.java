/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NguyenDinhTang;

import controller.ControllerFile;
import java.util.ArrayList;
import model.NguyenDinhTang.QuanLyDangKyBangLaiXe;
/**
 *
 * @author Admin
 */
public class QuanLyDangKyBangLai extends ControllerFile{
    public void sortByHoTen(ArrayList<QuanLyDangKyBangLaiXe> x){
        x.sort((QuanLyDangKyBangLaiXe o1, QuanLyDangKyBangLaiXe o2) -> o1.getHoTen().compareTo(o2.getHoTen()));
    }
    
    public void sortByNgayDky(ArrayList<QuanLyDangKyBangLaiXe> x){
        x.sort((QuanLyDangKyBangLaiXe o1, QuanLyDangKyBangLaiXe o2) -> o1.getNgayDky().compareTo(o2.getNgayDky()));
    }
}
