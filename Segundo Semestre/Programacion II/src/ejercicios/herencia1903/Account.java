package ejercicios.herencia1903;

public abstract class Account {
    protected float balance;
    protected int numDeposits = 0;
    protected int numWithdrawals = 0;
    protected float annualInterestRate;
    protected float monthlyFee = 0;

    public Account() {
    }

    public Account(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumDeposits() {
        return numDeposits;
    }

    public void setNumDeposits(int numDeposits) {
        this.numDeposits = numDeposits;
    }

    public int getNumWithdrawals() {
        return numWithdrawals;
    }

    public void setNumWithdrawals(int numWithdrawals) {
        this.numWithdrawals = numWithdrawals;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void deposit(float amount) {
        balance += amount;
        numDeposits++;
    }

    public void withdraw(float amount) {
        balance -= amount;
        numWithdrawals++;
    }

    public void calculateInterest() {
        float monthlyInterestRate = annualInterestRate / 12 / 100;
        balance += balance * monthlyInterestRate;
    }

    public void monthlyStatement() {
        balance -= monthlyFee;
        calculateInterest();
        numDeposits = 0;
        numWithdrawals = 0;
        monthlyFee = 0;
    }

    public abstract void print();
}
