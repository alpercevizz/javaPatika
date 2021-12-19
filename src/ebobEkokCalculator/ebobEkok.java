package ebobEkokCalculator;
import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, ebob=1, ekok=1;

        System.out.println("Birinci sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

       //ebob
        for(int k = num1; k >= 1; k--) {
            if(num1 % k == 0 && num2 % k == 0){
                ebob = k;
                System.out.println("Ebob: "+ebob);
                break;
            }
        }

        //ekok
        for(int i=1; i<(num1*num2);i++) {
            if(i % num1 == 0 && i % num2 == 0) {
                ekok = i;
                break;
            }
        }






        System.out.println("Ekok: "+(num1*num2)/ebob);

    }
}
