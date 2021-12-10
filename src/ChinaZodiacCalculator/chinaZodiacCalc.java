package ChinaZodiacCalculator;
import java.util.Scanner;

public class chinaZodiacCalc {
    public static void main (String[] args) {
        String text = null;
        int birthOfYear, remainder;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth of year: ");
        birthOfYear = input.nextInt();

        remainder = birthOfYear % 12;

        switch(remainder) {
            case 0:
                text = "Monkey (Maymun)";
               break;
            case 1:
                text = "Cockerel (Horoz)";
                break;
            case 2:
                text = "Dog (Köpek)";
                break;
            case 3:
                text = "Pig (Domuz)";
                break;
            case 4:
                text = "Mouse (Fare)";
                break;
            case 5:
                text = "Ox (Öküz)";
                break;
            case 6:
                text = "Tiger (Kaplan)";
                break;
            case 7:
                text = "Rabbit (Tavşan)";
                break;
            case 8:
                text = "Dragon (Ejderha)";
                break;
            case 9:
                text = "Snake (Yılan)";
                break;
            case 10:
                text = "Horse (At)";
                break;
            case 11:
                text = "Sheep (Koyun)";
                break;
            default:
                System.out.println("Please check your input value !!");
        }
        System.out.print("Your China Zodiac Horoscope : " +text);

    }
}
