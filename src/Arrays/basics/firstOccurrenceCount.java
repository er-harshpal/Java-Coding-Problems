package Arrays.basics;

import java.util.Scanner;
public class firstOccurrenceCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Scanner sc1 = new Scanner(System.in);
        int target = sc1.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
    }
}
