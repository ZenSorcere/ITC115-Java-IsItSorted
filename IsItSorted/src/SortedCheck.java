//*******************************************************************
//	ITC 115 - Assignment 8 - isSorted method
//  Write a static method named isSorted that accepts an array of doubles as
//  a parameter and returns true if the list is in sorted (nondecreasing) order
//  and false otherwise. Assume the array has at least one element. A
//  one-element array is considered to be sorted.
//
//	By: Mike Gilson
//	Date: 2/29/2020
//*******************************************************************

public class SortedCheck {

	public static void main(String[] args) {
//  create test arrays identical to the PracticeIt tests.
		double[] test1 = {16.1, 12.3, 22.2, 14.4};
		double[] test2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		double[] test3 = {42.0};
		double[] test4 = {42.0, 27.0};
		double[] test5 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2, 7.8};
		
//  run test arrays through isSorted method, with expected result in comments.		
		System.out.println("Is test1 Sorted? " + isSorted(test1)); // false
		System.out.println("Is test2 Sorted? " + isSorted(test2)); // true
		System.out.println("Is test3 Sorted? " + isSorted(test3)); // true	
		System.out.println("Is test4 Sorted? " + isSorted(test4)); // false
		System.out.println("Is test5 Sorted? " + isSorted(test5)); // false	
	} // end main method

//  method that returns a boolean result, with an array of doubles as a parameter.
	public static boolean isSorted(double[] list1) {
		
//  initialize variable and create if statement that returns true if array length is only 1.
		boolean sorted = false;
			if (list1.length==1) {
				sorted = true;
			} // end if statement
			
/*  a for loop will go through the length of the array, starting with the 0 index and 
 *  an if statement will compare the index with the next index in the array. if the 
 *  first index ("i") is larger than the next one ("i+1"), then it is not sorted, and
 *  will return false. If the for loop goes through the entire array without triggering
 *  the if condition, the sorted gets set to true and is returned.
 */
			for (int i = 0; i < list1.length-1; i++) {
				if (list1[i] >= list1[i+1]) {
					sorted = false;
					return sorted;
				} // end if statement
				sorted = true;
			} // end for loop
			
			return sorted;
	} // end isSorted method
	
} // end SortedCheck class
	
	
