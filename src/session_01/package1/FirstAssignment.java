package session_01.package1;

import java.util.Scanner;

public class FirstAssignment {
    public static void main (String[] args){

        System.out.println("enter your password ");
        Scanner scanner = new Scanner(System.in);
        String pass1 =scanner.nextLine();
        System.out.println("reenter your password ");
        String pass2 =scanner.nextLine();
        if (pass1.equals(pass2)){
            System.out.println("correct password ");
        }
        else {
            System.out.println("incorrect password ");
        }
        }

    }

