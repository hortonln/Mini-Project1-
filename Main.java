/*
Mini Project 1
Group #6: Angela Lopez, Jiun Kim, Lauren Horton
Date: Sept 29, 2020
*/


import java.util.Scanner;
import java.util.Random;


class Main {
  public static void main(String[] args) {
   
      System.out.println("Welcome to the guessing game! Please enter any positive whole number: ");

      Scanner s = new Scanner(System.in);
      int userNum = s.nextInt();

      Random r = new Random();
      int randomNum = r.nextInt(userNum);

      System.out.println("A random number to guess has been generated");

      playGame(randomNum, userNum);
  }
  

  //the playGame is used to track the amount of guesses
  static void playGame (int theRandomNum, int theUserNum) {

    System.out.println("Please guess a number between 0 and " + theUserNum);

    Scanner s2 = new Scanner(System.in);
    int userGuessNum;
    int tryCounter = 0;

      //track count variable here
    
      while ((userGuessNum = s2.nextInt()) != theRandomNum){
        tryCounter++;        
        // if the guess is too high
        if (userGuessNum > theRandomNum){
          System.out.println("Nope. Guess lower! Enter new guess here: "); 
          }

        //if the guess is too low
        else if (userGuessNum < theRandomNum) {
          System.out.println("Nope. Guess higher! Enter new guess here: ");
          } 
      }

      System.out.println("Great, you win! It took you " + tryCounter + " tries.");
        
  }
}