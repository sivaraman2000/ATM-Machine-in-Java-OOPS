import java.util.Scanner;

public class ATMFunctions {
    int balance;
    int depositCash;
    int withDrawCash;
    Scanner scan = new Scanner(System.in);
    public ATMFunctions(int balance, int depositCash, int withDrawCash){
        this.balance = balance;
        this.depositCash = depositCash;
        this.withDrawCash = withDrawCash;
    }
    public void welcomeMessage(){
        System.out.println("--------------------------------------");
        System.out.println("------- Welcome to ATM Machine -------");
        System.out.println("--------------------------------------");
        System.out.println("-----------Your Options are-----------");
        System.out.println(" 1. Check Balance \n 2. Deposit Cash \n 3. Withdraw Cash \n 4. Take Receipt \n 5. Exit");
        System.out.println("--------------------------------------");
    }
    public void showBalance(){
        System.out.println("Your A/C Balance is   : " +balance);
    }
    public void depositAmount(){
        System.out.println("Enter the Deposit Amount : ");
        depositCash = scan.nextInt();
        System.out.println("Successfully Credited");
        balance += depositCash;
    }
    public void withDrawAmount(){
        System.out.println("Enter the Withdraw Amount : ");
        withDrawCash = scan.nextInt();
        if(withDrawCash > balance){
            System.out.println("Insufficient Balance");
            System.out.println("Try Less than your available Balance");
        }
        else{
            System.out.println("Successfully Taken");
            balance -= withDrawCash;
        }
    }
    public void takeReceipt(){
        System.out.println("--------------ATM Receipt--------------");
        showBalance();
        System.out.println("Last Deposited Amount : " +depositCash);
        System.out.println("Last WithDrawn Amount : " +withDrawCash);
        System.out.println("----Thank You for using Our Service----");
    }
}
