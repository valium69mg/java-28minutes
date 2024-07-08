package udemyJavaCourse;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// STREAM 
		List<String> list = List.of("Apple","Banana","Coconut","Dragon Fruit");
		list.stream().forEach(str -> System.out.println(str));
		// ODD AND EVEN
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
		numbers.stream().filter(num -> num % 2 == 0).forEach(element -> System.out.println(element));
		// COLLECT
		Integer sum = numbers.stream().reduce(0, (number1,number2) -> number1 + number2);
		System.out.println(sum);
		// SORT
		List<Integer> unsortedList = List.of(2,8,10,3,6,1);
		unsortedList.stream().sorted().forEach(num -> System.out.println(num));
		// MAP
		List<Integer> unsortedList2 = List.of(2,8,10,3,6,1);
		unsortedList2.stream().sorted().map(num -> num*2).forEach(num -> System.out.println(num));
		// COLLECTOR
		List <Integer> unsortedList2Double = unsortedList2.stream().sorted().map(num -> num*2).collect(Collectors.toList());
		System.out.println(unsortedList2Double);
	}
	

}
