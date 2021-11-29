package KDVCalculator;

import java.util.Scanner;

public class kdvCalculator {
    public static void main(String[] args) {
        double price, kdvPrice, kdvPercent;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product price:  ");
        price = (int)input.nextDouble();
        boolean kdvAmount = price > 1000;
        kdvPercent = kdvAmount ? 0.08 : 0.18;
        kdvPrice = price * kdvPercent;

        System.out.println("Calculating KDV Price. Please wait...");
        System.out.println("Product KDV Price : " +kdvPrice);


    }
}
