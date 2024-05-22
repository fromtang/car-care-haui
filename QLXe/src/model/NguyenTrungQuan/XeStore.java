/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.NguyenTrungQuan;

import java.io.Serializable;
import java.time.LocalDate;
import model.Xe;

/**
 *
 * @author admin
 */
public class XeStore implements Serializable{
    private String tenXe;
    private LocalDate ngayNhap;
    private double giaNhap;
    private int soLuong;
    private Xe car;
    public XeStore() {
    }

    public XeStore( Xe car,String tenXe,int soLuong,double giaNhap,LocalDate ngayNhap ) {
        try{ 
            this.car = car;
            this.tenXe = tenXe;
            this.ngayNhap = ngayNhap;
            this.soLuong = soLuong;
            this.giaNhap = giaNhap;
        }catch(Exception e){
            System.out.println("Dữ liệu truyền vào không hợp lệ !.Lỗi :" + e.toString());
        }
    }

    public Xe getCar() {
        return car;
    }

    public void setCar(Xe car) {
        this.car = car;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }
     
     public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }  

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
