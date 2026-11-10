import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		// decide who goes first
		int ranNum = (int)Math.random();
		
		System.out.print("Player A. Guess a number: ");
		
		int plyrANum = scnr.nextInt();
		System.out.println("");
		
		System.out.print("Player B. Guess a number: ");
		int plyrBNum = scnr.nextInt();
		System.out.println("");
		
		if(plyrANum - ranNum < plyrBNum - ranNum) {
			System.out.println("Player A begins.");
		}
		else if(plyrANum - ranNum > plyrBNum - ranNum) {
			System.out.println("Player B begins.");
		}
		else if(plyrANum - ranNum == plyrBNum - ranNum) {
			System.out.println("Tie. Restart.");
			scnr.close();
			return;
			
		}
		
		// game
		String[][] grid = new String[3][3];
		System.out.println("");
		
		
		System.out.println(" _____________");
		for(int i = 0; i < grid.length; i++) {
			
			
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print("|___|");
			}
			System.out.println("");
			
		}
		
		
		scnr.close();
	}
}
