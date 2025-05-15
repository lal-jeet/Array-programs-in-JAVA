package com.array_programs_15_05_2025;

import java.util.Scanner;

public class Search_for_a_given_Element_in_an_Array {

	public static void reverseArray(int arr[],int s) {
		System.out.println("===========Elements of array============");
		for(int i=0; i<arr.length;i++) {
			arr[i]=+arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int f=0;
		System.out.println("===========Search of given Element in  array============");
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==s) {
				f=1;
				System.out.print(arr[i]+" ");
			}
			
		}
		if(f==0) {
			System.out.println("Element is not present");
		}
		System.out.println();
		
		
		
	}
	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size of Array :");

			int size = sc.nextInt();

			if (size < 0) {
				System.err.println("Error...Negative size");
			} else {
//				 Array Construction
				int arr[] = new int[size];

				if (size == 0) {
					System.err.println("Error...Array size is 0");
				} else {
					System.out.println("Enter " + size + " elements :");
					for (int i = 0; i < arr.length; i++) {
						System.out.println("Enter element at index " + i + " :");
						arr[i] = sc.nextInt();
					}
					System.out.println("Enter searching element:");
					int s= sc.nextInt();
					reverseArray(arr,s);
				}

			}
			sc.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}