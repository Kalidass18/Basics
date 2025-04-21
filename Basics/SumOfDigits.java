import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        int temp = Math.abs(num);  // Handle negative numbers

        // Calculate sum of digits
        while (temp != 0) {
            int digit = temp % 10;   // Extract last digit
            sum += digit;            // Add digit to sum
            temp /= 10;              // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
