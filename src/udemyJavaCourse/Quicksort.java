package udemyJavaCourse;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {2,6,5,3,8,7,1,0};
		int[] myArray2 = {2,1,0,3};
		int[] myArray3 = {8,7,6,5};
		int[] myArray4 = {2,1,0,3,8,7,6,5};
		sort(myArray,0,myArray.length -1);
	}
	
	public static void sort(int[] array, int start, int end) {
		// PIVOT
		// start end are indexes included
		
		
		int arrayLength = (end - start) + 1;;

		int pivot = findPivot(arrayLength - start); // index
		
		System.out.println("Initial loop: ");
		printArray(array,start,end);
		System.out.println("============");
		System.out.println("Start: " + start);
		System.out.println("End: " + end); 
		System.out.println("Pivot is: " + pivot);

		// SWAP PIVOT TO END IF PIVOT CONDITIONS NOT MET (CHECK NOTEBOOK)
		if (!isPivotCorrect(array,pivot,start,end) && (end > start) ) {
			swap(array,pivot,end); // SWAP PIVOT TO THE END
			pivot = end;
			// ACOMMODATE THE ARRAY PROPERLY
			while (true) {
				int itemFromLeft = 0; // index
				int itemFromRight = 0; // index
				// itemFromLeft
				for (int i = start; i < end; i ++) {
					if (array[i] > array[pivot]) {
						itemFromLeft = i;
						break;
					}
				}
				// itemFromRight
				for (int i = end - 1; i > start - 1; i --) {			
					if (array[i] < array[pivot]) {
						itemFromRight = i; // index
						break;
					}
				}
				// while itemFromLeft < itemFromRight
				if (itemFromLeft < itemFromRight) {
					swap(array,itemFromRight,itemFromLeft);
				} else {
					swap(array,itemFromLeft,pivot); // 	BEFORE EXITING WE SWAP ITEM FROM LEFT FOR PIVOT
					pivot = itemFromLeft;
					System.out.println("Exited partition with: ");
					System.out.println("Array length " + arrayLength);
					System.out.println("Pivot index " + pivot);
					System.out.println("============");
					printArray(array,start,end);
					break;
				}
			}
			
			if (start != pivot) {
				sort(array,start,pivot);

			}
			if (pivot + 1 != end) {
				sort(array,pivot+1,end);
			}
	}
			
		
			
		
		
	}
	
	public static void printArray(int[] array,int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static boolean isPivotCorrect(int[] array,int pivot,int start, int end) {
		
		
		
		for (int i = start; i < pivot; i++) {
			if (array[i] > array[pivot]) {
				System.out.println("False at index: " + i + " with a value of: " + array[i]);
				return false;
			}
		}
		for (int i = pivot+1; i <= end; i++) {
			if (array[i] < array[pivot]) {
				System.out.println("False at index: " + i + " with a value of: " + array[i]);
				return false;
			}
		}
		return true;
	}
	
	public static void swap(int[] array, int indexOfElement1, int indexOfElement2) {
		int temp;
		temp = array[indexOfElement1];
		array[indexOfElement1] = array[indexOfElement2];
		array[indexOfElement2] = temp;
	}
	
	public static int findPivot(int arrayLength) {
		int pivotIndex;
		if (arrayLength == 1) {
			return 0;
		}
		if (arrayLength % 2 == 0) {
			pivotIndex = (arrayLength / 2); // PIVOT INDEX IF ARRAY IS EVEN
		} else {
			pivotIndex = (int) (Math.ceil(arrayLength / 2)); // PIVOT INDEX IF ARRAY IS ODD
		}
		return pivotIndex - 1;
	}

}
