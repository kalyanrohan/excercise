import java.util.Random;
public class Normal {
    public static void main(String[] args) {
        //1. int

        //2.
        odd_or_even(100);
        //3.
        vowel("Hello");
    }
    static void odd_or_even(int num){
        Random rand= new Random();
        int n;
        //initialize 100 random numbers
        for(int i=0;i<=num;i++){
            n=rand.nextInt(1000);
            if(n%2==0){
                System.out.println("Even "+n);
            }
            else{
                System.out.println("Odd "+n);
            }
        }

    }
    static void vowel(String txt){
        int counter = 0;
        for(int i = 0; i<txt.length(); i++){
            String s = txt.substring(i, i + 1).toLowerCase();
            // can only compare strings using .equals()
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                counter++;
            }
        }
        System.out.println("There are "+counter+" number of vowels in this string.");
    }
}
