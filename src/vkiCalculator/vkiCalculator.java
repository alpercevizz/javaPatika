package vkiCalculator;
import java.util.Scanner;

public class vkiCalculator {
    public static void main(String[] args){
        double boy, kilo, vki;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);
        System.out.print("Vücut kitle indeksiniz: " +vki);
    }
}
