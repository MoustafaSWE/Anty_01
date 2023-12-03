package newPackage;

import java.util.Scanner;

public class ClassNumberOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Your name");
        String name = scanner.nextLine();
        System.out.println(name);
    }

    public static String fullName(String firstName, String lastName){
        return firstName +" "+ lastName;
    }

    public static void classStatic (String name){
        System.out.println(name);
    }

    public void classNonStatic(){

    }
    private static void classPrivate (){

    }
    protected static void classProtected (){

    }




}
