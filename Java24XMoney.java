//Cadenk
// Demonstrate using constructors and the instance variables with methods to use and apply currency

class Moneys {
    // instance variables
    String name;
    double amount;
    String Currency;
    String Color;
    double rate;
    String country;

    //constructor is used to initialize objects instance variables
    Moneys(String n, double amt, String curr, String C, double R, String Cty) {
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
public class Java24XMoney {
    public static void main(String[] args) {

        Moneys mP = new Moneys(" peso ", 500.00," peso ", " multi ", 16.50, " Mexico ");
        mP.transfer();
        mP.getBalance();
        mP. setDeposit();
        mP.setRate();
        mP.getWithraw();
        mP.Convert();


        Moneys mE = new Moneys(" Euro ", 500.00," Euro ", " multi ", 0.88, " Europe ");
        mE.transfer();
        mE.getBalance();
        mE. setDeposit();
        mE.setRate();
        mE.getWithraw();
        mE.Convert();

        Moneys mY = new Moneys(" Yuan ", 500.00," Yuan ", " multi ", 6.70, " China ");
        mY.transfer();
        mY.getBalance();
        mY. setDeposit();
        mY.setRate();
        mY.getWithraw();
        mY.Convert();



        Moneys mR = new Moneys(" Rupee ", 500.00," Rupee ", " multi ", 96, " India ");
        mR.transfer();
        mR.getBalance();
        mR. setDeposit();
        mR.setRate();
        mR.getWithraw();
        mR.Convert();




    }

}



