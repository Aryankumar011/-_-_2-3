import java.util.Random;
import java.util.Scanner;

/**
 * NUMBER_GUESSING_GAME
 * Author : Aryan Panchal
 */
public class NUMBER_GUESSING_GAME {
    public static void main(String[] args) {

        int Num = (int) (Math.random() * 100);
        int Count = 0, Attmps, Bound = 0, UserNo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("This Is Number Gussing Game..");
        System.out.println("The computer guessed the number(1-100)");
        System.out.println("Which Level You Play :");
        System.out.println("Level 1 : 5 Attemps (Enter 1)");
        System.out.println("Level 2 : 10 Attemps (Enter 2)");
        System.out.println("Level 3 : 20 Attemps (Default) (Enter 3)");
        System.out.print("Ans : ");

        Attmps = scanner.nextInt();
        switch (Attmps) {
            case 1:
                Bound = 5;
                break;
            case 2:
                Bound = 10;
                break;
            default:
                Bound = 20;
        }
        for (int i = 0; i <= Bound; i++) {
            System.out.print("Enter Your Number :");
            UserNo = scanner.nextInt();
            Count++;
            if (Num == UserNo) {
                System.out.println("You Win...!\nYou Guess Numbar In " + Count + " Attemps");
                System.out.println("Your Score Is :" + Count);

                System.exit(0);
            } else if (UserNo > Num) {
                System.out.println("The number you guess is higher. \nGuess Again Small Number......");
            } else
                System.out.println("The number you guess is smaller. \nGuess Again Higher Number......");
        }

        System.out.println("You Lose...Your Score Is 0");

    }

}