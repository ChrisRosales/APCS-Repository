package com.mycompany.craps;

import java.util.Random;
import java.util.Scanner;

public class craps {
  static Random r = new Random();

  public static void main(String[] args) {
    // Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Start with a 100 coins, you can bet any number of coins you would like while I roll the dice");
    // Declaring Variables
    int coins = 100;
    int wCoins;
    int wins;
    int loss;
    int rollV;
    int rollc = 1;
    int dice1;
    int dice2;
    int game = 1;
    int starter;
    int firstRoll = 0;
    boolean playing = true;
    int winRound = 0;
    // While loop
    while (playing == true) {
      while (coins > 0) {
        System.out.println("You have " + coins + " left");
        System.out.println("If youd like to bet more coins how many?");
        wCoins = input.nextInt();
        if (wCoins > coins) {
          System.out.println("Guess you didnt follow the rules lol");
          System.exit(0);

        }
        System.out.println(wCoins + " Coin Wager");
        winRound = 0;
        rollc = 1;
        System.out.println("please enter a 1 when you would like to role");
        while (winRound == 0) {
          starter = input.nextInt();
          if (starter != 1) {
            System.out.println("enter a number");
          }
          starter = 0;
          // Random generator for the dice
          dice1 = r.nextInt(6) + 1;
          dice2 = r.nextInt(6) + 1;
          rollV = dice1 + dice2;
          System.out.println("you rolled a " + rollV);
          if (rollc == 1 && (rollV == 7 || rollV == 11)) {
            System.out.println("You have won! Congratulations");
            coins += wCoins;
            winRound = 1;
            System.out.println("You have " + coins + " coins!");

          }
          if (rollc == 1 && (rollV == 2 || rollV == 3 || rollV == 12)) {
            System.out.println("you have lost!");
            coins -= wCoins;
            winRound = -1;
            System.out.println("You have " + rollc + " coins!");
          }
          if (rollc == 1 && rollV != 2 && rollV != 3 && rollV != 12 && rollV != 7 && rollV != 11) {
            firstRoll = rollV;
            System.out.println("Type 1 to roll the dice again");
          }
          if (rollc > 1 && firstRoll == rollV) {
            System.out.println("you have won " + rollc + " chips");
            System.out.println("You now have " + rollc + coins + " coins.");
            coins = coins + wCoins;
            winRound = 1;
          }
          // rollc++;

        }
        System.exit(0);
      }
    }
  }

}
