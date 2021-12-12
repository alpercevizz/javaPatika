package factorialCalculator;
import java.util.Scanner;

public class factorialCalc {
    public static void main(String[] args) {
        int number, factorial = 1, combination = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number for factorial calculating: ");
        number = input.nextInt();

        for(int i = 1; i <=number; i++) {
            factorial *= i;

        }

        System.out.print("Factorial : " +factorial);

    }
}
