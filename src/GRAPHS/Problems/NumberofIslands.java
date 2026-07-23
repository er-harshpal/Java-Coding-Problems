package GRAPHS.Problems;

public class NumberofIslands {
	public static void main(String[] args){
		char[][] grid = {
			{'1', '1', '1', '1', '0'},
			{'1', '1', '0', '1', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '0', '0', '1'}
		};

		System.out.println(islands(grid));
	}

	public static int islands(char[][] grid) {

		int count = 0;

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == '1') {

					count++;

					dfs(grid, i, j);

				}

			}

		}

		return count;
	}

	public static void dfs(char[][] grid, int i, int j) {

		if (i < 0 || j < 0 ||
				i >= grid.length ||
				j >= grid[0].length ||
				grid[i][j] == '0') {

			return;
		}

		grid[i][j] = '0';

		dfs(grid, i - 1, j);
		dfs(grid, i + 1, j);
		dfs(grid, i, j - 1);
		dfs(grid, i, j + 1);
	}
}


/***
 * For every graph problem
 * Step 1 (20–40 minutes)
 * Read and understand the solution.
 * Ask "Why?" for every line.
 * Don't memorize yet.
 * Step 2
 * Close everything.
 * Write the solution from memory.
 * Step 3
 * Compare with the original.
 * Identify only the parts you missed.
 * Step 4
 * Close it again.
 * Rewrite it.
 *
 * Repeat until you can write it without referring to the solution.
 *
 * Step 5
 * The next day, rewrite it once more before starting a new problem.
 * Keep a pattern notebook
 *
 * For each problem, write only:
 *
 * Pattern: Grid DFS / BFS / Topological Sort / Union Find / Dijkstra
 * Recognition: When should I use this?
 * Core idea: 3–5 lines
 * Time & Space Complexity
 * Common mistakes
 *
 * Keep it to one page.
 */