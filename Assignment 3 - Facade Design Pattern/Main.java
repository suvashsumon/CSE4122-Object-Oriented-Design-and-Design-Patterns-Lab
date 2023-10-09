import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        int jhonSavingAccount = bankService.createNewAccount("saving", new BigDecimal(1000.00));

        BigDecimal jhonSavingAccountBalance = bankService.showBalance(jhonSavingAccount);
        System.out.println("Joy's Saving Account Balance is: " + jhonSavingAccountBalance);

        int doeInvestmentAccount = bankService.createNewAccount("investment", new BigDecimal(2000.00));

        BigDecimal doeInvestmentAccountBalance = bankService.showBalance(doeInvestmentAccount);
        System.out.println("Joy's Investment Account Balance is: " + doeInvestmentAccountBalance);

        
        bankService.transferMoney(doeInvestmentAccount, jhonSavingAccount, new BigDecimal(500.00));

        
        doeInvestmentAccountBalance = bankService.showBalance(doeInvestmentAccount);
        jhonSavingAccountBalance = bankService.showBalance(jhonSavingAccount);
        System.out.println("After Transfer, Joy's Saving Account Balance is: " + jhonSavingAccountBalance);
        System.out.println("After Transfer, Joy's Investment Account Balance is: " + doeInvestmentAccountBalance);

        bankService.deposit(jhonSavingAccount, new BigDecimal(3000.00));

        jhonSavingAccountBalance = bankService.showBalance(jhonSavingAccount);
        System.out.println("After Deposit, Joy's Saving Account Balance is: " + jhonSavingAccountBalance);
    }
}
