package computerrepairscheduler;

public class ComputerRepairJobScheduler {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            NewJFrame frame = new NewJFrame();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

    }
}