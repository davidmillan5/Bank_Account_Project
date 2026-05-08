import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    @DisplayName("Deposit into Savings Account")
    void makeDeposit() {
        SavingsAccount savingsAccountTest = new SavingsAccount();

        savingsAccountTest.deposit(BigDecimal.valueOf(15000.00));

        assertEquals(BigDecimal.valueOf(15000.00), savingsAccountTest.getBalance());
    }
}
