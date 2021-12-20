package fibonacciSeries;
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0, number2 = 1, number3, n;
        System.out.println("Bir sayı giriniz: ");
        n = input.nextInt();
        System.out.print(number1 + " " + number2);

        for(int i = 2; i < n; i++) {
            number3 = number1 + number2;
            System.out.print(" " +number3);
            number1 = number2;
            number2 = number3;
        }

        System.out.println();
    }
}
