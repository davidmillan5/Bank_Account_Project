import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SavingsAccount extends BankAccount{

    double interestRate;

    void applyInterest(){
        interestRate = 0.05;
        BigDecimal zero = BigDecimal.ZERO;
        LocalDateTime timestamp = LocalDateTime.now();
        if(super.getBalance().compareTo(zero) > 0){
            balance = super.getBalance();
            BigDecimal interest = balance.multiply(BigDecimal.valueOf(interestRate));
            balance = balance.add(interest);
            Transaction interestTransaction = new Transaction(
                    transactionType.DEPOSIT,
                    interest,
                    timestamp,
                    "interests generated.");
            transaction.add(interestTransaction);
        }
    }


    @Override
    void withdraw(BigDecimal amount){
        LocalDateTime timestamp = LocalDateTime.now();
        if(getBalance().compareTo(amount)>0){
            balance = getBalance().subtract(amount);
            //System.out.println(balance);
            Transaction withdrawTransaction = new Transaction(
                    transactionType.WITHDRAW,
                    amount,
                    timestamp,
                    "simple withdraw.");
            transaction.add(withdrawTransaction);
        }else{
            System.out.println("You don't have enough founds to make that withdrawal try a smaller amount.");
        }
    }


}
