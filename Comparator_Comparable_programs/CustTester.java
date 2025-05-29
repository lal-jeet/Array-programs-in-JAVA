package com.Comparator_Comparable_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustTester {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Customer> cust=new ArrayList<Customer>();
		
		Customer p1=new Customer(121, "Bag", 200.10);
		Customer p2=new Customer(124, "Airpods", 2000.10);
		Customer p3=new Customer(123, "Laptop", 20000.10);
		Customer p4=new Customer(120, "Air Bag", 300.10);
		Customer p5=new Customer(128, "Chopper", 100.10);
//	Adding into Collection
		cust.add(p1);
		cust.add(p2);
		cust.add(p3);
		cust.add(p4);
		cust.add(p5);
		
//	Based on Product ID
		System.out.println("Based on Product ID :");
		Comparator<Customer> cu=((c1,c2)->{
			return c1.getProductId()-c2.getProductId();
		});
		Collections.sort(cust,cu);
	cust.forEach((val)->System.out.println(val));
		
	
//	Based on Product Name
	
	System.out.println("Based on Product Name");
	
	Collections.sort(cust,(Customer c1,Customer c2)->
		{
			return c1.getProductName().compareTo(c2.getProductName());
		}
	);
	
	cust.forEach(System.out::println);
	
// Based on price
	
	System.out.println("Based on product Price  ");
	
	Collections.sort(cust,(c1,c2)->{
		return (int)(c1.getProductPrice()-c2.getProductPrice());
	});
	
	cust.forEach(System.out::println);
	}
}
