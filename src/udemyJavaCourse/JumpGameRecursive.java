package udemyJavaCourse;

public class JumpGameRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2,3,1,1,4};
		int[] list2 = {3,2,1,0,4};
		int[] list3 = {1};
		//System.out.println(canJump(list));
		//System.out.println(canJump(list2));
		System.out.println(canJump(list3));

	}
	
	public static boolean canJump(int[] nums) {
		int start =  nums.length - 1;
		while (true) {
			// CHECK IF THE ARRAY HAS MORE THAN 1 ELEMENT
			if (nums.length == 0) { // DOES NOT HAVE A ROUTE
					return false;
			}
						
			if (nums.length == 1 & nums[0] == 0) {
					return true;
			}
			
			if (nums.length == 1 & nums[0] == 1) {
				return true;
			}
						
			
			int indexOfLongestJump = takeLongestJump(nums,start);
			
			if (indexOfLongestJump == -1) { // THE ALGORITHM DID NOT FOUND A JUMP TO THE END
				return false;
			} else {
				// IT FOUND A STEP
				start = indexOfLongestJump;
				
			}
			
			if (start == 0) {
				return true;
			}
		}
	}
	
	public static int takeLongestJump(int[] nums,int start) {
		int longestJumpToEnd = -1;
		int maxSteps = 0;
		for(int i = start; i >= 0 ; i--) { // EMPIEZA DESDE EL PENULTIMO HASTA EL PRIMERO
			int stepsToEnd = start - i;
			if (nums[i] >= stepsToEnd && stepsToEnd != 0) { // IF PARA VER SI PODEMOS LLEGAR AL FINAL DESDE LA POSICION ACTUAL
				longestJumpToEnd = i;
				maxSteps = stepsToEnd;
			}		
		}
		if (longestJumpToEnd != -1) {
			System.out.println("Current position: Value of {" + nums[longestJumpToEnd] + "} " + " at index: {" + longestJumpToEnd + "}");
			System.out.println("Steps to end: " + maxSteps);
			System.out.println("Jump to index: " + (start));
			System.out.println("==========");
		}
		
		return longestJumpToEnd;
	}
	
}
