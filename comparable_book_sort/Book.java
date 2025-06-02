package com.comparable_book_sort;

public record Book (String name, String Author) implements Comparable<Book> {

	@Override
	public int compareTo(Book o) {
		return this.name().compareTo(o.name());
	}

	
}
