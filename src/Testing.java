import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        int myAge=18;
        // string holds a more than 1 character while char only holds 1 character. char is a primitive data type
        char myChar ='A';
        int newNum= (int)myChar;
        System.out.println(myChar);
        System.out.println(newNum);
        // yes you can but it stores the ASCII code of the character rather than the character itself

        //assign
        int tenYear = 10;
        Scanner scanner = new Scanner(System.in);

        //input name
        System.out.println("What's your name?");
        String myName = scanner.next();

        //input age
        System.out.println("What's your age?");
        int Age = scanner.nextInt();


        //age 10 years from now
        int AgeTen = Age + tenYear;

        //print :slight_smile:
        System.out.println("My name is " + myName + " and I will be " + AgeTen + " in ten years.");



    }
}