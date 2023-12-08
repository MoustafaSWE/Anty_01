package session_01.package1;

import java.util.Scanner;

public class Password3times {
    public static void main (String[] args){
        System.out.println("enter your password ");
        Scanner scanner = new Scanner(System.in);
        String pass1 =scanner.nextLine();
        if(pass1.length()>3){
            System.out.println("password should be less than 3 characters \n reenter your password  ");
             pass1 =scanner.nextLine();

        }
        System.out.println("confirm your password ");
        String pass2 =scanner.nextLine();
        for(int i=3;i>1;i--){
            if(pass1.equals(pass2)){
                System.out.println("correct password ");
                break;
            }
            else {
                System.out.println("u have "+(i-1)+" attempt/s left\n confirm your password ");
                 pass2 =scanner.nextLine();
            }
        }
    }
}
