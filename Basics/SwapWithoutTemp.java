import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap using arithmetic
        a = a + b;  // a becomes a + b
        b = a - b;  // b becomes original a
        a = a - b;  // a becomes original b

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
