import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();  // Get the number of digits

        while (num != 0) {
            int digit = num % 10;                  // Extract last digit
            sum += Math.pow(digit, digits);        // Add power of digit to sum
            num /= 10;                             // Remove last digit
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
