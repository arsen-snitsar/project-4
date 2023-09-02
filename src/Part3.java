import java.util.Scanner;

/*
    Create dialog, where you ask user to input any string.

    Print that string in reversed order using for loop and String.charAt().

    Ask if user want to continue (Y/N). If user type y or Y repeat everything.
    If user typed any other character exit the loop.
 */

public class Part3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userInput = "y";
        while (userInput.equals("y") || userInput.equals("Y")){

            System.out.print("Hi! Please, enter any string: ");
            userInput = keyboard.nextLine();

            for (int i = userInput.length()-1; i >= 0; i--)
                System.out.print(userInput.charAt(i));

            System.out.println("\nDo you want to continue? (Y/N)");
            userInput = keyboard.nextLine();

        }
    }
}
