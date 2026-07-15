//package CollectionFramework.Hashmap;
//
//import java.util.*;
//
//public class FirstNonRepeatingChar {
//	public static void main(String[] args){
//		FirstNonRepeatingChar f = new FirstNonRepeatingChar();
//		f.firstNonRepeatingCharacter("Harshhhh");
//	}
//}
//	public void firstNonRepeatingCharacter(String s){
//		HashMap<Integer, String> hm = new HashMap()<>;
//		for(int i=0; i<s.length(); i++){
//			char currChar = s.chatAt(i);
//
//			if(hm.containsKey(currChar){
//				int currentCount = hm.get(currChar;
//				hm.put(currChar, currentCount+1));
//			}else{
//				hm.put(currChar, 1);
//			}
//			System.out.println("Frequencies "+hm);
//
//			for (int i = 0; i < s.length(); i++) {
//				char currChar = s.charAt(i);
//
//				if (hm.get(currChar) == 1) {
//					System.out.println("The first non-repeating character is: " + currChar);
//					return; // We found it! Stop looking and exit the method.
//				}
//		}
//	}
//}



package CollectionFramework.Hashmap;

import java.util.*;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		FirstNonRepeatingChar f = new FirstNonRepeatingChar();
		f.firstNonRepeatingCharacter("Harshhhh");
	}

	public void firstNonRepeatingCharacter(String s) {
		s = s.toLowerCase();

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char currChar = s.charAt(i); // Fix 2: Fixed typo 'chatAt' to 'charAt'

			if (hm.containsKey(currChar)) { // Fix 3: Added missing closing parenthesis
				int currentCount = hm.get(currChar);
				hm.put(currChar, currentCount + 1);
			} else {
				hm.put(currChar, 1);
			}
		} // <-- The first loop ends here! The notebook is completely full now.

		System.out.println("Frequencies " + hm);

		// LOOP 2: Find the winner (Now correctly sitting AFTER the first loop)
		for (int i = 0; i < s.length(); i++) {
			char currChar = s.charAt(i);

			if (hm.get(currChar) == 1) {
				System.out.println("The first non-repeating character is: " + currChar);
				return;
			}
		}

		System.out.println("All characters repeat!");
	}
}