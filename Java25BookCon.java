// CadenK
// pgm desc: objects are created from class Book & initialized with a Constructor
//
import java.util.Scanner;
class Book {
    String title;
    int bookNum;
    String author;
    String genre;

    Book(String Btitle, int Bnum, String Bauthor, String Bgenre) {
// constructor method which initializes objects created from class

        title = Btitle;
        bookNum = Bnum;
        author = Bauthor;
        genre = Bgenre;
    }

    void checkIn() {
        System.out.println("this book " + title + "is being checked in");
    }

    void checkOut() {
        System.out.println("this book " + title + " has now been checked out");
    }
    void Reserved(){
        System.out.println("this book" + title +" has been reserved");
    }
}
public class Java25BookCon{
public static void main(String[] args) {
    Scanner scObj = new Scanner (System.in);
    int bookNum;
    boolean active = true;
    Book b1 = new Book("painted house", 123, "john grisham", "Historial fiction");
    Book b2 = new Book("angels & demons", 456, "dan brown", "Thriller");
    Book b3 = new Book("last templar", 789, "raymond khoury", "Thriller");
    Book b4 = new Book("the great bridge", 805, "david mcCullough","Non-Fiction");
    while (active) {
        System.out.println("welcome to X library - please enter your book #");
        bookNum = scObj.nextInt();
        System.out.println("you entered: " + bookNum);

        if (bookNum == 123) {
            b1.checkOut();
            b1.checkIn();
        } else if (bookNum == 456) {
            b2.checkOut();
            b2.checkIn();
        } else if (bookNum == 789) {
            b3.checkOut();
            b3.checkIn();
        } else if (bookNum == 805) {
            b4.checkOut();
            b4.checkIn();
        } else
            System.out.println("invalid entry; please try again");

        }
    }
}