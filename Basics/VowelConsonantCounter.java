import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Convert string to lowercase to simplify checking
        str = str.toLowerCase();

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {  // Check if it's an alphabetic character
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;         // Count vowels
                } else {
                    consonantCount++;     // Count consonants
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
