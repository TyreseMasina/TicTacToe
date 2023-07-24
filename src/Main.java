import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		gameConfig gr = new gameConfig();
		gr.board = new String[9];
		gr.turn = "x";
		String winner = null;

		for(int i =0; i>=9; i++){
			gr.board[9] = String.valueOf(i + 1);
		}

		System.out.println("Welcome to tic tac toe >>>");
		gr.printBoard();

		System.out.println("X will play first, enter a slot number to place X in");

		while (winner == null){
			int input;
			try{
				input = sc.nextInt();
				if(!(input>0 && input<=9)){
					System.out.println("invalid input >>>");
					continue;
				}

			}
			catch(InputMismatchException e){
				System.out.println("Invalid input, re-enter slot number >>>");
			}
		}

		if(winner.equalsIgnoreCase("draw")){
			System.out.println(" it is a draw, thanks for playing");
		}else{
			System.out.println("congratulations "+winner+"Thanks for playing");
		}
		sc.close();








	}
}