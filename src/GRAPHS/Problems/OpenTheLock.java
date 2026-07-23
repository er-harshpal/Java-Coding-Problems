package GRAPHS.Problems;

// BFS Solution
import java.util.*;

class Solution {

	public int openLock(String[] deadends,
	                    String target) {

		Set<String> dead = new HashSet<>(
				Arrays.asList(deadends));

		if (dead.contains("0000"))
			return -1;

		Queue<String> queue =
				new LinkedList<>();

		Set<String> visited =
				new HashSet<>();

		queue.offer("0000");

		visited.add("0000");

		int moves = 0;

		while (!queue.isEmpty()) {

			int size = queue.size();

			while (size-- > 0) {

				String curr = queue.poll();

				if (curr.equals(target))
					return moves;

				for (String next :
						neighbors(curr)) {

					if (!dead.contains(next)
							&&
							!visited.contains(next)) {

						visited.add(next);

						queue.offer(next);

					}

				}

			}

			moves++;

		}

		return -1;

	}

	private List<String> neighbors(
			String s) {

		List<String> list =
				new ArrayList<>();

		char[] arr = s.toCharArray();

		for (int i = 0; i < 4; i++) {

			char original = arr[i];

			arr[i] =
					original == '9'
							? '0'
							: (char)(original + 1);

			list.add(
					new String(arr));

			arr[i] =
					original == '0'
							? '9'
							: (char)(original - 1);

			list.add(
					new String(arr));

			arr[i] = original;

		}

		return list;

	}

}