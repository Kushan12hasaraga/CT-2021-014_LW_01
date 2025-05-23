package Q_06;

import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random = new Random();

        int secNum = random.nextInt(100) +1;
        int guess = 0;
        System.out.println("Guess number (1-100)!!!!");

        while (guess != secNum){
            System.out.print("Guess Number:");
            guess = scanner.nextInt();
            if (guess < secNum ){
                System.out.println("Too low!!!. Guess again");
            } else if (guess > secNum) {
                System.out.println("Too High!!!. Guess again");
            }else{
                System.out.println("Congratulations! Guessed correctly.");
            }
        }
    }
}
