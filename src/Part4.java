
/*
    Take your implementation from Project 3. Part 3 "Improved conversation" and put it into loop:

    Ask user if he wants to continue (Y/N). If user type Y or y repeat whole conversation.
 */

import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String shouldContinue = "Y";
        // name
        System.out.println("Hi! This is a book recommendation program. What is your name?");
        String name = keyboard.nextLine();
        int whichIteration = 0;
        do {
            // age
            if (whichIteration == 0)
                System.out.println("Nice to meet you, " + name + ".\nCould you please tell me your age?");
            else{
                System.out.println("Nice to meet you again, " + name + ".\nCould you remind me your age, please?");
            }
            byte age = keyboard.nextByte();
            keyboard.nextLine();

            // book genre
            System.out.println("Great! And book of which genre would you like to read?" +
                    "\n(unfortunately, adventure/science fiction are the only ones available right now)");
            String genre = keyboard.nextLine();

            // money
            System.out.println("And how much money do you wish to spend on a book?");
            long money = keyboard.nextLong();
            keyboard.nextLine();

            // choosing a book based on inputs
            System.out.println("Well done. The program will soon find a best-fitting book for you.");
            switch (genre){
                case "adventure":
                    if (age > 12){
                        if (money >= 220){
                            System.out.println("The most suitable book for you is \"Treasure Island\".\n" +
                                    "You can buy the book here - " +
                                    "https://nashformat.ua/products/ostriv-skarbiv-urbino-914515\n" +
                                    "If you are unsatisfied with the result or want to look for a few more books, "  +
                                    "feel free to continue! (Y/N)");
                            shouldContinue = keyboard.nextLine();
                        }
                        else {
                            System.out.println("Sorry, no books for you!\nHowever, you can try changing one of your " +
                                    "input parameters and maybe you will find something else! Continue? (Y/N)");
                            shouldContinue = keyboard.nextLine();
                        }
                    }
                    else{
                        if (money >= 249){
                            System.out.println("The most suitable book for you is \"Dog Patron and Socks' Monster\".\n" +
                                    "You can buy the book here - " +
                                    "https://book-ye.com.ua/catalog/komiksy-dlya-ditej-i-pidlitkiv/pes-patron-ta-shkarpetkovyj-monstr-knyha-1/\n" +
                                    "If you are unsatisfied with the result or want to look for a few more books, " +
                                    "feel free to continue! (Y/N)");
                            shouldContinue = keyboard.nextLine();
                        }
                        else {
                            System.out.println("The most suitable book for you is \"Alice's Adventures in the Wonderland\".\n" +
                                    "You can buy the book here - " +
                                    "https://book-ye.com.ua/catalog/dytyacha-proza/alisa-v-krayini-dyv-shkilna-seriya/\n" +
                                    "If you are unsatisfied with the result or want to look for a few more books, " +
                                    "feel free to continue! (Y/N)");
                            shouldContinue = keyboard.nextLine();
                        }
                    }
                    whichIteration++;
                    break;
                case "science fiction":
                    if (age > 13){
                        if (money >= 440){
                            System.out.println("The most suitable book for you is \"Dune\".\n" +
                                    "You can buy the book here - " +
                                    "https://bookclub.ua/catalog/books/fantastic_books/dyuna\n" +
                                    "If you are unsatisfied with the result or want to look for a few more books, " +
                                            "feel free to continue! (Y/N)");
                            shouldContinue = keyboard.nextLine();
                        }
                        else {
                            System.out.println("The most suitable book for you is \"Foundation\".\n" +
                                    "You can buy the book here - " +
                                    "https://bookclub.ua/catalog/books/fantastic_books/fundaciya-kniga-1\n" +
                                    "If you are unsatisfied with the result or want to look for a few more books, " +
                                    "feel free to continue! (Y/N)");
                            shouldContinue = keyboard.nextLine();
                        }
                    }
                    else {
                        if (money >= 199){
                            System.out.println("The most suitable book for you is \"20,000 Leauges Under Water\".\n" +
                                    "You can buy the book here - " +
                                    "https://book-ye.com.ua/catalog/pryhodnytska-literatura/20000-lye-pid-vodoyu-svitovyd/\n" +
                                    "If you are unsatisfied with the result or want to look for a few more books, " +
                                    "feel free to continue! (Y/N)");
                            shouldContinue = keyboard.nextLine();
                        }
                        else{
                            System.out.println("Sorry, no books for you!\nHowever, you can try changing one of your " +
                                    "input parameters and maybe you will find something else! Continue? (Y/N)");
                            shouldContinue = keyboard.nextLine();
                        }
                    }
                    whichIteration++;
                    break;
                default:
                    System.out.println("Sorry, no books of such genre are available in our shop. However, you can try " +
                            "searching for a book of different genre. Continue? (Y/N)");
                    shouldContinue = keyboard.nextLine();
                    whichIteration++;
            }
        }while (shouldContinue.equals("Y") || shouldContinue.equals("y"));
    }
}
