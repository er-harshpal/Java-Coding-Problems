package String;

public class LongestUncommonSubstringK {
	public static void main(String[] args){
		String sample = "abcdefgha";
		System.out.println(solulu(sample));
	}

	public static String solulu(String sample){

		sample.toLowerCase();
		int start = 0;
		int maxStart = 0;
		int maxLength = 0;

		for(int end=0; end < sample.length(); end++){

			for(int j=start; j<end; j++){
				if(sample.charAt(j)==sample.charAt(end)){
					start = j+1;
					break;
				}
			}

			if(end-start+1>maxLength){
				maxLength = maxLength + 1;
				maxStart = start;
			}
		}
		return sample.substring(maxStart, maxStart + maxLength);
	}
}

