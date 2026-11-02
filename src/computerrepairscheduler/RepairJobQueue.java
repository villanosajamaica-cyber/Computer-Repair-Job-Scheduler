package computerrepairscheduler;

public class RepairJobQueue {

    private RepairJob[] jobs;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public RepairJobQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                    "Capacity must be greater than zero.");
        }

        this.capacity = capacity;
        this.jobs = new RepairJob[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Add a repair job to the rear of the queue
    public boolean enqueue(RepairJob job) {
        if (job == null || isFull()) {
            return false;
        }

        rear = (rear + 1) % capacity;
        jobs[rear] = job;
        size++;

        return true;
    }

    // Remove the repair job at the front
    public RepairJob dequeue() {
        if (isEmpty()) {
            return null;
        }

        RepairJob removedJob = jobs[front];
        jobs[front] = null;
        front = (front + 1) % capacity;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        return removedJob;
    }

    // View the next repair job without removing it
    public RepairJob peek() {
        if (isEmpty()) {
            return null;
        }

        return jobs[front];
    }

    // Search for a job using its Job ID
    public RepairJob search(String jobId) {
        if (jobId == null || jobId.trim().isEmpty()) {
            return null;
        }

        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;

            if (jobs[index].getJobId()
                    .equalsIgnoreCase(jobId.trim())) {
                return jobs[index];
            }
        }

        return null;
    }

    // Display all jobs in queue order
    public String displayAll() {
        if (isEmpty()) {
            return "No repair jobs in the queue.";
        }

        String result = "";

        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            result += jobs[index].toString() + "\n";
        }

        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }
}
