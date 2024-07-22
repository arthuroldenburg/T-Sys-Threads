public class Main {
    public static void main(String[] args) {
//      first create the account
        Account acc = new Account(150.00);
        int accNum = acc.getAccNum();
        Account acc2 = new Account(150.00);
        int accNum2 = acc2.getAccNum();
        CustomerThread cust = new CustomerThread("deposit", 150.00, accNum);
        CustomerThread cust2 = new CustomerThread("withdraw", 50.00, accNum2);
        cust.start();
        cust2.start();
        CustomerThread cust3 = new CustomerThread("transfer", 150.00, acc, acc2);
        cust3.start();
        System.out.println(acc.getBalance());
        System.out.println(acc2.getBalance());
        acc.showTransactionsHistory();
    }
}