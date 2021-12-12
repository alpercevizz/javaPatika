package combinationCalculator;
import java.util.Scanner;

public class combinationCalc {
    public static void main(String[] args) {
        int number1, number2, factorialN=1, factorialR = 1, factorialNFarkR = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        for(int i = 1; i <= number1; i++) {
            factorialN *= i;

        }
        System.out.println("Factorial for first number: " +factorialN);

        for(int j = 1; j <=number2; j++) {
            factorialR *=j;
        }

        System.out.println("Factorial for second number: " +factorialR);

        for(int k = 1; k<=factorialNFarkR; k++) {
            factorialNFarkR *= k;
        }

        System.out.println("n-r factorial : " +factorialNFarkR);
        System.out.println("Combination : " +(factorialN) / (factorialR * factorialNFarkR));
    }


}
