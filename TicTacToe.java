import java.util.Scanner;
public class TicTacToe {
	static Scanner box = new Scanner(System.in);
	static int[][] board = new int[3][3];
	public static void main(String[] args){
		int X;
		int Y;
		while(true){
			System.out.println("PLAYER 1 ENTER YO ROW");
			X = box.nextInt();
			System.out.println("PLAYER 1 ENTER YO COLUMN");
			Y = box.nextInt();
			board[X][Y] = 7;
			for(int i = 0; i<3; i++){
				for(int j = 0; j<3; j++){
					if(board[j][i] == 7){
						System.out.print("X ");	
					}
					else if(board[j][i] == 3){
						System.out.print("O ");
					}
					else{
						System.out.print("  ");
					}	
				}
				System.out.println();//next line
			}
			System.out.println("PLAYER 2 ENTER YO ROW");
			X = box.nextInt();
			System.out.println("PLAYER 2 ENTER YO COLUMN");
			Y = box.nextInt();
			board[X][Y] = 3;
			for(int i = 0; i<3; i++){
				for(int j = 0; j<3; j++){
					if(board[j][i] == 7){
						System.out.print("X ");	
					}
					else if(board[j][i] == 3){
						System.out.print("O ");
					}
					else{
						System.out.print("  ");
					}	
				}
				System.out.println();//next line
			}
		}
	}
}
