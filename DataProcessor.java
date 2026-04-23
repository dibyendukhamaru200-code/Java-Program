// DataProcessor class
class DataProcessor {

    // Method using throws keyword
    public int parseData(String input) throws NumberFormatException {

        // Convert string to integer
        int number = Integer.parseInt(input);

        return number;
    }
}

// Main class
public class Assignment2 {
    public static void main(String[] args) {

        DataProcessor dp = new DataProcessor();

        try {
            // Passing non-numeric string
            int result = dp.parseData("ABC");

            System.out.println("Converted number: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
    }
}
