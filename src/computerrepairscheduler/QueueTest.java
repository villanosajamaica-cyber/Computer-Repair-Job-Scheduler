
package computerrepairscheduler;

public class QueueTest {

    public static void main(String[] args) {

        RepairJobQueue queue = new RepairJobQueue(5);

        RepairJob job1 = new ScheduledRepair(
                "J001", "Juan", "Laptop",
                "Broken screen", "2026-11-05", "09:00 AM");

        RepairJob job2 = new UrgentRepair(
                "J002", "Maria", "Desktop",
                "Computer will not start", "High");

        // Test enqueue
        System.out.println("Add J001: " + queue.enqueue(job1));
        System.out.println("Add J002: " + queue.enqueue(job2));

        // Test display
        System.out.println("\nALL REPAIR JOBS:");
        System.out.println(queue.displayAll());

        // Test search
        RepairJob found = queue.search("J002");

        if (found != null) {
            System.out.println("SEARCH RESULT:");
            System.out.println(found);
        } else {
            System.out.println("Repair job not found.");
        }

        // Test peek
        System.out.println("\nNEXT JOB:");
        System.out.println(queue.peek());

        // Test dequeue
        RepairJob removed = queue.dequeue();

        System.out.println("\nREMOVED JOB:");
        System.out.println(removed);

        // Check FIFO
        System.out.println("\nNEXT JOB AFTER REMOVAL:");
        System.out.println(queue.peek());

        System.out.println("\nQueue size: " + queue.getSize());
    }
}
