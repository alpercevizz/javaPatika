package palindromeNumbers;

public class palindromeNumbers {

    static boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0) {
            System.out.println("******************************");
            System.out.println("Sayı => " +temp);
            // Son basamak değeri
            lastNumber = temp % 10;
            System.out.println("Son basamak değeri : " +lastNumber);
            // lastNumber, reverseNumber'ın ilk değeri olmalı.
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayı: "+reverseNumber);
            temp /= 10; // sayının son basamağını atar.
            System.out.println("Yeni temp değeri: "+temp);
        }

        if(number == reverseNumber) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(2476));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(9889));
        System.out.println(isPalindrome(4));

    }
}
