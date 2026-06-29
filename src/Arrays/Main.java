package Arrays;

import java.util.Scanner;
public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int maxElement = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }

        System.out.println(maxElement);
    }
}