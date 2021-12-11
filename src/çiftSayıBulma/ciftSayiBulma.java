package çiftSayıBulma;
import java.util.Scanner;
public class ciftSayiBulma {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        for(int i=1; i<=num; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " , ");
            }
        }
    }
}
