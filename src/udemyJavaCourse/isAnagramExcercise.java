package udemyJavaCourse;

import java.util.HashMap;

public class isAnagramExcercise{
	public static void main(String[] args) {
		// EXAMPLE 1
		String word = "ballena";
		String word2 = "llenaba";
		System.out.println("Word 1: " + word);
		System.out.println("Word 2: " + word2);
		System.out.println("Are words anagrams: " + isAnagram(word,word2));
		
		// EXAMPLE 2
		String word3 = "Botines";
		String word4 = "Bisonte ";
		System.out.println("Word 1: " + word3);
		System.out.println("Word 2: " + word4);
		System.out.println("Are words anagrams: " + isAnagram(word3,word4));
		
	}
	
	public static boolean isAnagram(String str1,String str2) {
		// HANDLE INPUTS
		String s1 = str1.trim().replace("\u00A0", "");
		String s2 = str2.trim().replace("\u00A0", "");
		if (s1.length() != s2.length()) {
			return false;
		}
		
		HashMap<Character,Integer> frequencyS1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> frequencyS2 = new HashMap<Character,Integer>();
		for (int i = 0; i < s1.length(); i++) {
			// S1
			if (frequencyS1.containsKey(s1.charAt(i))) { // IF IT IS ALREADY ON THE HASHMAP
				int newValue = frequencyS1.get(s1.charAt(i)) + 1;
				frequencyS1.replace(s1.charAt(i), frequencyS1.get(s1.charAt(i)), newValue);
			} else { // FIRST TIME ON THE HASHMAP
				frequencyS1.put(s1.charAt(i),1);
			}
			// S2
			if (frequencyS2.containsKey(s2.charAt(i))) { // IF IT IS ALREADY ON THE HASHMAP
				int newValue = frequencyS2.get(s2.charAt(i)) + 1;
				frequencyS2.replace(s2.charAt(i), frequencyS2.get(s2.charAt(i)), newValue);
			} else { // FIRST TIME ON THE HASHMAP
				frequencyS2.put(s2.charAt(i),1);
			}
		}
		if (frequencyS1.equals(frequencyS2)) { // IF BOTH HASHMAPS ARE THE SAME IT IS AN ANAGRAM
			return true;
		}
		
		
		

		return false;
	}
	
	public static void printHashMap(HashMap<Character,Integer> map) {
		System.out.println("=============");
		for (Character t: map.keySet()) {
		    String key = t.toString();
		    String value = map.get(t).toString();
		    System.out.println("{" + key + "}" + " : " + "{" +value+"}");
		}
	}
}
