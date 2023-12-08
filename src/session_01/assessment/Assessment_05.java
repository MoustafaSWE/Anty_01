package session_01.assessment;

import java.util.Scanner;

public class Assessment_05 {
    /*write a java program to ask enter mobile number starts with 1 instead of 0 assert
    that his/her mobile number equal 10 digits
    input:enter your mobile number :
    output:correct mobile number
    your mobile number is [the mobile number ]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter your mobile number ");
            int mobileNunber=scanner.nextInt();
            if(String.valueOf(mobileNunber).length()==10){
                System.out.println("correct mobile number");
                System.out.println("your  mobile number is 0"+mobileNunber);


            }
            else {

                System.out.println("incorrect mobile number ");

            }


        }
        catch (Exception e){
            System.out.println("incorrect mobile number ");
        }


    }
}
