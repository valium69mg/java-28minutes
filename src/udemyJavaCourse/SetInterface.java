package udemyJavaCourse;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		// STORED IN RANDOM ORDER NOT INSERTION ORDER
		System.out.println(numbers);
		Set <Integer> linkedNumbers = new LinkedHashSet<>();
		linkedNumbers.add(1);
		linkedNumbers.add(10);
		linkedNumbers.add(100);
		// LINKED ORDER
		System.out.println(linkedNumbers);
		Set <Integer> treeNumbers = new TreeSet<>();
		treeNumbers.add(1);
		treeNumbers.add(10);
		treeNumbers.add(100);
		// TREE ORDER
		System.out.println(treeNumbers);
	}

}
