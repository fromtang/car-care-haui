/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.NguyenTrungQuan;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import model.Xe;

/**
 *
 * @author admin
 */
public class BaoHiemXeMay implements Serializable{
    private String MaBH;
    private Xe car;
    private LocalDate timeStart,timeEnd;
    private double cost;
    private int duration;

    public BaoHiemXeMay() {
    }

    public BaoHiemXeMay(String MaBH, Xe car, LocalDate timeStart, double cost, int duration) {
        try{
            this.MaBH = MaBH;
            this.car = car;
            this.timeStart = timeStart;
            this.duration = duration;
            this.timeEnd = timeStart.plusYears(duration);
            switch (this.car.getLoaiXe()) {
                case "Dưới 50cc":
                    this.cost = duration*55000;
                    break;
                case "Trên 50cc":
                    this.cost = duration*60000;
                    break;
                default:
                    this.cost = duration*290000;
                    break;
            }
            
            
        }catch(Exception e){
            System.out.println("Dữ liệu truyền vào không hợp lệ !.Lỗi :" + e.toString());
        }
    }
    public String getMaBH() {
        return MaBH;
    }

    public void setMaBH(String MaBH) throws Exception {
        if (MaBH.trim().equals("")) {
            throw new Exception("Mã bảo hiểm không được để trống");
        }
        this.MaBH = MaBH;
    }
    public Xe getCar() {
        return car;
    }

    public void setCar(Xe car) {
        this.car = car;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) throws Exception {
        if(duration == 0){
            throw new Exception("Số năm phải khác 0");
        }
        this.duration = duration;
    }

    public LocalDate getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDate timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDate getTimeEnd() {
        return timeEnd;
    }

  
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.car);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(getClass() != obj.getClass()) return false;
        final BaoHiemXeMay other = (BaoHiemXeMay) obj;
        return Objects.equals(this.car, other.car);
    }

            
}
