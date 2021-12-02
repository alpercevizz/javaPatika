package userValidator;
import java.util.Scanner;

public class userValidator {
    public static void main(String[] args){
        String userName, password, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        userName = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Session opened.");
        }
        else if(!password.equals("java123")){
            System.out.println("Your password is wrong. Reset your password.");
            System.out.println("********************************************");

            System.out.println("Enter a new password: ");
            newPassword = input.nextLine();

            if(newPassword.equals("java123")){
                System.out.println("Your new password is equal to your old password! Password is not changed. Please enter a different password value.");
            }
            else{
                System.out.println("Your password changed...");
            }
        }

        else{
            System.out.println("Username and password values are wrong. Session locked. Are you 'patika' ? If aren't you, session won't never open!!!");
        }
    }
}
