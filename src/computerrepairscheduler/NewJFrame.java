package computerrepairscheduler;

public class NewJFrame extends javax.swing.JFrame {
    private RepairJobQueue queue = new RepairJobQueue(100);

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblRepairInfo = new javax.swing.JLabel();
        lblJobId = new javax.swing.JLabel();
        txtJobId = new javax.swing.JTextField();
        lblCustomerName = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblDeviceName = new javax.swing.JLabel();
        txtDeviceName = new javax.swing.JTextField();
        lblProblem = new javax.swing.JLabel();
        txtProblem = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        lblRepairType = new javax.swing.JLabel();
        cmbRepairType = new javax.swing.JComboBox<>();
        lblUrgencyLevel = new javax.swing.JLabel();
        cmbUrgencyLevel = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblSearchTitle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblSearchResult = new javax.swing.JLabel();
        lblQueueTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecords = new javax.swing.JTextArea();
        btnRemoveNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Computer Repair Job Scheduler");
        setBackground(new java.awt.Color(245, 247, 251));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblTitle.setText("COMPUTER REPAIR JOB SCHEDULER");

        lblDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDescription.setText("Manage and organize repair requests");

        lblRepairInfo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblRepairInfo.setText("REPAIR INFORMATION");

        lblJobId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblJobId.setText("Job ID");

        lblCustomerName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCustomerName.setText("Customer Name");

        lblDeviceName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDeviceName.setText("Device Name");

        lblProblem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblProblem.setText("Problem");

        lblDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDate.setText("Appointment Date");

        lblTime.setText("Appointment Time");

        lblRepairType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRepairType.setText("Repair Type");

        cmbRepairType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbRepairType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scheduled Repair", "Urgent Repair" }));

        lblUrgencyLevel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUrgencyLevel.setText("Urgency Level");

        cmbUrgencyLevel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbUrgencyLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));

        btnAdd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAdd.setText("ADD REPAIR");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblSearchTitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSearchTitle.setText("SEARCH REPAIR JOB");

        btnSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblSearchResult.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSearchResult.setText("Search result will appear here.");

        lblQueueTitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblQueueTitle.setText("REPAIR JOB QUEUE");

        txtRecords.setColumns(20);
        txtRecords.setRows(5);
        txtRecords.setText("\n");
        jScrollPane1.setViewportView(txtRecords);

        btnRemoveNext.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRemoveNext.setText("REMOVED NEXT");
        btnRemoveNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRepairInfo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDate)
                                    .addComponent(lblJobId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCustomerName)
                                    .addComponent(lblDeviceName)
                                    .addComponent(lblProblem)
                                    .addComponent(lblTime)
                                    .addComponent(lblRepairType)
                                    .addComponent(lblUrgencyLevel)
                                    .addComponent(btnAdd))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbUrgencyLevel, 0, 125, Short.MAX_VALUE)
                                    .addComponent(cmbRepairType, 0, 364, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnClear)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDeviceName)
                                            .addComponent(txtProblem)
                                            .addComponent(txtTime, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                            .addComponent(txtCustomerName))
                                        .addComponent(btnSearch))
                                    .addComponent(txtJobId)
                                    .addComponent(txtDate)))
                            .addComponent(lblSearchTitle)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearchResult)
                            .addComponent(lblQueueTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoveNext)))
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lblDescription)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRepairInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblJobId, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceName)
                    .addComponent(txtDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProblem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProblem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRepairType)
                    .addComponent(cmbRepairType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrgencyLevel)
                    .addComponent(cmbUrgencyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(lblSearchTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSearchResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQueueTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveNext)
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

if (jobId.isEmpty() || customer.isEmpty()
        || device.isEmpty() || problem.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Please fill in all required fields.");
    return;
}

if (queue.search(jobId) != null) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Job ID already exists.");
    return;
}

RepairJob job;

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
} else {
    job = new UrgentRepair(
            jobId, customer, device, problem, urgencyLevel);
}

if (queue.enqueue(job)) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Repair job added successfully!");

    txtRecords.setText(queue.displayAll());

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
    txtJobId.setText("");
    txtCustomerName.setText("");
    txtDeviceName.setText("");
    txtProblem.setText("");
    txtDate.setText("");
    txtTime.setText("");
    txtSearch.setText("");

    cmbRepairType.setSelectedIndex(0);
    cmbUrgencyLevel.setSelectedIndex(0);

    lblSearchResult.setText("Search result will appear here.");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveNextActionPerformed
        if (queue.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "The repair queue is empty.");
    return;
}

RepairJob removed = queue.dequeue();
removed.markAsCompleted();

javax.swing.JOptionPane.showMessageDialog(
        this,
        "Removed repair job:\n" + removed.toString(),
        "Job Removed",
        javax.swing.JOptionPane.INFORMATION_MESSAGE);

txtRecords.setText(queue.displayAll());
    }//GEN-LAST:event_btnRemoveNextActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDeviceName;
    private javax.swing.JLabel lblJobId;
    private javax.swing.JLabel lblProblem;
    private javax.swing.JLabel lblQueueTitle;
    private javax.swing.JLabel lblRepairInfo;
    private javax.swing.JLabel lblRepairType;
    private javax.swing.JLabel lblSearchResult;
    private javax.swing.JLabel lblSearchTitle;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUrgencyLevel;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDeviceName;
    private javax.swing.JTextField txtJobId;
    private javax.swing.JTextField txtProblem;
    private javax.swing.JTextArea txtRecords;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
