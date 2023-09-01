package Part1;
import java.util.Random;
import java.util.Scanner;

/*
    ===============================
              DO WHILE
    ===============================
 */

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int biggest = 1, x = random.nextInt(biggest + 1), smallest = 0, guess = - 1;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Try to guess my number: (" + smallest + "-" + biggest + ")\n");
            guess = keyboard.nextInt();
            if (guess < x) {
                System.out.println("Too small!");
                if (guess >= smallest)
                    smallest = guess + 1;
            } else if (guess > x){
                System.out.println("Too big!");
                if (guess <= biggest)
                    biggest = guess - 1;
            }
        }while (guess != x);
        System.out.print("That's a correct number!");
    }
}
