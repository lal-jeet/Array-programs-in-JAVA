package com.comparable_book_sort;

import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) {
		TreeSet<Book> booksort = new TreeSet<Book>();
		booksort.add(new Book("jems goslin", "java"));
		booksort.add(new Book("henri ford", "electrician"));
		booksort.add(new Book("newton", "gravity"));
		booksort.add(new Book("sonu", "selfbook"));
		booksort.add(new Book("hilal", "caption america"));
		
		System.out.println("Based on autor name ....");
		booksort.forEach(System.out::println);
      
	}

}
