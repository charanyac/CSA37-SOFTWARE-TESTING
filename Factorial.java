import java.util.Scanner;

public class Factorial {

    public static int findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int input = scanner.nextInt();
        scanner.close();

        try {
            System.out.println("Factorial of " + input + " is: " + findFactorial(input));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
