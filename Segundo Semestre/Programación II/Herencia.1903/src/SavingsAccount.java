public class SavingsAccount extends Account {
    private final boolean active;

    public SavingsAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        this.active = balance >= 10000;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public void withdraw(float amount) {
        if (active) {
            super.withdraw(amount);
        }
    }

    @Override
    public void deposit(float amount) {
        if (active) {
            super.deposit(amount);
        }
    }

    @Override
    public void monthlyStatement() {
        if (getNumWithdrawals() > 4) {
            setMonthlyFee(getMonthlyFee() + (getNumWithdrawals() - 4) * 1000);
        }
        setActive();
        super.monthlyStatement();
    }

    private void setActive() {}

    @Override
    public void print() {
        System.out.println("Savings Account Balance: $" + getBalance());
        System.out.println("Monthly Fee: $" + getMonthlyFee());
        System.out.println("Number of Transactions: " + (getNumDeposits() + getNumWithdrawals()));
    }
}
