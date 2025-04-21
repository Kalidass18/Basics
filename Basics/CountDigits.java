import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int count = 0;
        int temp = Math.abs(num);  // Handle negative numbers

        while (temp != 0) {
            temp /= 10;  // Remove last digit
            count++;      // Increment count
        }

        // Special case for 0
        if (num == 0) count = 1;

        System.out.println("Number of digits: " + count);
    }
}
