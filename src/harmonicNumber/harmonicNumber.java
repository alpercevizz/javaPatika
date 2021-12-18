package harmonicNumber;
import java.util.Scanner;

public class harmonicNumber {
    public static void main(String [] args) {
        int number;
        double result = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = input.nextInt();

        for(int i = 1; i<=number; i++) {
            result += (1.0/i);
        }

        // First loop : i = 1, result = 0+ 1/1 = 1
        // Second loop : i = 2, result = 0+ 1/1+ 1/2
        // Third loop : i = 3, result = 1+ 1/1 + 1/2

        System.out.println("Result: " +result);
    }
}
