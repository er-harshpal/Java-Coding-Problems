public class test {
	public static void main(String[] args){
		int fact_Number = 1;
		// 5 * & * 3 * 2 * 1
		int factorial = 1;
		if(fact_Number == 0){
			System.out.print("Change the number from zero and the factorial = ");
			factorial =0;
		}
		for (int i=fact_Number; i>0; i--){
				factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}

