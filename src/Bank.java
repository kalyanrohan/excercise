public class Bank {
    private Customer customers[];
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName){
        this.bankName=bName;
    }

    public void addCustomer(String f, String l){
        customers[customers.length]=new Customer(f,l);
    }

    public int getNumberOfCustomers(){
        return customers.length;
    }

    public Customer getCustomer(int index){
        return customers[index];
    }

    public static void main(String[] args){
        Bank A= new Bank("Hello");

        System.out.print(A.getNumberOfCustomers());
    }
}


