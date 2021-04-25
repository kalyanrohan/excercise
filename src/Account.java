public class Account {
    private double balance;

    public Account(double balance){
        this.balance=balance;
    }

    public Double getBalance(){
        return balance;
    }

    public boolean deposit(double amt){
        Boolean success= Boolean.TRUE;
        if(amt>0){
            balance+=amt;
        }
        else{
            success=Boolean.FALSE;
        }
        return success;
    }

    public boolean withdraw(double amt){
        Boolean success=Boolean.TRUE;
        if(amt<=balance){
            balance-=amt;
        }
        else{
            success=Boolean.FALSE;
        }
        return success;
    }
}
