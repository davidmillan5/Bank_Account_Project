import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


enum transactionType {
    DEPOSIT,
    WITHDRAW
}


public class Transaction {

    UUID uuid = UUID.randomUUID();
    String id = uuid.toString();
    transactionType type;
    BigDecimal amount;
    LocalDateTime timestamp;
    String description;


}
