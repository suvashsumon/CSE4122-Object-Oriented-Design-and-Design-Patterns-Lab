import java.math.BigDecimal;

public class Saving implements IAccount {
    private final int accountNumber;
    private BigDecimal balance;

    public Saving(int accountNumber, BigDecimal initAmount) {
        this.accountNumber = accountNumber;
        this.balance = initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount); 
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount);
        this.balance = this.balance.subtract(amount); 
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal showBalance() {
        return this.balance;
    }
}
