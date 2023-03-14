package intec.brussel.oefeningen;

import java.util.Random;
import java.util.Scanner;

public class Oef02 {
    public static void main(String[] args) {

//Oefening 2Schrijf een Java-programma om het spel rock paper scissors te spelen.
// Oefening 2 +Zorg ervoor dat na het spel, word gevraagd of je het nogmaals wil spelen of als je "quit" invoert te stoppen.
// Oefening 2 ++Als toevoeging op het spel kun je een teller toevoegen om de wins, losses and draws bij te houden.

        Scanner scanner = new Scanner(System.in);
        Random rg = new Random();

        int rock = 0;
        int paper = 1;
        int scissor = 2;

        int player = 0;
        int comp = 0;
        int user = 0;

        do {
            int randomgetal = rg.nextInt(3);

            System.out.println("Hello lets play a game, choose between these numbers: 1, 2 or 3 \n If you want to quit press 5");
            user = scanner.nextInt();

            if (randomgetal == user) {
                System.out.println("Draw, want to play again?");
            } else if (randomgetal == rock && user == paper) {                       //rock verliest van papier
                System.out.println("You win! Want to play again?");
                player++;
            }
            else if (randomgetal == rock && user == scissor) {                       //rock wint van scissor
                System.out.println("You lose! Want to play again?");
                comp++;
            }else if (randomgetal == paper && user ==rock) {
                System.out.println("You lose! Want to play again?");
                comp++;
            }
            else if (randomgetal == paper && user ==scissor) {
                System.out.println("You win! Want to play again?");
                player++;
            }
            else if (randomgetal == scissor && user ==paper) {
                System.out.println("You lose! Want to play again?");
                comp++;
            }
            else if (randomgetal == scissor && user ==rock) {
                System.out.println("You win! Want to play again?");
                player++;

            }

        } while (user != 5);

        System.out.println("wins" + player + "loses" + comp );

        System.out.println("Later!");




//        System.out.println("Enter a choice: rock, paper, scissors");
//        String player = scanner.nextLine();
//
//        String computer = "";
//        int comprandchoice = rg.nextInt(3);
//        if (comprandchoice == 0) {
//            computer = "rock";
//        } else if (comprandchoice == 1) {
//            computer = "paper";
//        } else {
//            computer = "scissors";
//        }
//
//        if (player.equals("rock") && computer.equals("paper")) {
//            System.out.println("Comp wins");
//        }

    }


}


