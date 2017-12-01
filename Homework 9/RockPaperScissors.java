/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Your name
   Date Due:   MM/DD/2017
 ******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String tryAgain;
        String userChoice;
        String computerChoice;
        
        printInstructions();
        
        // Keep playing the game as many times as the user wants
        do
        {
            userChoice = getUsersChoice();
            computerChoice = getComputersChoice();
            
            System.out.printf("%s vs. %s\n", userChoice, computerChoice);
            System.out.printf("Outcome: %s\n\n", getOutcome(userChoice, computerChoice));            
            
            System.out.print("Do you want to play again? (Yes/No): ");
            tryAgain = keyboard.next();
        } while (tryAgain.equals("Yes"));
    }
    
    
    // Prints the instructions for the program
    static void printInstructions()
    {
        System.out.println("------------ Rock, Paper, Scissors----------");
        System.out.println(  "Rock beats Scissors, Paper beats Rock, Scissors beat Paper");
        System.out.println("------------------------------------------------------------------");
    }
    
    // Forces the user to pick either Rock, Paper, or Scissors
    static String getUsersChoice()
    {
        Scanner keyboard = new Scanner(System.in);
       System.out.println("what is your choice? Rock,Paper,or Scissors");
       
        return  keyboard.next();
      if (keyboard.next() != "Rock" || "Paper" || "Scissors")
    {
        System.out.println("Sorry, You can only pick Rock, Paper or Scissors");
    }
    }
    
    // Picks either Rock, Paper, or Scissors for the computer
    static String getComputersChoice()
    {
        
        Random rand = new Random();
        int num;
        num = rand.nextInt(3);
        if (num == 1)
        {
             return "Rock";
        }
       else if (num == 2)
        {
             return "Paper";
        }
       else 
        {
             return "Scissors";
        }
       
    } 
    
    // Figures out if the user won, lost, or tied a round of rock/paper/scissors
    static String getOutcome(String user, String computer)
    {
        if(user.equals(computer))
       {
           return "draw";
       }
       else if (user.equals("rock")&& computer.equals("scissors"))

       {
           return "You win";
       }
         else if (user.equals("paper")&& computer.equals("rock"))

       {
           return "You win";
       }
         else if (user.equals("scissors")&& computer.equals("paper"))

       {
           return "You win";
       }
         else if (user.equals("rock")&& computer.equals("scissors"))

       {
           return "You win";
       }
       else
       {
           return "you lose";
       }

    }
}