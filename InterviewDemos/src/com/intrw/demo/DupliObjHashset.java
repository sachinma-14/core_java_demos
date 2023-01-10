package com.intrw.demo;

import java.util.HashSet;

import com.intrw.demo.collection.Book;

public class DupliObjHashset {

	public static void main(String[] args) {
		
		HashSet<Book> bookSet = new HashSet<Book>();
		
		Book b1 = new Book("101", "Ja");
		Book b2 = new Book("101", "J");
		Book b3 = new Book("101", "c");
		Book b4 = new Book("101", "Java.");
		
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		
		for(Book b : bookSet) {
			System.out.println(b);
		}
		
		

	}

}
