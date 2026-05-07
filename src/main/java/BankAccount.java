import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

enum AccountStatus{
    ACTIVE,
    BLOCKED,
    CLOSED
}


abstract class BankAccount {

    UUID uuid = UUID.randomUUID();
    String id = uuid.toString();
    String ownerName;
    BigDecimal balance = BigDecimal.valueOf(0.00);
    AccountStatus status;
    List<Transaction> transaction = new ArrayList<>();


    void deposit(BigDecimal amount){
            LocalDateTime timestamp = LocalDateTime.now();
            balance = balance.add(amount);
            //System.out.println(getBalance());
            Transaction depositTransaction = new Transaction(
                    transactionType.DEPOSIT,
                    amount,
                    timestamp,
                    "simple deposit.");
            transaction.add(depositTransaction);
    }

    void withdraw(BigDecimal amount){
            LocalDateTime timestamp = LocalDateTime.now();
            if(getBalance().compareTo(amount)>0){
                balance = getBalance().subtract(amount);
                System.out.println(balance);
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

    BigDecimal getBalance(){
        return balance;
    }


    void transactionHistory(){
        for(Transaction trx : transaction){
            System.out.println(trx);
        }
    }

}
