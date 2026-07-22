//package Arrays.Problems;
//
//class EightyFifth {
//
//	public int inversionCount(int[] arr) {
//		return mergeSort(arr, 0, arr.length - 1);
//	}
//
//	private int mergeSort(int[] arr, int left, int right) {
//
//		// Base Case
//		if (left >= right)
//			return 0;
//
//		int mid = left + (right - left) / 2;
//
//		int count = 0;
//
//		// Count inversions in left half
//		count += mergeSort(arr, left, mid);
//
//		// Count inversions in right half
//		count += mergeSort(arr, mid + 1, right);
//
//		// Count inversions while merging
//		count += merge(arr, left, mid, right);
//
//		return count;
//	}
//
//	private int merge(int[] arr, int left, int mid, int right) {
//
//		int[] temp = new int[right - left + 1];
//
//		int i = left;
//		int j = mid + 1;
//		int k = 0;
//
//		int count = 0;
//
//		while (i <= mid && j <= right) {
//
//			if (arr[i] <= arr[j]) {
//				temp[k++] = arr[i++];
//			}
//			else {
//
//				// All remaining elements in left half
//				// are greater than arr[j]
//				count += (mid - i + 1);
//
//				temp[k++] = arr[j++];
//			}
//		}
//
//		// Remaining left elements
//		while (i <= mid) {
//			temp[k++] = arr[i++];
//		}
//
//		// Remaining right elements
//		while (j <= right) {
//			temp[k++] = arr[j++];
//		}
//
//		// Copy back
//		for (int p = 0; p < temp.length; p++) {
//			arr[left + p] = temp[p];
//		}
//
//		return count;
//	}
//
//	public static void main(String[] args) {
//
//		EightyFifth obj = new EightyFifth();
//
//		int[] arr = {2,4,1,3,5};
//
//		System.out.println(obj.inversionCount(arr)); // Output: 3
//	}
//}