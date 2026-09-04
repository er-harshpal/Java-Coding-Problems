package Basics;
import java.util.*;
public class ReverseNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n/10 == 0 ){
			System.out.print("Enter a valid reversible number");
		}
		while (n!=0){
			int z = n%10;
			n = n/10;
			System.out.print(z);
		}

	}
}
