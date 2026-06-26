import java.util.Scanner;

public class secondSmallestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {

            if(arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            }

            else if(arr[i] > firstMin && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        System.out.println("Smallest: " + firstMin);
        System.out.println("Second Smallest: " + secondMin);
    }
}
