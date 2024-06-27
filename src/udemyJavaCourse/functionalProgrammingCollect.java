package udemyJavaCourse;

import java.util.List;

public class functionalProgrammingCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(4,6,8,13);
		//list.stream().forEach(element -> System.out.println(element));
		printSum(list);
	}
	
	public static void printSum(List<Integer> list) {
		int sum = list.stream().reduce(0, (number1,number2) -> number1 + number2);
		System.out.println(sum);
	}

}
