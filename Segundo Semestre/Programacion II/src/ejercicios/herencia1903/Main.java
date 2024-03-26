package ejercicios.herencia1903;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12000, 3);

        savingsAccount.deposit(2000);

        savingsAccount.withdraw(500);

        savingsAccount.monthlyStatement();

        savingsAccount.print();
    }
}
