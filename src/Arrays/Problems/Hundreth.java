//// Count of the smaller numbers after self
package Arrays.Problems;

import java.util.Arrays;

public class Hundreth {

	public static void main(String[] args) {
		int[] nums = {5, 56, 26, 8, 1, 385, 1, 35, 4, 2, 6};
		Hundreth h = new Hundreth();
		int[] answer = h.smallerCount(nums);
		System.out.println(Arrays.toString(answer));
	}

	public int[] smallerCount(int[] nums) {
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					count++;
				}
			}
			answer[i] = count;
		}
		return answer;
	}
}
		// Step1 i am standing at the first index  add that index as a key in the hashmap and
		// then a for loop will run and in the for loopi'll check for the other numbers and if
		// are smaller than the current numbers then increase the count and in the end add the count in the
		// hashmap as a key
		// then in the last step the hashmap will return the key wiith the largest value
