package calculator;
import java.util.Scanner;

public class calculator {

    static int addition(int a, int b){
        int result =  a + b;
        System.out.println("Result: " +result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Result: " +result);
        return result;
    }

    static int multiple(int a, int b){
        int result = a * b;
        System.out.println("Result: " +result);
        return result;
    }

    static int divide(int a, int b){
        if(b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Result: " +result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for(int i  = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

    static int mode(int a, int b) {
        return a % b;
    }

    static void perimeterAndArea(int a, int b) {
        System.out.println("Perimeter: " + (2 * (a + b)));
        System.out.println("Area: " + (a*b));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /*Making with methods*/

        int select, num1, num2;
        String menu = "1- Addition\n"
                + "2- Minus\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mode\n"
                + "7- Rectangle's Perimeter and Area Calculating\n"
                + "8- Exit";
        System.out.println(menu);
        while(true) {
            System.out.println("*******************");
            System.out.println("Bir işlem seçiniz:");
            select = input.nextInt();
            if(select == 0) {
                break;
            }
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();

            switch (select){
                case 1:
                    addition(num1, num2);
                    break;
                case 2:
                    minus(num1, num2);
                    break;
                case 3:
                    multiple(num1, num2);
                    break;
                case 4:
                    if(divide(num1, num2) == 0) {
                        System.out.println("Second number have to different from zero !");
                    }
                    divide(num1, num2);
                    break;
                case 5:
                    power(num1, num2);
                    break;
                case 6:
                    mode(num1, num2);
                    break;
                case 7:
                    perimeterAndArea(num1, num2);
                    break;
                default:
                    System.out.println("Invalid input value !");
                    break;

            }
        }


       /* Making with only switch-case

       int num1, num2, select;


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
        }*/


    }
}
