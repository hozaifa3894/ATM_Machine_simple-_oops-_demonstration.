import java.util.Scanner;
public class ATM {


        float Balance;
        int PIN = 5674;
        Scanner sc = new Scanner(System.in);

        public void checkPin() {
            System.out.println("Enter your PIN:");
            int enteredPin = sc.nextInt();
            if (enteredPin == PIN) {
                menu();
            } else {
                System.out.println("Enter a valid pin");
                checkPin();
            }
        }

        public void menu() {
            System.out.println("Enter Your Choice:");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT");

            int opt = sc.nextInt();

            if (opt == 1) {
                checkBalance();
            } else if (opt == 2) {
                withdrawMoney();
            } else if (opt == 3) {
                depositMoney();
            } else if (opt == 4) {
                return;
            } else {
                System.out.println("Enter a valid choice");
                menu();
            }
        }

        public void checkBalance() {
            System.out.println("Balance: " + Balance);
            menu();
        }

        public void withdrawMoney() {
            System.out.println("Enter Amount to Withdraw:");
            float amount = sc.nextFloat();
            if (amount > Balance) {
                System.out.println("Insufficient Balance");
            } else {
                Balance = Balance - amount;
                System.out.println("Money Withdrawal Successful");
            }
            menu();
        }

        public void depositMoney() {
            System.out.println("Enter the Amount:");
            float amount = sc.nextFloat();
            Balance = Balance + amount;
            System.out.println("Money Deposited Successfully");
            menu();
        }
    }



