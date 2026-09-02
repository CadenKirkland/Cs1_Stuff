//CadenK
//demonstrate getting input and setting up a While loop
import java.util.Scanner;
public class Java12Whileloop {
    public static void main(String[] args){
        int remainder, num;
        String result;
        boolean status = true;

        Scanner sc0bj = new Scanner(System.in);

        while(status){
            System.out.println("enter a number: ");
            num = sc0bj.nextInt();

            remainder = num % 2;
            if(remainder == 0) {
                result = "Even";
            }
            else {
                result = "Odd";
            }
            System.out.println("the number "+ num + " is "+ result);
        }
    }
}
