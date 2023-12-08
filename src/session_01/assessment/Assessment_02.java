package session_01.assessment;

import java.util.Scanner;

public class Assessment_02 {

    /*
    Write a Java program to ask user to enter password and user have only three attempts
    Password should be not less than 3 character

        Input Data:
        Enter Your Password:

        ***************************

        Expected Output
        Correct password

 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your password");
        String Password1 = scanner.nextLine();
        for (int i = 1; i <= 3; i++) {
            System.out.println("please re-enter your password");
            String Password2 = scanner.nextLine();
            if (Password2.length()>3) {
                System.out.println("password is correct");
                break;
            } else {
                System.out.println("you have attempts:" + i + "out of 3");
                System.out.println("Password should be not less than 3 character");
            }
        }
    }

}