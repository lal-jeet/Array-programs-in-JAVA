package com.Comparator_Comparable_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product implements Comparable<Product> {
	private int productNumber;
	private String productName;
	private double productPrice;



Product(int productNumber, String productName, double productPrice) {
	super();
	this.productNumber = productNumber;
	this.productName = productName;
	this.productPrice = productPrice;
}



@Override
public int compareTo(Product o) {
	return this.productName.compareTo(o.productName);
}



@Override
public String toString() {
	return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice=" + productPrice
			+ "]";
}




}


public class ProductSortUsingComparable
{
	public static void main(String[] args) {
		
		ArrayList<Product> l=new ArrayList();
		Product p1=new Product(1, "camera", 985);
		Product p2=new Product(3, "laptop", 988);
		Product p3=new Product(5, "apple", 98553);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		
		
		
		Collections.sort(l);
		
		for (Product product : l) {
			System.out.println(product);
		}
	}
}