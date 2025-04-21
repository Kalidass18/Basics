package randomString;

public class Patterns {

    public static void main(String[] args) {
    pattern2(4);
    }
    static void pattern2(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int row = 1; row < 2 * n; row++) {

            int totalColsInRow = row > n ? 2 * n - row: row;

          //  int noOfSpaces = n - totalColsInRow;
          //  for (int s = 0; s < noOfSpaces; s++) {
          //      System.out.print(" ");
          //  }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* " );
            }

            System.out.println();
        }


    }
}
