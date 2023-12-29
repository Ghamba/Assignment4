package assignmet4;

public class Demo {

	public static void main(String[] args) {

        try {
            // Creating a Account with $1000 balance
            BankAccount account = new BankAccount("Javad Javadi", 1000.0);

            // Display  account details
            System.out.println("First Account Details:");
            System.out.println(account);

            // Checking Deposit $350 
            System.out.println("Depositing $350...");
            account.deposit(350.0);
            System.out.println("Updated Account :");
            System.out.println(account);

            // Withdrawal checking
            System.out.println("Withdrawing $250...");
            account.withdraw(250.0);
            System.out.println("Updated Account :");
            System.out.println(account);

            // Invalid deposit (non-positive amount)
            System.out.println("deposit a non-positive amount?");
            account.deposit(-50.0);  // throw InvalidAmountException

        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for banking with us.. End of transaction");

        }

        try {
            // Creating a BankAccount with no initial balance
            BankAccount account2 = new BankAccount("Sohrab Sepehri");

            // initial account details:
            System.out.println("No Initial Balance: ");
            System.out.println(account2);

            // Withdrawal - insufficient balance
            System.out.println("Withdrawing $260 from nsufficient balance!!!");
            account2.withdraw(260.0);  // throw NotEnoughBalanceException

        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("\nThank you for banking with us.. End of transaction\n******");

        }

        try {
            //BankAccount with initial balance 1020
            BankAccount account3 = new BankAccount("Sadegh Hedayat", 1020.0);

            // Display initial account details
            System.out.println("Account Details: ");
            System.out.println(account3);

            // Exceeding deposit limit 
            System.out.println("deposit an amount exceeding the deposit limit!!");
            account3.deposit(600.0);  // throw DepositLimitException

        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("\nThank you for banking with us.. End of transaction\n******");

        }

        try {
            // Creating a BankAccount with an initial balance
            BankAccount account4 = new BankAccount("Jen jenzade", 1000.0);

            // Display initial account details
            System.out.println("Initial Account Details:");
            System.out.println(account4);

            // Exceeding withdraw limit 
            System.out.println("withdraw an amount exceeding the withdraw limit!!");
            account4.withdraw(600.0);  //throw WithdrawLimitException

        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("\nThank you for banking with us.. End of transaction\n******");

        }
    }
}
