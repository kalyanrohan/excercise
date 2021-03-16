import java.util.Scanner;
import java.util.Arrays;
public class TASK1 {
    public static void main(String[] args){
        int choice;
        int num;
        int whicharray;
        int row1 = 0;
        int columns1=0;
        int row2=0;
        int columns2=0;
        int [][]array1 = new int[0][];
        int [][]array2 = new int[0][];
        int [][]answer;

        do {
            System.out.println("MAIN MENU ");
            System.out.println("1. INITIALIZE 2 ARRAYS ");
            System.out.println("2. DOT PRODUCT ");
            System.out.println("3. SCALAR MULTIPLICATION");
            System.out.println("4. EXIT");

            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER A NUMBER");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    //first array
                    System.out.println("Enter the number of rows for the first array: ");
                    row1 = sc.nextInt();
                    System.out.println("Enter the number of columns for the first array: ");
                    columns1 = sc.nextInt();
                    array1= new int[row1][columns1];

                    for (int i = 0; i < row1; i++) {
                        for (int x = 0; x < columns1; x++) {
                            System.out.println("Enter the elements of the matrix: ");
                            array1[i][x] = sc.nextInt();
                        }
                    }
                    System.out.println("Elements of array 1 are: ");
                    for (int i = 0; i < row1; i++) {
                        for (int x = 0; x < columns1; x++) {
                            System.out.print(array1[i][x]+",");
                        }
                        System.out.println();
                    }
                    //second array
                    System.out.println("Enter the number of rows for the second array: ");
                    row2 = sc.nextInt();
                    System.out.println("Enter the number of columns for the second array: ");
                    columns2 = sc.nextInt();
                    array2=new int[row2][columns2];

                    for (int i = 0; i < row2; i++) {
                        for (int x = 0; x < columns2; x++) {
                            System.out.println("Enter the elements of the matrix: ");
                            array2[i][x] = sc.nextInt();
                        }
                    }
                    System.out.println("Elements of array 2 are: ");
                    for (int i = 0; i < row2; i++) {
                        for (int x = 0; x < columns2; x++) {
                            System.out.print(array2[i][x]+",");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    //dot product
                    System.out.println("number of row1: "+row1);
                    System.out.println(" number of column1: "+columns1);
                    System.out.println("number of row2: "+row2);
                    System.out.println("number of column2: "+columns2);
                    answer= new int[row1][columns2];
                    if(columns1!=row2){
                        System.out.println("please enter a valid matrix.");
                    }
                    else{
                        for (int i = 0; i < row1; i++) {
                            for (int x = 0; x < columns2; x++) {
                                answer[i][x]=0;
                                for (int j = 0; j < row2; j++) {
                                        answer[i][x]+=array1[i][j]*array2[j][x];
                                }
                                System.out.print(answer[i][x]+",");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    //Scalar multiplication
                    System.out.println("Please select which array do you want to use. (1/2): ");
                    whicharray=sc.nextInt();
                    System.out.println("Please enter a number to multiply the chosen array.");
                    num=sc.nextInt();
                    if(whicharray==1){
                        answer=new int[row1][columns1];
                        for(int i=0;i<row1;i++){
                            for(int x=0;x<columns1;x++){
                                answer[i][x]+=num*array1[i][x];
                                System.out.print(answer[i][x]+",");
                            }
                            System.out.println();
                        }
                    }
                    else{
                        answer=new int[row2][columns2];
                        for(int i=0;i<row2;i++){
                            for(int x=0;x<columns2;x++){
                                answer[i][x]+=num*array2[i][x];
                                System.out.print(answer[i][x]+",");
                            }
                            System.out.println();
                        }
                    }
                    break;
            }
        }while(choice!=4);
    }
}
