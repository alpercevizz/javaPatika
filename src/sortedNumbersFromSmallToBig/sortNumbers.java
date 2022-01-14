package sortedNumbersFromSmallToBig;
import java.util.Scanner;
import java.util.Arrays;

public class sortNumbers {
   public static String sortArrayValue(int[] arr) {
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int arraySize = input.nextInt();

        int[] sortArray = new int[arraySize];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for(int i = 0; i < sortArray.length; i++) {
            System.out.println((i+1) + " . Eleman : ");
            int arrayValue = input.nextInt();
            sortArray[i] = arrayValue;
        }

        System.out.println("Sıralama: " +sortArrayValue(sortArray));


    }
}
