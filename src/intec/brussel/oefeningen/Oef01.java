package intec.brussel.oefeningen;

import java.util.Scanner;

public class Oef01 {
    public static void main(String[] args) {

//        Oefening 1 Schrijf een Java-programma om het spel FizzBuzz te spelen. Het spel bestaat uit het tellen van 1 tot 100 en het uitprinten van elk getal,
//        waarbij getallen die deelbaar zijn door 3 worden vervangen door het woord "Fizz"en getallen die deelbaar zijn door 5 door het woord "Buzz".
//        Als een getal deelbaar is door zowel 3 als 5, moethet worden vervangen door "FizzBuzz".
//        Het programma moet doorgaan totdat het 100 bereikt.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welkom bij het spel Fizzbuzz, lets play!");
//        String name = scanner.nextLine();


        for (int number01 = 1; number01 <= 100; number01++) {

            if ((number01 % 3 == 0) && (number01 % 5 == 0)) {
                System.out.println("FizzBuzz");

            } else if (number01 % 5 == 0) {
                System.out.println("Buzz");

            } else if (number01 % 3 == 0) {
                System.out.println("Fizz");

            } else {
                System.out.println(number01);
            }

        }


    }

}



