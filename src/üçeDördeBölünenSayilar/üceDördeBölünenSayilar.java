package üçeDördeBölünenSayilar;
import java.util.Scanner;

public class üceDördeBölünenSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a number: ");
        num = input.nextInt();

        for(int i = 0; i <= num; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " , ");
            }
        }
    }
}
