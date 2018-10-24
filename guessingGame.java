//Michelle Holden
//10/24/2018

import java.util.Random;
import java.util.Scanner;

public class guessingGame{
		public static Random rand= new Random();
		public static int numGuessOne= rand.nextInt(10);
		public static int numGuessTwo= rand.nextInt(100);
		public static int numGuessThree= rand.nextInt(1000);
		public static int numberOfGuesses= 0; 
		public static int tries= 5;
		//Scanner input= new Scanner(System.in);
		public static int userGuess;
		public static boolean win= false;
	
	public static void main(String[] args){
		play();
	}	
	
	public static void play(){
		//This allows the user to choose a level diffculty 
		System.out.println("Please choose level of diffculty (Pick a number): \n1 = easy \n2 = medium \n3 = hard \n4 = quit");
		Scanner input= new Scanner(System.in);
		int userChoice= input.nextInt();
		System.out.println(userChoice);
		
		//each input will take the game to level diffculty
		if(userChoice== 1){
			easy();
		
		}else if(userChoice== 2){
			medium();
		}else if(userChoice== 3){
			hard();
		}else if(userChoice== 4){
			quit();
		}else{
			System.out.println("You did not choice the correct diffculty. Try again");
			play();
		}
	
	}
	
	public static void quit(){
		//This will quit the program
		System.exit(0);
	}
	
	public static void easy(){
		//if the win is false it will keep going. When it is true it will take the user back to the menu
		while(win== false){
			System.out.println("Please guess a number between 1-10");
			Scanner input= new Scanner(System.in);
			userGuess= input.nextInt();
			numberOfGuesses++;
			
			if(tries== numberOfGuesses){
				win= true;
				System.out.println("You guessed too many times. You lose");
				play();
			}else if(userGuess< numGuessOne){
				System.out.println("Your guess is to low.");
			}else if(userGuess> numGuessOne){
				System.out.println("Your guess is to high.");
			}else{
				System.out.println("You win");
				System.out.println("The number was " + numGuessOne);
				System.out.println("It took you this many " + numberOfGuesses + " guesses");
				play();
			}
		}		
	}
	
	public static void medium(){
		//if the win is false it will keep going. When it is true it will take the user back to the menu

		while(win== false){
			System.out.println("Please guess a number between 1-100");
			Scanner input= new Scanner(System.in);
			userGuess= input.nextInt();
			numberOfGuesses++;
			
			if(tries== numberOfGuesses){
				win= true;
				System.out.println("You guessed too many times. You lose");
				play();
			}else if(userGuess< numGuessTwo){
				System.out.println("Your guess is to low.");
			}else if(userGuess> numGuessTwo){
				System.out.println("Your guess is to high.");
			}else{
				System.out.println("You win");
				System.out.println("The number was " + numGuessTwo);
				System.out.println("It took you this many " + numberOfGuesses + " guesses");
				play();
			}
		}		
	}
	
	public static void hard(){
		//if the win is false it will keep going. When it is true it will take the user back to the menu		
		while(win== false){
			System.out.println("Please guess a number between 1-1000");
			Scanner input= new Scanner(System.in);
			userGuess= input.nextInt();
			numberOfGuesses++;
			
			if(tries== numberOfGuesses){
				win= true;
				System.out.println("You guessed too many times. You lose");
				play();
			}else if(userGuess< numGuessThree){
				System.out.println("Your guess is to low.");
			}else if(userGuess> numGuessThree){
				System.out.println("Your guess is to high.");
			}else{
				System.out.println("You win");
				System.out.println("The number was " + numGuessThree);
				System.out.println("It took you this many " + numberOfGuesses + " guesses");
				play();
			}
		}		
	}
}
	
		