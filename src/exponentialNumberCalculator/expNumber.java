package exponentialNumberCalculator;
import java.util.Scanner;

public class expNumber {
    public static void main(String[] args) {
        int n, k, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        n = input.nextInt();

        System.out.println("Üs değeri: ");
        k = input.nextInt();


        // With While loop

        /*int i = 1;
        while(i <= k)  {
            total *= n;
            i++;
        }*/

        // With for loop


        for(int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.println("Result: " +total);
    }
}
