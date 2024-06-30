package udemyJavaCourse;

public class LeetCode392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s,t));
		System.out.println(isSubsequence("",""));

	}
	
	public static boolean isSubsequence(String s, String t) {
        int i = 0;
		int j = 0;
        if (s.equals("")) {
            return true;
        }
        if (s.length() <= 1 || t.length() <= 1) {
            if (s.equals(t)) {
                return true;
            } 
		}
		while (j < t.length()) {
            
			if (s.charAt(i) == t.charAt(j)) { // SI SON IGUALES
				i++;
                if (i >= s.length()) {
				return true;
			    }
			} 
			j++;
		}
		return false;
    }

}
