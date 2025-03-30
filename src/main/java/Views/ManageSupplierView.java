package Views;


import javax.swing.JOptionPane;
import Controllers.SupplierController;
import Models.Supplier;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

public class ManageSupplierView extends javax.swing.JFrame {

    Supplier objSupplier;
    SupplierController objSupplierController;
    Supplier[] SupplierArray;
    ArrayList<Supplier> SupplierList;
    int index;    
    
    public ManageSupplierView() {
        initComponents();
        objSupplierController = new SupplierController();
        SupplierArray = new Supplier[100];
        SupplierList = new ArrayList<>();
        index = 0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSupplierID = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,150));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Parts Suppliers");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Supplier ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Supplier Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SupplierID", "SupplierName", "E-mail", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSupplier);

        btnView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                        .addGap(28, 28, 28)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSupplierID, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(txtSupplierName)
                                    .addComponent(txtEmail)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 38, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(73, 73, 73))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(btnUpdate)
                                .addGap(74, 74, 74)
                                .addComponent(btnRemove))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)))))
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnReset))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 610, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org.me.mypics.resources/manas-taneja-G61BLezGo2s-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        String check = LoginUI.user;
        
        if (check.equals("emp")){
            EmpManageView Ui = new EmpManageView();
            this.setVisible(false);
            Ui.setVisible(true);
        } else if (check.equals("admn")){
            MainManageView Ui = new MainManageView();
            this.setVisible(false);
            Ui.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
        String SupID = txtSupplierID.getText();
        String SupName = txtSupplierName.getText();
        String Address = txtAddress.getText();
        String Email = txtEmail.getText();

        objSupplier = objSupplierController.AddSupplier(SupID, SupName, Address, Email);
        boolean result = objSupplierController.insertSupplierTODB(objSupplier);
        SupplierArray[index] = objSupplier;
        SupplierList.add(objSupplier);
        index++;
        if (result) {
            JOptionPane.showMessageDialog(rootPane, "Are you sure you want to Add record? ", "Alert", 1);
            JOptionPane.showMessageDialog(rootPane," Supplier have been Added to Database Successfully", "Info", 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error adding to Database", "Error", 0);
        }
        
        }catch(RuntimeException ex){
             if (txtSupplierName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Supplier name is Empty","Error",0);
            }
            if(txtSupplierID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Supplier ID is Empty","Error",0);
            }
            if(txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Supplier email is Empty","Error",0);
            }
            if (txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Supplier email is Empty","Error",0);

            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
        String SupID = txtSupplierID.getText();
        String SupName = txtSupplierName.getText();
        String Address = txtAddress.getText();
        String Email = txtEmail.getText();

        objSupplier = objSupplierController.AddSupplier(SupID, SupName, Address, Email);
        boolean result = objSupplierController.updateSupplierTODB(objSupplier);
        SupplierArray[index] = objSupplier;
        SupplierList.add(objSupplier);
        index++;
        
         if (result) {
            JOptionPane.showMessageDialog(rootPane, "Are you sure you want to Update record? ", "Alert", 1);
            JOptionPane.showMessageDialog(rootPane," Supplier have been Updated to Database Successfully", "Info", 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error updating to Database", "Error", 0);
        }
         
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(rootPane,"Can't Update Database","Error",0);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try{
        String SupID = txtSupplierID.getText();
        String SupName = txtSupplierName.getText();
        String Address = txtAddress.getText();
        String Email = txtEmail.getText();

        objSupplier = objSupplierController.AddSupplier(SupID, SupName, Address, Email);
        boolean result = objSupplierController.DeleteSupplierTODB(objSupplier);
        SupplierArray[index] = objSupplier;
        SupplierList.add(objSupplier);
        index++;
        
        if (result) {
            JOptionPane.showMessageDialog(rootPane, "Are you sure you want to Remove record? ", "Alert", 1);
            JOptionPane.showMessageDialog(rootPane,"  Information Removed from Database Successfully", "Info", 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error removing to Database", "Error", 0);
        }
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(rootPane,"Can't Remove Database","Error",0);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSupplierName.setText(null);
        txtSupplierID.setText(null);
        txtAddress.setText(null);
        txtEmail.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        String query = "select * from supplier";
                
        try {
            PreparedStatement singleConn = DBLayer.DatabaseConnection.con.prepareStatement(query);
            ResultSet rs = singleConn.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tblSupplier.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[] {rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3)});
            }
            rs.close();
            singleConn.close();
            
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tblSupplier.getSelectedRow();
        int col = tblSupplier.getSelectedColumn();
        String Sid = tblSupplier.getModel().getValueAt(row, 0).toString();
        String SName = tblSupplier.getModel().getValueAt(row, 1).toString();
        String email = tblSupplier.getModel().getValueAt(row, 2).toString();
        String address = tblSupplier.getModel().getValueAt(row, 3).toString();
        
        txtSupplierID.setText(Sid);
        txtSupplierName.setText(SName);
        txtEmail.setText(email);
        txtAddress.setText(address);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageSupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSupplierView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
}
