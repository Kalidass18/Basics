import java.util.*;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = in.nextInt();
        
        if(isPrime(number)){
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }
       // scanner.close();
    }
     public static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // If the number is divisible by any number other than 1 and itself, it's not prime
                return false;
            }
        }
        
        // If no factors are found, the number is prime
        return true;
    }
        
    }
