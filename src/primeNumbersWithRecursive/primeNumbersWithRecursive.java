package primeNumbersWithRecursive;
import java.util.Scanner;

public class primeNumbersWithRecursive {
    static boolean isPrime(int primeOrNotPrime, int n){
        if(primeOrNotPrime <=2) return (n == 2) ? true: false;
        if(primeOrNotPrime % n == 0) return false;
        if(primeOrNotPrime * primeOrNotPrime > n) return true;

        return isPrime(primeOrNotPrime, n + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(isPrime(number, 2)) System.out.println(number + " is a prime number.");
        else System.out.println(number + " is not a prime number.");
    }
}
