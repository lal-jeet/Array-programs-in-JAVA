package com.ArrayList_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElement {
	
public static Object retriveElements(ArrayList<Object> elements,int ind) {
	
	if(elements.size()<ind || ind<0)
	{
		try
		{
			throw new IndexOutOfBoundsException("Index not Available!");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	
	return elements.get(ind);
	
	
}
	public static void main(String[] args) {
		
		ArrayList<Object> obj=new ArrayList<Object>();
		System.out.println("Enter the number of elements you want to add to the list: ");
Scanner sc= new Scanner(System.in);
int noItems=sc.nextInt();
		for(int i=0; i<noItems; i++)
		{
			
			System.out.println("Enter Element "+(i+1)+" : ");
			String str=sc.next();
			
			obj.add(str);
		}
		
		System.out.println("Enter the index you want to retrieve:");
		int index=sc.nextInt();
		Object value = retriveElements(obj, index);
		System.out.println("Element at index "+index+": "+value);
		
	}

}
