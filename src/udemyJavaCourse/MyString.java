package udemyJavaCourse;
import java.util.*;

public class MyString {

	public String str;
	
	
    public MyString(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
    	if (Character.isDigit(ch)) {
    		return true;
    	}
        // Write your code here
    	
    	if (ch >= 'A' && ch <= 'F') { // MAYUS
    		return true;
    		
    	} 
    	
    	if (ch >= 'a' && ch <= 'f') { // MINUS
			return true;
		}
    	
    	return false;
    	
    }

    public boolean isHexadecimal() {
        // Write your code here
    	if (this.str == null) {
    		return false;
    	} else if (this.str.isEmpty()) {
    		return false;
    	} else {
    		char[] charArray = this.str.toCharArray();
    		for (char c : charArray) {
                if (!this.isHexadecimalChar(c) && !Character.isDigit(c)) {
                	return false;
                }
            }
    		return true;
    	}
    }
    	
    
    
    public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
    	
	}

	
	
}
