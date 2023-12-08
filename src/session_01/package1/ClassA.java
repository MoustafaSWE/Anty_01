package session_01.package1;

import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number ");
        try {
            int number = scanner.nextInt();
            if (number < 5) {
                System.out.println("number is less than five");
            } else if (number > 5) {
                System.out.println("number is bigger than five");

            } else {
                System.out.println("number is 5");
            }
        } catch (Exception e) {
            System.out.println("incorrect input");


        }
    }
}
