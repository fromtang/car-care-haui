///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller.CaoDinhNhat;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import model.Nguoi;
//import model.VatPham;
//import model.Xe;
//
///**
// *
// * @author Admin
// */
//public class QuanLyChamSocXe extends Xe implements Serializable{
//    private VatPham vatpham;
//    private LocalDate ngaysua;
//    private String maChamSoc;
//
//    public QuanLyChamSocXe() {
//    }
//
//    public void QuanLyChamSocXe(Vatpham vatpham,LocalDate ngaysua, String maChamSoc,String bienSoXe,String loaiXe,Nguoi ChuSoHuu, ) {
//
//        this.vatpham = vatpham;
//        this.ngaysua = ngaysua;
//        this.maChamSoc = maChamSoc;
//        super(bienSoXe,loaiXe , ChuSoHuu);
//        try{
//            setMaChamSoc(maChamSoc);
//        }
//        catch (Exception e)
//        {
//            System.out.println("co loi du lieu khong hop le!" + e.toString());
//        }
//    }
//
//    public Vatpham getVatpham() {
//        return vatpham;
//    }
//
//    public LocalDate getNgaysua() {
//        return ngaysua;
//    }
//
//    public String getMaChamSoc() {
//        return maChamSoc;
//    }
//
//    public void setVatpham(Vatpham vatpham) {
//        this.vatpham = vatpham;
//    }
//
//    public void setNgaysua(LocalDate ngaysua) {
//        this.ngaysua = ngaysua;
//    }
//
//    public void setMaChamSoc(String maChamSoc) throws Exception {
//        if(maChamSoc.trim().equals("")){
//            throw new Exception("ma cham soc khong duoc de trong");
//        }
//        this.maChamSoc = maChamSoc;
//    }
//
//    @java.lang.Override
//    public java.lang.String toString() {
//        return "QuanLyChamSocXe{" +
//                "vatpham=" + vatpham +
//                ", ngaysua=" + ngaysua +
//                ", maChamSoc='" + maChamSoc + '\'' +
//                '}';
//    }
//}
