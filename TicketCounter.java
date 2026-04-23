class TicketCounter {

    int availableSeats = 50;

    public void bookTicket(String name, int seats) {

        // Non-critical section
        System.out.println("Welcome to the portal, " + name);

        try {
            Thread.sleep(500);
        } catch (Exception e) {}

        // Critical section
        synchronized (this) {

            if (availableSeats >= seats) {
                System.out.println(name + " booked " + seats + " seats");
                availableSeats = availableSeats - seats;
                System.out.println("Seats left: " + availableSeats);
            } else {
                System.out.println("Not enough seats for " + name);
            }
        }
    }
}

// Thread class
class User extends Thread {

    TicketCounter counter;
    String name;
    int seats;

    User(TicketCounter counter, String name, int seats) {
        this.counter = counter;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(name, seats);
    }
}

// Main class
public class Assignment2 {
    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        User u1 = new User(counter, "User1", 30);
        User u2 = new User(counter, "User2", 25);

        u1.start();
        u2.start();
    }
}
