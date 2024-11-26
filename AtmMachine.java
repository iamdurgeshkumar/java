package OopsProject;
import java.util.*;
class ATM {
    float Balance;
    int PIN = 5674;

    public void checkPin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int interedpin = sc.nextInt();
        if (interedpin == PIN) {
            menu();
        } else {
            System.out.println("Enter valid PIN");
        }
    }

    public void menu() {
        System.out.println("Enter your choice ");
        System.out.println("1. check account balance ");
        System.out.println("2. Withdraw money");
        System.out.println("3.Deposit money ");
        System.out.println("4. exit ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance ();
        } else if (opt == 2) {
            withdrowmoney();
        } else if (opt == 3) {
            Dipositemoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter valid choice ");
        }
    }
    public void checkBalance () {
        System.out.println("Balance" +Balance);
        menu();
    }
    public void withdrowmoney ( ) {
        System.out.println("Enter amount to withdraw ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("inSufficient balance ");
        }
        else {
            Balance = Balance-amount;
            System.out.println("money withdraw successfully");
        }
        menu();
    }
    public  void Dipositemoney () {
        System.out.println("enter the amount ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance =Balance + amount;
        System.out.println("money deposit  successfully  ");
        menu();
    }
}
public class AtmMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();

    }
}
