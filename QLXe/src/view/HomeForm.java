package view;

import controller.CaoDinhNhat.ControllerQuanLyChamSocXe;
import controller.NguyenDinhTang.QLDangKyThueXe;
import controller.NguyenTrungQuan.QuanLyXe;
import controller.TrinhDucThang.ControllerQuanLyHoaDon;
import java.text.SimpleDateFormat;
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

import view.QuanLyXe.SuaXeStore;
import view.QuanLyXe.ThemXeStore;

import view.QuanLyChamSocXe.Sua;
import view.QuanLyChamSocXe.ThemMoi;

import view.QuanLyThueXe.ThemThueXe;
import view.QuanLyThueXe.SuaThueXe;

public class HomeForm extends javax.swing.JFrame implements View {

    private int dongChon = -1;

    //    DATA FOR QUAN LY THUE XE
    private ArrayList<ThueXe> dsThueXe;
    private QLDangKyThueXe file;
    private DefaultTableModel tblModelThueXe;
    private QLDangKyThueXe controllerQLThueXe;

//    DATA FOR QUANLYCHAMSOCXE
    private ArrayList<QuanLyChamSocXe> dsQly;
    private DefaultTableModel tblModelQLX;
    private ControllerQuanLyChamSocXe controllerQLX;

//  DATA FOR QUANLYHOADON
    private TreeSet<QuanLyHoaDon> dsHD; // danh sách để lưu trữ hóa đơn
    private DefaultTableModel modelHD; // sử dụng lớp triển khai sẵn có của giao diện TableModel
    private ControllerQuanLyHoaDon controller; // sử dụng lớp ControllerHD để điều khiển chức năng
    private ArrayList<QuanLyHoaDon> ds2; // danh sách để lưu trữ những thay đổi của danh sách hóa đơn

//    DATA FOR QUANLYXE
    private ArrayList<XeStore> dsXe;
    private DefaultTableModel tblModelXeCuaHang;
    private QuanLyXe controllerXeStore;
    private ArrayList<XeStore> dsXeBanDau;
    private QuanLyXe dsxe;

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
        if (dsThueXe == null) {
            dsThueXe = new ArrayList<>();
        }
        file = new QLDangKyThueXe();
        dsThueXe = (ArrayList<ThueXe>) file.readDataFromFile("thuexe.txt");
        tblModelThueXe = (DefaultTableModel) tblThueXe.getModel();
        controllerQLThueXe = new QLDangKyThueXe();
        showQuanLyThueXe();
        // SHOW QUAN LY XE STORE
        if (dsXe == null || dsXe.isEmpty()) {
            dsXe = new ArrayList<>();
        }
        dsxe = new QuanLyXe();
        controllerXeStore = new QuanLyXe();
        dsXe = (ArrayList<XeStore>) dsxe.readDataFromFile("dsxe.txt");
        tblModelXeCuaHang = (DefaultTableModel) tblXeCuaHang.getModel();
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
        jButton4 = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbbsortThueXe = new javax.swing.JComboBox<>();
        txtTimKiemThueXe = new javax.swing.JTextField();
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
        jLabel13 = new javax.swing.JLabel();
        cbSapXepHoaDon = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        txtTimKiemXeCuaHang = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblXeCuaHang = new javax.swing.JTable();
        cbbSapXepXe = new javax.swing.JComboBox<>();
        btnThemBH = new javax.swing.JButton();
        btnSuaBH = new javax.swing.JButton();
        btnXoaBH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTimKiemXe = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnQLXeHoanTac = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
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
        btnQuayLai.setText("Hoàn tác");
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
        txtTimKiemBSX.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiemBSX, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiemBSX, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel7)
                    .addComponent(comboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnQuayLai)
                    .addComponent(btnThemMoi))
                .addContainerGap(105, Short.MAX_VALUE))
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
                "Họ và tên", "Số điện thoại", "Địa chỉ", "Ngày Thuê", "Loại Xe", "Biển Số"
            }
        ));
        tblThueXe.setMinimumSize(new java.awt.Dimension(150, 0));
        jScrollPane1.setViewportView(tblThueXe);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Thêm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBL(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Sửa thông tin");
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Sắp xếp theo: ");

        cbbsortThueXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Ngày thuê tăng dần" }));
        cbbsortThueXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbsortThueXeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbsortThueXe, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbbsortThueXe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtTimKiemThueXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemThueXeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiemThueXe, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiemThueXe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(103, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1172, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        btThemHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btThemHD.setText("Thêm mới");
        btThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemHDActionPerformed(evt);
            }
        });

        btSuaHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSuaHD.setText("Sửa thông tin");
        btSuaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaHDActionPerformed(evt);
            }
        });

        btXoaHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btXoaHD.setText("Xóa");
        btXoaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaHDActionPerformed(evt);
            }
        });

        btXemChiTietHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btXemChiTietHD.setText("Xem chi tiết");
        btXemChiTietHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemChiTietHDActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Hoàn tác");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Sắp xếp theo:");

        cbSapXepHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSapXepHoaDon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng Thanh Toán", "Thời Gian" }));
        cbSapXepHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btSuaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btXemChiTietHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSapXepHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSapXepHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemHD)
                    .addComponent(btSuaHD)
                    .addComponent(btXoaHD)
                    .addComponent(btXemChiTietHD)
                    .addComponent(btnReset))
                .addContainerGap(101, Short.MAX_VALUE))
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên Xe", "Loại xe", "Số Lượng", "Ngày Nhập", "Giá Nhập", "Thành Tiền"
            }
        ));
        jScrollPane5.setViewportView(tblXeCuaHang);

        cbbSapXepXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbbSapXepXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại Xe", "Ngày Nhập", "Giá Nhập Từ Bé Đến Lớn", "Giá Nhập Từ Lớn Đến Bế" }));
        cbbSapXepXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSapXepXeActionPerformed(evt);
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
        btnSuaBH.setText("Sửa thông tin");
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
        jLabel1.setText("QUẢN LÝ XE");

        btnTimKiemXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiemXe.setText("Tìm kiếm");
        btnTimKiemXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemXeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Sắp xếp theo: ");

        btnQLXeHoanTac.setText("Hoàn tác");
        btnQLXeHoanTac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLXeHoanTacActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tên xe:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiemXeCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiemXe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbSapXepXe, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(btnThemBH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnSuaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnXoaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnQLXeHoanTac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiemXeCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimKiemXe)
                        .addComponent(cbbSapXepXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemBH)
                    .addComponent(btnSuaBH)
                    .addComponent(btnXoaBH)
                    .addComponent(btnQLXeHoanTac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Xe", jPanel6);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhóm 1");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hệ Thống Quản Lý Cửa Hàng Xe");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cbbSapXepXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSapXepXeActionPerformed
         int index = cbbSapXepXe.getSelectedIndex();
//        Nếu chỉ số là 0 thì sắp theo thành tiền còn chỉ số là 1 thì sắp theo ngày sửa 
        if (index == 0) {
            controllerXeStore.sortByLoaiXe(dsXe);
        } else if (index == 1) {
            controllerXeStore.sortByNgayNhap(dsXe);
        }else if (index == 2){
            controllerXeStore.sortByGiaNhapMore(dsXe);
        }else{
            controllerXeStore.sortByGiaNhapLess(dsXe);
        }
        this.showData(dsXe, tblModelXeCuaHang);
    }//GEN-LAST:event_cbbSapXepXeActionPerformed

    private void btnThemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBHActionPerformed
        ThemXeStore themMoi = new ThemXeStore(this, rootPaneCheckingEnabled);
        themMoi.setVisible(true);

    }//GEN-LAST:event_btnThemBHActionPerformed

    private void btnSuaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaBHActionPerformed
        dongChon = tblXeCuaHang.getSelectedRow();

        if (dsXe.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có thông tin để sửa !");
        } else if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn dòng để sửa!");
        } else {
            SuaXeStore suaXeStore = new SuaXeStore(this, rootPaneCheckingEnabled);
            suaXeStore.setEditData(dsXe.get(dongChon));
            suaXeStore.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaBHActionPerformed

    private void btnXoaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBHActionPerformed
         dongChon = tblXeCuaHang.getSelectedRow();
        if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn dòng cần xoá!");
        } else if (dsXe.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có thông tin để xoá!");
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
                this.showData(dsXe, tblModelXeCuaHang);
            }
        }
    }//GEN-LAST:event_btnXoaBHActionPerformed

    private void btnTimKiemXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemXeActionPerformed
             String tenxeTimKiem = txtTimKiemXeCuaHang.getText();
        if (tenxeTimKiem.length() > 0) {
            ArrayList<XeStore> list = new ArrayList<>();
            for (XeStore x : dsXe) {
                if (x.getTenXe().equals(tenxeTimKiem)) {
                    list.add(x);
                }
            }
//            dsXe.clear();
//            dsXe.addAll(list);
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!");
            } else {
                this.showData(list, tblModelXeCuaHang);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập thông tin!");
        }
    }//GEN-LAST:event_btnTimKiemXeActionPerformed

    private void btnThemBL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBL
        ThemThueXe them = new ThemThueXe(this, rootPaneCheckingEnabled);
        them.setVisible(true);
    }//GEN-LAST:event_btnThemBL

    private void btnSuaBL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaBL
        dongChon = tblThueXe.getSelectedRow();
        if (dsThueXe.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có thông tin để sửa!");
        } else if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn dòng chứa thông tin cần sửa!");
        } else {
            SuaThueXe suaBlx = new SuaThueXe(this, rootPaneCheckingEnabled);
            suaBlx.setEditData(dsThueXe.get(dongChon));
            suaBlx.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaBL

    private void btnXoaBL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBL
        dongChon = tblThueXe.getSelectedRow();
        if (dongChon == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 dòng cần xoá!");
        } else if (dsThueXe.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có thông tin để xoá!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Bạn có chắc chắn muốn xóa?",
                    "Xác nhận xóa",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                dsThueXe.remove(dongChon);
                 file.writeToFile(dsThueXe, "thuexe.txt");
                this.showData(dsThueXe, tblModelThueXe);
            }
        }
    }//GEN-LAST:event_btnXoaBL

    private void btnHoanTacBL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanTacBL
        showQuanLyThueXe();
    }//GEN-LAST:event_btnHoanTacBL

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

        String hoTenTimKiem = txtTimKiemThueXe.getText();
        if (hoTenTimKiem.length() > 0) {
            ArrayList<ThueXe> list = new ArrayList<>();
            for (ThueXe x : dsThueXe) {
                if (x.getHoTen().equals(hoTenTimKiem)) {
                    list.add(x);
                }
            }
//            dsThueXe.clear();
//            dsThueXe.addAll(list);
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy ");
            } else {
                this.showData(list, tblModelThueXe);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập thông tin");
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void txtTimKiemBSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemBSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemBSXActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnQLXeHoanTacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLXeHoanTacActionPerformed
        txtTimKiemXeCuaHang.setText("");
        showQuanLyXeStore();
    }//GEN-LAST:event_btnQLXeHoanTacActionPerformed

    private void cbbsortThueXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbsortThueXeActionPerformed
        int index = cbbsortThueXe.getSelectedIndex();
//        Nếu chỉ số là 0 thì sắp theo thành tiền còn chỉ số là 1 thì sắp theo ngày sửa 
        if (index == 0) {
            controllerQLThueXe.sortByHoTen(dsThueXe);
        } else if (index == 1) {
            controllerQLThueXe.sortByNgayDky(dsThueXe);
        }
        this.showData(dsThueXe, tblModelThueXe);
    }//GEN-LAST:event_cbbsortThueXeActionPerformed

    private void txtTimKiemThueXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemThueXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemThueXeActionPerformed

    private void cbSapXepHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepHoaDonActionPerformed
        // TODO add your handling code here:
         int index = cbSapXepHoaDon.getSelectedIndex();
         ds2 = new ArrayList<>(dsHD);
        this.showData(ds2, modelHD);
         if (index == 0) {
            ds2 = controller.sortByTien(dsHD);
        } else if (index == 1) {
           ds2=  controller.sortByTime(dsHD);
        }
        this.showData(ds2, modelHD);
    }//GEN-LAST:event_cbSapXepHoaDonActionPerformed

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
    private javax.swing.JButton btSuaHD;
    private javax.swing.JButton btThemHD;
    private javax.swing.JButton btXemChiTietHD;
    private javax.swing.JButton btXoaHD;
    private javax.swing.JButton btnQLXeHoanTac;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaBH;
    private javax.swing.JButton btnThemBH;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiemXe;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaBH;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cbSapXepHoaDon;
    private javax.swing.JComboBox<String> cbbSapXepXe;
    private javax.swing.JComboBox<String> cbbsortThueXe;
    private javax.swing.JComboBox<String> comboSapXep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDanhSachXe;
    private javax.swing.JTable tblQLHD;
    private javax.swing.JTable tblThueXe;
    private javax.swing.JTable tblXeCuaHang;
    private javax.swing.JTextField txtTimKiemBSX;
    private javax.swing.JTextField txtTimKiemThueXe;
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
                XeStore xe = (XeStore) t;
                model.addRow(new Object[]{
                    xe.getTenXe(),
                    xe.getCar().getLoaiXe(),
                    xe.getSoLuong(),
                    xe.getNgayNhap(),
                    xe.getGiaNhap(),
                    xe.getGiaNhap()*xe.getSoLuong()
                });
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
        if (dsQly == null || dsQly.isEmpty()) {
            dsQly = new ArrayList<>();
        }
        this.showData(dsQly, tblModelQLX);
    }

    // ====================== QUAN LY DANGKY THUE XE=====================
    public void addThueXe(ThueXe x) {
        if (dsThueXe == null) {
            dsThueXe = new ArrayList<>();
        }
        dsThueXe.add(x);
        file.writeToFile(dsThueXe, "thuexe.txt");
//        Hiển thị ra màn hình
        this.showData(dsThueXe, tblModelThueXe);
    }

    public void updateThueXe(ThueXe x) {
        dsThueXe.remove(dongChon);
        
        this.addThueXe(x);
    }

    private void showQuanLyThueXe() {
        dsThueXe = (ArrayList<ThueXe>) file.readDataFromFile("thuexe.txt");
        if (dsThueXe == null || dsThueXe.isEmpty()) {
            dsThueXe = new ArrayList<>();
        }
        this.showData(dsThueXe, tblModelThueXe);
    }

    // QUAN LY XE CUA HANG
    public void addXeStore(XeStore x) {
        if (dsXe == null) {
            dsXe = new ArrayList<>();
        }
        dsXe.add(x);
        controllerXeStore.writeToFile(dsXe, "dsxe.txt");
        dsXeBanDau = new ArrayList<>(dsXe);
        this.showData(dsXe, tblModelXeCuaHang);
    }

    public void updateXeStore(XeStore x) {
        dsXe.remove(dongChon);
        this.addXeStore(x);
    }

    private void showQuanLyXeStore() {
        dsXe = (ArrayList<XeStore>) controllerXeStore.readDataFromFile("dsxe.txt");
        if (dsXe == null || dsXe.isEmpty()) {
            dsXe = new ArrayList<>();
        }
        this.showData(dsXe, tblModelXeCuaHang);
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
        if (dsHD == null || dsHD.isEmpty()) {
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

