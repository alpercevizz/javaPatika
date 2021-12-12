package ciftSayiToplam;
import java.util.Scanner;

public class ciftSayiToplam {
    public static void main(String[] args) {
        int n, total  = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter a number: ");
            n = input.nextInt();
            if(n % 2 == 0 && n % 4 == 0) {
                total += n;
            }
        }while(n > 0);

        System.out.println("Total: " +total);
    }
}
