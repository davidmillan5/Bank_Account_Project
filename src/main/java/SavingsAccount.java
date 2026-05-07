import java.math.BigDecimal;

public class SavingsAccount extends BankAccount{

    double interestRate;

    void applyInterest(){
        interestRate = 0.05;
        BigDecimal zero = BigDecimal.ZERO;
        if(super.getBalance().compareTo(zero) > 0){
            balance = super.getBalance();
            balance = balance.add(balance.multiply(BigDecimal.valueOf(interestRate)));
            System.out.println(getBalance());
        }
    }


    @Override
    void withdraw(BigDecimal amount){
        if(getBalance().compareTo(amount)>0){
            balance = getBalance().subtract(amount);
            System.out.println(balance);
        }else{
            System.out.println("You don't have enough founds to make that withdrawal try a smaller amount.");
        }
    }


}
