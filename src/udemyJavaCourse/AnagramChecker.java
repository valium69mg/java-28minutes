package udemyJavaCourse;

import java.util.Arrays;

public class AnagramChecker {

	public static boolean arePalindrome(String str1,String str2) {
		
		if (str1.length() != str2.length()) {
			return false;
		} else {
			
			char[] Array1 = new char[str1.length()];
			char[] Array2 = new char[str2.length()];

			for (int i = 0; i < str1.length(); i++) {
				Array1[i] = Character.toLowerCase(str1.charAt(i));
			}
			for (int j = 0; j < str2.length(); j++) {
				Array2[j] = Character.toLowerCase(str2.charAt(j));
			}

			// FLIP ARRAY 1
			char[] Array1Flipped = new char[str1.length()];
			int i = str1.length() -1;
			int j = 0;
			while (i >= 0) {
				Array1Flipped[i] = Array1[j];
				i--;
				j++;
			}		
			
			String string2 = String.valueOf(Array2);
			String string1Flipped = String.valueOf(Array1Flipped);
			
			if (string2.equals(string1Flipped)) {
				return true;
			} else {
				return false;
				
			}			
		}
	}
	
public static boolean areAnagram(String str1,String str2) {
		// null entry
		if (str1 == null | str2 == null) {
				return false;
			}	
			// Single char entry	
		if (str1.length() == 1 | str2.length() == 1) {
			if (str1.equals(str2)) {
				return true;
			} else {
				return false;
			}
		}
		
		// Everything else
		if (str1.length() != str2.length()) {
			return false;
		} else {
			
			char[] Array1 = new char[str1.length()];
			char[] Array2 = new char[str2.length()];

			for (int i = 0; i < str1.length(); i++) {
				Array1[i] = Character.toLowerCase(str1.charAt(i));
			}
			for (int j = 0; j < str2.length(); j++) {
				Array2[j] = Character.toLowerCase(str2.charAt(j));
			}
			
			char[] Array1Sorted = new char[str1.length()];
			char[] Array2Sorted = new char[str2.length()];
			Arrays.sort(Array1Sorted);
			Arrays.sort(Array2Sorted);
			
			String string1 = String.valueOf(Array1Sorted);
			String string2 = String.valueOf(Array2Sorted);
			
			if (string2.equals(string1)) {
				return true;
			} else {
				return false;
				
			}			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Mango";
		String str2 = "Ognam";
		boolean anagram = arePalindrome(str1,str2);
		System.out.println(anagram);
	}

}
