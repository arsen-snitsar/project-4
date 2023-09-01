package Part1;
import java.util.Scanner;

/*
===========================================================================
                              WHILE LOOP
===========================================================================
 */

// This is a Collatz conjecture program, considered to be the most famous unsolved problem in mathematics.
// It's meaning is simple: select a random number, if it is even - divide by two, if odd - triple it and add one.
// The loop repeats till the number becomes 1.
// Or will it?
// The problem is, mathematicians still can not prove or disprove whether all numbers will eventually become 1 or not.

public class Task1 {
    public static void main(String[] args) {
        long x;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = keyboard.nextLong();

        while (x != 1){

            if (x % 2 == 0)
                x /= 2;
            else
                x = 3 * x + 1;

            if (x == 1)
                System.out.print(x);
            else
                System.out.print(x + ", ");

        }
    }
}
