import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int originalNum = num;
        int reversed = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;               // Extract last digit
            reversed = reversed * 10 + digit;   // Build reversed number
            num /= 10;                          // Remove last digit
        }

        // Check if original number and reversed are the same
        if (originalNum == reversed) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is not a Palindrome.");
        }
    }
}
