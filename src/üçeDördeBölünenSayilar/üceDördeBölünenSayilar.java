package üçeDördeBölünenSayilar;
import java.util.Scanner;

public class üceDördeBölünenSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, total = 0, count = 0;
        System.out.println("Enter a number: ");
        num = input.nextInt();

        for(int i = 0; i <= num; i++) {
            if(i == 0) continue; // Döngü sırasında sıfır ortalamayı etkileyeceği için ortalamaya katmamak gerekir.

            if(i % 3 == 0 && i % 4 == 0) {
                total +=i;
                count++;

            }
        }

        System.out.println("Average: " + total / count);

    }
}
