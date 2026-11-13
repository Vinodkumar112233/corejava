package com.LabPractice;
//Java: -
//1. Write a Java program to find the Next Greater Element for every element in a given circular array.
//
//Requirements:
//a) For each element, find the first element greater than it while traversing towards the right.
//b) If the traversal reaches the last index, continue searching from the beginning of the array.
//c) Continue the traversal until you reach the current element's position again.
//d) If a greater element is found, replace the current element with that greater element.
//e) If no greater element is found after completing the circular traversal, replace it with -1.
//f) The current element itself must not be considered during the comparison.
//Example 1:
//Input:
//(1,2, 3)
//Output:
//(3,3, -1)
public class Testdemo2 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					arr[i] = arr[j];
					break;
				}
				else {
					arr[i] = -1;
				}
				
			}
		}
		for(int n: arr) {
			System.out.println(n);
		}
		
		

	}

}
