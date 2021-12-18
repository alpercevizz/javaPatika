package ATMProject;
import java.util.Scanner;


public class atmProject {
    public static void main(String[] args) throws InterruptedException {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while(right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if(userName.equals("Alper") && password.equals("1234")) {
                System.out.println("Merhaba " +userName + ", A Bank'a Hoşgeldiniz!");

                do{
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.println("Ne Yapmak İstiyorsunuz ? ");
                    select = input.nextInt();
                    switch(select) {
                        case 1:
                            System.out.println("Lütfen yatıracağınız para miktarını giriniz: ");
                            int price = input.nextInt();
                            System.out.println("Paranız yatırılıyor... Lütfen bekleyiniz.");
                            Thread.sleep(1000);
                            balance += price;
                            System.out.println("Para yatırma işleminiz gerçekleşmiştir...");
                            break;
                        case 2:
                            System.out.println("Lütfen çekmek istediğiniz para miktarını giriniz: ");
                            int outPrice = input.nextInt();
                            Thread.sleep(1000);
                            if(outPrice > balance) {
                                System.out.println("Bakiye yetersiz !");
                            }
                            else {
                                balance -= outPrice;
                                System.out.println("Para çekme işlemi başarılı...");
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " +balance);
                            break;
                    }

                }while(select != 4);
                System.out.println("Yeniden bekleriz. İyi günler...");
                break;

            }
            else {
                right --;
                System.out.println("Hatalı kullanıcı adı veya şifre girişi !");
                if(right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else System.out.print("Kalan hakkınız: " +right);
            }

        }
    }
}
