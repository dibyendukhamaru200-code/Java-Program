class MathWizard {

    // Recursive factorial method
    public static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // If negative number (to avoid infinite recursion)
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
            return -1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }
}

public class Assignment1 {
    public static void main(String[] args) {

        System.out.println("Factorial of 5 = " + MathWizard.factorial(5));

        // Error experiment
        System.out.println("Factorial of -1 = " + MathWizard.factorial(-1));
    }
}
