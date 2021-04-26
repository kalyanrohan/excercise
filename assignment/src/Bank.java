import java.util.ArrayList;
public class Bank {
    private ArrayList<Customer>customers;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName) {
        this.bankName = bName;
        this.numberOfCustomers=0;
        this.customers=new ArrayList<Customer>();
    }

    public void addCustomer(String f, String l) {
        this.numberOfCustomers++;
        customers.add(new Customer(f, l));
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }
}




