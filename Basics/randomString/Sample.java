package randomString;

public class Sample {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <=n ; col++) {

                if (row == 0 || col == 0 || row == n || col == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}
