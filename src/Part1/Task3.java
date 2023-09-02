package Part1;

/*
    ==================================================================
    Demonstrate for loop.
    1) Print through loop, using increment (i++): 1 2 3 4 5 6 7 8 9 10
    2) Print through loop, using decrement (i--): 10 9 8 7 5 4 3 2 1
    ==================================================================
 */

public class Task3 {
    public static void main(String[] args) {

        // 1)
        for (int i = 1; i < 11; i++) {
            if (i == 10)
                System.out.printf("%2d\n", i);
            else
                System.out.printf("%2d, ", i);
        }

        // 2)
        for (int i = 10; i > 0; i--) {
            if (i == 1)
                System.out.printf("%2d", i);
            else
                System.out.printf("%2d, ", i);
        }
    }
}
