package hipotenusCalculator;
import java.util.Scanner;

public class hipotenusCalculator {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("******* Welcome to Right-Angled Triangle's Hipotenus Calculator *********");
        Thread.sleep(1000);
        Scanner input = new Scanner(System.in);
        double firstSide, secondSide, hipotenusSide, area;

        System.out.println("Please enter first side: ");
        firstSide = input.nextDouble();
        Thread.sleep(500);

        System.out.println("Please enter second side: ");
        secondSide = input.nextDouble();
        Thread.sleep(500);

        System.out.println("Hipotenus side is calculating... Please wait.");
        Thread.sleep(1000);
        hipotenusSide = Math.sqrt((Math.pow(firstSide,2)) + Math.pow(secondSide, 2));
        System.out.println("Hipotenus side is " +hipotenusSide);

        System.out.println("****************************************");
        Thread.sleep(500);
        System.out.println("Triangle's area is calculating...");
        Thread.sleep(1000);
        area = (firstSide * secondSide) / 2;
        System.out.println("Triangle's area is " +area);
    }
}
