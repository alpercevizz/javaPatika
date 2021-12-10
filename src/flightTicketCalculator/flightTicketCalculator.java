package flightTicketCalculator;
import java.util.Scanner;

public class flightTicketCalculator {
    public static void main(String[] args){
        /*
 Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
Senaryolar
Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

Toplam Tutar = 216 TL
Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):

Hatalı Veri Girdiniz !
Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1

Toplam Tutar = 20.0 TL*/
    double distance, distanceUnitPrice = 0.10, normalPrice, ageDiscount, discountPrice, roundTripDiscount, totalPrice;
    int age, travelType;
    Scanner input = new Scanner(System.in);

    // Get data from user
        System.out.print("Please enter distance value (km): ");
        distance = input.nextDouble();

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.print("Please your travel type: (1=> One Direction (Tek Yön) 2=> Round-Trip (Gidiş-Dönüş)");
        travelType = input.nextInt();

        if(age < 0 && distance < 0 && travelType >2) {
            System.out.println("Error! Please check age, distance and travel type input values !!!");
        }
            normalPrice = distance * distanceUnitPrice;


        // Calculating the price by age discount and round-trip discount

        if(age < 12)  {
            ageDiscount = normalPrice * 0.50;
        }

        else if(age >= 12 && age <= 24) {
            ageDiscount = normalPrice * 0.10;
        }
        else if(age >= 65) {
            ageDiscount = normalPrice * 0.30;
        }

        else  ageDiscount = 0;

        discountPrice = normalPrice - ageDiscount;

        // round-trip discount

        if(travelType == 2) {
            roundTripDiscount = discountPrice * 0.20;
        }
        else roundTripDiscount = 0;

        totalPrice = (discountPrice - roundTripDiscount) * travelType;
        System.out.println("Total price: " + totalPrice + " TL");

    }
}
