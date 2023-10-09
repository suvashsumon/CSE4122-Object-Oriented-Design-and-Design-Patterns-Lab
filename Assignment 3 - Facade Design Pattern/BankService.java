import java.util.Hashtable;
import java.math.BigDecimal;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;
    private int nextAccountNumber;

    public BankService() {
        this.bankAccounts = new Hashtable<>();
        this.nextAccountNumber = 0;
    }

    public int createNewAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;
        nextAccountNumber += 1;
        switch (type.toLowerCase()) {
            case "chequing":
                newAccount = new Chequing(nextAccountNumber, initAmount);
                break;
            case "saving":
                newAccount = new Saving(nextAccountNumber, initAmount);
                break;
            case "investment":
                newAccount = new Investment(nextAccountNumber, initAmount);
                break;
            default:
                System.out.println("Invalid Account type");
                break;
        }

        if (newAccount != null) {
            bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        if (toAccount != null && fromAccount != null) {
            fromAccount.transfer(toAccount, amount);
        } else {
            System.out.println("Invalid account numbers");
        }
    }

    public void deposit(int accountNumber, BigDecimal amount) {
        IAccount account = this.bankAccounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Invalid account number");
        }
    }

    public void withdraw(int accountNumber, BigDecimal amount) {
        IAccount account = this.bankAccounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid account number");
        }
    }

    public BigDecimal showBalance(int accountNumber) {
        IAccount account = this.bankAccounts.get(accountNumber);
        if (account != null) {
            return account.showBalance();
        } else {
            System.out.println("Invalid account number");
            return BigDecimal.ZERO;
        }
    }
}
