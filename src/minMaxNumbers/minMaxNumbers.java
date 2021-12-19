package minMaxNumbers;
import java.util.Scanner;

public class minMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0,min = 0;
        System.out.print("Kaç tane sayı gireceksiniz ? : ");
        int num = input.nextInt();

        for(int i = 1; i <=num; i++) {
            System.out.print(i +". Sayıyı Giriniz: ");
            int data = input.nextInt();
            if(i==1){
                max=data;
                min=data;
            }
            else if(data>max){
                max = data;
            }
            else if(data<min){
                min=data;
            }
        }

        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);




    }
}
