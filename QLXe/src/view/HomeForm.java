package view;


import controller.CaoDinhNhat.ControllerQuanLyChamSocXe;
import controller.NguyenDinhTang.QuanLyDangKyBangLai;
import controller.NguyenTrungQuan.QuanLyBaoHiem;
import controller.TrinhDucThang.ControllerQuanLyHoaDon;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.CaoDinhNhat.QuanLyChamSocXe;
import model.NguyenDinhTang.QuanLyDangKyBangLaiXe;
import model.NguyenTrungQuan.BaoHiemXeMay;
import model.TrinhDucThang.QuanLyHoaDon;
import view.QuanLyChamSocXe.Sua;
import view.QuanLyChamSocXe.ThemMoi;


public class HomeForm extends javax.swing.JFrame implements View{

    private int dongChon = -1;
    
    //    DATA FOR QUANLYBANGLAIXE
    private ArrayList<QuanLyDangKyBangLaiXe> dsDky;
    QuanLyDangKyBangLai file;
    private ArrayList<QuanLyDangKyBangLaiXe> dsDkyBanDau;
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
    private TreeSet<BaoHiemXeMay> listBH;
    private ArrayList<BaoHiemXeMay> listBH2;
    private DefaultTableModel modelBH;
    private QuanLyBaoHiem controllerBH;


    public HomeForm() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // SHOW QUANLYCHAMSOCXE
         dsQly = new ArrayList<>(); // khoi tao danh sach luu ds cham soc xe
        tblModelQLX = (DefaultTableModel) tblDanhSachXe.getModel(); 
        controllerQLX = new ControllerQuanLyChamSocXe();
        showQuanLyChamSocXe();
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
        tblDSBLX = new javax.swing.JTable();
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
        jPanel6 = new javax.swing.JPanel();
        txtTimKiemBH = new javax.swing.JTextField();
        radioBtnMaBH = new javax.swing.JRadioButton();
        radioBtnChuXe = new javax.swing.JRadioButton();
        btnRFBH = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblBaoHiem = new javax.swing.JTable();
        cbbSapXepBH = new javax.swing.JComboBox<>();
        btnThemBH = new javax.swing.JButton();
        btnSuaBH = new javax.swing.JButton();
        btnXoaBH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTimKiemBH = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Panle_timKiem = new javax.swing.JPanel();
        RadioSearchByMaHD = new javax.swing.JRadioButton();
        RadioSearchByKH = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        btTimHD = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btThemHD = new javax.swing.JButton();
        btSuaHD = new javax.swing.JButton();
        btXoaHD = new javax.swing.JButton();
        btXemChiTietHD = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        RadioSortTT = new javax.swing.JRadioButton();
        RadioSortByTime = new javax.swing.JRadioButton();
        jbtXep = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblQLHD = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ứng dụng hỗ trợ chăm sóc xe và đào tạo bằng lái ");

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
        jLabel5.setText("DANH SÁCH CHĂM SÓC XE");

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
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiemBSX, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnSua)
                .addGap(60, 60, 60)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTimKiemBSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(comboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMoi)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnQuayLai))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý chăm sóc xe", jPanel2);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DANH SÁCH ĐĂNG KÝ BẰNG LÁI XE");

        tblDSBLX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDSBLX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ và tên", "Số điện thoại", "Địa chỉ", "Ngày đăng ký", "Loại bằng"
            }
        ));
        jScrollPane1.setViewportView(tblDSBLX);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Họ và tên: ");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                jButton4ActionPerformed(evt);
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTenTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTim)
                .addGap(109, 109, 109)
                .addComponent(sortByName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortByDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(93, 93, 93)
                .addComponent(jButton2)
                .addGap(88, 88, 88)
                .addComponent(jButton3)
                .addGap(62, 62, 62)
                .addComponent(jButton4)
                .addGap(144, 144, 144))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnTim)
                    .addComponent(txtHoTenTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortByDate)
                    .addComponent(Sort)
                    .addComponent(sortByName))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý đăng ký bằng lái xe", jPanel5);

        txtTimKiemBH.setToolTipText("Nhập thông tin để tìm kiếm");
        txtTimKiemBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemBHActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioBtnMaBH);
        radioBtnMaBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioBtnMaBH.setText("Mã bảo hiểm");
        radioBtnMaBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaBHActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioBtnChuXe);
        radioBtnChuXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioBtnChuXe.setText("Chủ xe");
        radioBtnChuXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnChuXeActionPerformed(evt);
            }
        });

        btnRFBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRFBH.setText("Refresh");
        btnRFBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRFBHActionPerformed(evt);
            }
        });

        tblBaoHiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã bảo hiểm", "Chủ xe", "Biển số", "Loại xe", "Ngày bắt đầu", "Ngày kết thúc", "Phí bảo hiểm"
            }
        ));
        jScrollPane5.setViewportView(tblBaoHiem);

        cbbSapXepBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbSapXepBH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp theo loại xe", "Sắp xếp theo phí BH" }));
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
        jLabel1.setText("QUẢN LÝ BẢO HIỂM XE MÁY");

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
            .addComponent(jScrollPane5)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(radioBtnMaBH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioBtnChuXe))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtTimKiemBH, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiemBH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbSapXepBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnRFBH, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnThemBH)
                .addGap(50, 50, 50)
                .addComponent(btnSuaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnXoaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiemBH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiemBH)
                        .addComponent(cbbSapXepBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnMaBH)
                    .addComponent(radioBtnChuXe))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRFBH)
                    .addComponent(btnThemBH)
                    .addComponent(btnSuaBH)
                    .addComponent(btnXoaBH))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý bảo hiểm", jPanel6);

        Panle_timKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        Panle_timKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonGroup1.add(RadioSearchByMaHD);
        RadioSearchByMaHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RadioSearchByMaHD.setText("Mã HĐ");

        buttonGroup1.add(RadioSearchByKH);
        RadioSearchByKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RadioSearchByKH.setText("Khách hàng");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btTimHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btTimHD.setText("Tìm");
        btTimHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panle_timKiemLayout = new javax.swing.GroupLayout(Panle_timKiem);
        Panle_timKiem.setLayout(Panle_timKiemLayout);
        Panle_timKiemLayout.setHorizontalGroup(
            Panle_timKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panle_timKiemLayout.createSequentialGroup()
                .addGroup(Panle_timKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panle_timKiemLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panle_timKiemLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Panle_timKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearch)
                            .addGroup(Panle_timKiemLayout.createSequentialGroup()
                                .addComponent(RadioSearchByMaHD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(RadioSearchByKH)))))
                .addGap(30, 30, 30))
        );
        Panle_timKiemLayout.setVerticalGroup(
            Panle_timKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panle_timKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panle_timKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioSearchByMaHD)
                    .addComponent(RadioSearchByKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btTimHD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp xếp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonGroup2.add(RadioSortTT);
        RadioSortTT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RadioSortTT.setText("Tăng dần theo tổng thanh toán");

        buttonGroup2.add(RadioSortByTime);
        RadioSortByTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RadioSortByTime.setText("Thời gian gần nhất");

        jbtXep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtXep.setText("Xếp");
        jbtXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtXep, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RadioSortTT)
                        .addComponent(RadioSortByTime)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioSortTT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioSortByTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtXep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Panle_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panle_timKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý hóa đơn", jPanel7);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTimHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimHDActionPerformed
//     
    }//GEN-LAST:event_btTimHDActionPerformed

    private void btThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemHDActionPerformed

    }//GEN-LAST:event_btThemHDActionPerformed

    private void btSuaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaHDActionPerformed

    }//GEN-LAST:event_btSuaHDActionPerformed

    private void btXoaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaHDActionPerformed

    }//GEN-LAST:event_btXoaHDActionPerformed

    private void btXemChiTietHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemChiTietHDActionPerformed

    }//GEN-LAST:event_btXemChiTietHDActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

    }//GEN-LAST:event_btnResetActionPerformed

    private void jbtXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXepActionPerformed

    }//GEN-LAST:event_jbtXepActionPerformed

    private void tblQLHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLHDMouseClicked

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

    private void txtTimKiemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemBHActionPerformed

    private void radioBtnMaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaBHActionPerformed

    private void radioBtnChuXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnChuXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnChuXeActionPerformed

    private void btnRFBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRFBHActionPerformed
       
    }//GEN-LAST:event_btnRFBHActionPerformed

    private void cbbSapXepBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSapXepBHActionPerformed

    }//GEN-LAST:event_cbbSapXepBHActionPerformed

    private void btnThemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBHActionPerformed


    }//GEN-LAST:event_btnThemBHActionPerformed

    private void btnSuaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaBHActionPerformed

    }//GEN-LAST:event_btnSuaBHActionPerformed

    private void btnXoaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBHActionPerformed
       
    }//GEN-LAST:event_btnXoaBHActionPerformed

    private void btnTimKiemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemBHActionPerformed
       
    }//GEN-LAST:event_btnTimKiemBHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtHoTenTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenTimKiemActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
       
      
    }//GEN-LAST:event_btnTimActionPerformed

    private void sortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameActionPerformed

    }//GEN-LAST:event_sortByNameActionPerformed

    private void sortByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortByDateActionPerformed

    private void SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortActionPerformed
      
    }//GEN-LAST:event_SortActionPerformed

    private void txtTimKiemBSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemBSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemBSXActionPerformed

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
    private javax.swing.JPanel Panle_timKiem;
    private javax.swing.JRadioButton RadioSearchByKH;
    private javax.swing.JRadioButton RadioSearchByMaHD;
    private javax.swing.JRadioButton RadioSortByTime;
    private javax.swing.JRadioButton RadioSortTT;
    private javax.swing.JButton Sort;
    private javax.swing.JButton btSuaHD;
    private javax.swing.JButton btThemHD;
    private javax.swing.JButton btTimHD;
    private javax.swing.JButton btXemChiTietHD;
    private javax.swing.JButton btXoaHD;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnRFBH;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JButton jbtXep;
    private javax.swing.JRadioButton radioBtnChuXe;
    private javax.swing.JRadioButton radioBtnMaBH;
    private javax.swing.JRadioButton sortByDate;
    private javax.swing.JRadioButton sortByName;
    private javax.swing.JTable tblBaoHiem;
    private javax.swing.JTable tblDSBLX;
    private javax.swing.JTable tblDanhSachXe;
    private javax.swing.JTable tblQLHD;
    private javax.swing.JTextField txtHoTenTimKiem;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTimKiemBH;
    private javax.swing.JTextField txtTimKiemBSX;
    // End of variables declaration//GEN-END:variables

     @Override
    public <T> void showData(ArrayList<T> list, DefaultTableModel model) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        model.setRowCount(0);
        for (T t : list) {
            if (t instanceof QuanLyDangKyBangLaiXe) {
                QuanLyDangKyBangLaiXe blx = (QuanLyDangKyBangLaiXe) t;
                tblModelBLX.addRow(new Object[]{
                    blx.getHoTen(), blx.getSdt(), blx.getDiaChi(), blx.getNgayDky(), blx.getLoaiBang()
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
            if (t instanceof BaoHiemXeMay) {
                BaoHiemXeMay bh = (BaoHiemXeMay) t;
                model.addRow(new Object[]{
                    bh.getMaBH(), bh.getCar().getChuSoHuu().getHoTen(), bh.getCar().getBienSoXe(),
                    bh.getCar().getLoaiXe(), bh.getTimeStart().format(dateFormatter),
                    bh.getTimeEnd().format(dateFormatter), bh.getCost()

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
        if (dsQly == null) {
            dsQly = new ArrayList<>();
        }
        this.showData(dsQly, tblModelQLX);
    }
}
