import java.util.Scanner;//Scanner is in the java.util.package

public class ComputeChange {
	public static void main(String[] args) {
		//Create a Scnaner
		Scanner input = new Scanner(System.in);
		
		//Receive the amount
		System.out.println(
			"Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
	
		//Find the number of dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//Find the dollars of the remaining amount
		int numberOfQuarters = remainingAmount  / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the dimes of the remaining amount
		int numberOfDimes = remainingAmount  / 10;
		remainingAmount = remainingAmount % 10;
	
		//Find the nickles of the remaining amount
		int numberOfNickels = remainingAmount  / 5;
		remainingAmount = remainingAmount % 5;
		
		//Find the pennies of the remaining amount
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + "consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quartes");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickles");
		System.out.println(" " + numberOfPennies + " pennies");
	}
}

