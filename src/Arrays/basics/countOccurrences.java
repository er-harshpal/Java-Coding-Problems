package Arrays.basics;

import java.util.Scanner;
public class countOccurrences {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Scanner sc2 = new Scanner(System.in);
        int target = sc2.nextInt();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count = count +1;
            }
        }
        System.out.println(count);
    }
}
