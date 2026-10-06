// Demonstrate using constructors and the instance variables with methods to use and apply currency

class Money {
    // instance variables
    String name;
    double amount;
    String Currency;
    String Color;
    double rate;
    String country;

    //constructor is used to initialize objects instance variables
    Money(String n, double amt, String curr, String C, double R, String Cty) {
        name = n;
        amount = amt;
        Currency = curr;
        Color = C;
        rate = R;  // capacity is Gigabytes
        country = Cty;

    }

    //method for class
    public void transfer() {
        System.out.println("Transfer is occuring for " + Currency + " of country " + country);
    }


    public void getBalance() {
        System.out.println("Balance for " + Currency + " of country " + country + " is " + amount);
    }


    public void setDeposit() {
        System.out.println("Deposit is occuring for " + Currency + " of country " + country);
    }

    public void setRate() {
        System.out.println("New rate for " + Currency + " of country " + country + " is " + rate);
    }


    public void getWithraw() {
        System.out.println("Withdraw is occuring for " + Currency + " of country " + country + " amount " + amount);
    }

    public void Convert() {
        System.out.println("Conversion is occuring for " + Currency + " of country " + country);
    }

}
public class Java24Money {
    public static void main(String[] args) {

        Money mP = new Money(" peso ", 500.00," peso ", " multi ", 16.50, " Mexico ");
        mP.transfer();
        mP.getBalance();
        mP. setDeposit();
        mP.setRate();
        mP.getWithraw();
        mP.Convert();
    }

}