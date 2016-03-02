import java.util.Random;
import java.util.Scanner;
public class secretNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secretNumber, guess = 0;//guess is initialized to 0
		Random rnd =new Random();
		secretNumber = 1+rnd.nextInt(10);
		
		System.out.println("I'm thinking of a number between 1 and 10");
		System.out.print("Enter the number:");
		guess = keyboard.nextInt();
		
		while ( guess != secretNumber && guess!=5)
		{
			
			if(guess > secretNumber)
				System.out.println("enter a lower number!!");
			if(guess<secretNumber)
				System.out.println("enter a higher number");
			
			System.out.println("\nYou are wrong. Try again.");
			System.out.println("Enter the number: ");
			guess = keyboard.nextInt();
				
			
		}
		
		System.out.println("You are correct. You win a prize!");
		keyboard.close();

}
}
