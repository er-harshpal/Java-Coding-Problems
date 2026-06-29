package Arrays;

import java.util.Scanner;
public class linearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Scanner sc2 = new Scanner(System.in);
        int target = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Target found at index "+arr[i]);
            }
        }
    }
}
