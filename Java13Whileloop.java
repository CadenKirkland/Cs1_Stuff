//CadenK
//demonstrate getting input and setting up a While loop
import java.util.Scanner;
public class Java13Whileloop {
    public static void main(String[] args){
        int remainder, num;
        String result;
        boolean status = true;

        Scanner sc0bj = new Scanner(System.in);

        while(status){
            System.out.println("enter a number (999 to exit): ");
            num = sc0bj.nextInt();

            if (num == 999){
                status = false;
            }
            else {
                remainder = num % 2;
                if (remainder == 0) {
                    result = "Even";
                } else {
                    result = "Odd";
                }
                System.out.println("the number " + num + " is " + result);
            }
        }
        System.out.println("Program has concluded");
    }
}
