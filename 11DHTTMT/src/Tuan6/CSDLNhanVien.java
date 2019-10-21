package Tuan6;

import Tuan5.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CSDLNhanVien extends javax.swing.JFrame {

    public CSDLNhanVien() {
        initComponents();
        ShowNhanVien();
    }

    private List<NhanVien> getAllNV() {
        List<NhanVien> ListAllNV
                = new ArrayList<NhanVien>();
        Connection conn = null;
        String url = "jdbc:jtds:sqlserver://localhost:1433/javaTuan4TaiLop";
        String user = "sa";
        String password = "abc123!";
        String sql = "SELECT * FROM DuLieuNhanVien";
        Statement stmt = null;
        ResultSet rsSet = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            rsSet = stmt.executeQuery(sql);
            NhanVien nhanvien = null;
            while (rsSet.next()) {
                nhanvien = new NhanVien();
                nhanvien.setId(rsSet.getInt("ID"));
                nhanvien.setName(rsSet.getString("name"));
                nhanvien.setAddress(rsSet.getString("Address"));
                nhanvien.setGender(rsSet.getString("Gender"));
                nhanvien.setKnowledge(rsSet.getString("Knowledge"));
                nhanvien.setSubject(rsSet.getString("strSubject"));
                ListAllNV.add(nhanvien);
            }
            conn.close();
            rsSet.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CSDLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListAllNV;
    }

    private void ShowNhanVien() {
        List<NhanVien> listNV = getAllNV();
        DefaultTableModel model
                = (DefaultTableModel) TBList.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listNV.size(); i++) {
            row[0] = listNV.get(i).getId();
            row[1] = listNV.get(i).getName();
            row[2] = listNV.get(i).getAddress();
            row[3] = listNV.get(i).getGender();
            row[4] = listNV.get(i).getKnowledge();
            row[5] = listNV.get(i).getSubject();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpRoot = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Subject = new javax.swing.JComboBox();
        Java = new javax.swing.JCheckBox();
        Python = new javax.swing.JCheckBox();
        Reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBList = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbName.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("Gender");

        jLabel4.setText("Knowledge");

        jLabel5.setText("Subject");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        buttonGroup1.add(Male);
        Male.setText("Male");

        buttonGroup1.add(Female);
        Female.setText("Female");

        Subject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer Science", "doctor", "Managerment", "Good Boy" }));

        Java.setText("Java");

        Python.setText("Python");

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        TBList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Gender", "Knowledge", "Subject"
            }
        ));
        TBList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBList);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRootLayout = new javax.swing.GroupLayout(jpRoot);
        jpRoot.setLayout(jpRootLayout);
        jpRootLayout.setHorizontalGroup(
            jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRootLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(lbName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Update))
                .addGap(28, 28, 28)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRootLayout.createSequentialGroup()
                        .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtName)
                            .addComponent(Subject, 0, 142, Short.MAX_VALUE)
                            .addComponent(txtAdd, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRootLayout.createSequentialGroup()
                        .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpRootLayout.createSequentialGroup()
                                .addComponent(Java)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Python))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpRootLayout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(Delete))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpRootLayout.createSequentialGroup()
                                .addComponent(Male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Female)))
                        .addGap(10, 10, 10)
                        .addComponent(Reset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpRootLayout.setVerticalGroup(
            jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRootLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Male)
                    .addComponent(Female))
                .addGap(30, 30, 30)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Java, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Python))
                .addGap(22, 22, 22)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset)
                    .addComponent(Update)
                    .addComponent(btnSave)
                    .addComponent(Delete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Connection conn = null;
        String url = "jdbc:jtds:sqlserver://localhost:1433/javaTuan4TaiLop";
        String user = "sa";
        String password = "abc123!";
        String sql = "INSERT INTO DuLieuNhanVien" + " VALUES (? , ? , ? , ? , ? )";
        PreparedStatement preStmt = null;
        String Name = txtName.getText();
        String Address = txtAdd.getText();
        String strSubject = Subject.getSelectedItem().toString();
        String Gender = "";
        if (Male.isSelected()) {
            Gender = "Male";
        } else {
            Gender = "Female";
        }
        String Knowledge = "";
        if (Java.isSelected()) {
            Knowledge = Knowledge + Java.getText() + " ";
            //Java@
        }

        if (Python.isSelected()) {
            Knowledge = Knowledge + Python.getText() + " ";
            //Python@
        }

        strSubject = Subject.getSelectedItem().toString();
        int row = 0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, Name);
            preStmt.setString(2, Address);
            preStmt.setString(3, Gender);
            preStmt.setString(4, Knowledge);
            preStmt.setString(5, strSubject);
            row = preStmt.executeUpdate();
            System.out.println("Row inserted" + row);
            DefaultTableModel model = (DefaultTableModel) TBList.getModel();
            model.setRowCount(0);
            ShowNhanVien();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CSDLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        txtName.setText("");
        txtAdd.setText("");
        Male.setSelected(true);
        Java.setSelected(true);
        Python.setSelected(false);
        Subject.setSelectedIndex(0);
    }//GEN-LAST:event_ResetActionPerformed

    private void TBListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBListMouseClicked
        // TODO add your handling code here:
        int rowIndex = TBList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) TBList.getModel();
        txtName.setText(model.getValueAt(rowIndex, 1).toString());
        txtAdd.setText(model.getValueAt(rowIndex, 2).toString());
        String Gender = model.getValueAt(rowIndex, 3).toString();
        if (Gender.equals("Male")) {
            Male.setSelected(true);
        } else {
            Female.setSelected(true);
        }

        String Knowledge = model.getValueAt(rowIndex, 4).toString();
        switch (Knowledge) {
            case "Java ":
                Java.setSelected(true);
                Python.setSelected(false);
                break;
            case "Python ":
                Java.setSelected(false);
                Python.setSelected(true);
                break;
            default:
                Java.setSelected(true);
                Python.setSelected(true);
                break;
        }

        String subject = model.getValueAt(rowIndex, 5).toString().trim();
        switch (subject) {
            case "Computer Science":
                Subject.setSelectedIndex(0);
                break;
            case "doctor":
                Subject.setSelectedIndex(1);
                break;
            case "Managerment":
                Subject.setSelectedIndex(2);
                break;
            case "Good Boy":
                Subject.setSelectedIndex(3);
                break;
        }
    }//GEN-LAST:event_TBListMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        Connection conn = null;
        String url = "jdbc:jtds:sqlserver://localhost:1433/javaTuan4TaiLop";
        String user = "sa";
        String password = "abc123!";
        String Id;
        int rowIndex = TBList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) TBList.getModel();
        Id = model.getValueAt(rowIndex, 0).toString();
        String sql = " UPDATE DuLieuNhanVien SET name=?, Address=?, Gender=?, Knowledge=?, strSubject=? WHERE Id=" + Id;
        PreparedStatement preStmt = null;
        String Name = txtName.getText();
        String Address = txtAdd.getText();
        String strSubject = Subject.getSelectedItem().toString();
        String Gender = "";
        if (Male.isSelected()) {
            Gender = "Male";
        } else {
            Gender = "Female";
        }
        String Knowledge = "";
        if (Java.isSelected()) {
            Knowledge = Knowledge + Java.getText() + " ";
            //Java@
        }

        if (Python.isSelected()) {
            Knowledge = Knowledge + Python.getText() + " ";
            //Python@
        }

        strSubject = Subject.getSelectedItem().toString();
        int row = 0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, Name);
            preStmt.setString(2, Address);
            preStmt.setString(3, Gender);
            preStmt.setString(4, Knowledge);
            preStmt.setString(5, strSubject);
            row = preStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Seccessfully!");
            model.setRowCount(0);
            ShowNhanVien();
            System.out.println("Row inserted" + row);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CSDLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
         int opt = JOptionPane.showConfirmDialog(null, "Ban co that su muon xoa khong ha??",  "Delete", JOptionPane.YES_NO_OPTION);
       if (opt ==0){ 
       Connection conn = null;
        String url = "jdbc:jtds:sqlserver://localhost:1433/javaTuan4TaiLop";
        String user = "sa";
        String password = "abc123!";
        String Id;
        int rowIndex = TBList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) TBList.getModel();
        Id = model.getValueAt(rowIndex, 0).toString();
        String sql = " DELETE DuLieuNhanVien WHERE Id =" +Id;
        PreparedStatement preStmt = null;
        int row = 0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            row = preStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Seccessfully!");
            model.setRowCount(0);
            ShowNhanVien();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CSDLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } }                     
    }//GEN-LAST:event_DeleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSDLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JRadioButton Female;
    private javax.swing.JCheckBox Java;
    private javax.swing.JRadioButton Male;
    private javax.swing.JCheckBox Python;
    private javax.swing.JButton Reset;
    private javax.swing.JComboBox Subject;
    private javax.swing.JTable TBList;
    private javax.swing.JButton Update;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpRoot;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
