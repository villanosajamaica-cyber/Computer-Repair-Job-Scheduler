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
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtJobID = new javax.swing.JTextField();
        txtProblem = new javax.swing.JTextField();
        txtDeviceName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblRepairInfo = new javax.swing.JLabel();
        lblJobId = new javax.swing.JLabel();
        lblDeviceName = new javax.swing.JLabel();
        lblAppointmentDate = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblCostumerName = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        lblProblemDescription = new javax.swing.JLabel();
        lblAppointmentTime = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRemoveNext = new javax.swing.JButton();
        txtJobId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblQueueTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecords = new javax.swing.JTextArea();
        cmbRepairType = new javax.swing.JComboBox<>();
        lblRepairType = new javax.swing.JLabel();
        lblUrgencyLevel = new javax.swing.JLabel();
        cmbUrgencyLevel = new javax.swing.JComboBox<>();
        lblSearchResult = new javax.swing.JLabel();
        lblEnterJobID = new javax.swing.JLabel();

        jTextField5.setText("YYYY-MM-DD");

        jButton4.setText("jButton4");

        jTextField1.setText("jTextField1");

        jLabel1.setText("jLabel1");

        txtSearch.setText("Search Repair Job");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setText("Computer Repair Job Scheduler");

        txtJobID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobIDActionPerformed(evt);
            }
        });

        txtDeviceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceNameActionPerformed(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lblRepairInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRepairInfo.setText("Repair Information");

        lblJobId.setText("Job ID");

        lblDeviceName.setText("Device Name");

        lblAppointmentDate.setText("Appointment Date");

        lblCostumerName.setText("Customer Name");

        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        lblProblemDescription.setText("Problem Description");

        lblAppointmentTime.setText("Appointment Time");

        btnAdd.setBackground(new java.awt.Color(0, 153, 0));
        btnAdd.setText("ADD REPAIR");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnRemoveNext.setText("REMOVE NEXT");
        btnRemoveNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveNextActionPerformed(evt);
            }
        });

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblQueueTitle.setText("Repair Job Queue");

        txtRecords.setColumns(20);
        txtRecords.setForeground(new java.awt.Color(0, 204, 255));
        txtRecords.setRows(5);
        jScrollPane1.setViewportView(txtRecords);

        cmbRepairType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scheduled Repair", "Urgent Repair" }));

        lblRepairType.setText("Repair Type");

        lblUrgencyLevel.setText("Urgency Level");

        cmbUrgencyLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));
        cmbUrgencyLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUrgencyLevelActionPerformed(evt);
            }
        });

        lblSearchResult.setText("Search result will appear here.");

        lblEnterJobID.setText("Enter Job ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblQueueTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRepairInfo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblRepairType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbRepairType, javax.swing.GroupLayout.Alignment.LEADING, 0, 293, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addComponent(lblJobId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtJobID)
                                .addComponent(lblDeviceName)
                                .addComponent(txtDeviceName)
                                .addComponent(lblAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtJobId)
                                .addComponent(lblSearchResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblUrgencyLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbUrgencyLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCostumerName)
                                            .addGap(57, 57, 57))
                                        .addComponent(lblProblemDescription)
                                        .addComponent(txtProblem, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                        .addComponent(txtCustomerName)
                                        .addComponent(lblAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTime)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(btnSearch))))
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAdd)
                            .addGap(18, 18, 18)
                            .addComponent(btnClear)
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoveNext)))
                    .addComponent(lblEnterJobID))
                .addContainerGap(26, Short.MAX_VALUE))
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
                    .addComponent(lblJobId)
                    .addComponent(lblCostumerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJobID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceName)
                    .addComponent(lblProblemDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProblem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentDate)
                    .addComponent(lblAppointmentTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRepairType)
                    .addComponent(lblUrgencyLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRepairType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUrgencyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnRemoveNext))
                .addGap(28, 28, 28)
                .addComponent(lblEnterJobID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSearchResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lblQueueTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtDeviceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceNameActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

String jobId = txtSearch.getText().trim();

if (jobId.isEmpty()) {
    lblSearchResult.setText("Please enter a Job ID.");
    return;
}

RepairJob found = queue.search(jobId);

if (found != null) {
    lblSearchResult.setText(
            "<html>" + found.toString().replace("\n", "<br>") + "</html>"
    );
} else {
    lblSearchResult.setText(
            "No repair job found with ID: " + jobId
    );
}


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
String jobId = txtJobId.getText().trim();
String customer = txtCustomerName.getText().trim();
String device = txtDeviceName.getText().trim();
String problem = txtProblem.getText().trim();

String repairType = cmbRepairType.getSelectedItem().toString();
String urgencyLevel = cmbUrgencyLevel.getSelectedItem().toString();

// Check required fields
if (jobId.isEmpty() || customer.isEmpty()
        || device.isEmpty() || problem.isEmpty()) {

    javax.swing.JOptionPane.showMessageDialog(
            this, "Please fill in all required fields.");
    return;
}

// Check duplicate Job ID
if (queue.search(jobId) != null) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Job ID already exists.");
    return;
}

RepairJob job;

// Create Scheduled Repair
if (repairType.equals("Scheduled Repair")) {

    String date = txtDate.getText().trim();
    String time = txtTime.getText().trim();

    if (date.isEmpty() || time.isEmpty()
            || date.equals("YYYY-MM-DD")
            || time.equals("e.g. 09:00 AM")) {

        javax.swing.JOptionPane.showMessageDialog(
                this, "Please enter the appointment date and time.");
        return;
    }

    job = new ScheduledRepair(
            jobId, customer, device, problem, date, time);

// Create Urgent Repair
} else {

    job = new UrgentRepair(
            jobId, customer, device, problem, urgencyLevel);
}

// Add job to Queue
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

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
lblJobId.setText("");
lblCostumerName.setText("");
lblDeviceName.setText("");
lblProblemDescription.setText("");
lblAppointmentDate.setText("");
lblAppointmentTime.setText("");
txtSearch.setText("");

btnClear.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveNextActionPerformed
        if (queue.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "The repair queue is empty.");
    return;
}

RepairJob removed = queue.dequeue();

javax.swing.JOptionPane.showMessageDialog(
        this,
        "Removed repair job:\n" + removed.toString(),
        "Job Removed",
        javax.swing.JOptionPane.INFORMATION_MESSAGE);

txtRecords.setText(queue.displayAll());
    }//GEN-LAST:event_btnRemoveNextActionPerformed

    private void cmbUrgencyLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUrgencyLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUrgencyLevelActionPerformed

    private void txtJobIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobIDActionPerformed

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
    private javax.swing.JComboBox<String> cmbRepairType;
    private javax.swing.JComboBox<String> cmbUrgencyLevel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblAppointmentDate;
    private javax.swing.JLabel lblAppointmentTime;
    private javax.swing.JLabel lblCostumerName;
    private javax.swing.JLabel lblDeviceName;
    private javax.swing.JLabel lblEnterJobID;
    private javax.swing.JLabel lblJobId;
    private javax.swing.JLabel lblProblemDescription;
    private javax.swing.JLabel lblQueueTitle;
    private javax.swing.JLabel lblRepairInfo;
    private javax.swing.JLabel lblRepairType;
    private javax.swing.JLabel lblSearchResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUrgencyLevel;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDeviceName;
    private javax.swing.JTextField txtJobID;
    private javax.swing.JTextField txtJobId;
    private javax.swing.JTextField txtProblem;
    private javax.swing.JTextArea txtRecords;
    private javax.swing.JLabel txtSearch;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
