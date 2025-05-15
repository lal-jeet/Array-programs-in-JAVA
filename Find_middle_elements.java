package com.array_programs_15_05_2025;

import java.util.Scanner;

public class Find_middle_elements {

	public static void reverseArray(int arr[]) {
		System.out.println("===========Elements of array============");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = +arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("===========Add the last and first element of a given array.============");

		if(arr.length%2!=0)
			
				{	
		
			System.out.println(arr[arr.length/2]);
				
				}
		else {
			System.out.println(arr[arr.length/2-1] +"        "+arr[arr.length/2]);
		}
		

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

					reverseArray(arr);
				}

			}
			sc.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}