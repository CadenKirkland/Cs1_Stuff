//Cadenk
//use the scanner class to capture user input

import java.util.Scanner;


public class Java7input {
    public static void main(String[] args){

        Scanner scIn = new Scanner (System.in);

        System.out.println("enter your UserName");
        String UserName = scIn.nextLine();

        System.out.println("enter your Account number");
        int AccountNumber = scIn.nextInt();

        System.out.println("confirmation " + UserName + AccountNumber);
    }
}
