import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

enum AccountStatus{
    ACTIVE,
    BLOCKED,
    CLOSED
}


abstract class BankAccount{

    UUID uuid = UUID.randomUUID();
    String id = uuid.toString();
    String ownerName;
    BigDecimal balance;
    AccountStatus status;
    List<Transaction> transaction;


    void deposit(BigDecimal amount){

    }


    void withdraw(BigDecimal amount){

    }


    BigDecimal getBalance(){
        return balance;
    }


}
