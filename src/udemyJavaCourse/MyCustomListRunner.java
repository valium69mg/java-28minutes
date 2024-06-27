package udemyJavaCourse;

public class MyCustomListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// GENERICS IN JAVA CLASSES
		
		// STRINGS
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Alpha");
		list.addElement("Beta");
		list.addElement("Charly");
		String listToString = list.toPrint();
		String strElement = list.getElement(0);
		System.out.println(strElement);
		System.out.println(listToString);
		// INTEGER
		MyCustomList<Integer> listIntegers = new MyCustomList<>();
		listIntegers.addElement(1000);
		listIntegers.addElement(2000);
		listIntegers.addElement(3000);
		String listIntegersToString = listIntegers.toPrint();
		int intElement = listIntegers.getElement(1);
		System.out.println(intElement);
		System.out.println(listIntegersToString);
	}

}
