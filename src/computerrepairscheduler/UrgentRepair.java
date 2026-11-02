package computerrepairscheduler;

public class UrgentRepair extends RepairJob {

    private String urgencyLevel;

    public UrgentRepair(String jobId, String customerName,
            String deviceName, String problemDescription,
            String urgencyLevel) {

        super(jobId, customerName, deviceName, problemDescription);

        this.urgencyLevel = urgencyLevel;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        if (urgencyLevel != null && !urgencyLevel.trim().isEmpty()) {
            this.urgencyLevel = urgencyLevel;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Urgency Level: " + urgencyLevel;
    }
}
