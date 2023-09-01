package Part1;

/*
    =================================================================================================================
    Demonstrate loop inside the loop (nested loop). For example, create for loop inside the outer for loop, make some
    output inside these loops. Understand the essence of such algorithm.
    =================================================================================================================
 */

// This is a Collatz conjecture for the first 100 positive integers.

public class Task5 {
    public static void main(String[] args) {

        for (int i = 1, x; i < 101; i++) {
            x = i;
            System.out.print("x = " + x + ": ");
            while (x != 1){
                System.out.print(x + ", ");

                if (x % 2 == 0)
                    x /= 2;
                else
                    x = 3 * x + 1;
            }
            System.out.println(x);
        }
    }
}
