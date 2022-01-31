package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("You are in a land full of dragons.  In front of you are two caves.  " +
                "One is friendly and will share treasure.  The other is greedy and hungry and will eat you on sight.  " +
                "Which cave will you go into.  1 or 2? ");

        int x = sc.nextInt();

        if (x == 1){
            System.out.println("you approach the cave, it is dark and quiet.  A BIG DRAGON JUMPS OUT AND EATS YOU");
        } else if(x == 2) {
            System.out.println("it is dark and quiet.  YOUR LUCKY DAY! HERE GOES YOUR TREASURE");
        } else {
            System.out.println("try again");
        }

    }
}
