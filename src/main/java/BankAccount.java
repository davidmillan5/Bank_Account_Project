import java.math.BigDecimal;
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
    List<Transaction> transaction;


    void deposit(BigDecimal amount){
            balance = balance.add(amount);
            System.out.println(getBalance());
    }

    void withdraw(BigDecimal amount){
            if(getBalance().compareTo(amount)>0){
                balance = getBalance().subtract(amount);
                System.out.println(balance);
            }else{
                System.out.println("You don't have enough founds to make that withdrawal try a smaller amount.");
            }
    }

    BigDecimal getBalance(){
        return balance;
    }

}
