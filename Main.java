import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int A = 0; //declare the variable guess
        int B = 0; //declare the count
        int C = 21; //number of time we guessed
        
        Scanner in = new Scanner(System.in); //declare scanner
        do {
            System.out.println("Guess a number between 1 and 50.");
            System.out.println("What is you number?");
            A = in.nextInt();
            B++;
            
            if (A > C) System.out.println("Too large");
            if (A < C) System.out.println("Too small");
        }
        while (A != C);
        System.out.println("Correct guess");
        System.out.println("It took " + B + " tries to guess the correct number.");
    }
}