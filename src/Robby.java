import java.util.Scanner;

public class Robby {
    public static void main(String[] args) {
       int choice;
       char direction;
       int distance;
       int x=0;
       int y=0;

       do {
           System.out.println("ROBBY THE ROBOT");
           System.out.println("1. LOCATION");
           System.out.println("2. MOVE");
           System.out.println("3. RESET");
           System.out.println("4. QUIT");

           Scanner option = new Scanner(System.in);
           System.out.println("ENTER A NUMBER");
           choice = option.nextInt();

           switch (choice){

               case 1:
                   System.out.println("Robby is located at ("+x+","+y+")");
                   break;
               case 2:
                   System.out.println("Enter direction: N,W,E,S ");
                   direction=option.next().charAt(0);
                   System.out.println("Enter a distance: ");
                   distance=option.nextInt();
                   switch (direction){
                       case 'N':
                           y= y+distance;
                           break;
                       case 'W':
                           x=x-distance;
                           break;
                       case 'E':
                           x=x+distance;
                           break;
                       case 'S':
                           y= y-distance;
                           break;
                   }
                   break;
               case 3:
                   x=0;
                   y=0;
                   break;

           }
       }
       while(choice!=4);
       System.out.println("PROGRAM TERMINATED");
    }
}
