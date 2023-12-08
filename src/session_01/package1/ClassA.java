package session_01.package1;

import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("enter number ");
        try {
            int number = scanner.nextInt();
            if (number < 5) {
                System.out.println("number is less than 5");
            } else if (number > 5) {
                System.out.println("number is more than 5");

            } else {
                System.out.println("number eque6l 5");
            }


    }
        catch (Exception e){
            System.out.println("enter valid input");
        }
    }*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("enetr password ");
        String password = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("renetr password ");
            String repassword = scanner.nextLine();
            if (repassword.length()<3){
                System.out.println("password less than 3 cr");
                System.out.println("you have attempts:" + i + "out of 3");
            }
           /* if (password.equals(repassword)) {
                System.out.println("true");
                break;
            } else {
                System.out.println("you have attempts:" + i + "out of 3");
            }*/
        }
    }
}
