import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int guess = 0; //declare the variable guess
        int count = 0; //declare the count
        int mysteryNumber = 21; //number of time we guessed
        int previousNumber = 0;
        
        Scanner in = new Scanner(System.in); //declare scanner
        do {
            System.out.println("Guess a number between 1 and 50.");
            System.out.println("What is you number?");
            guess = in.nextInt();
            
            
            if (guess > mysteryNumber) 
            { System.out.println("Too large");
            }
            else if (guess < mysteryNumber)
            {System.out.println("Too small");
            }  
            if (guess != previousNumber) 
            {
            count++;
            previousNumber = guess; 
            }
           
        }
        while (guess != mysteryNumber);
        
        System.out.println("Correct guess");
        System.out.println("It took " + count + " tries to guess the correct number.");
    
        }
    }   
