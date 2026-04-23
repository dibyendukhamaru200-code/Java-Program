// TaskRunner class implementing Runnable
class TaskRunner implements Runnable {

    public void run() {
        try {
            // Thread will sleep for 2000 ms
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

// Main class
public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {

        // Create Runnable object
        TaskRunner task = new TaskRunner();

        // Create Thread object
        Thread t = new Thread(task);

        // 1. State before start()
        System.out.println("State after creation: " + t.getState());

        // Start thread
        t.start();

        // Small delay to catch TIMED_WAITING state
        Thread.sleep(100);

        // 2. State after start()
        System.out.println("State after start: " + t.getState());

        // Wait for thread to finish
        t.join();

        // 3. State after completion
        System.out.println("State after completion: " + t.getState());
    }
}
