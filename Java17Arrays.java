//CadenK
//demonstrate setting up, initializing and traversing arrays

public class Java17Arrays {
    public static void main(String[] args){

        int[] primes = {1,3,5,7,11,13,17};
        String[] colors = {"red", "blue", "green", "orange", "pink"};
        char[] letters = {'a', 'e', 'i', 'o', 'u'};

        int primesLen = primes.length;   //get length of the primes array

        for (int i = 0; i < primesLen; i++){
            System.out.println("primes[i]" + primes[i]);
        }

        int colorsLen = colors.length; // get the length of the colors length

        for (int x = 0; x < colorsLen; x++){
            System.out.println("colors[x] "+ colors[x]);
        }

        // print out the array elements individually with use of a loop
        System.out.println("letter: "+ letters[0]);
        System.out.println("letter: "+ letters[1]);
        System.out.println("letter: "+ letters[2]);
        System.out.println("letter: "+ letters[3]);
        System.out.println("letter: "+ letters[4]);

        //un-comment the following to get an exception out of bounds
        //System.out.println("letter: "+ letter[5])
    }
}
