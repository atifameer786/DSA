public class ExceptionHandling extends Exception {

    // Constructor to pass custom message
    public ExceptionHandling(String message) {
        super(message);
    }

    // Static inner class for BankAccount
    public static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) throws ExceptionHandling {
            if (balance - amount < 5000) {
                throw new ExceptionHandling(
                    "Try with less withdraw amount, your balance is low."
                );
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }

        public double getBalance() {
            return balance;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount(8000);

        try {
            account.withdraw(3000); // This will throw the exception
        } catch (ExceptionHandling e) {
            System.out.println(e.getMessage());
        }
    }
}
