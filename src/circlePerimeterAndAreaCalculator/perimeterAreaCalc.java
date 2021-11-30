package circlePerimeterAndAreaCalculator;
import java.util.Scanner;

public class perimeterAreaCalc {
    public static void main(String[] args) throws InterruptedException {
        double radius, perimeter, area;
        double centerAngle = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("************ Circle's Perimeter And Area Calculator *****************");
        System.out.println("Please enter a circle's radius value: ");
        radius = input.nextDouble();
        double PI = 3.14;
        System.out.println("Please enter a circle's center angle: (If you don't enter value. Write only 0)");
        centerAngle = input.nextDouble();

        System.out.println("Perimeter and Area is calculating...");
        Thread.sleep(1000);

        if(centerAngle == 0 || centerAngle < 0) {
            area = PI * Math.pow(radius,2);
        }
        else{
            area = (PI * (radius * radius) * centerAngle) / 360;
        }
        perimeter = 2 * PI * radius;

        System.out.println("Circle's Perimeter: " +perimeter);
        System.out.println("Circle's Area: " +area);

    }
}
