package com.array_programs_15_05_2025;

import java.util.Scanner;

public class Print_all_even_elements_and_odd_in_Array {

	public static void reverseArray(int arr[]) {
		System.out.println("===========Elements of array============");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = +arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("===========Print all even elements and odd elements separately from an array============");
		    System.out.print("Even elements are : ");
           for (int i : arr) {
			if(i%2==0) {
				
				System.out.print(" "+i+" ");
			}
		  }
          System.out.println();
		    System.out.print("Odd elements are : ");

           for (int i : arr) {
   			if(i%2!=0) {
   				
   				System.out.print(" "+i+" ");
   			}
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
           //Array Construction
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
