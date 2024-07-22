import java.util.ArrayList;
import java.util.Date;

public class Account {
    private Integer accNum = 0;
    private double balance;
    private ArrayList<AccountHistory> history = new ArrayList<AccountHistory>();

    public Account(){}

    public Account(double balance) {
        accNum = Bank.getNumOfAccounts() + 1;
        this.balance = balance;
        new Bank(accNum, this);
    }

    public Integer getAccNum() {
        return accNum;
    }

    public void setAccNum(Integer accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        history.add(new AccountHistory(new Date(), "deposit", amount));
        setBalance(getBalance() + amount);
        System.out.println("deposit " + amount + " to " + getAccNum());
    }

    public void withdraw(double amount) {
        history.add(new AccountHistory(new Date(), "withdraw", amount));
        setBalance(getBalance() - amount);
        System.out.println("withdraw " + amount + " from " + getAccNum());
    }

    public void showTransactionsHistory() {
        history.stream().forEach(e ->{
            System.out.println("Type: " + e.type);
            System.out.println("Value: " + e.value);
            System.out.println("Date: " + e.date);
        });
    }
}
