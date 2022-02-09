/*
 * The high-low game is a game, where the user rolls dice and then tries to
 *guess whether the computer will roll a higher or ower sum of dice than the user.
 *P. Cochran and N. Guidry
 *1/27/22
 */

import java.util.*;

public class HighLowGame {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to the High-Low Game. In this game you will\n"
                + "guess whether or not your dice roll will be either higher or \n"
                + "lower than the computer's dice roll. Your answer will be verified\n"
                + "and you will win if guessed correctly.");
        
       
        System.out.println("\nTo begin game input any key.");
        
        String beginGame = keyboard.next();
        
        Random randGen = new Random();
        int user_die1 = randGen.nextInt(6)+1;
        int user_die2 = randGen.nextInt(6)+1;
        int user_die3 = randGen.nextInt(6)+1;
        int user_die4 = randGen.nextInt(6)+1;
        int user_die5 = randGen.nextInt(6)+1;
       
        int userDiceSum = user_die1 + user_die2 + user_die3 + user_die4 + user_die5;
        
        System.out.println("\nYou rolled the following values:\n"
                + "die 1 --> " + user_die1 + "\n" + "die 2 --> " + user_die2 + "\n"
                + "die 3 --> " + user_die3 + "\n" + "die 4 --> " + user_die4 + "\n"
                + "die 5 --> " + user_die5 + "\n");
        
        System.out.println("Total: " + userDiceSum + "\n");
 
        
        System.out.println("Please enter an 'h' if you think your roll will be higher\n"
                + "or an 'l' if you think your roll will be lower.");
        System.out.print("--> ");
        
        char continueGame = keyboard.next().charAt(0);
        
        while ((continueGame != 'l') && (continueGame != 'h'))
        {
            System.out.println("Please enter an 'l' or an 'h'");
            continueGame = keyboard.next().charAt(0);
        }
        
        int comp_die1 = randGen.nextInt(6)+1;
        int comp_die2 = randGen.nextInt(6)+1;
        int comp_die3 = randGen.nextInt(6)+1;
        int comp_die4 = randGen.nextInt(6)+1;
        int comp_die5 = randGen.nextInt(6)+1;
        
        int compDiceSum = comp_die1 + comp_die2 + comp_die3 + comp_die4 + comp_die5;
        
        System.out.println("You rolled the following values:\n"
                + "die 1 --> " + comp_die1 + "\n" + "die 2 --> " + comp_die2 + "\n"
                + "die 3 --> " + comp_die3 + "\n" + "die 4 --> " + comp_die4 + "\n"
                + "die 5 --> " + comp_die5 + "\n");
        
        System.out.println("Total: " + compDiceSum + "\n");
        
        if (compDiceSum > userDiceSum)
        {
            if (continueGame == 'l')
            {
                System.out.println("You Win.");
            }
            else
                System.out.println("You Lose.");
        }
        else if(continueGame == 'l')
        {
            System.out.println("You Lose.");
        }
        else
            System.out.println("You Win.");
        
        System.out.println("\nThe game has ended.");
    
    
    
    
    }
}
