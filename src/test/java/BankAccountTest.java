import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    @DisplayName("Deposit into Savings Account")
    void makeDepositSavingAccount() {
        SavingsAccount savingsAccountTest = new SavingsAccount();
        savingsAccountTest.deposit(BigDecimal.valueOf(15000.00));
        assertEquals(BigDecimal.valueOf(15000.00), savingsAccountTest.getBalance());
    }

    @Test
    @DisplayName("Deposit into Checking Account")
    void makeDepositCheckingAccount() {
        CheckingAccount checkingAccountTest = new CheckingAccount();
        checkingAccountTest.deposit(BigDecimal.valueOf(15000.00));
        assertEquals(BigDecimal.valueOf(15000.00), checkingAccountTest.getBalance());
    }


    @Test
    @DisplayName("Withdraw from Savings Account")
    void makeWithdrawSavingAccount() {
        SavingsAccount savingsAccountTest = new SavingsAccount();
        savingsAccountTest.deposit(BigDecimal.valueOf(15000.00));
        savingsAccountTest.withdraw(BigDecimal.valueOf(15000.00));
        assertEquals(BigDecimal.valueOf(0.00), savingsAccountTest.getBalance());
    }


    @Test
    @DisplayName("Withdraw from Savings Account")
    void makeWithdrawCheckingAccount() {
        CheckingAccount checkingAccountTest = new CheckingAccount();
        checkingAccountTest.deposit(BigDecimal.valueOf(15000.00));
        checkingAccountTest.withdraw(BigDecimal.valueOf(15000.00));
        assertEquals(BigDecimal.valueOf(0.00), checkingAccountTest.getBalance());
    }


    @Test
    @DisplayName("Applying Interest into Savings Account")
    void applyInterestRateSavingAccount() {
        SavingsAccount savingsAccountTest = new SavingsAccount();
        savingsAccountTest.deposit(BigDecimal.valueOf(15000.00));
        savingsAccountTest.applyInterest();
        assertEquals(BigDecimal.valueOf(0.00), savingsAccountTest.getBalance());
    }


}
