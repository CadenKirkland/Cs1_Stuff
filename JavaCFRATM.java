import java.util.Scanner;
class atm{
    String acustomername;
    int baccountID;
    double cbalance;

    atm(String customername, int accountID, double balance) {
// constructor method which initializes objects created from class

        acustomername = customername;
        baccountID = accountID;
        cbalance = balance;

    }

    public void getbalance(){
       System.out.println("your balance is " + cbalance);
    }

    public void setDeposit(){
        Scanner scObj = new Scanner (System.in);
        System.out.println("how much would you like to deposit?");
         double depositamount = scObj.nextInt();
         cbalance += depositamount;
         System.out.println("you have deposited " + depositamount + "dollars");
    }

    public void getWithdraw(){
        Scanner scObj = new Scanner (System.in);
        System.out.println("how much would you like to withdraw?");
        double withdrawamount = scObj.nextInt();
        cbalance -= withdrawamount;
        System.out.println("you have withdrawn " + withdrawamount + "dollars");
    }

    public void ATMcustomer(){
        System.out.println("Your name is " + acustomername + ", your account ID is " + baccountID + ", your balance is " + cbalance );

    }
}


public class JavaCFRATM {
public static void main(String[] args){


    Scanner scObj = new Scanner (System.in);
    System.out.println("What is your name?");
    String customername = scObj.nextLine();
    System.out.println("What is your accountID");
    int accountID = scObj.nextInt();
    System.out.println("What is your balance");
    double balance = scObj.nextInt();




    atm ATM = new atm(customername, accountID, balance);
    ATM.ATMcustomer();
    ATM.getbalance();
    ATM.getWithdraw();
    ATM.setDeposit();
        }
    }

