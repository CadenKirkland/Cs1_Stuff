// CadenK
// pgm description: this program will setup an array of pet names & randomly select one to display
//
import java.util.Random;  // access the library, specifically the Random class
//
public class Java19RandomPetArray {
    public static void main(String[] args){

        String[] Pets = {"bulldog", "chow", "pug", "yorky", "dane", "lab", "poodle"};

        Random rObj = new Random();  // creating an object from the Random class

        int rNum;

        for (int x=0; x < 10; x++) {

            rNum = rObj.nextInt(6);  // call the nextInt() method using the "rObj" object to generate a Random #

            System.out.println("random pet name: " + Pets[rNum]);
        }
    }
}
