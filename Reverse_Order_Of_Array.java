package com.array_programs_15_05_2025;



import java.util.Scanner;

public class Reverse_Order_Of_Array {

	public static void reverseArray(int arr[]) {
		System.out.println("===========Elements of array============");
		for(int i=0; i<arr.length;i++) {
			arr[i]=+arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("===========reverse array============");
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
	}

	// main class started
	
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
					reverseArray(arr);
				}

			}
			sc.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
