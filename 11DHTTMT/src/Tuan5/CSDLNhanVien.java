package Tuan5;
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
import javax.swing.table.DefaultTableModel;

public class CSDLNhanVien extends javax.swing.JFrame {

    public CSDLNhanVien() {
        initComponents();
        ShowNhanVien();
    }
private List<NhanVien> getAllNV() {
    List<NhanVien> ListAllNV = 
            new ArrayList<NhanVien>();
      Connection conn=null;
        String url="jdbc:jtds:sqlserver://localhost:1433/javaTuan4TaiLop";
        String user="sa";
        String password="abc123!";
        String sql = "SELECT * FROM DuLieuNhanVien";
        Statement stmt = null;
        ResultSet rsSet = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt =conn.createStatement();
            rsSet = stmt.executeQuery(sql);
            NhanVien nhanvien =null;
            while (rsSet.next()){
                nhanvien =new NhanVien();
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
        }
        catch (SQLException ex){
             Logger.getLogger(CSDLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    return ListAllNV;
}

private void ShowNhanVien() {
    List<NhanVien> listNV = getAllNV();
    DefaultTableModel model = 
            (DefaultTableModel) TBList.getModel();
    Object [] row = new Object[5];
    for(int i=0; i < listNV.size(); i++){
        row[0] = listNV.get(i).getName();
        row[1] = listNV.get(i).getAddress();
         row[2] = listNV.get(i).getGender();
        row[3] = listNV.get(i).getKnowledge();
         row[4] = listNV.get(i).getSubject();
         model.addRow(row);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBList = new javax.swing.JTable();

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

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TBList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Gender", "Knowledge", "Subject"
            }
        ));
        jScrollPane1.setViewportView(TBList);

        javax.swing.GroupLayout jpRootLayout = new javax.swing.GroupLayout(jpRoot);
        jpRoot.setLayout(jpRootLayout);
        jpRootLayout.setHorizontalGroup(
            jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRootLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lbName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(45, 45, 45)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpRootLayout.createSequentialGroup()
                        .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Male)
                            .addComponent(Java)
                            .addComponent(btnSave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Female)
                                .addComponent(Python))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txtAdd)
                    .addComponent(txtName)
                    .addComponent(Subject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
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
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Java, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Python))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

         Connection conn=null;
        String url="jdbc:jtds:sqlserver://localhost:1433/javaTuan4TaiLop";
        String user="sa";
        String password="abc123!";
        String sql = "INSERT INTO DuLieuNhanVien" + " VALUES (? , ? , ? , ? , ? )";
        PreparedStatement preStmt= null;
        String Name =txtName.getText();
        String Address = txtAdd.getText();
        String strSubject = Subject.getSelectedItem().toString();
        String Gender= "";
            if(Male.isSelected()){
                Gender = "Male";
            }else{
                Gender = "Female";
            }
            String Knowledge = "";
        if(Java.isSelected()){
            Knowledge = Knowledge + "Java";
        }
        if(Java.isSelected()){
            Knowledge = Knowledge + "Python";
        }
         int row =  0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt=conn.prepareStatement(sql);
            preStmt.setString(1, Name);
            preStmt.setString(2, Address);
            preStmt.setString(3, Gender);
            preStmt.setString(4, Knowledge);
            preStmt.setString(5, strSubject);
            row = preStmt.executeUpdate();
            System.out.println("Row inserted"+row);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CSDLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CSDLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSDLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSDLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSDLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSDLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JCheckBox Java;
    private javax.swing.JRadioButton Male;
    private javax.swing.JCheckBox Python;
    private javax.swing.JComboBox Subject;
    private javax.swing.JTable TBList;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
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
