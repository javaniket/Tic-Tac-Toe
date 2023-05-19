import java.util.Scanner;
//0 - -1
//X- 1
//empty- 0
public class TicTacToe1 {

	static int[][] board = new int [3][3];
	static Scanner sc = new Scanner(System.in);
	static Integer player = 1;
	static Integer winner=0;
	public static void main(String[] args) {
		while(winner == 0) {
			System.out.println("Player"+ player+", give your next move");
		System.out.println("input the next move row");
		int row = sc.nextInt();
		System.out.println("input the next move col");
		int col = sc.nextInt();
		if(board[row][col]==0 )
		board[row][col]= player;
		else {
			System.out.println("The place is already marked, choose another position");
		continue;
		}
		printBoard(board);
		int rowScore=0,colScore=0,diagScore=0,crossDiagScore=0;
		//check the winner
		for(int i=0; i<board[0].length;i++) {
			if(board[row][i]==player)
				rowScore++;
		}
		for(int i=0; i<board.length;i++) {
			if(board[i][col]== player)
				colScore++;
		}
		for(int i=0,j=0; i<board.length && j<board[0].length ; i++,j++) {
			
			if(board[i][j]== player)
				diagScore++;
		}
		for(int i=0,j=board[0].length-1;i<board.length && j>=0; i++,j--) {
			
			if(board[i][j]== player)
				crossDiagScore++;
		}
		if(rowScore==3 || colScore==3 || diagScore==3 || crossDiagScore==3) {
			winner=player;
		System.out.println("The Game has Ended. The winner is :" + player);
		}
		else {
			if(player == 1)
				player = -1;
			else
				player = 1;
		}
		
		//board[row][col]=player == 1?-1:1;
		
		}
	}
	//for output
	private static void printBoard(int[][]board) {
		for(int i=0; i<board.length;  i++) {
			for(int j=0; j<board[0].length;j++) 
			{
		 			System.out.print(board[i][j]+" ");
			}
			System.out.println(" ");
	}
		
	}

}
