import java.math.BigDecimal;

public class BankAccountTestDrive {
    static void main(String[] args) {
        SavingsAccount savingAccount1 = new SavingsAccount();

        savingAccount1.deposit(BigDecimal.valueOf(155000.00));
        savingAccount1.deposit(BigDecimal.valueOf(1500052.00));
        savingAccount1.withdraw(BigDecimal.valueOf(15689.00));
        savingAccount1.applyInterest();
        System.out.println("balance ----> " +savingAccount1.getBalance());

        savingAccount1.transactionHistory();


        System.out.println("======================== Checking Account ==========================");

        CheckingAccount checkingAccount1 = new CheckingAccount();
        checkingAccount1.deposit(BigDecimal.valueOf(15000.00));
        System.out.println("balance #1 ----> " + checkingAccount1.getBalance());
        checkingAccount1.withdraw(BigDecimal.valueOf(15000.00));
        System.out.println("balance #2 ----> " + checkingAccount1.getBalance());
        checkingAccount1.withdraw(BigDecimal.valueOf(13000.00));
        System.out.println("balance #3 ----> " + checkingAccount1.getBalance());
        checkingAccount1.withdraw(BigDecimal.valueOf(13000.00));
        System.out.println("balance #4 ----> " + checkingAccount1.getBalance());
        checkingAccount1.transactionHistory();

    }
}
