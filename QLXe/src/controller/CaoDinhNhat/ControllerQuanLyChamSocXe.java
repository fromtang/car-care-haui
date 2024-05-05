
package controller.CaoDinhNhat;

import controller.ControllerFile;
import java.util.ArrayList;
import java.util.Comparator;
import model.CaoDinhNhat.QuanLyChamSocXe;

/**
 *
 * @author Admin
 */
public class ControllerQuanLyChamSocXe extends ControllerFile{
    public void sortByThanhTien(ArrayList<QuanLyChamSocXe> x) {
        x.sort(new Comparator<QuanLyChamSocXe>() {
            @Override
            public int compare(QuanLyChamSocXe o1, QuanLyChamSocXe o2) {
                return Double.compare(o1.thanhTien(), o2.thanhTien());
            }
        }); 
    }
    public void sortByNgaySua(ArrayList<QuanLyChamSocXe> x) {
        x.sort(new Comparator<QuanLyChamSocXe>() {
            @Override
            public int compare(QuanLyChamSocXe o1, QuanLyChamSocXe o2) {
                return o2.getNgaySua().compareTo(o1.getNgaySua());
            }
        });
    }
    public ArrayList timKiemQLX(ArrayList<QuanLyChamSocXe> dsQly, String bsx) {
        ArrayList<QuanLyChamSocXe> list = new ArrayList<>();
        if(bsx.length() > 0) {
            for(QuanLyChamSocXe x : dsQly) {
                if(x.getBienSoXe().equals(bsx)) {
                    list.add(x);
                }
            }
        }
        return list;
    }
}
