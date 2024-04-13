import java.util.Random;
import java.util.Scanner;

class Game {
    int inputNumber;
    int guessNumber;
    int guesses;

    Game() {
        Random rand = new Random();
        this.guessNumber = rand.nextInt(10);
    }

    int getGuesses() {
        return guesses;
    }

    void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    void takeImput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number : ");
        inputNumber = sc.nextInt();
    }

    boolean checkCorrect() {
        guesses++;
        if (inputNumber == guessNumber) {
            System.out.printf("\nGreat your guess is right..the random number is %d...you take %d attempts", guessNumber,
                    guesses);
            return true;
        } else if (inputNumber < guessNumber) {
            System.out.println("Too less number");
        } else if (inputNumber > guessNumber) {
            System.out.println("Too high");
        }
        return false;
    }
}

public class guess_number {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b = false;
        while (!b) {
            game.takeImput();
            b = game.checkCorrect();
        }
    }
}