package computerrepairscheduler;

public class RepairJob {

    private String jobId;
    private String customerName;
    private String deviceName;
    private String problemDescription;
    private String status;

    public RepairJob(String jobId, String customerName,
                     String deviceName, String problemDescription) {

        this.jobId = jobId;
        this.customerName = customerName;
        this.deviceName = deviceName;
        this.problemDescription = problemDescription;
        this.status = "Pending";
    }

    public String getJobId() {
        return jobId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        }
    }

    @Override
    public String toString() {
        return "Job ID: " + jobId
                + " | Customer: " + customerName
                + " | Device: " + deviceName
                + " | Problem: " + problemDescription
                + " | Status: " + status;
    }
}
