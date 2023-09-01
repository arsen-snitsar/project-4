package Part1;
import java.util.Scanner;

/*
    =============================================================================
    Iterate through String. Print each character of the String in every new line.
    =============================================================================
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = keyboard.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (i == word.length()-1)
                System.out.print(word.charAt(i));
            else
                System.out.println(word.charAt(i));
        }
    }
}
