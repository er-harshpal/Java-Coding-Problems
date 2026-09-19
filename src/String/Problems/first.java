package String.Problems;

import java.util.HashMap;

// Check Pangram
public class first {
//	String input = "The quick brown fox jumps over the lazy dog";
//	output = true;
	public static void main(String[] args){
		String inp = "The quick brown fox jumps over the lazy dog";
		System.out.println(solulu(inp));
	}
	public static boolean solulu(String inp){
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i=0; i<inp.length(); i++){
			if(!inp.containsKey(i)){
				hm.put(i, 1);
			}
			else if(inp.containsKey(i)){
				hm.get(i) // and increase the value by plus one
			}
		}
		if(hm.size==27){
			return true;
		}
		else return false;
	}
}
