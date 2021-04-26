import java.util.Scanner;

public class driver {
    public static void main(String[] args){
        int choice;
        float num=0;
        Bank bank= new Bank("Rohan's Bank");

        do {
            System.out.println("Welcome to the Bank");
            System.out.println("1. Make account");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Check Balance");
            System.out.println("5. Quit");

            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER YOUR CHOICE");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    String first="";
                    String last="";
                    System.out.println("Enter first name");
                    first=sc.next();
                    System.out.println("Enter last name");
                    last=sc.next();
                    bank.addCustomer(first, last);
                    bank.getCustomer(0).setAccount(new Account(0));
                    System.out.println("Congratulations "+first+""+last+", you have made your account.");
                    break;

                case 2:
                    System.out.println("Enter amount to be withdrawn");
                    num=sc.nextFloat();
                    if(bank.getCustomer(0).getAccount().withdraw(num)){
                        System.out.println("Your remaining balance is: ");
                        System.out.print(bank.getCustomer(0).getAccount().getBalance());
                        System.out.println();
                    }
                    else{
                        System.out.print("Insufficient funds");
                }
                    break;

                case 3:
                    System.out.println("Enter amount to be deposited");
                    num=sc.nextFloat();
                    if(bank.getCustomer(0).getAccount().deposit(num)){
                        System.out.println("Your remaining balance is: ");
                        System.out.print(bank.getCustomer(0).getAccount().getBalance());
                        System.out.println();
                    }
                    else{
                        System.out.print("Invalid number");
                    }
                    break;
                case 4:
                    System.out.println("Your remaining balance is: ");
                    System.out.print(bank.getCustomer(0).getAccount().getBalance());
                    break;

            }

        }while(choice!=5);
    }
}
