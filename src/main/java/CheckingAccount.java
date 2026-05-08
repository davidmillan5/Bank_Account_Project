import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CheckingAccount extends BankAccount{

    BigDecimal overdraftLimit;


    @Override
    void withdraw(BigDecimal amount){
        LocalDateTime timestamp = LocalDateTime.now();
        overdraftLimit = BigDecimal.valueOf(15000.00);
        if(getBalance().compareTo(amount) >= 0){
            balance = getBalance().subtract(amount);
            Transaction withdrawTransaction = new Transaction(
                    transactionType.WITHDRAW,
                    amount,
                    timestamp,
                    "simple withdraw checking account.");
            transaction.add(withdrawTransaction);
        }else if (getBalance().compareTo(amount) < 0) {

            BigDecimal newBalance = getBalance().subtract(amount);

            if (newBalance.compareTo(overdraftLimit.negate()) >= 0) {
                balance = newBalance;
                Transaction withdrawTransaction = new Transaction(
                        transactionType.WITHDRAW,
                        amount,
                        timestamp,
                        "overdraft withdraw checking account.");
                transaction.add(withdrawTransaction);
            } else {
                System.out.println("Withdrawal denied: overdraft limit exceeded.");
            }
        }else{
            System.out.println("You don't have enough founds to make that withdrawal try a smaller amount.");
        }
    }

}
