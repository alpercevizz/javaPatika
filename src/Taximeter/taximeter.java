package Taximeter;
import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(" ********* Taximeter opened ***************");
        Scanner input = new Scanner(System.in);
        double targetKilometer;
        double minPayingPrice = 20.0, taximeterBeginPrice = 10.0, oneKilometerPrice = 2.20, payingPrice;

        System.out.println("Enter a target kilometer value: ");
        targetKilometer = input.nextDouble();

        payingPrice = (oneKilometerPrice * targetKilometer) + taximeterBeginPrice;
        double price = (payingPrice < minPayingPrice) ? 20:payingPrice;
        System.out.println("Amount payable: " +price);
        Thread.sleep(500);
        System.out.println(" ********* Taximeter closed ***************");

    }
}
