import java.util.*;
public class gameConfig {

	 static String [] board;
	public static String turn;

	//check winner method, decides combination of three boxes

	public static String checkWinner(){
		for(int i = 0; i<8; i++){
			String line = null;

			switch (i){
				case 0:
					line = board[0]+board[1]+board[2];
					break;
				case 1:
					line = board[3]+board[4]+board[5];
					break;
				case 2:
					line = board[6]+board[7]+board[8];
					break;
				case 3:
					line = board[0]+board[3]+board[6];
					break;
				case 4:
					line = board[1]+board[4]+board[7];
					break;
				case 5:
					line = board[2]+board[5]+board[8];
					break;
				case 6:
					line = board[0]+board[4]+board[8];
					break;
				case 7:
					line = board[2]+board[4]+board[6];
					break;
			}
			if(line.equals("xxx")){
				return "x";

			}
			if(line.equals("ooo")){
				return "0";
			}
		}
		for(int i = 0; i < 9; i++){
			if(Arrays.asList(board).contains(String.valueOf(i + 1))){
				break;
			}
			else if(i == 8){
				return "draw";
			}
		}
		// to enter x or o at the exact place
		System.out.println(turn+ "s turn enter a slot num to place"+turn+ "in");
		return null;
	}

	static void printBoard(){
		System.out.println("|---|---|---|");
		System.out.println("|"+board[0]+"|"+board[1]+"|"+board[2]+"|");
		System.out.println("|"+board[3]+"|"+board[4]+"|"+board[5]+"|");
		System.out.println("|"+board[6]+"|"+board[7]+"|"+board[8]+"|");
		System.out.println("|---|---|---|");

	}
}
