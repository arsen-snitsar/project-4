import java.util.Scanner;

/*
    Create dialog, where you ask user to input any string.

    Print that string uppercased (String.toUpperCase()).

    Ask if user wants to continue (Y/N). If user types y or Y repeat everything.
    If user types any other character exit the loop.
 */

public class Part2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userInput = "y";
        while (userInput.equals("y") || userInput.equals("Y")){

            System.out.print("Hi! Please, enter any string: ");
            userInput = keyboard.nextLine();
            System.out.println(userInput.toUpperCase());

            System.out.println("Do you want to continue? (Y/N)");
            userInput = keyboard.nextLine();

        }

        /*
        Scanner keyboard = new Scanner(System.in);
        String userInput = "y";
        char continueOrNot = 'y';
        while (continueOrNot == 'y' || continueOrNot == 'Y'){

            System.out.print("Hi! Please, enter any string: ");
            userInput = keyboard.nextLine();
            System.out.println(userInput.toUpperCase());

            System.out.println("Do you want to continue? (Y/N)");
            continueOrNot = keyboard.nextLine();

        }
        */
    }
}
