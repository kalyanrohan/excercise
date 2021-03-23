import java.util.Scanner;

public class Testing {
    public static void main(String args[]){
        String temp1;
        String temp2;

        String[] names = {"Monique", "Rohan", "Raphael", "Chris", "Morris"};
        String[] colour = {"Blue", "Black", "Red", "Black", "Violet"};


        for (int i = 0; i<5-1; i++)
        {
            for (int j = i+1 ; j<5; j++)
            {
                if (names[i].compareTo(names[j])>0)
                {
                    temp1 = names[i];
                    temp2 = colour[i];
                    names[i] = names [j];
                    colour[i] = colour [j];
                    names[j] = temp1;
                    colour[j] = temp2;
                }
            }
        }

        for (int i = 0; i<5; i++) {
            System.out.print(names[i] + " ");
            System.out.println(colour[i]);
        }

        String tempName;
        String tempColour;

        System.out.println("\n After sorted: ");
        for (int i = 0; i<5-1; i++)
        {
            for (int j = i+1 ; j<5; j++)
            {
                if (colour[i].compareTo(colour[j])>0)
                {
                    tempName = names[i];
                    tempColour = colour[i];
                    names[i] = names [j];
                    colour[i] = colour [j];
                    names[j] = tempName;
                    colour[j] = tempColour;
                }
            }
        }

        for (int i = 0; i<5; i++) {
            System.out.print(names[i] +" ");
            System.out.println(colour[i]);
        }

    }
}
