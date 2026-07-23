package GRAPHS.Problems;

// BFS
import java.util.*;

class Solution {

	public int minMutation(String startGene,
	                       String endGene,
	                       String[] bank) {

		Set<String> dict =
				new HashSet<>(Arrays.asList(bank));

		if (!dict.contains(endGene))
			return -1;

		Queue<String> queue =
				new LinkedList<>();

		queue.offer(startGene);

		int mutations = 0;

		char[] genes = {'A','C','G','T'};

		while (!queue.isEmpty()) {

			int size = queue.size();

			while (size-- > 0) {

				String curr = queue.poll();

				if (curr.equals(endGene))
					return mutations;

				char[] arr =
						curr.toCharArray();

				for (int i = 0;
				     i < arr.length;
				     i++) {

					char original = arr[i];

					for (char ch : genes) {

						arr[i] = ch;

						String next =
								new String(arr);

						if (dict.contains(next)) {

							queue.offer(next);

							dict.remove(next);

						}

					}

					arr[i] = original;

				}

			}

			mutations++;

		}

		return -1;

	}

}