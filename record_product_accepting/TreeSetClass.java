package com.record_product_accepting;

import java.util.TreeSet;

public class TreeSetClass {
	
	
	
	public static void main(String[] args) {
		
		TreeSet<Product> pr=new TreeSet<Product>((p1,p2)->p1.pid()-p2.pid());
		
		pr.add(new Product(121, "Shoap"));
		pr.add(new Product(23, "Apple"));
		pr.add(new Product(59, "Jeep"));
		System.out.println("Based on product id Ascending Order");
		pr.forEach(System.out::println);
		System.out.println();
		
	TreeSet<Product> pr1=new TreeSet<Product>((p1,p2)->p2.pid()-p1.pid());
		pr1.addAll(pr);
		System.out.println("Based on product id Decending  Order");
		pr1.forEach(System.out::println);
		System.out.println();
		
     TreeSet<Product> pr2=new TreeSet<Product>((p1,p2)->p1.pname().compareTo(p2.pname()));
		pr2.addAll(pr1);
		System.out.println("Based on product name Ascending Order");
		pr2.forEach(System.out::println);
		System.out.println();
		
	    TreeSet<Product> pr3=new TreeSet<Product>((p1,p2)->p2.pname().compareTo(p1.pname()));
			pr3.addAll(pr1);
			System.out.println("Based on product name Decending Order");
			pr3.forEach(System.out::println);
			System.out.println();
	
	
	}

}
