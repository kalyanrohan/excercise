public class Savings extends Current{
    private int balance;
    public void deposit(int amt){
        this.balance+=amt;
        System.out.println(balance+" Deposited in savings account.");
    }

    public Savings(){
        super();
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
