package calculator;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        int num1, num2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.println("Choose an operation: ");
        System.out.println("1-Addition\n2-Multiplication\n3-Division\n4-Extraction");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println("Result: " +(num1 + num2));
                break;
            case 2:
                System.out.println("Result: " +(num1 * num2));
                break;
            case 3:
                System.out.println("Result: " +(num1 / num2));
                break;
            case 4:
                System.out.println("Result: " +(num1 - num2));
                break;
            default:
                System.out.println("Invalid input value!!");
        }
    }
}
