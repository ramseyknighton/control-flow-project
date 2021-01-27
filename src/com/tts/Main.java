package com.tts;
import java.util.Scanner;
import java.util.Random;


public class Main {

        public static void printNumbers() {
            int num1;
            for (num1 = 48; num1 <= 57; num1++) {
                char ascii1 = (char) num1;
                System.out.println("The ASCII value of Number " + num1 + " is: " + ascii1);
            }
        }

        public static void printLowerCase() {
            int num2;
            for (num2 = 97; num2 <= 122; num2++) {
                char ascii2 = (char) num2;
                System.out.println("The ASCII value of Lowercase Letter " + num2 + " is: " + ascii2);
            }
        }


        public static void printUpperCase() {
            int num3;
            for (num3 = 65; num3 <= 90; num3++) {
                char ascii3 = (char) num3;
                System.out.println("The ASCII value of Uppercase Letter " + num3 + " is: " + ascii3);
            }
        }

    public static void main(String[] args) {
            printNumbers();
            printLowerCase();
            printUpperCase();

        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name?");
        String nameString = scanner.nextLine();
        System.out.println("Hello " + nameString);

        System.out.print("What was the name of your favorite pet?");
        String petString = scanner.nextLine();
        System.out.println(petString + "? Really? That's an interesting choice...");

        System.out.print("How old is/was your favorite pet?");
        Integer petAge = scanner.nextInt();
        System.out.println(petAge + ", ok.");

        System.out.print("What's your lucky number? ");
        Integer luckNum = scanner.nextInt();
        System.out.println(luckNum + ", how original...");

        int quarterbackNum = 0;

        System.out.println("Do you have a favorite quarterback?");
        String quarterString = scanner.next();
        if (quarterString.equals("yes")) {
            System.out.println("Really? Umm...ok. What's their jersey number?");
            quarterbackNum = scanner.nextInt();
        } else {
            System.out.println("yeah, me neither");
        }

        System.out.print("What's the two digit model year of your car?");
        Integer carNum = scanner.nextInt();
        System.out.println(carNum + "? Really? Wait, what do you do for a living? You know what, nevermind, it's not important.");

        scanner.nextLine();
        System.out.print("What's the first name of your favorite actor or actress?");
        String actString = scanner.nextLine();
        System.out.println(actString + "? Ew.");

        System.out.print("Ok, ummm, I guess pick a random number between 1 and 50");
        Integer ranNum = scanner.nextInt();
        System.out.println(ranNum + "? Ok, that's fine.");

        Random rand = new Random();
        Integer randoNum1 = rand.nextInt(10);
        Integer randoNum2 = rand.nextInt(20);
        Integer randoNum3 = rand.nextInt(30);

        Integer magicBall1 = (luckNum *= randoNum1);
        Integer magicBall2 = 0;
        if (magicBall1 > 75) {
             magicBall2 = magicBall1 - 75;
        } else {
             magicBall2 = magicBall1;
        }

        char character = petString.charAt(2);
        int ascii = (int) character;
        int lottoNum1 = ascii - 57;

        char character2 = actString.charAt(0);
        int ascii2 = (int) character2;
        int lottoNum2 = ascii2 - 25;

        int lottoNum3 = ranNum / 2;

        char character3 = actString.charAt(actString.length() - 1);
        int ascii3 = (int) character3;
        int lottoNum4 = ascii3 - 25;

        int lottoNum5 = petAge * 2;

        System.out.println("Your Lottery Numbers Are: " + lottoNum1 + ", " + lottoNum2 + ", " + lottoNum3 + ", " + lottoNum4 + ", " + lottoNum5 + " Magic Ball: " + magicBall2);

        System.out.println("Do you want to go again?");
        String endString = scanner.next();
        if (endString.equals("yes")) {
            System.out.println("Really? Well too bad. I'm so tired from working on this Java project. I'm going to bed.");
        } else {
            System.out.println("Ok! Have a good night!");
        }


    }
}
