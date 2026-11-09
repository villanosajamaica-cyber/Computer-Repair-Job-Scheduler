package computerrepairscheduler;

public class ScheduledRepair extends RepairJob {

    private String appointmentDate;
    private String appointmentTime;

    public ScheduledRepair(String jobId, String customerName,
            String deviceName, String problemDescription,
            String appointmentDate, String appointmentTime) {

        super(jobId, customerName, deviceName, problemDescription);

        if (appointmentDate == null || appointmentDate.trim().isEmpty()) {
    throw new IllegalArgumentException("Appointment date is required.");
}

if (appointmentTime == null || appointmentTime.trim().isEmpty()) {
    throw new IllegalArgumentException("Appointment time is required.");
}

this.appointmentDate = appointmentDate;
this.appointmentTime = appointmentTime;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Appointment Date: " + appointmentDate
                + " | Appointment Time: " + appointmentTime;
    }
}
