package view;

import controller.CaoDinhNhat.ControllerQuanLyChamSocXe;
import controller.NguyenDinhTang.QLDangKyThueXe;
import controller.NguyenTrungQuan.QuanLyXe;
import controller.TrinhDucThang.ControllerQuanLyHoaDon;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import model.CaoDinhNhat.QuanLyChamSocXe;
import model.NguyenDinhTang.ThueXe;
import model.NguyenTrungQuan.XeStore;
import model.TrinhDucThang.QuanLyHoaDon;
import view.HoaDon.SuaHoaDon;
import view.HoaDon.ThemHoaDon;
import view.HoaDon.XemChiTiet;

import view.NguyenTrungQuan.SuaXeStore;
import view.NguyenTrungQuan.ThemXeStore;

import view.QuanLyChamSocXe.Sua;
import view.QuanLyChamSocXe.ThemMoi;

import view.QuanLyThueXe.ThemThueXe;
import view.QuanLyThueXe.SuaThueXe;

public class HomeForm extends javax.swing.JFrame implements View {

    private int dongChon = -1;

    //    DATA FOR QUAN LY THUE XE
    private ArrayList<ThueXe> dsDky;
    private QLDangKyThueXe file;
    private ArrayList<ThueXe> dsDkyBanDau;
    private DefaultTableModel tblModelBLX;

//    DATA FOR QUANLYCHAMSOCXE
    private ArrayList<QuanLyChamSocXe> dsQly;
    private DefaultTableModel tblModelQLX;
    private ControllerQuanLyChamSocXe controllerQLX;

//  DATA FOR QUANLYHOADON
    private TreeSet<QuanLyHoaDon> dsHD; // danh sách để lưu trữ hóa đơn
    private DefaultTableModel modelHD; // sử dụng lớp triển khai sẵn có của giao diện TableModel
    private ControllerQuanLyHoaDon controller; // sử dụng lớp ControllerHD để điều khiển chức năng
    private ArrayList<QuanLyHoaDon> ds2; // danh sách để lưu trữ những thay đổi của danh sách hóa đơn

//    DATA FOR QUANLYBAOHIEM
    private ArrayList<XeStore> dsXe;
    private DefaultTableModel modelXeStore;
    private QuanLyXe controllerXeStore;
    private ArrayList<XeStore> dsXeBanDau;

    public HomeForm() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // SHOW QUANLYCHAMSOCXE
        dsQly = new ArrayList<>(); // khoi tao danh sach luu ds cham soc xe
        tblModelQLX = (DefaultTableModel) tblDanhSachXe.getModel();
        controllerQLX = new ControllerQuanLyChamSocXe();
        showQuanLyChamSocXe();

        // SHOW QL THUE XE
        if (dsDky == null) {
            dsDky = new ArrayList<>();
        }
        file = new QLDangKyThueXe();
        dsDky = (ArrayList<ThueXe>) file.readDataFromFile("thuexe.txt");
        tblModelBLX = (DefaultTableModel) tblThueXe.getModel();
        sortByName.setSelected(true);
        showQuanLyBLX();

        // SHOW QUAN LY XE STORE
        if (dsXe == null) {
            dsXe = new ArrayList<>();
        }
        controllerXeStore = new QuanLyXe();
        dsXe = (ArrayList<XeStore>) file.readDataFromFile("dsxe.txt");
        modelXeStore = (DefaultTableModel) tblXeCuaHang.getModel();
        sortByName.setSelected(true);
        showQuanLyXeStore();
        
        // SHOW QUAN LY HOA DON
         dsHD = new TreeSet<>();
        modelHD = (DefaultTableModel) tblQLHD.getModel();
        controller = new ControllerQuanLyHoaDon();
        showHD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnThemMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiemBSX = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboSapXep = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDanhSachXe = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThueXe = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtHoTenTimKiem = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        sortByName = new javax.swing.JRadioButton();
        sortByDate = new javax.swing.JRadioButton();
        Sort = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblQLHD = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btThemHD = new javax.swing.JButton();
        btSuaHD = new javax.swing.JButton();
        btXoaHD = new javax.swing.JButton();
        btXemChiTietHD = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtTimKiemXeCuaHang = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblXeCuaHang = new javax.swing.JTable();
        cbbSapXepBH = new javax.swing.JComboBox<>();
        btnThemBH = new javax.swing.JButton();
        btnSuaBH = new javax.swing.JButton();
        btnXoaBH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTimKiemBH = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ Thống Quản Lý Cửa Hàng Xe ");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnThemMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemQLChamSocXe(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setText("Sửa thông tin");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaQLChamSocXe(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaQLChamSocXe(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DANH SÁCH XE BẢO DƯỠNG");

        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiQLChamSocXe(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Biển số xe:");

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemQLChamSocXe(evt);
            }
        });

        txtTimKiemBSX.setToolTipText("Nhập biển số xe");
        txtTimKiemBSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemBSXActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Sắp xếp theo:");

        comboSapXep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần thành tiền", "Ngày sửa gần nhất", " " }));
        comboSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSapXepActionPerformed(evt);
            }
        });

        tblDanhSachXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Biển số xe", "Loại xe", "Chủ sở hữu", "SĐT", "Sửa chữa", "Ngày sửa", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        jScrollPane4.setViewportView(tblDanhSachXe);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiemBSX, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2166, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btnSua)
                .addGap(187, 187, 187)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(376, 376, 376))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiemBSX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiem)
                        .addComponent(comboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnQuayLai)
                    .addComponent(btnThemMoi))
                .addGap(109, 109, 109))
        );

        jTabbedPane1.addTab("Quản Lý Bảo Dưỡng Xe", jPanel2);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DANH SÁCH THUÊ XE");

        tblThueXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblThueXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ và tên", "Số điện thoại", "Địa chỉ", "Ngày Thuê", "Xe Thuê", "Biển Số"
            }
        ));
        jScrollPane1.setViewportView(tblThueXe);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBL(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaBL(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Họ và tên: ");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaBL(evt);
            }
        });

        txtHoTenTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoTenTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenTimKiemActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Hoàn tác");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanTacBL(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        buttonGroup4.add(sortByName);
        sortByName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortByName.setText("Họ tên");
        sortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameActionPerformed(evt);
            }
        });

        buttonGroup4.add(sortByDate);
        sortByDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortByDate.setText("Ngày đăng ký");
        sortByDate.setActionCommand("Ngày Thuê");
        sortByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByDateActionPerformed(evt);
            }
        });

        Sort.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sort.setText("Sắp xếp");
        Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTenTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTim)
                .addGap(120, 120, 120)
                .addComponent(sortByName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortByDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sort)
                .addContainerGap(1997, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(1827, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(70, 70, 70)
                .addComponent(jButton2)
                .addGap(62, 62, 62)
                .addComponent(jButton3)
                .addGap(63, 63, 63)
                .addComponent(jButton4)
                .addGap(494, 494, 494))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHoTenTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim)
                    .addComponent(sortByName)
                    .addComponent(sortByDate)
                    .addComponent(Sort))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Thuê Xe", jPanel5);

        tblQLHD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        tblQLHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblQLHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Khách hàng", "Địa chỉ", "SĐT", "Thời gian", "Tổng thanh toán"
            }
        ));
        tblQLHD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblQLHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLHDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblQLHD);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DANH SÁCH HÓA ĐƠN");

        btThemHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btThemHD.setText("Thêm");
        btThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemHDActionPerformed(evt);
            }
        });
        jPanel9.add(btThemHD);

        btSuaHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSuaHD.setText("Sửa");
        btSuaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaHDActionPerformed(evt);
            }
        });
        jPanel9.add(btSuaHD);

        btXoaHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btXoaHD.setText("Xóa");
        btXoaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaHDActionPerformed(evt);
            }
        });
        jPanel9.add(btXoaHD);

        btXemChiTietHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btXemChiTietHD.setText("Xem chi tiết");
        btXemChiTietHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemChiTietHDActionPerformed(evt);
            }
        });
        jPanel9.add(btXemChiTietHD);

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Refresh");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel9.add(btnReset);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 2663, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Hoá Đơn", jPanel7);

        txtTimKiemXeCuaHang.setToolTipText("Nhập thông tin để tìm kiếm");
        txtTimKiemXeCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemXeCuaHangActionPerformed(evt);
            }
        });

        tblXeCuaHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Xe", "Biển số", "Loại xe", "Ngày Nhập"
            }
        ));
        jScrollPane5.setViewportView(tblXeCuaHang);

        cbbSapXepBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbSapXepBH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp Xếp Theo Loại Xe", "Sắp Xếp Theo Ngày Nhập" }));
        cbbSapXepBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSapXepBHActionPerformed(evt);
            }
        });

        btnThemBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemBH.setText("Thêm mới");
        btnThemBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBHActionPerformed(evt);
            }
        });

        btnSuaBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSuaBH.setText("Sửa");
        btnSuaBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaBHActionPerformed(evt);
            }
        });

        btnXoaBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaBH.setText("Xóa");
        btnXoaBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaBHActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ XE CỬA HÀNG");

        btnTimKiemBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiemBH.setText("Tìm kiếm");
        btnTimKiemBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemBHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(txtTimKiemXeCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiemBH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2186, Short.MAX_VALUE)
                .addComponent(cbbSapXepBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(btnThemBH)
                .addGap(135, 135, 135)
                .addComponent(btnSuaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(btnXoaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiemXeCuaHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiemBH)
                        .addComponent(cbbSapXepBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemBH)
                    .addComponent(btnSuaBH)
                    .addComponent(btnXoaBH))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Xe Cửa Hàng", jPanel6);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Nhóm 1");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Hệ Thống Quản Lý Cửa Hàng Xe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 448, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemHDActionPerformed
          new ThemHoaDon(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btThemHDActionPerformed

    private void btSuaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaHDActionPerformed
         if (dongChon != -1) {
            new SuaHoaDon(this, rootPaneCheckingEnabled).setVisible(true);
        } else
            JOptionPane.showMessageDialog(this,
                    "Bạn chưa chọn dòng để sửa", "Thông báo", WIDTH);
    }//GEN-LAST:event_btSuaHDActionPerformed

    private void btXoaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaHDActionPerformed
         if (dongChon != -1) {
            int confirm = JOptionPane.showConfirmDialog(
                    rootPane, "Bạn có chắc chắn muốn xóa không?",
                    "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            // Người dùng đã chọn đồng ý
            if (confirm == JOptionPane.YES_OPTION) {
                QuanLyHoaDon hd = searchObj();
                dsHD.remove(hd);
                ds2 = new ArrayList<>(dsHD);
                showData(ds2, modelHD);
                controller.writeToFile(dsHD, "HoaDon.txt");
            }
        } else
            JOptionPane.showMessageDialog(this,
                    "Bạn chưa chọn dòng để xóa", "Thông báo", WIDTH);
    }//GEN-LAST:event_btXoaHDActionPerformed

    private void btXemChiTietHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemChiTietHDActionPerformed
          if (dongChon != -1) {
            new XemChiTiet(this, rootPaneCheckingEnabled).setVisible(true);
        } else
            JOptionPane.showMessageDialog(this,
                    "Bạn chưa chọn dòng để xem thông tin chi tiết", "Thông báo", WIDTH);
    }//GEN-LAST:event_btXemChiTietHDActionPerformed

    private void tblQLHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLHDMouseClicked
         dongChon = tblQLHD.getSelectedRow();
    }//GEN-LAST:event_tblQLHDMouseClicked

    private void btnThemQLChamSocXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemQLChamSocXe
        ThemMoi themMoi = new ThemMoi(this, rootPaneCheckingEnabled);
        themMoi.setVisible(true);
    }//GEN-LAST:event_btnThemQLChamSocXe

    private void btnSuaQLChamSocXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaQLChamSocXe
        dongChon = tblDanhSachXe.getSelectedRow();
        /*       Nếu danh sách rỗng hoặc người dùng chưa chọn dòng  thì in ra thông báo
        còn nếu không thì gọi đến màn hình sửa */
        if (dsQly.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có thông tin xe để sửa!");
        } else if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn dòng chứa thông tin cần sửa!");
        } else {
            Sua sua = new Sua(this, rootPaneCheckingEnabled);
            sua.setEditData(dsQly.get(dongChon));
            sua.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaQLChamSocXe

    private void btnXoaQLChamSocXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaQLChamSocXe
        dongChon = tblDanhSachXe.getSelectedRow();
        /*       Nếu danh sách rỗng hoặc người dùng chưa chọn dòng  thì in ra thông báo
        còn nếu không thì show ra màn hình xác nhận xóa */
        if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng cần xóa!");
        } else if (dsQly.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có thông tin để xóa!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Bạn có chắc chắn muốn xóa?",
                    "Xác nhận xóa",
                    JOptionPane.YES_NO_OPTION
            );
            /*           Người dùng chọn Yes sẽ tiến hành xóa thông tin khỏi danh sách và 
            show lại danh sách sau khi xóa */
            if (confirm == JOptionPane.YES_OPTION) {
                dsQly.remove(dongChon);
                controllerQLX.writeToFile(dsQly, "ChamSocXe.txt");
                this.showData(dsQly, tblModelQLX);
            }
        }
    }//GEN-LAST:event_btnXoaQLChamSocXe

    private void btnQuayLaiQLChamSocXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiQLChamSocXe
        //        Show lại danh sách ban đầu đọc từ file ra
        txtTimKiemBSX.setText("");
        showQuanLyChamSocXe();
    }//GEN-LAST:event_btnQuayLaiQLChamSocXe

    private void btnTimKiemQLChamSocXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemQLChamSocXe
        //        Lấy ra biển số xe người dùng nhập vào để tìm 
        String bsx = txtTimKiemBSX.getText().trim();
//        Nếu biển số xe rỗng tức là chưa nhập biển số sẽ show ra thông báo
        if (bsx.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập biển số!");
        } else {
            ArrayList<QuanLyChamSocXe> list = controllerQLX.timKiemQLX(dsQly, bsx); // list chứa thông tin cần tìm
//            Nếu list chứa thông tin tìm được mà rỗng show ra thông báo còn không thì show thông tin trong list ra
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy xe!");
            } else {
                this.showData(list, tblModelQLX);
            }
        }
    }//GEN-LAST:event_btnTimKiemQLChamSocXe

    private void comboSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSapXepActionPerformed
        //        Lấy ra chỉ số của JcomboBox
        int index = comboSapXep.getSelectedIndex();
//        Nếu chỉ số là 0 thì sắp theo thành tiền còn chỉ số là 1 thì sắp theo ngày sửa 
        if (index == 0) {
            controllerQLX.sortByThanhTien(dsQly);
        } else if (index == 1) {
            controllerQLX.sortByNgaySua(dsQly);
        }
        this.showData(dsQly, tblModelQLX);
    }//GEN-LAST:event_comboSapXepActionPerformed

    private void txtTimKiemXeCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemXeCuaHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemXeCuaHangActionPerformed

    private void cbbSapXepBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSapXepBHActionPerformed
          int index = comboSapXep.getSelectedIndex();
//        Nếu chỉ số là 0 thì sắp theo thành tiền còn chỉ số là 1 thì sắp theo ngày sửa 
        if (index == 0) {
            controllerXeStore.sortByLoaiXe(dsXe);
        } else if (index == 1) {
            controllerXeStore.sortByNgayNhap(dsXe);
        }
        this.showData(dsXe, modelXeStore);
    }//GEN-LAST:event_cbbSapXepBHActionPerformed

    private void btnThemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBHActionPerformed
        ThemXeStore themMoi = new ThemXeStore(this, rootPaneCheckingEnabled);
        themMoi.setVisible(true);

    }//GEN-LAST:event_btnThemBHActionPerformed

    private void btnSuaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaBHActionPerformed
        dongChon = tblXeCuaHang.getSelectedRow();

        if (dsXe.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Khong co thong tin de sua !");
        } else if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hay chon dong chua thong tin can sua!");
        } else {
            SuaXeStore suaXeStore = new SuaXeStore(this, rootPaneCheckingEnabled);
            suaXeStore.setEditData(dsXe.get(dongChon));
            suaXeStore.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaBHActionPerformed

    private void btnXoaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBHActionPerformed
         dongChon = tblXeCuaHang.getSelectedRow();
        if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hay chon mot dong can xoa!");
        } else if (dsXe.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Khong co thong tin de xoa!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Bạn có chắc chắn muốn xóa?",
                    "Xác nhận xóa",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                dsXe.remove(dongChon);
                 controllerXeStore.writeToFile(dsXe, "dsxe.txt");
                this.showData(dsXe, modelXeStore);
            }
        }
    }//GEN-LAST:event_btnXoaBHActionPerformed

    private void btnTimKiemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemBHActionPerformed
             String tenxeTimKiem = txtTimKiemXeCuaHang.getText();
        if (tenxeTimKiem.length() > 0) {
            ArrayList<XeStore> list = new ArrayList<>();
            for (XeStore x : dsXe) {
                if (x.getTenXe().equals(tenxeTimKiem)) {
                    list.add(x);
                }
            }
            dsXe.clear();
            dsXe.addAll(list);
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Khong tim thay!");
            } else {
                this.showData(list, modelXeStore);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui long nhap thong tin!");
        }
    }//GEN-LAST:event_btnTimKiemBHActionPerformed

    private void btnThemBL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBL
        ThemThueXe them = new ThemThueXe(this, rootPaneCheckingEnabled);
        them.setVisible(true);
    }//GEN-LAST:event_btnThemBL

    private void btnSuaBL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaBL
        dongChon = tblThueXe.getSelectedRow();
        if (dsDky.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Khong co thong tin de sua!");
        } else if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hay chon dong chua thong tin can sua!");
        } else {
            SuaThueXe suaBlx = new SuaThueXe(this, rootPaneCheckingEnabled);
            suaBlx.setEditData(dsDky.get(dongChon));
            suaBlx.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaBL

    private void btnXoaBL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBL
        dongChon = tblThueXe.getSelectedRow();
        if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hay chon mot dong can xoa!");
        } else if (dsDky.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Khong co thong tin de xoa!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Bạn có chắc chắn muốn xóa?",
                    "Xác nhận xóa",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                dsDky.remove(dongChon);
                 file.writeToFile(dsDky, "thuexe.txt");
                this.showData(dsDky, tblModelBLX);
            }
        }
    }//GEN-LAST:event_btnXoaBL

    private void txtHoTenTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenTimKiemActionPerformed

    private void btnHoanTacBL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanTacBL
        showQuanLyBLX();
    }//GEN-LAST:event_btnHoanTacBL

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

        String hoTenTimKiem = txtHoTenTimKiem.getText();
        if (hoTenTimKiem.length() > 0) {
            ArrayList<ThueXe> list = new ArrayList<>();
            for (ThueXe x : dsDky) {
                if (x.getHoTen().equals(hoTenTimKiem)) {
                    list.add(x);
                }
            }
            dsDky.clear();
            dsDky.addAll(list);
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Khong tim thay!");
            } else {
                this.showData(list, tblModelBLX);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui long nhap thong tin!");
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void sortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameActionPerformed

    }//GEN-LAST:event_sortByNameActionPerformed

    private void sortByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortByDateActionPerformed

    private void SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortActionPerformed
        QLDangKyThueXe sort = new QLDangKyThueXe();
        if (sortByName.isSelected()) {
            sort.sortByHoTen(dsDky);
        } else {
            sort.sortByNgayDky(dsDky);
        }
        this.showData(dsDky, tblModelBLX);
    }//GEN-LAST:event_SortActionPerformed

    private void txtTimKiemBSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemBSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemBSXActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new HomeForm().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sort;
    private javax.swing.JButton btSuaHD;
    private javax.swing.JButton btThemHD;
    private javax.swing.JButton btXemChiTietHD;
    private javax.swing.JButton btXoaHD;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaBH;
    private javax.swing.JButton btnThemBH;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiemBH;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaBH;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cbbSapXepBH;
    private javax.swing.JComboBox<String> comboSapXep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton sortByDate;
    private javax.swing.JRadioButton sortByName;
    private javax.swing.JTable tblDanhSachXe;
    private javax.swing.JTable tblQLHD;
    private javax.swing.JTable tblThueXe;
    private javax.swing.JTable tblXeCuaHang;
    private javax.swing.JTextField txtHoTenTimKiem;
    private javax.swing.JTextField txtTimKiemBSX;
    private javax.swing.JTextField txtTimKiemXeCuaHang;
    // End of variables declaration//GEN-END:variables

    @Override
    public <T> void showData(ArrayList<T> list, DefaultTableModel model) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        model.setRowCount(0);
        for (T t : list) {
            if (t instanceof ThueXe) {
                ThueXe blx = (ThueXe) t;
                model.addRow(new Object[]{
                    blx.getHoTen(), blx.getSdt(), blx.getDiaChi(), blx.getNgayThue(), blx.getLoaiXe(), blx.getBienso()
                });

            }
            if (t instanceof QuanLyChamSocXe) {
                QuanLyChamSocXe xe = (QuanLyChamSocXe) t;
                model.addRow(new Object[]{
                    xe.getMaChamSoc(), xe.getBienSoXe(), xe.getLoaiXe(), xe.getChuSoHuu().getHoTen(),
                    xe.getChuSoHuu().getSdt(), xe.getVatPham().getTenVatPham(),
                    xe.getNgaySua().format(dateFormatter),
                    xe.getVatPham().getSoLuong(), xe.getVatPham().getDonGia(), xe.thanhTien()
                });
            }
            if (t instanceof XeStore) {
                XeStore bh = (XeStore) t;
                model.addRow(new Object[]{
                    bh.getTenXe(),
                    bh.getCar().getBienSoXe(),
                    bh.getCar().getLoaiXe(),
                    bh.getNgayNhap(),});
            }
            if (t instanceof QuanLyHoaDon hd) {
                model.addRow(new Object[]{
                    hd.getMaHD(), hd.getKhachHang().getHoTen(),
                    hd.getKhachHang().getDiaChi(), hd.getKhachHang().getSdt(),
                    hd.getThoiGian().format(dateFormatter), hd.tongTien()
                });
            }
        }
    }

// QUAN LY CHAM SOC XE
    //    Phương thức này dùng để thêm thông tin chăm sóc xe mới vào danh sách
    public void addXe(QuanLyChamSocXe x) {
        dsQly.add(x);
        this.showData(dsQly, tblModelQLX);
        controllerQLX.writeToFile(dsQly, "ChamSocXe.txt");
    }

//    Phương thức này dùng để cập nhật thông tin chăm sóc xe
    public void updateXe(QuanLyChamSocXe x) {
        int oldIndex = dongChon;
        dsQly.remove(oldIndex);
        dsQly.add(oldIndex, x);
        showData(dsQly, tblModelQLX);
        controllerQLX.writeToFile(dsQly, "ChamSocXe.txt");
    }

//    Phương thức này để kiểm tra mã ID trùng 
    public boolean checkIdTrung(String maChamSoc) {
        for (QuanLyChamSocXe xe : dsQly) {
            if (xe.getMaChamSoc().equalsIgnoreCase(maChamSoc)) {
                return true;
            }
        }
        return false;
    }

//    Phương thức này dùng để đọc file và show dữ liệu từ file ra khi chạy lại chương trình
    private void showQuanLyChamSocXe() {
        dsQly = (ArrayList<QuanLyChamSocXe>) controllerQLX.readDataFromFile("ChamSocXe.txt");
        if (dsQly == null) {
            dsQly = new ArrayList<>();
        }
        this.showData(dsQly, tblModelQLX);
    }

    // ====================== QUAN LY DANGKY THUE XE=====================
    public void addBLX(ThueXe x) {
        if (dsDky == null) {
            dsDky = new ArrayList<>();
        }
        dsDky.add(x);
        file.writeToFile(dsDky, "thuexe.txt");
        dsDkyBanDau = new ArrayList<>(dsDky);
        this.showData(dsDky, tblModelBLX);
    }

    public void updateBLX(ThueXe x) {
        dsDky.remove(dongChon);
        this.addBLX(x);
    }

    private void showQuanLyBLX() {
        dsDky = (ArrayList<ThueXe>) file.readDataFromFile("thuexe.txt");
        if (dsDky == null) {
            dsDky = new ArrayList<>();
        }
        this.showData(dsDky, tblModelBLX);
    }

    // QUAN LY XE CUA HANG
    public void addXeStore(XeStore x) {
        if (dsXe == null) {
            dsXe = new ArrayList<>();
        }
        dsXe.add(x);
        controllerXeStore.writeToFile(dsXe, "dsxe.txt");
        dsXeBanDau = new ArrayList<>(dsXe);
        this.showData(dsXe, modelXeStore);
    }

    public void updateXeStore(XeStore x) {
        dsXe.remove(dongChon);
        this.addXeStore(x);
    }

    private void showQuanLyXeStore() {
        dsXe = (ArrayList<XeStore>) controllerXeStore.readDataFromFile("dsxe.txt");
        if (dsXe == null) {
            dsXe = new ArrayList<>();
        }
        this.showData(dsXe, modelXeStore);
    }
    
    // QUAN LY HOA DON
 public TreeSet<QuanLyHoaDon> getDsHD() {
        return dsHD;
    }

    public void setDsHD(TreeSet<QuanLyHoaDon> dsHD) {
        this.dsHD = dsHD;
    }

    // Phương thức này dùng để thêm hóa đơn vào danh sách và lưu vào file
    public void addHoaDon(QuanLyHoaDon hd) {
        dsHD.add(hd);
        ds2 = new ArrayList<>(dsHD);
        showData(ds2, modelHD);
        controller.writeToFile(dsHD, "HoaDon.txt");
    }

    // Phương thức này dùng để hiển thị dữ liệu từ file khi khởi động chương trình
    private void showHD() {
        dsHD = (TreeSet<QuanLyHoaDon>) controller.readDataFromFile("HoaDon.txt");
        if (dsHD == null) {
            dsHD = new TreeSet<>();
        }
        if (!dsHD.isEmpty()) {
            int sMaHD = dsHD.last().getMaHD();
            QuanLyHoaDon.setSmaHD(sMaHD + 1);
        }
        ds2 = new ArrayList<>(dsHD);
        this.showData(ds2, modelHD);
    }

    // Phương thức này dùng để tìm kiếm hóa đơn từ danh sách tạm thời
    public QuanLyHoaDon searchObj() {
        return ds2.get(dongChon);
    }

}

