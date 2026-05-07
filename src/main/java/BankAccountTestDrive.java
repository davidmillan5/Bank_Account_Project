import java.math.BigDecimal;

public class BankAccountTestDrive {
    static void main(String[] args) {
        SavingsAccount savingAccount1 = new SavingsAccount();

        //savingAccount1.deposit(BigDecimal.valueOf(155000.00));
        savingAccount1.deposit(BigDecimal.valueOf(1500052.00));
        savingAccount1.withdraw(BigDecimal.valueOf(15689.00));
        savingAccount1.applyInterest();
    }
}
