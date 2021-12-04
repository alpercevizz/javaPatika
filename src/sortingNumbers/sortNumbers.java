package sortingNumbers;
import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        int[] numbers = new int[3];
        if(num1 > num2 && num1>num3) {
            if( num2 > num3) {
                numbers[0] = num1;
                numbers[1] = num2;
                numbers[2] = num3;
            }

            else {
                numbers[0] = num1;
                numbers[1] = num3;
                numbers[2] = num2;
            }
        }

        else if(num2 > num1 && num2 > num3) {
            if( num1 > num3){
                numbers[0] = num2;
                numbers[1] = num1;
                numbers[2] = num3;
            }
            else{
                numbers[0] = num2;
                numbers[1] = num3;
                numbers[2] = num1;
            }
        }

        else if(num3 > num1 && num3 > num2) {
            if(num1 > num2) {
                numbers[0] = num3;
                numbers[1] = num1;
                numbers[2] = num2;
            }
            else{
                numbers[0] = num3;
                numbers[1] = num2;
                numbers[2] = num1;

            }
        }

        else if(num1 == num2 && num1 == num3) System.out.println("You entered same numbers...");

        else System.out.println("Invalid input value !");
        System.out.println("************************************");
        System.out.println("Sorted numbers : ");

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
