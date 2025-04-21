package randomString;

public class Palin {
    public static void main(String[] args) {
    String str = "malayalam";
        System.out.println(isPalindrom(str));
    }
    static boolean isPalindrom(String str){
        str = str.toLowerCase();
        if(str == "null" || str == "0"){
            return false;
        }
        for (int i =0; i<= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end){
                return false;
            }
        }
        return true;
    }
}
