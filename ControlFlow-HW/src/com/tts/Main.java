package com.tts;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
        String nameString = scanner.next();
        System.out.println("Hello " + nameString);

        System.out.println("Do you wish to continue? Y or N");
        Scanner cont = new Scanner(System.in);
        String response = cont.next();


        boolean approved = response.contains("Y") || response.contains("y");

        if (approved){
            System.out.println("Do you have a red car? ");
            String carCont = cont.next();
        }
        else if (false){
            cont.close();
        }

        System.out.println("What's the name of your favorite pet?");
        Scanner pet = new Scanner(System.in);
        String petName = cont.next();

        System.out.println("What's the age of your favorite pet?");
        Scanner agePet = new Scanner(System.in);
        int petAge = cont.nextInt();

        System.out.println("What's your lucky number?");
        Scanner numLucky = new Scanner(System.in);
        int luckyNum = cont.nextInt();

        System.out.println("Do you have a favorite quarterback?");
        Scanner qbCont = new Scanner(System.in);
        String qbResponse = cont.next();

        boolean qbApproved = response.contains("Y") || response.contains("y");

        if (approved){
            System.out.println("What's their jersey number? ");
            String jerseyCont = cont.next();
        }

        System.out.println("What's the two digit model of your car");
        Scanner model = new Scanner(System.in);
        String carModel = cont.next();

        System.out.println("What's the first name of your favorite actor or actress?");
        Scanner actress = new Scanner(System.in);
        String favActress = cont.next();

        System.out.println("Enter a random number between 1 and 50");
        Scanner random = new Scanner(System.in);
        int num =  Integer.parseInt(random.next());




    }
}
