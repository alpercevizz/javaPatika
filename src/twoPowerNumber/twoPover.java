package twoPowerNumber;
import java.util.Scanner;

public class twoPover {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        // 2'nin kuvvetleri
        for(int i = 1; i <= number; i*= 2) {
            System.out.println(i);
        }

        // 4'ün kuvvetleri

        for(int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        // 5'in kuvvetleri

        for(int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }

    }
}
