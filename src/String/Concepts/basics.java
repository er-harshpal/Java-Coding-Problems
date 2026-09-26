package String.Concepts;

import java.util.HashMap;

public class basics {
	public static void main(String[] args){
//		String s = "";
//		System.out.println(s.length());
//		System.out.println(s.charAt(0));
//		System.out.println(s.substring(0,5));
//		System.out.println(s.equals("hello"));
//		System.out.println(s.indexOf("a"));
//		System.out.println(s.contains("abc"));
//		System.out.println(s.toCharArray());
//		System.out.println(s.split("h"));
//		System.out.println(s);
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.replace("h", "l"));


//		char ch = s.charAt(4);
//		System.out.println(Character.isLetter(ch));
//		System.out.println(Character.isDigit(ch));
//		System.out.println(Character.isWhitespace(ch));
//		System.out.println(Character.isUpperCase(ch));
//		System.out.println(Character.isLowerCase(ch));
//		System.out.println(Character.toLowerCase(ch));
//		System.out.println(Character.toUpperCase(ch));


        /// Frequency Counter

//		String s = "abbcablkjluiuwwerqwjzbvaddsjgrsjfhmfmfgx";
//		int[] freq = new int[26];
//		for(char ch: s.toCharArray()){
//			freq[ch - 'a']++;
//		}
//		 for (int i = 0; i<26; i++){
//			 if(freq[i] > 0){
//				 System.out.println((char)(i + 'a')+ "=" + freq[i]);
//			 }
//		 }
//		 System.out.println('d'-'a');



		/// HashMap
		String s = "banana";
		HashMap<Character, Integer> hm = new HashMap<>();

		hm.put('a', 1);
		hm.put('b', 1);
		hm.put('c', 1);
		hm.put('d', 1);
		hm.put('e', 1);
		hm.put('f', 1);

		System.out.println(hm.get('a'));
		System.out.println(hm.get('b'));
		System.out.println(hm.get('c'));

		System.out.println(hm.containsKey('d'));
		System.out.println(hm.getOrDefault('a', 1));
		System.out.println(hm.remove('a'));
		System.out.println(hm.size());

		for(char ch : s.toCharArray()){
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
	}
}

