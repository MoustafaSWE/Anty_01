package session_01.assessment;

import java.util.Scanner;

public class Assessment_05 {
    /*
    write a java program to ask user to enter mobile number start with 1 instead of 0
    assert that his/her mobile number 10 digits

    Input:
    Enter Your mobile number
    Output:
    Correct mobile number
    Your mobile number is : [number]
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Your mobile number:");
      try{
       int mobileNumber = scanner. nextInt();
       if(String.valueOf(mobileNumber).length() == 10){
           System.out.println("correct mobile number");
           System.out.println("your mobile number is: 0"+ mobileNumber);
       }        else {
           System.out.println("incorrect mobile number");
       }
      }
      catch (Exception e){
          System.out.println("incorrect mobile number format");
      }
    }
}
