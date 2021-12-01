package groceryCase;
import java.util.Scanner;

public class groceryCase {
    public static void main(String [] args) {
        double armut, armutUnitPrice = 2.14, elma, elmaUnitPrice = 3.67, domates, domatesUnitPrice = 1.11, muz, muzUnitPrice = 0.95, patlican, patlicanUnitPrice = 5.00, tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo ? :");
        armut = input.nextDouble();

        System.out.println("Elma kaç kilo ? :");
        elma = input.nextDouble();

        System.out.println("Domates kaç kilo ? :");
        domates = input.nextDouble();

        System.out.println("Muz kaç kilo ? :");
        muz = input.nextDouble();

        System.out.println("Patlıcan kaç kilo ? :");
        patlican = input.nextDouble();

        tutar = (armut * armutUnitPrice) + (elma * elmaUnitPrice) + (domates * domatesUnitPrice) + (muz * muzUnitPrice) + (patlican * patlicanUnitPrice);

        System.out.print("Toplam tutar: " +tutar + " TL");
    }
}
