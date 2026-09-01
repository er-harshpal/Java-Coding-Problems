//public class LongestUnrepeatedSubString {
//
//	public static void main(String[] args) {
//		String s = "abcdfba";
//		System.out.println(subString(s));
//	}
//
//	public static String subString(String s) {
//		s = s.toLowerCase();
//
//		int start = 0;
//		int maxStart = 0;
//		int maxLength = 0;
//
//		for (int end = 0; end < s.length(); end++) {
//
//			for (int j = start; j < end; j++) {
//				if (s.charAt(j) == s.charAt(end)) {
//					start = j + 1;
//					break;
//				}
//			}
//
//			if (end - start + 1 > maxLength) {
//				maxLength = end - start + 1;
//				maxStart = start;
//			}
//		}
//
//		return s.substring(maxStart, maxStart + maxLength);
//	}
//}
