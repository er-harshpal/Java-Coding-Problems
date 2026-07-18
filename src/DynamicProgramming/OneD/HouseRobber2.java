// Using the Recursion
class HouseRobber2{
	public int rob(int[] nums){
		int n = nums.length;
		if(n == 1) return nums[0];
		// Max of: excluding last house excluding first hosue
		return Math.max(robLinear(nums, 0 , n-2), robLinear(nums, 1, n-1));
	}

	private int robLinear(int[] nums, int start, int end){
		if(start > end) return 0;
		if(start == end) return nums[start];
		// take current house + skip one, or skip current house
		return Math.max(
				nums[end] + robLinear(nums, start, end -2),
				robLinear(nums, start, end -1)
		);
	}
}
