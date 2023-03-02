
import java.util.*;

public class Queen {

	public boolean isSafe(int row, int col, char board) {
		// horizantel 
		for (int j = 0; j < board.length; j++) {
			if (board[row][l] == 'Q') {
				return false;
			}
		}

		//vertical 
		for (int i = 0; i<board[0].length; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}

		// upper left 
		int r = row;
		for (int c=col; c>=0 && r>=0; c--,r--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}

		// upper right 
		 r = row;
		for (int c=col; col>=0 && r>board.length; c++,r--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}


		// lower left 
		int r = row;
		for (int c=col; c>=0 && r>=0; c--,r++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// lower right 
		for (int c=col; col>=0 && r>board.length; c++,r++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
	}


	public void helper(char board, List<List<String>> allBoard, int col) {

		if (col == board.length) {
			saveBoard(board, allBoards);
			return;
		}

		for (int row=0; row<board.length; row++) {
			if (isSafe(row,col,board)) {
				board[row][col] = 'Q';
				helper(board, allBoards,col+1);
				board[row][col] = '.';			}
		}
	}


	public List<List<String>> solveNQueens(int n) {
		List<List<String>> allBoard = new ArrayList<>();

		char board = new board[n][n];
		helper(board, allBoards, 0);
		
	}

	//RUN 
	public static void main(String[] args) {
		
	}
}