public class Bank {
    public static void main(String[] args){
        Current ca=new Current();
        Savings sa=new Savings();
        Withdraw wd=new Withdraw();

        ca.deposit(100);
        sa.deposit(50);
        wd.withdraw(20,ca);
        wd.withdraw(20,sa);
    }
}
