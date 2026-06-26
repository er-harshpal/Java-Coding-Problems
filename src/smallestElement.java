import java.util.Scanner;
public class smallestElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int minElement = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]<minElement){
                minElement = arr[i];
            }
        }
        System.out.print(minElement);
    }
}
