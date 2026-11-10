package computerrepairscheduler;

public class QueueTest {

    public static void main(String[] args) {

        RepairJobQueue queue = new RepairJobQueue(5);

        RepairJob job1 = new ScheduledRepair(
                "J001", "Jamaica", "Laptop",
                "Broken screen", "2026-11-05", "09:00 AM");

        RepairJob job2 = new UrgentRepair(
                "J002", "Ralph Roger", "Desktop",
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
        
        // Test queue underflow
System.out.println("\nTEST EMPTY QUEUE:");

while (!queue.isEmpty()) {
    queue.dequeue();
}

System.out.println("Dequeue empty queue: " + queue.dequeue());

// Test queue overflow
System.out.println("\nTEST QUEUE OVERFLOW:");

RepairJobQueue smallQueue = new RepairJobQueue(1);

System.out.println("Add first job: " + smallQueue.enqueue(job1));
System.out.println("Add second job: " + smallQueue.enqueue(job2));
System.out.println("Is queue full: " + smallQueue.isFull());

// Test circular queue behavior
System.out.println("\nTEST CIRCULAR QUEUE:");

RepairJobQueue circularQueue = new RepairJobQueue(2);

System.out.println("Add J001: " + circularQueue.enqueue(job1));
System.out.println("Add J002: " + circularQueue.enqueue(job2));

System.out.println("Remove: " + circularQueue.dequeue());

System.out.println("Add J003: " + circularQueue.enqueue(
        new UrgentRepair(
                "J003", "Customer Three", "Laptop",
                "Battery problem", "Medium")));

System.out.println("\nCIRCULAR QUEUE CONTENT:");
System.out.println(circularQueue.displayAll());
    }
}
