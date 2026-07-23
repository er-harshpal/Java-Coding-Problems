package GRAPHS.Problems;

// Recursive Approach
class Solution {

	public int[][] floodFill(int[][] image, int sr, int sc, int color) {

		int originalColor = image[sr][sc];

		if (originalColor == color) {
			return image;
		}

		dfs(image, sr, sc, originalColor, color);

		return image;
	}

	private void dfs(int[][] image, int row, int col,
	                 int originalColor, int newColor) {

		if (row < 0 || col < 0 ||
				row >= image.length ||
				col >= image[0].length ||
				image[row][col] != originalColor) {

			return;
		}

		image[row][col] = newColor;

		dfs(image, row - 1, col, originalColor, newColor);
		dfs(image, row + 1, col, originalColor, newColor);
		dfs(image, row, col - 1, originalColor, newColor);
		dfs(image, row, col + 1, originalColor, newColor);
	}
}




// Iterative DFS Stack
import java.util.Stack;

class Solution {

	public int[][] floodFill(int[][] image, int sr, int sc, int color) {

		int original = image[sr][sc];

		if (original == color)
			return image;

		Stack<int[]> stack = new Stack<>();
		stack.push(new int[]{sr, sc});

		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		while (!stack.isEmpty()) {

			int[] curr = stack.pop();

			int r = curr[0];
			int c = curr[1];

			if (r < 0 || c < 0 ||
					r >= image.length ||
					c >= image[0].length ||
					image[r][c] != original)
				continue;

			image[r][c] = color;

			for (int[] d : dir) {
				stack.push(new int[]{r + d[0], c + d[1]});
			}
		}

		return image;
	}
}



// BFS Queue
import java.util.LinkedList;
import java.util.Queue;

class Solution {

	public int[][] floodFill(int[][] image, int sr, int sc, int color) {

		int original = image[sr][sc];

		if (original == color)
			return image;

		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[]{sr, sc});

		image[sr][sc] = color;

		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		while (!queue.isEmpty()) {

			int[] curr = queue.poll();

			for (int[] d : dir) {

				int r = curr[0] + d[0];
				int c = curr[1] + d[1];

				if (r >= 0 &&
						c >= 0 &&
						r < image.length &&
						c < image[0].length &&
						image[r][c] == original) {

					image[r][c] = color;

					queue.offer(new int[]{r, c});
				}
			}
		}

		return image;
	}
}