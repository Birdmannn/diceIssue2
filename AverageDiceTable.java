package diceIssue2;

import textio.TextIO;
public class AverageDiceTable {
	static double average;
	
	public static void main(String[] args) {
		
		
		int number;
		boolean rollAgain;
		System.out.println("Enter the total you wish to roll");
		
		try {
			while (true) {
				number = TextIO.getlnInt();
				averageRoll(number);
				System.out.println("Total On Dice               Average Number Of Rolls");
				System.out.println("--------------             ------------------------");
				System.out.printf("     %d                             %.4f", number, average);
				System.out.print("\n\n\n");
				System.out.println("Do you wish to roll again?\nAnswer with with \"true\" or \"false\".");
				rollAgain = TextIO.getlnBoolean();
				if (!rollAgain) {
					break;
				}
				System.out.print("Enter a total: ");

			}
			System.out.print("Bye bye");
			System.exit(0);
			
			
			
		}
		catch (IllegalArgumentException e) {
			System.out.print("Invalid input.");
		}
	}
	
	
	static double averageRoll(int x) {
		
		int die1;
		int die2;
		double count = 0;
		double count1 = 0;
		int total;
		
		while (true) {
			if (x < 2 || x > 12) {
				throw new IllegalArgumentException("This is not a valid number.");
			}
			die1 = (int)(Math.random()*6)+1;
			die2 = (int)(Math.random()*6)+1;
			count++;
			total = die1 + die2;
			if (total == x) {
				count1++;
			}
			if (count == 10000) {
				break;
			}
		}
		average = count / count1;
		return average;
	}

}
