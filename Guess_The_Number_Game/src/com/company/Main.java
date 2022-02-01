package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int maxValue = 20;
        int ans;
        int guesses = 0;
        String play = "";
        Random rand = new Random();
        ans = rand.nextInt(maxValue) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Hello " + name + " welcome to the guess a number game!");

        try {
            while (true) {
                for (int i = 1; i <= 6; i++) {
                    System.out.println("Please guess a number between 1 - 20");
                    int guess = sc.nextInt();
                    guesses++;
                    if (guess == ans) {
                        System.out.println("You got it right!");
                        System.out.println("it took you " + guesses + " tries to complete");
                        break;
                    } else if (guess < ans) {
                        System.out.println("Guess too low!");
                    } else {
                        System.out.println("Guess too high!");
                    }
                }
                System.out.println("Game Over");
                guesses = 0;
                System.out.println("Do you want to play again? yes or no?");
                play = sc.next();
                if (!play.equals("yes")) {
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("Please try again and enter number from 1 - 20");
        }
    }
}
