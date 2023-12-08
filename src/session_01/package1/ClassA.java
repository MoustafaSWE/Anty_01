package session_01.package1;

import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your number");
        try {
            int number = scanner.nextInt();
            if (number < 5) {
                System.out.println("number is less than 5");

            } else if (number > 5) {
                System.out.println("number is greater than 5");
            } else {
                System.out.println("number is 5");
            }
        } catch (Exception e) {
            System.out.println("incorrect input");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("please enter your password");
        String Password1 = scanner.nextLine();
        //Scanner scanner= new Scanner(System.in);
        // System.out.println("enter x");
        // int x = scanner.nextInt();
        for (int i = 1; i < 3; i++) {
            System.out.println("please re-enter your password");
            String Password2 = scanner.nextLine();
            if (Password1.equals(Password2)) {
                System.out.println("password is correct");
                break;
            } else {
                System.out.println("you have attempts:" + i + "out of 3");
            }


        }
    }
}

