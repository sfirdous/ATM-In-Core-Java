import java.util.Scanner;

public class OptionMenu {
    private Scanner scanner = new Scanner(System.in);
    private Account currentAccount;

    public OptionMenu(Account account) {
        this.currentAccount = account;
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("1. View Balance");
            System.out.println("2. Deposit to Checking");
            System.out.println("3. Withdraw from Checking");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    depositToChecking();
                    break;
                case 3:
                    withdrawFromChecking();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void viewBalance() {
        System.out.println("Checking Balance: $" + currentAccount.getCheckingBalance());
        System.out.println("Saving Balance: $" + currentAccount.getSavingBalance());
    }

    private void depositToChecking() {
        System.out.print("Enter the amount to deposit to Checking: $");
        double amount = scanner.nextDouble();
        currentAccount.depositToChecking(amount);
        System.out.println("Deposit successful.");
    }

    private void withdrawFromChecking() {
        System.out.print("Enter the amount to withdraw from Checking: $");
        double amount = scanner.nextDouble();
        currentAccount.withdrawFromChecking(amount);
    }
}
