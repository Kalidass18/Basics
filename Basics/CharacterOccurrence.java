import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Convert string to lowercase to handle case insensitivity (optional)
        str = str.toLowerCase();

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Populate the map with character frequencies
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print character occurrences
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' = " + entry.getValue() + " times");
        }
    }
}
