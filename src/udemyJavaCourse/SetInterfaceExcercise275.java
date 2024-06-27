package udemyJavaCourse;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceExcercise275 {
	
	public static void main(String[] args) {
		List<Character> characters = List.of('A','Z','A','B','Z','F');
		// treeSet sorted by character order
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet: " + treeSet);
		// linkedHashSet sorted by insertion time
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet: " + linkedHashSet);
	}
}
