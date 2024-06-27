package udemyJavaCourse;

public class StringMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if (sentence == null) {
            return "INVALID";
        } 
        
        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if (sentence.isEmpty()) {
            return "";
        }
        // TODO: Split the sentence into words using the split method. 
        // Use " " as the delimiter to match space.
        String[] splittedSentence = sentence.split(" ");
        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder reversedStr = new StringBuilder();
        // TODO: Loop through each word in the words array.
        for (String str : splittedSentence) {
        	 // TODO: For each word, create a StringBuilder and reverse the word.
            // Append the reversed word, followed by a space, to the reversed sentence.
        	StringBuilder reversedWord = new StringBuilder();
            reversedWord.append(str);
            reversedWord.reverse();
            reversedStr.append(reversedWord); // ADD REVERSED WORD
            reversedStr.append(" "); // ADD SPACE AFTER WORD
        }
           
        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        String returnStr = reversedStr.toString();
        return returnStr.trim();
	}
}
