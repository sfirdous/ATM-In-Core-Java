public class Account {
    private int accountNumber;
    private int pin;
    private double checkingBalance;
    private double savingBalance;

    public Account(int accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public boolean validatePin(int enteredPin) {
        return pin == enteredPin;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

   

    public void depositToChecking(double amount) {
        checkingBalance += amount;
    }

    public void withdrawFromChecking(double amount) {
        if (checkingBalance >= amount) {
            checkingBalance -= amount;
        } else {
            System.out.println("Insufficient funds in Checking account.");
        }
    }

    // Similar methods for saving account

   

    public void depositToSaving(double amount) {
        checkingBalance += amount;
    }

    public void withdrawFromSaving(double amount) {
        if (checkingBalance >= amount) {
            checkingBalance -= amount;
        } else {
            System.out.println("Insufficient funds in Checking account.");
        }
    }
}

