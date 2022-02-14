import java.util.Scanner;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        int userOne;
        int random;
        int ten = 10;
        Random ran = new Random();
        Scanner userIn = new Scanner(System.in);
        random = ran.nextInt(ten);

        System.out.println("Guess a number between 1 and 10: ");
        userOne = userIn.nextInt();

        if(userOne == random)
        {
            System.out.println("You both guessed " + random + "!");
        }
        else
        {
            System.out.println("You guessed " + userOne + ", and the computer guessed " + random + ".");
        }
    }
}
