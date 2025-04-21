import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Split the string into words
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        // Reverse each word and append to result
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }

        // Remove trailing space and print result
        System.out.println("Reversed each word: " + result.toString().trim());
    }
}
