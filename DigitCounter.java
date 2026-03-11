import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;

        // Handle the case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Work with absolute value to handle negative numbers
            number = Math.abs(number);

            // Loop until number becomes 0
            while (number != 0) {
                number = number / 10; // Remove last digit
                count++;              // Increase count
            }
        }

        // Output
        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}