public class Current {
    private int balance;

    public Current() {
    }

    public void deposit(int amt){
        this.balance+=amt;
        System.out.println(balance+" Deposited in current account.");
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
