package minMaxNumbersArr;

import java.util.Arrays;
import java.util.Scanner;
public class minMaxArr {
     public static void main(String[] args) {
         /*int[] list = {56,34, 1, 8, 101, -2, 53};
         int min = list[0];
         int max = list[0];

         for(int i: list) {
             if(i < min) {
                 min = i;
             }
             if(i > max) {
                 max = i;
             }
         }

         System.out.println("Minimum val: " +min);
         System.out.println("Maximum val: " +max);*/


         Scanner input = new Scanner(System.in);
         System.out.println("Bir sayı giriniz: ");
         int value = input.nextInt();
         int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
         Arrays.sort(list);

         int i;
         for (i=0; i < list.length; i++) {
             if(list[i] > value)
                 break;
         }
         int minValue = list[i - 1];
         int maxValue = list[i];


         System.out.print("Dizi: " + Arrays.toString(list));
         System.out.println("Girilen sayı : " +value);
         System.out.println("Girilen sayıdan küçük en yakın sayı: "+minValue);
         System.out.println("Girilen sayıdan büyük en yakın sayı: "+maxValue);
     }
}
