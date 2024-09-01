import java.util.Random;
import java.util.*;
public class NumGG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        System.out.print("Enter your guess (1-100): ");
        int playerGuess = input.nextInt();

        if(playerGuess == randomNumber){
            System.out.println("You won!");
        }else{
            System.out.println("You lost!");

            input.close();
        }
    }
    
}
