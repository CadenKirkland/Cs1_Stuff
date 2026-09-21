// Gabriel Gonzalez
// input user elements into an array and reverse print

import java.util.Scanner;

public class Java21UserElements {
    public static void main(String[] args) {

        Scanner scIn = new Scanner(System.in);

        int size = 12;
        String[] elementsArray = new String[size];

        //traditional loop to prompt user for data and add to array
        for (int x=0; x < size;x++) {

            System.out.println("enter an element: ");
            String Ename = scIn.nextLine();  // nextLine method helps get user string data

            //use the String object method "equals()" to compare the input value
            if ( Ename.equals("Copper") ) {
                Ename = "Copper29";
            }
            if ( Ename.equals("Silver") ) {
                Ename = "Silver47";
            }
            if ( Ename.equals("Gold") ) {
                Ename = "Gold79";
            }


            elementsArray[x] = Ename;
        }

        // use a For Each loop to print out elements
        for (int i = elementsArray.length - 1; i >= 0; i--) {
            System.out.println(elementsArray[i]);
        }
    }
}
