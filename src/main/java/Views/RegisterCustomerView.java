package Views;

import javax.swing.JOptionPane;
import Controllers.RegisterCustomerController;
import Models.RegisterCustomer;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class RegisterCustomerView extends javax.swing.JFrame {

    RegisterCustomer objCustomer;
    RegisterCustomerController Customercontrollerobj;
    RegisterCustomer[] CustomerArray;
    ArrayList<RegisterCustomer> CustomerList;
    int index;
    
    
    
    public RegisterCustomerView() {
        initComponents();
        Customercontrollerobj = new RegisterCustomerController();
        CustomerArray = new RegisterCustomer[100];
        CustomerList = new ArrayList<>();
        index = 0;
        ViewTable();
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
        txtCutomerID = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register Customer");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CustomerID", "CustomerName", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSelect)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCutomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(txtCustomerName)))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate)
                            .addComponent(btnAdd)
                            .addComponent(btnRemove))
                        .addGap(156, 156, 156))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCutomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnRemove)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnSelect)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnBack))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 550, 680));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org.me.mypics.resources/2048x1288-px-Bert-Seinstra-clocks-dark-monochrome-1426337-wallhere.com.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -240, 650, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ViewTable(){
        String query = "select * from customer";
                
        try {
            PreparedStatement singleConn = DBLayer.DatabaseConnection.con.prepareStatement(query);
            ResultSet rs = singleConn.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tblCustomer.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
            rs.close();
            singleConn.close();
            
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
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
        System.out.println(evt);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            String CustomerName = txtCustomerName.getText();
            String CustomerID = txtCutomerID.getText();
            String Email = txtEmail.getText();
            String Address = txtAddress.getText();

            objCustomer = Customercontrollerobj.addCustomer(CustomerName, CustomerID, Email, Address);
            boolean result=Customercontrollerobj.insertCustomerToDB(objCustomer);
            CustomerArray[index] = objCustomer;
            CustomerList.add(CustomerArray[index]);
            index++;
            if (evt.getSource() == btnAdd){
                ViewTable();
            }
            if(result){
                JOptionPane.showMessageDialog(rootPane, "Are you sure you want to Add record? ","Alert",1);
                JOptionPane.showMessageDialog(rootPane, (index) + " Customer have been Added to Database Successfully", "Info", 1);
            }else{
               JOptionPane.showMessageDialog(rootPane, "Error adding to Database", "Error", 0); 
            }
 
        }catch(RuntimeException ex){
            if (txtCustomerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Customer name is Empty","Error",0);
            }
            if(txtCutomerID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Customer ID is Empty","Error",0);
            }
            if(txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Customer email is Empty","Error",0);
            }
            if (txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Customer email is Empty","Error",0);

            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            String CustomerName = txtCustomerName.getText();
            String CustomerID = txtCutomerID.getText();
            String Email = txtEmail.getText();
            String Address = txtAddress.getText();

            objCustomer = Customercontrollerobj.updateCustomer(CustomerName, CustomerID, Email, Address);
            boolean result=Customercontrollerobj.updateCustomerToDB(objCustomer);
            CustomerArray[index] = objCustomer;
            CustomerList.add(CustomerArray[index]);
            index++;
            
            if (evt.getSource() == btnUpdate){
                ViewTable();
            }
            if(result){
                JOptionPane.showMessageDialog(rootPane, "Are you sure you want to Update the record? ","Alert",1);
                JOptionPane.showMessageDialog(rootPane, " Information have been Updated to Database Successfully", "Info", 1);
            }else{
               JOptionPane.showMessageDialog(rootPane, "Error updating the Database", "Error", 0); 
            }  
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(rootPane,"Can't Update Database","Error",0);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try{
            String CustomerName = txtCustomerName.getText();
            String CustomerID = txtCutomerID.getText();
            String Email = txtEmail.getText();
            String Address = txtAddress.getText();

            objCustomer = Customercontrollerobj.deleteCustomer(CustomerName, CustomerID, Email, Address);
            boolean result=Customercontrollerobj.deleteCustomerToDB(objCustomer);
            CustomerArray[index] = objCustomer;
            CustomerList.remove(CustomerArray[index]);
            index++;
            
            if (evt.getSource() == btnRemove){
                ViewTable();
            }
             
            if(result){
                JOptionPane.showMessageDialog(rootPane, "Are you sure you want to Remove the record? ","Alert",1);
                JOptionPane.showMessageDialog(rootPane, " Information Removed from Database Successfully", "Info", 1);
            }else{
               JOptionPane.showMessageDialog(rootPane, "Error removing the Data", "Error", 0); 
            }  
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(rootPane,"Can't Remove Data","Error",0);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtCutomerID.setText(null);
        txtCustomerName.setText(null);
        txtEmail.setText(null);
        txtAddress.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        int row = tblCustomer.getSelectedRow();
        
        String CustomerID = tblCustomer.getModel().getValueAt(row, 0).toString();
        String CustomerName = tblCustomer.getModel().getValueAt(row, 1).toString();
        String Address = tblCustomer.getModel().getValueAt(row, 2).toString();
        String Email = tblCustomer.getModel().getValueAt(row, 3).toString();
        
        txtCutomerID.setText(CustomerID);
        txtCustomerName.setText(CustomerName);
        txtAddress.setText(Address);
        txtEmail.setText(Email);
    }//GEN-LAST:event_btnSelectActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCutomerID;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
