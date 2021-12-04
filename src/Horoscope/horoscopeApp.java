package Horoscope;
import java.util.Scanner;

public class horoscopeApp {
    public static void main(String[] args) {
        System.out.println("*********** Find Your Horoscope ****************");
        int day, month;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of born: ");
        day = input.nextInt();

        System.out.print("Enter the month of born (number): ");
        month = input.nextInt();

        switch (month) {
            case 1:
                if(day >= 1 && day <= 31) {
                    if(day < 22) {
                        horoscope = "Capricorn (Oğlak)";
                        System.out.println("Your horoscope is " +horoscope);
                    }
                    else{
                        horoscope = "Aquarius (Kova)";
                        System.out.print("Your horoscope is " +horoscope);
                    }
                }
                else isError = true;
                break;
            case 2:
                if(day >= 1 && day <= 28) {
                    if(day < 20) {
                        horoscope = "Aquarius (Kova)";
                    }
                    else{
                        horoscope = "Pisces (Balık)";
                    }
                }
                else isError = true;
                break;
            case 3:
                if(day >=1 && day <= 31) {
                    if(day < 21) {
                        horoscope = "Pisces (Balık)";
                    }
                    else{
                        horoscope = "Aries (Koç)";
                    }
                }

                else isError = true;
                break;
            case 4:
                if(day >= 1 && day <= 31) {
                    if(day < 21) {
                        horoscope = "Aries (Koç)";
                    }
                    else horoscope = "Taurus (Boğa)";
                }
                else isError = true;
                break;
            case 5:
                if(day >= 1 && day <= 31) {
                    if(day < 21) {
                        horoscope = "Taurus (Boğa)";
                    }
                    else horoscope = "Gemini (İkizler)";
                }
                else isError = true;
                break;
            case 6:
                if(day >= 1 && day <= 31) {
                    if(day < 22) {
                        horoscope = "Gemini (İkizler)";
                    }
                    else horoscope = "Cancer (Yengeç)";
                }
                else isError = true;
                break;
            case 7:
                if(day >= 1 && day <= 31) {
                    if(day < 23) {
                        horoscope = "Cancer (Yengeç)";
                    }
                    else horoscope = "Leo (Aslan)";
                }
                else isError = true;
                break;
            case 8:
                if(day >= 1 && day <= 31) {
                    if(day < 23) {
                        horoscope = "Leo (Aslan)";
                    }
                    else horoscope = "Virgo (Başak)";
                }
                else isError = true;
                break;
            case 9:
                if(day >= 1 && day <= 31) {
                    if(day < 23) {
                        horoscope = "Virgo (Başak)";
                    }
                    else horoscope = "Libra (Terazi)";
                }
                else isError = true;
                break;
            case 10:
                if(day >= 1 && day <= 31) {
                    if(day < 23) {
                        horoscope = "Libra (Terazi)";
                    }
                    else horoscope = "Scorpio (Akrep)";
                }
                else isError = true;
                break;
            case 11:
                if(day >= 1 && day <= 31) {
                    if(day < 22) {
                        horoscope = "Scorpio (Akrep)";
                    }
                    else horoscope = "Sagittarius (Yay)";
                }
                else isError = true;
                break;

            case 12:
                if(day >= 1 && day <= 31) {
                    if(day < 22) {
                        horoscope = "Sagittarius (Yay)";
                    }
                    else horoscope = "Capricorn (Oğlak)";
                }
                else isError = true;
                break;


        }
        if(isError) {
            System.out.println("Invalid input !!");
        }
        else System.out.println("Your horoscope is " +horoscope);

    }
}
