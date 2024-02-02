import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account account1 = new Account(123456, 1234);
        Account account2 = new Account(789012, 5678);// Example account with account number and PIN
        OptionMenu optionMenu = new OptionMenu(account1);

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter account number and PIN
        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your account number: ");
        int enteredAccountNumber = scanner.nextInt();
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        // Simulate login validation
        if (account1.validatePin(enteredPin)) {
            System.out.println("Login successful.");
            optionMenu.displayMenu();
        } else {
            System.out.println("Invalid PIN. Exiting.");
        }
    }
}
