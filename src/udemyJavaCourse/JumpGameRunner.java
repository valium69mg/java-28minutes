package udemyJavaCourse;


public class JumpGameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2,3,1,1,4};
		int[] list2 = {3,2,1,0,4};
		int[] list3 = {0};
		System.out.println(canJump(list));

	}
	
	public static boolean canJump(int[] nums) {
		while (true) {
			// CHECK IF THE ARRAY HAS MORE THAN 1 ELEMENT
			if (nums.length == 0) { // DOES NOT HAVE A ROUTE
				return false;
			}
			
			if (nums.length == 1 & nums[0] == 0) {
				return true;
			}
			
			if (nums.length == 1) {
				return true;
			}
			
			int[] prevNums = nums; // SAVE PREVIOUS VALUE
		
			nums = findClosestStepToEnd(nums); // CURRENT VALUE
			
			if (nums.length == prevNums.length) { // CHECK IF THE PROGRAM FOUND A ROAD
				return false;
			}
			
			
			
		}
    }
	
	public static int[] findClosestStepToEnd(int[] nums) { // FIND LONGEST JUMP TO END OF AN ARRAY AND RETURNS THAT ARRAY WITHOUT THE JUMP
		int start =  nums.length - 2;
		int longestJumpToEnd = nums.length -1;
		
		for(int i = start; i >= 0 ; i--) { // EMPIEZA DESDE EL PENULTIMO HASTA EL PRIMERO
			int stepsToEnd = (nums.length - 1) - i;
			if (nums[i] >= stepsToEnd) { // IF PARA VER SI PODEMOS LLEGAR AL FINAL DESDE LA POSICION ACTUAL
				longestJumpToEnd = i;
			}			
		}
		return getSlice(nums,0,longestJumpToEnd + 1);
	}
	
	public static int[] getSlice(int[] array, int startIndex, int endIndex)   {   
		// Get the slice of the Array   
		int[] slicedArray = new int[endIndex - startIndex];   
		//copying array elements from the original array to the newly created sliced array  
		for (int i = 0; i < slicedArray.length; i++)   
		{   
		slicedArray[i] = array[startIndex + i];   
		}   
		//returns the slice of an array  
		return slicedArray;   
	}   
	

}
