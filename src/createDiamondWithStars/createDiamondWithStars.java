package createDiamondWithStars;
import java.util.Scanner;

public class createDiamondWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++) {
            for(int k = 1; k <= (number-i); k++ ) {
                System.out.print(" ");

            }
            for(int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = number - 1; i >= -1; i--) {
            for(int k = 0; k < (number - i - 1); k++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2 * i) + 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
