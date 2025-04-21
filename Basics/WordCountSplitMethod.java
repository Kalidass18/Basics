import java.util.Scanner;

public class WordCountSplitMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Trim leading and trailing spaces and split by one or more spaces
        String[] words = str.trim().split("\\s+");
        
        // Handle empty string case
        if (str.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            System.out.println("Number of words: " + words.length);
        }
    }
}
