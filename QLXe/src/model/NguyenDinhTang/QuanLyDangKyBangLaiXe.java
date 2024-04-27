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
public class QuanLyDangKyBangLaiXe extends Nguoi{
    LocalDate ngayDky;
    String loaiBang;

    public QuanLyDangKyBangLaiXe() {
    }

    public QuanLyDangKyBangLaiXe(String hoTen, String diaChi, String sdt, LocalDate ngayDky, String loaiBang) {
        super(hoTen, diaChi, sdt);
        this.ngayDky = ngayDky;
        this.loaiBang = loaiBang;
    }

    public LocalDate getNgayDky() {
        return ngayDky;
    }

    public void setNgayDky(LocalDate ngayDky) {
        this.ngayDky = ngayDky;
    }

    public String getLoaiBang() {
        return loaiBang;
    }

    public void setLoaiBang(String loaiBang) {
        this.loaiBang = loaiBang;
    }
}
