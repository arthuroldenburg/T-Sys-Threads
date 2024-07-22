public class CustomerThread extends Thread {
    private String type;
    private Double amount;
    private Account from;
    private Account to;
    private Integer accNum;

    public CustomerThread(String type, Double amount, int accNum) {
        this.type = type;
        this.amount = amount;
        this.accNum = accNum;
    }

    public CustomerThread(String type, Double amount, Account from, Account to) {
        this.type = type;
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        super.run();
        try{
            if(type.toLowerCase().equals("deposit")){
                Bank bank = new Bank();
                bank.deposit(accNum, amount);
            }
            if(type.toLowerCase().equals("withdraw")){
                Bank bank = new Bank();
                bank.withdraw(accNum, amount);
            }
            if(type.toLowerCase().equals("transfer")){
                Bank bank = new Bank();
                bank.transfer(from, to, amount);
            }
        }catch (Error e) {
            e.printStackTrace();
        }
    }
}
