package KiemTraGiuaKi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class danhSachSinhVien extends javax.swing.JFrame {

    public danhSachSinhVien() {
        initComponents();
         ShowSinhVien();
    }
private List<SinhVien> getAllSV() {
        List<SinhVien> ListAllSV
                = new ArrayList<SinhVien>();
        Connection conn = null;
        String url = "jdbc:jtds:sqlserver://localhost:1433/QLSV";
        String user = "sa";
        String password = "abc123!";
        String sql = "SELECT * FROM sinhVien";
        Statement stmt = null;
        ResultSet rsSet = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            rsSet = stmt.executeQuery(sql);
            SinhVien sinhVien = null;
            while (rsSet.next()) {
                sinhVien = new SinhVien();
                sinhVien.setId(rsSet.getInt("ID"));
                sinhVien.setMaSV(rsSet.getString("MaSV"));
                sinhVien.setHo_Ten(rsSet.getString("Ho_Ten"));
                sinhVien.setNam_Sinh(rsSet.getString("Nam_Sinh"));
                ListAllSV.add(sinhVien);
            }
            conn.close();
            rsSet.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListAllSV;
    }

 private void ShowSinhVien() {
       List<SinhVien> listSV = getAllSV();
       DefaultTableModel model
                = (DefaultTableModel) BangSV.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listSV.size(); i++) {
            row[0] = listSV.get(i).getId();
            row[1] = listSV.get(i).getMaSV();
            row[2] = listSV.get(i).getHo_Ten();
            row[3] = listSV.get(i).getNam_Sinh();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        Them = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        Luu = new javax.swing.JButton();
        kLuu = new javax.swing.JButton();
        Thoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangSV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DANH SÁCH SINH VIÊN");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Năm Sinh");

        jLabel4.setText("Họ Tên");

        Them.setText("Thêm");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        Xoa.setText("Xóa");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        Sua.setText("Sửa");
        Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaActionPerformed(evt);
            }
        });

        Luu.setText("Lưu");
        Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuActionPerformed(evt);
            }
        });

        kLuu.setText("K.Lưu");
        kLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kLuuActionPerformed(evt);
            }
        });

        Thoat.setText("Thoát");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });

        BangSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Mã Sinh Viên", "Họ Và Tên", "Năm Sinh"
            }
        ));
        BangSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BangSV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Them)
                                .addGap(44, 44, 44)
                                .addComponent(Xoa)
                                .addGap(48, 48, 48)
                                .addComponent(Sua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Luu)
                                .addGap(51, 51, 51)
                                .addComponent(kLuu)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNam))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(50, 50, 50)
                        .addComponent(Thoat))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Them)
                    .addComponent(Xoa)
                    .addComponent(Sua)
                    .addComponent(Luu)
                    .addComponent(kLuu)
                    .addComponent(Thoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        Connection conn = null;
       String url = "jdbc:jtds:sqlserver://localhost:1433/QLSV";
        String user = "sa";
        String password = "abc123!";
        String sql = "INSERT INTO sinhVien" + " VALUES (? , ? , ? )";
        PreparedStatement preStmt = null;
        String Ma_SV = txtMa.getText();
        String Ho_Ten = txtTen.getText();
        String Nam_Sinh = txtNam.getText();
        int row = 0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, Ma_SV);
            preStmt.setString(2, Ho_Ten);
            preStmt.setString(3, Nam_Sinh);
            row = preStmt.executeUpdate();
            System.out.println("Row inserted" + row);
            DefaultTableModel model = (DefaultTableModel) BangSV.getModel();
            model.setRowCount(0);
            ShowSinhVien();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ThemActionPerformed

    private void kLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kLuuActionPerformed
 txtMa.setText("");
        txtTen.setText("");
       txtNam.setText("");
    }//GEN-LAST:event_kLuuActionPerformed

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ThoatActionPerformed

    private void SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaActionPerformed
  Connection conn = null;
         String url = "jdbc:jtds:sqlserver://localhost:1433/QLSV";
        String user = "sa";
        String password = "abc123!";
        String Id;
        int rowIndex = BangSV.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) BangSV.getModel();
        Id = model.getValueAt(rowIndex, 0).toString();
        String sql = " UPDATE sinhVien SET MaSV=?, Ho_Ten=?, Nam_Sinh=? WHERE Id=" + Id;
        PreparedStatement preStmt = null;
        String MaSV = txtMa.getText();
        String Ho_Ten = txtTen.getText();
        String Nam_Sinh = txtNam.getText();
        int row = 0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, MaSV);
            preStmt.setString(2, Ho_Ten);
            preStmt.setString(3, Nam_Sinh);
            row = preStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sua xong!");
            model.setRowCount(0);
            ShowSinhVien();
            System.out.println("Row inserted" + row);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SuaActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
   int opt = JOptionPane.showConfirmDialog(null, "Ban co that su muon xoa khong ha??",  "Delete", JOptionPane.YES_NO_OPTION);
       if (opt ==0){ 
       Connection conn = null;
        String url = "jdbc:jtds:sqlserver://localhost:1433/QLSV";
        String user = "sa";
        String password = "abc123!";
        String id;
        int rowIndex = BangSV.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) BangSV.getModel();
        id = model.getValueAt(rowIndex, 0).toString();
        String sql = " DELETE sinhVien WHERE id =" +id;
        PreparedStatement preStmt = null;
        int row = 0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            row = preStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Seccessfully!");
            model.setRowCount(0);
            ShowSinhVien();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } }                     
    }                                      

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new danhSachSinhVien().setVisible(true);
            }
        });
    }//GEN-LAST:event_XoaActionPerformed

    private void BangSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangSVMouseClicked
        int rowIndex = BangSV.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) BangSV.getModel();
        txtMa.setText(model.getValueAt(rowIndex, 1).toString());
        txtTen.setText(model.getValueAt(rowIndex, 2).toString());
      txtNam.setText(model.getValueAt(rowIndex, 2).toString());                                       
    }//GEN-LAST:event_BangSVMouseClicked

    private void LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuActionPerformed
   Connection conn = null;
       String url = "jdbc:jtds:sqlserver://localhost:1433/QLSV";
        String user = "sa";
        String password = "abc123!";
        String sql = "INSERT INTO sinhVien" + " VALUES (? , ? , ? )";
        PreparedStatement preStmt = null;
        String Ma_SV = txtMa.getText();
        String Ho_Ten = txtTen.getText();
        String Nam_Sinh = txtNam.getText();
        int row = 0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, Ma_SV);
            preStmt.setString(2, Ho_Ten);
            preStmt.setString(3, Nam_Sinh);
            row = preStmt.executeUpdate();
            System.out.println("Row inserted" + row);
            DefaultTableModel model = (DefaultTableModel) BangSV.getModel();
            model.setRowCount(0);
            ShowSinhVien();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LuuActionPerformed


 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangSV;
    private javax.swing.JButton Luu;
    private javax.swing.JButton Sua;
    private javax.swing.JButton Them;
    private javax.swing.JButton Thoat;
    private javax.swing.JButton Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kLuu;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
