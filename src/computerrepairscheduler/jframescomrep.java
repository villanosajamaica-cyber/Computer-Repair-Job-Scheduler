
package computerrepairscheduler;


public class jframescomrep extends javax.swing.JFrame {
    private RepairJobQueue queue = new RepairJobQueue(100);

    
    public jframescomrep() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblJobId = new javax.swing.JTextField();
        lblCustomerName = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        lblRepairInfo = new javax.swing.JLabel();
        txtJobId = new javax.swing.JLabel();
        txtDeviceName = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        txtProblem = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRemoveNext = new javax.swing.JButton();
        txtSearch = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecords = new javax.swing.JTextArea();

        jTextField5.setText("YYYY-MM-DD");

        jButton4.setText("jButton4");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Computer Repair Job Scheduler");

        lblJobId.setText("Enter Job ID");

        lblCustomerName.setText("Customer Name:");

        jTextField3.setText("Enter device");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("YYYY-MM-DD");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        lblRepairInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRepairInfo.setText("Repair Information");

        txtJobId.setText("Job ID");

        txtDeviceName.setText("Device Name");

        txtDate.setText("Appointment Date");

        jTextField6.setText("Enter name");

        txtCustomerName.setText("Customer Name");

        jTextField7.setText("e.g. 09:00 AM");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        txtProblem.setText("Problem Description");

        txtTime.setText("Appointment Time");

        btnAdd.setBackground(new java.awt.Color(0, 153, 0));
        btnAdd.setText("ADD REPAIR");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");

        btnRemoveNext.setText("REMOVE NEXT");

        txtSearch.setText("Search Repair Job");

        jTextField8.setText("Enter Job ID");

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel10.setText("Repair Job Queue");

        txtRecords.setColumns(20);
        txtRecords.setRows(5);
        jScrollPane1.setViewportView(txtRecords);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(txtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJobId)
                            .addComponent(txtDeviceName)
                            .addComponent(jTextField3)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch)
                            .addComponent(jTextField8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCustomerName)
                                    .addComponent(txtProblem)
                                    .addComponent(lblCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(jTextField6)
                                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))))
                    .addComponent(jScrollPane1)
                    .addComponent(lblRepairInfo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveNext)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblRepairInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJobId)
                    .addComponent(txtCustomerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJobId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeviceName)
                    .addComponent(txtProblem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate)
                    .addComponent(txtTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnRemoveNext))
                .addGap(28, 28, 28)
                .addComponent(txtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
String jobId = txtSearch.getText().trim();

// Check if the search field is empty
if (jobId.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Please enter a Job ID.");
    return;
}

// Search for the repair job in the Queue
RepairJob found = queue.search(jobId);

if (found != null) {

    javax.swing.JOptionPane.showMessageDialog(
            this,
            found.toString(),
            "Repair Job Found",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
    );

} else {

    javax.swing.JOptionPane.showMessageDialog(
            this,
            "No repair job found with ID: " + jobId,
            "Search Result",
            javax.swing.JOptionPane.WARNING_MESSAGE
    );
}

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
String jobId = txtJobId.getText().trim();
String customer = txtCustomerName.getText().trim();
String device = txtDeviceName.getText().trim();
String problem = txtProblem.getText().trim();
String date = txtDate.getText().trim();
String time = txtTime.getText().trim();

// Validate all fields
if (jobId.isEmpty() || customer.isEmpty()
        || device.isEmpty() || problem.isEmpty()
        || date.isEmpty() || time.isEmpty()) {

    javax.swing.JOptionPane.showMessageDialog(
            this, "Please fill in all fields.");
    return;
}

// Check duplicate Job ID
if (queue.search(jobId) != null) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Job ID already exists.");
    return;
}

// Create repair job
RepairJob job = new ScheduledRepair(
        jobId, customer, device, problem, date, time);

// Add repair job to Queue
if (queue.enqueue(job)) {

    javax.swing.JOptionPane.showMessageDialog(
            this, "Repair job added successfully!");

    txtRecords.setText(queue.displayAll());

    // Clear input fields
    txtJobId.setText("");
    txtCustomerName.setText("");
    txtDeviceName.setText("");
    txtProblem.setText("");
    txtDate.setText("");
    txtTime.setText("");

} else {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Queue is full!");
}

        
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(jframescomrep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframescomrep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframescomrep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframescomrep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframescomrep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemoveNext;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField lblCustomerName;
    private javax.swing.JTextField lblJobId;
    private javax.swing.JLabel lblRepairInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel txtCustomerName;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtDeviceName;
    private javax.swing.JLabel txtJobId;
    private javax.swing.JLabel txtProblem;
    private javax.swing.JTextArea txtRecords;
    private javax.swing.JLabel txtSearch;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables
}
