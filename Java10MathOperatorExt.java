//CadenK
// demonstrate using the java math operators
import java.util.Scanner;

public class Java10MathOperatorExt {
    public static void main(String[] args){

        Scanner scIn = new Scanner(System.in);

        System.out.println("enter your number");
        int number = scIn.nextInt();

        // addition assignment
        number += 5;  // same as number = number + 5
        System.out.println("after addition assignment (+=):" + number);

        // addition assignment
        number -= 3;  // same as number = number - 3
        System.out.println("after subtraction assignment (-=):" + number);
        // addition assignment

        number *= 2;  // same as number = number * 2
        System.out.println("after multiplication assignment (*=):" + number);

        // addition assignment
        number /= 4;  // same as number = number / 4
        System.out.println("after division assignment (/=):" + number);
    }
}
