package com.numguess;

import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int min = 1;
		int max = 100;
		int maxAttempts = 5;
		int totalAttempts = 0;
		boolean ContinueGame = true;
		
		
		while(ContinueGame) 
		{
			int noofGuess = 0;
			int randNo = rand.nextInt(max - min + 1) + min;
			System.out.println("***_Welcome to Number Guessing Game_***");
			System.out.println("The number is in between " + min + " and "+ max +".");
			System.out.println("You have "+ maxAttempts+" Attempts to guess it.");
			while(noofGuess < maxAttempts)
			{
				System.out.print("Guess "+ (noofGuess +1) + ": ");
				int userguess = sc.nextInt();
				noofGuess++;
				totalAttempts++;
				
				if(userguess == randNo)
				{
					System.out.println("Congratulations...You guess the correct number: "+randNo);
					System.out.println("Number of guess is: "+userguess);
					break;
				}
			
				else if(userguess < randNo) 
			    {
		    		System.out.println("Sorry...Your Guess is Too Low, try again");
			    }
			    else
			    {
				System.out.println("Sorry...Your Guess is Too High, try again");
			    }
			    
		   }
		
		if(noofGuess == maxAttempts) 
		{
			System.out.println("Sorry...You have used all your attemptes. The correcet number was: "+randNo);
		}
			System.out.print("Do you want to play again? (yes/no): ");
			String ContinueGameResponse = sc.next().toLowerCase();
			ContinueGame = ContinueGameResponse.equals("yes");

		}
		System.out.print("Thanks for playing!");
		System.out.print("Total Attempts: "+totalAttempts);
		sc.close();
		
	}
}
