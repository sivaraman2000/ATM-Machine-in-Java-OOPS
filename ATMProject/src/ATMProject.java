import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {

        int pin = 5555;
        int balance = 10000;
        int depositCash = 0;
        int withDrawCash = 0;
        ATMFunctions atm = new ATMFunctions(balance, depositCash, withDrawCash);
        String name ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Pin Number");
        int password = scan.nextInt();
        // Check if the user entered pin is correct or not
        if(password == pin){
            System.out.println("Enter Your Name : ");
            name = scan.next();
            System.out.println("Welcome " +name);
            while (true){
                atm.welcomeMessage();
                // Get the Choice from the User
                System.out.println("Enter Your Choice : ");
                int choice = scan.nextInt();
                // Evaluate the Choice
                switch (choice){
                    case 1 :
                        atm.showBalance();
                        break;
                    case 2 :
                        atm.depositAmount();
                        break;
                    case 3 :
                        atm.withDrawAmount();
                        break;
                    case 4 :
                        atm.takeReceipt();
                        break;
                    case 5 :
                        System.out.println("ThankYou");
                        System.exit(0);
                        break;
                    default :
                        System.out.println("Invalid Choice !");
                        System.out.println("Please Enter a valid Choice : ");
                }
            }
        }
        else{
            System.out.println("Wrong Pin Number");
            System.out.println("Please Enter a Valid Pin Number");
        }
    }
}
