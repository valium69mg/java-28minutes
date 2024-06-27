package udemyJavaCourse;

import java.util.ArrayList;

public class MyCustomList<T> {

	ArrayList<T> list = new ArrayList<>();
	
	public T getElement(Integer index) {
		return list.get(index);
	}
	
	public void addElement(T element) {
		list.add(element);
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}
	
	public String toPrint() {
		if (list.size() == 0) {
			return "[]";
		}
		StringBuilder str = new StringBuilder();	 
		str.append("[");
		for (int i = 0; i < list.size(); i++) {
			if (i == (list.size()-1)) { // LAST ELEMENT
				str.append(list.get(i));
				str.append("]");
			} else {
				str.append(list.get(i)); // FIRST AND ELEMENTS OTHER ELEMENTS (EXCEPT LAST)
				str.append(", ");
			}
		}
		return str.toString();
	}

}
