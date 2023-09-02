
/*
    Take your implementation from Project 3. Part 3 "Improved conversation" and put it into loop:

A   sk user if he wants to continue (Y/N). If user type Y or y repeat whole conversation.
 */

import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {

        // name
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hi! This is a book recommendation program. What is your name?");
        String name = keyboard.nextLine();

        // age
        System.out.println("Nice to meet you, " + name + ".\nCould you please tell me your age?");
        byte age = keyboard.nextByte();
        keyboard.nextLine();

        // book genre
        System.out.println("Great! And book of which genre would you like to read?" +
                "\n(unfortunately, adventure/science fiction are the only ones available right now)");
        String genre = keyboard.nextLine();

        // money
        System.out.println("And how much money do you wish to spend on a book?");
        long money = keyboard.nextLong();

        // choosing a book based on inputs
        System.out.println("Great. The program will soon find a best-fitting book for you.");
        switch (genre){
            case "adventure":
                if (age > 12){
                    if (money >= 220){
                        System.out.print("The most suitable book for you is \"Treasure Island\".\n" +
                                "You can buy the book here - " +
                                "https://nashformat.ua/products/ostriv-skarbiv-urbino-914515");
                    }
                    else {
                        System.out.print("Sorry, no books for you!");
                    }
                }
                else{
                    if (money >= 249){
                        System.out.print("The most suitable book for you is \"Dog Patron and Socks' Monster\".\n" +
                                "You can buy the book here - " +
                                "https://book-ye.com.ua/catalog/komiksy-dlya-ditej-i-pidlitkiv/pes-patron-ta-shkarpetkovyj-monstr-knyha-1/");
                    }
                    else {
                        System.out.print("The most suitable book for you is \"Alice's Adventures in the Wonderland\".\n" +
                                "You can buy the book here - " +
                                "https://book-ye.com.ua/catalog/dytyacha-proza/alisa-v-krayini-dyv-shkilna-seriya/");
                    }
                }
                break;
            case "science fiction":
                if (age > 13){
                    if (money >= 440){
                        System.out.print("The most suitable book for you is \"Dune\".\n" +
                                "You can buy the book here - " +
                                "https://bookclub.ua/catalog/books/fantastic_books/dyuna");
                    }
                    else {
                        System.out.print("The most suitable book for you is \"Foundation\".\n" +
                                "You can buy the book here - " +
                                "https://bookclub.ua/catalog/books/fantastic_books/fundaciya-kniga-1");
                    }
                }
                else {
                    if (money >= 199){
                        System.out.print("The most suitable book for you is \"20,000 Leauges Under Water\"." +
                                "You can buy the book here - " +
                                "https://book-ye.com.ua/catalog/pryhodnytska-literatura/20000-lye-pid-vodoyu-svitovyd/");
                    }
                    else{
                        System.out.print("Sorry, no books for you!");
                    }
                }
                break;
            default:
                System.out.print("Sorry, no books of such genre are available in our shop. Subscribe to our" +
                        "newsletter to be the first to know about any new shipments!");
        }

    }
}
