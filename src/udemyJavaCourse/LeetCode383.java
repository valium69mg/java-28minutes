package udemyJavaCourse;

import java.util.HashMap;

public class LeetCode383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aab";
		String magazine = "baa";
		System.out.println(canConstruct(ransomNote,magazine));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
		// Magazine availible letters
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			if (map.containsKey(magazine.charAt(i))) { // IF IT ALREADY CONTAINS THE VALUE
				// WE UPDATE IT
				int oldValue = map.get(magazine.charAt(i));
				int newValue = oldValue+1;
				map.replace(magazine.charAt(i), oldValue, newValue);
			} else { // IF IT DOES NOT CONTAIN THE VALUE
				map.put(magazine.charAt(i), 1);
			}
		}
		
		for (int j = 0; j < ransomNote.length(); j++) {
			if (map.containsKey(ransomNote.charAt(j))) { // IF IT CONTAINS THE CHARACTER
				if (map.get(ransomNote.charAt(j)) >= 1) { // THERE ARE LETTERS LEFT TO USE
	
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		
		return true;
		
    }

}
