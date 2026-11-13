package com.LabPractice;


//2.Write a Java program to sort the array of integers using selection sorting algorithm

public class kthLargest {

	public static void main(String[] args) {
		
		int[] arr = {4,5,7,1,3};
		int k = 4;
		
		for(int i = 0;i<arr.length;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			
			
		}
		
		System.out.println(arr[k-1]);
		
		
		
		
		
		

	}

}
