
package controller.TrinhDucThang;


public class QuanLyHoaDon {
    private String maHD;
    private String tenkhachhang;
    private String diachi;
    private String sodienthoai;
    private String thoigian;
    private String tongthanhtoan;

    public void QuanLyHoaDon(String maHD, String tenkhachhang, String diachi, String sodienthoai, String thoigian, String tongthanhtoan) {
        this.maHD = maHD;
        this.tenkhachhang = tenkhachhang;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.thoigian = thoigian;
        this.tongthanhtoan = tongthanhtoan;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getTongthanhtoan() {
        return tongthanhtoan;
    }

    public void setTongthanhtoan(String tongthanhtoan) {
        this.tongthanhtoan = tongthanhtoan;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHD='" + maHD + '\'' +
                ", tenkhachhang='" + tenkhachhang + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sodienthoai='" + sodienthoai + '\'' +
                ", thoigian='" + thoigian + '\'' +
                ", tongthanhtoan='" + tongthanhtoan + '\'' +
                '}';
    }
}

