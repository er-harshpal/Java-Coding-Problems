package Arrays.Concepts.search;

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {2,1,4,5,6};
        int n = arr.length;
        int sum = (n + 1) * (n + 2) / 2;;
        int sum2 = 0;
        for(int i=0; i<n; i++){
            sum2 = arr[i] + sum2;
        }
        int missing = sum - sum2;
        System.out.println(missing);
    }
}
