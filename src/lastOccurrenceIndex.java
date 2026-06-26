import java.util.Scanner;
public class lastOccurrenceIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Scanner sc1 = new Scanner(System.in);
        int target = sc1.nextInt();

        for (int i = arr.length-1 ; i > -1; i--) {
            if (arr[i] == target) {
                System.out.println(i);
                break;
            }
        }
    }
}