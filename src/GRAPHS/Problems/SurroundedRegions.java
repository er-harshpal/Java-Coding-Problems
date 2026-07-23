package GRAPHS.Problems;

// Recursive DFS
class Solution {

	public void solve(char[][] board) {

		int rows = board.length;
		int cols = board[0].length;

		// Left and Right Borders
		for (int i = 0; i < rows; i++) {

			dfs(board, i, 0);
			dfs(board, i, cols - 1);

		}

		// Top and Bottom Borders
		for (int j = 0; j < cols; j++) {

			dfs(board, 0, j);
			dfs(board, rows - 1, j);

		}

		// Convert remaining O -> X
		// Restore T -> O

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (board[i][j] == 'O')
					board[i][j] = 'X';

				else if (board[i][j] == 'T')
					board[i][j] = 'O';

			}
		}
	}

	private void dfs(char[][] board, int r, int c) {

		if (r < 0 || c < 0 ||
				r >= board.length ||
				c >= board[0].length ||
				board[r][c] != 'O')
			return;

		board[r][c] = 'T';

		dfs(board, r - 1, c);
		dfs(board, r + 1, c);
		dfs(board, r, c - 1);
		dfs(board, r, c + 1);
	}
}





// Iterative DFS
import java.util.Stack;

class Solution {

	public void solve(char[][] board) {

		int rows = board.length;
		int cols = board[0].length;

		Stack<int[]> stack = new Stack<>();

		for (int i = 0; i < rows; i++) {

			if (board[i][0] == 'O')
				stack.push(new int[]{i, 0});

			if (board[i][cols - 1] == 'O')
				stack.push(new int[]{i, cols - 1});
		}

		for (int j = 0; j < cols; j++) {

			if (board[0][j] == 'O')
				stack.push(new int[]{0, j});

			if (board[rows - 1][j] == 'O')
				stack.push(new int[]{rows - 1, j});
		}

		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		while (!stack.isEmpty()) {

			int[] cur = stack.pop();

			int r = cur[0];
			int c = cur[1];

			if (r < 0 || c < 0 ||
					r >= rows || c >= cols ||
					board[r][c] != 'O')
				continue;

			board[r][c] = 'T';

			for (int[] d : dir) {

				stack.push(new int[]{
						r + d[0],
						c + d[1]
				});

			}
		}

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (board[i][j] == 'O')
					board[i][j] = 'X';

				else if (board[i][j] == 'T')
					board[i][j] = 'O';

			}
		}
	}
}







// BFS
import java.util.*;

class Solution {

	public void solve(char[][] board) {

		int rows = board.length;
		int cols = board[0].length;

		Queue<int[]> q = new LinkedList<>();

		for (int i = 0; i < rows; i++) {

			if (board[i][0] == 'O')
				q.offer(new int[]{i,0});

			if (board[i][cols-1] == 'O')
				q.offer(new int[]{i,cols-1});
		}

		for (int j = 0; j < cols; j++) {

			if (board[0][j] == 'O')
				q.offer(new int[]{0,j});

			if (board[rows-1][j] == 'O')
				q.offer(new int[]{rows-1,j});
		}

		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		while (!q.isEmpty()) {

			int[] cur = q.poll();

			int r = cur[0];
			int c = cur[1];

			if (r < 0 || c < 0 ||
					r >= rows || c >= cols ||
					board[r][c] != 'O')
				continue;

			board[r][c] = 'T';

			for (int[] d : dir) {

				q.offer(new int[]{
						r + d[0],
						c + d[1]
				});
			}
		}

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (board[i][j] == 'O')
					board[i][j] = 'X';

				else if (board[i][j] == 'T')
					board[i][j] = 'O';
			}
		}
	}
}