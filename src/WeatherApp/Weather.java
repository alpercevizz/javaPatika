package WeatherApp;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args){
        int temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a temperature: ");
        temp = input.nextInt();

        if(temp <= 5) {
            System.out.println("You can go to snowy place for make snowboard...");
        }
        else if(temp>5 && temp <=15){
            System.out.println("You can go to cinema with your family or friends.");
        }
        else if(temp>15 && temp<=25){
            System.out.println("You can go to picnic...");
        }
        else if(temp>25) {
            System.out.println("You can go to pool or sea...");
        }
        else {
            System.out.println("Invalid temperature input !!!");
        }
    }


}
