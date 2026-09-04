//CadenK
//demonstrate getting input and setting up a While loop
import java.util.Scanner;
public class Java14CodeCFR {
    public static void main(String[] args) {
        int grade;
        String result;
        boolean active = true;

        Scanner sc0bj = new Scanner(System.in);
        while (active) {
            System.out.println("enter your grade: ");
            grade = sc0bj.nextInt();

            if (grade == 100) {
                System.out.println("WooHoo!, you got an A+");
            } else if (grade > 89) {
                System.out.println("great, you get an A");
            } else if (grade > 79) {
                System.out.println("good, you get a B!");
            } else if (grade > 69) {
                System.out.println("ok, you get a c");
            } else {
                System.out.println("you can do better");
            }
        }
    }
}
