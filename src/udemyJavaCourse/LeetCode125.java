package udemyJavaCourse;
import java.util.HashMap;
public class LeetCode125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "A man, a plan, a canal: Panama";
		String textStripped = stripNonAlphanumericalCharacter(text);
		System.out.println("Stripped text: " + textStripped);
		System.out.println(isPalindrome(textStripped));
		
		String text2 = "Tessa's in Italy, Latin is asset.";
		String textStripped2 = stripNonAlphanumericalCharacter(text2);
		System.out.println("Stripped text: " + textStripped2);
		System.out.println(isPalindrome(textStripped2));
	}
	
	public static String stripNonAlphanumericalCharacter(String s) {
		s.strip();
		System.out.println("String to be analized: " + s);
		char[] strArray = s.toCharArray();
		int i = 0;
		int j = strArray.length - 1;
		HashMap<Integer, Character> charsToRemove= new HashMap<Integer, Character>();
		StringBuilder str = new StringBuilder();
		while (i < j) {
			System.out.println("i: "+i);
			System.out.println("j: " + j);
			
			if (i == j) { // WHEN TWO POINTERS POINT AT THE SAME INDEX
				if (!isAlphanumerical(strArray[i])) { // IF THE CHAR IS NOT ALPHANUMERICAL
					charsToRemove.put(i,strArray[i]); // EX. (c = ,) => HashMap<indexOfc,c>
				}
				i++;
			}
			if (!isAlphanumerical(strArray[i])) {
				charsToRemove.put(i,strArray[i]);
			}
			i++;

			if (!isAlphanumerical(strArray[j])) {
				charsToRemove.put(j,strArray[j]);
			}
			j--;

			
		}
		for (Integer index: charsToRemove.keySet()) {
		    String key = index.toString();
		    String value = charsToRemove.get(index).toString();
		    System.out.println("{" +key+ "}" + " " + "{" + value + "}");
		}
		for (int k = 0; k < strArray.length; k++) {
			if (!charsToRemove.containsKey(k)) { // IF THE CHARACTER IN THIS POSITION NEEDS TO BE REMOVED
				if (isAlphanumerical(strArray[k])) {
					str.append(strArray[k]);
				}
			}
		}
		return str.toString().toLowerCase();
		
	}
	
	
    public static boolean isAlphanumerical(char c) {
    	if (c >= 65 && c <= 90) { // A-Z MAYUS 
    		return true;
    	}
    	if (c>= 97 && c<= 122) { // A-Z MINUS
    		return true;
    	}
    	if (c >= 48 && c<= 57) { // 0-9 NUMS
    		return true;
    	} else {
        	return false;
    	}
    }
    
    public static boolean isPalindrome(String s)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Checking if both the strings are equal
        if (s.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    
}
