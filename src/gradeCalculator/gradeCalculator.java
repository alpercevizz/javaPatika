package gradeCalculator;
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        int mathematic, physics, turkish, chemical, music;
        double total, average;
        Scanner grade = new Scanner(System.in);

        System.out.print("Your mathematic grade: ");
        mathematic = grade.nextInt();

        System.out.print("Your physics grade: ");
        physics = grade.nextInt();

        System.out.print("Your turkish grade: ");
        turkish = grade.nextInt();

        System.out.print("Your chemical grade: ");
        chemical = grade.nextInt();

        System.out.print("Your music grade: ");
        music = grade.nextInt();

        total = mathematic + physics + turkish + chemical + music;
        average = total / 5;

        System.out.println("Average: " +average);

        if(average < 0 || average > 100) {
            System.out.println("Average value is out of range!!! Please check the grades.\n Average: 0");
        }

        else if(average == 0 && average == 30) {
            System.out.println("You must study hard! :(");
        }

        else if(average == 31 && average == 54) {
            System.out.println("You must study more. :(");
        }

        else{
            System.out.println("You passed :)");
        }
    }
}
