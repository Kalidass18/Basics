import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Convert string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Populate the map with character frequencies
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {  // Check if it's an alphabetic character
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Unique characters in the string are:");
        boolean hasUnique = false;

        // Print characters that appear only once
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
                hasUnique = true;
            }
        }

        if (!hasUnique) {
            System.out.println("No unique characters found.");
        }
    }
}
