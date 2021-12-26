package powerNumberCalculatorWithRecursive;
import java.util.Scanner;

public class powerNumberCalc {
    static int power(int a, int b) {
        int result;

        if(a == 0) {
            return 0;
        }
        if(b == 0) {
            return 1;
        }
        else{
            result = a * power(a, b - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baseNumber, powerNumber;
        System.out.println("Please enter a base number: ");
        baseNumber = input.nextInt();
        System.out.println("Please enter a power number: ");
        powerNumber = input.nextInt();

        if(baseNumber == 0 && powerNumber == 0) {
            System.out.println("Error ! Two numbers haven't to zero !");
        }

        else {
            System.out.print("Result: " + power(baseNumber, powerNumber));
        }
    }
}
