import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;            // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            num /= 10;                      // Remove last digit
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
