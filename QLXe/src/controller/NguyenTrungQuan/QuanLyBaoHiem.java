/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NguyenTrungQuan;

import controller.ControllerFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import model.NguyenTrungQuan.BaoHiemXeMay;

/**
 *
 * @author Admin
 */
public class QuanLyBaoHiem extends ControllerFile {
    public BaoHiemXeMay searchByMaBH(TreeSet<BaoHiemXeMay> list, String ma){
        for(BaoHiemXeMay x : list){
            if(x.getMaBH().equals(ma)) return x;
        }
        return null;
    }
    public ArrayList searchByChuXe(TreeSet<BaoHiemXeMay> list,String tenChuXe){
        ArrayList list2 = new ArrayList<>();
        for(BaoHiemXeMay x: list){
            if(x.getCar().getChuSoHuu().getHoTen().equals(tenChuXe)){
                list2.add(x);
            }
        }
        return list2;
    }
    public void SortByCost(ArrayList<BaoHiemXeMay> list){
        Comparator<BaoHiemXeMay> comp = new Comparator<BaoHiemXeMay>(){
            @Override
            public int compare(BaoHiemXeMay xe1,BaoHiemXeMay xe2){
                return (int) (xe1.getCost() - xe2.getCost());
            }
        };
        list.sort(comp);
    }
}
