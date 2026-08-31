//CadenK
//demonstrate using traditional for loop

public class Java11TForLoop {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {

            System.out.println("x is " + x);
            if (x == 7) {
                System.out.println("7 is a lucky number");
            }
        }
        // add another For loop here with z as its iterator
        for (int z = 5; z <= 15; z++) {

            System.out.println("x is " + z);
            if (z == 12) {
                System.out.println("hooray");
            }
        }
    }
}
