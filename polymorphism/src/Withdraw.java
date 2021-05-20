public class Withdraw {
    public void withdraw(int amt,Current acc){
        acc.setBalance(acc.getBalance()-amt);
        System.out.println("Current acc: "+acc.getBalance());
    }

    public void withdraw(int amt,Savings acc){
        acc.setBalance(acc.getBalance()-amt);
        System.out.println("Savings acc: "+acc.getBalance());
    }
}
