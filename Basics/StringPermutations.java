import java.util.Scanner;

public class StringPermutations {
    // Recursive method to generate permutations
    private static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);  // Print permutation
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);          // Swap characters
                permute(str, left + 1, right);     // Recursive call
                str = swap(str, left, i);          // Backtrack to original string
            }
        }
    }

    // Method to swap characters at positions i and j
    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        System.out.println("Permutations of the string are:");
        permute(str, 0, str.length() - 1);
    }
}
