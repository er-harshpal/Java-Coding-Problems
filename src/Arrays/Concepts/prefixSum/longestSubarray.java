package Arrays.Concepts.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class longestSubarray {
        public static int findLongestSubarray(int[] arr, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int maxLen = 0;

            // Handle case where subarray starts from index 0
            map.put(0, -1);

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                // If (sum - k) exists in map, we found a subarray with sum k
                if (map.containsKey(sum - k)) {
                    maxLen = Math.max(maxLen, i - map.get(sum - k));
                }

                // Store the first occurrence of the prefix sum to maximize length
                map.putIfAbsent(sum, i);
            }

            return maxLen;
        }

        public static void main(String[] args) {
            int[] arr = {10, 5, 2, 7, 1, -10};
            int k = 15;
            System.out.println("Length: " + findLongestSubarray(arr, k)); // Output: 6
        }
    }
