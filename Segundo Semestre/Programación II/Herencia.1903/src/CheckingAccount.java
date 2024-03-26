public class CheckingAccount extends Account {
    private float overdraft;

    public CheckingAccount() {
    }

    public CheckingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        this.overdraft = 0;
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            this.overdraft += amount - getBalance();
            setBalance(0);
        }
    }

    @Override
    public void deposit(float amount) {
        if (overdraft > 0) {
            float remaining = amount - overdraft;
            overdraft = Math.max(0, overdraft - amount);
            setBalance(getBalance() + remaining);
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }

    @Override
    public void print() {
        System.out.println("Checking Account Balance: $" + getBalance());
        System.out.println("Monthly Fee: $" + getMonthlyFee());
        System.out.println("Number of Transactions: " + (getNumDeposits() + getNumWithdrawals()));
        System.out.println("Overdraft: $" + overdraft);
    }
}
