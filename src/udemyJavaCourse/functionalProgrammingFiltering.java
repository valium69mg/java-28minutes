package udemyJavaCourse;

import java.util.List;

public class functionalProgrammingFiltering {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		printNumbers(list);
		printOddNumbers(list);
		printEvenNumbers(list);
	}
	
	// FILTERING
	// EXCERCISE TO PRINT ODD AND EVEN
	
	// TYPICALLY PROGRAMMED
	private static void printNumbers(List<Integer> list) {
		for (Integer number: list) {
			System.out.println(number);
		}
	}
	// USING FUNCTIONAL PROGRAMMING
	
	private static void printOddNumbers(List<Integer> list) {
		list.stream().filter(element -> element  % 2 == 1).forEach(element -> System.out.println(element));
	}
	
	private static void printEvenNumbers(List<Integer> list) {
		list.stream().filter(element -> element  % 2 == 0).forEach(element -> System.out.println(element));
	}
	
}
