import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static Map<Integer, Account> accounts = new HashMap<Integer, Account>();

    public Bank() {}

    public Bank(Integer accNum, Account acc) {
        accounts.put(accNum, acc);
    }

    public Map<Integer, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<Integer, Account> accounts) {
        accounts = accounts;
    }

    public void deposit(Integer accNum, Double amount) {
        Account acc = accounts.get(accNum);
        acc.deposit(amount);
    }

    public void withdraw(Integer accNum, Double amount) {
        Account acc = accounts.get(accNum);
        acc.withdraw(amount);
    }

    public void transfer(Account from, Account to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

    public static int getNumOfAccounts() {
        return accounts.size();
    }
}
