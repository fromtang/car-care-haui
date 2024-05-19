/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.NguyenDinhTang;

import model.Nguoi;
import java.time.LocalDate;

/**
 *
 * @author tangnd
 */
public class ThueXe extends Nguoi{
    LocalDate ngayThue;
    String loaiXe;
    String bienso;

    public ThueXe() {
    }

    public ThueXe(String hoTen, String diaChi, String sdt, LocalDate ngayThue, String loaiXe, String bienso) {
        super(hoTen, diaChi, sdt);
        this.ngayThue = ngayThue;
        this.loaiXe = loaiXe;
        this.bienso = bienso;
    }

  

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiBang(String loaiBang) {
        this.loaiXe = loaiBang;
    }

    public LocalDate getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(LocalDate ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }
    
}
