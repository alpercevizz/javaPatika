package averageGradeCalculator;
import java.util.Scanner;

public class averageGradeCalc {
    public static void main(String[] args) {
        // Create variables
        int mat, physic, chemical,turkish, history, music;

        //Scanner class
        Scanner input = new Scanner(System.in);
        //Take notes from user
        System.out.println("Math grade: ");
        mat = input.nextInt();

        System.out.println("Physic grade: ");
        physic = input.nextInt();

        System.out.println("Chemical grade: ");
        chemical = input.nextInt();

        System.out.println("Turkish grade: ");
        turkish = input.nextInt();

        System.out.println("History grade: ");
        history = input.nextInt();

        System.out.println("Music grade: ");
        music = input.nextInt();

        int total = (mat + physic + chemical + turkish + history + music);
        double avg = total/ 6.0;

        System.out.println("Your average grade " + avg);

        if(avg > 60) {
            System.out.println("You passed");
        }

        else if(avg < 60) {
            System.out.println("You failed");
        }

        else{
            System.out.println("Invalid input data !! Please check it");
        }
    }
}
