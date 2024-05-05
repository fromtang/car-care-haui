
package controller.TrinhDucThang;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import model.TrinhDucThang.QuanLyHoaDon;


public class ControllerQuanLyHoaDon {
    public QuanLyHoaDon searchByMaHD(TreeSet ds, int maHD) { 
        Iterator bir = ds.iterator();
        for (QuanLyHoaDon hd; bir.hasNext();) {
            hd = (QuanLyHoaDon) bir.next();
            if (hd.getMaHD() == maHD) {
                return hd;
            }
        }
        return null;
    }
    
    public ArrayList searchByKH(TreeSet ds, String tenKH) {
        ArrayList<QuanLyHoaDon> ds2 = new ArrayList<>();
        Iterator bir = ds.iterator();
        for (QuanLyHoaDon hd; bir.hasNext();) {
            hd = (QuanLyHoaDon) bir.next();
            if (hd.getKhachHang().getHoTen().equals(tenKH)) {
                ds2.add(hd);
            }
        }
        return ds2;
    }

    public ArrayList sortByTien(TreeSet ds) {
        ArrayList<QuanLyHoaDon> ds2 = new ArrayList<>(ds);
        ds2.sort(new Comparator<QuanLyHoaDon>() {
            @Override
            public int compare(QuanLyHoaDon o1, QuanLyHoaDon o2) {
                return Double.compare(o1.tongTien(), o2.tongTien());
            }
        });
        return ds2;
    }
    
    public ArrayList sortByTime(TreeSet ds) {
        ArrayList<QuanLyHoaDon> ds2 = new ArrayList<>(ds);
        ds2.sort(new Comparator<QuanLyHoaDon>() {
            @Override
            public int compare(QuanLyHoaDon o1, QuanLyHoaDon o2) {
                LocalDate date1 = o1.getThoiGian();
                LocalDate date2 = o2.getThoiGian();
                return date2.compareTo(date1);
            }
        });
        return ds2;
    }
}

