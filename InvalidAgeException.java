// Custom Unchecked Exception
class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main logic class
class ElectionBooth {

    public void checkEligibility(int age) {

        if (age < 18) {
            throw new InvalidAgeException("Underage voters not allowed.");
        }

        System.out.println("You are eligible to vote.");
    }
}

// Main class
public class Assignment1 {
    public static void main(String[] args) {

        ElectionBooth obj = new ElectionBooth();

        try {
            obj.checkEligibility(16); // Change age to test
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
