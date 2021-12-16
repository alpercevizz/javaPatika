package armstrongNumber;
import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args){
        // Bir sayının basamak sayısı öncelikle bulunmalı.
        // Armstrong sayısını basamakların basamak sayısı kadar üssünü alarak bulabiliriz.
        /*Basamak değerini bulmak için döngüde sürekli sayıyı 10'a bölerek kalan değerini alırız.
         * Bulduğumuz basamak değerleri ile basamak sayısını üs olarak alıp toplarsak armstrong sayısını buluruz. */

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basamakNumber = 0;
        int tempNumber = number;
        int basamakValue;
        int result = 0;
        int basamakPower;
        int totalBasamakValue = 0;

        // Basamak sayısı bulma
        while (tempNumber != 0) {
            tempNumber /= 10;
            // Döngünün döndüğü sayı, sayının basamak sayısını verir.
            basamakNumber++;
        }
        tempNumber = number; // tempNumber değişkenini num sayısını kaybetmemek adına atadık. Döngü bittiğinde num sıfır olacağı için tempNumber'ı num'a eşitleyerek değeri geri aldık.


        while (tempNumber != 0) {

            basamakValue = tempNumber % 10; // Basamak değerini bulduk.

            System.out.println("Basamak değeri: "+basamakValue);


            basamakPower = 1;

            for(int i = 1; i <= basamakNumber; i++) {
                basamakPower *= basamakValue;
            } // basamak değerini basamak üssü kadar çarptık.

            result += basamakPower; // bunu toplayıp result değişkenine atadık
            tempNumber /= 10;

        }


        if(result == number ){
            System.out.println(number + " sayısı, armstrong sayısıdır.");
        }
        else System.out.println(number + " sayısı  armstrong sayısı değildir.");


    }
}
