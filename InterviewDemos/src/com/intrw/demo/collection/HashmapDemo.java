package com.intrw.demo.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {

		Book b1 = new Book("101", "Java");
		Book b2 = new Book("101", "Javaa");
		Book b3 = new Book("101", "Javadjfhd");
		Book b4 = new Book("101", "Java4");

		HashMap<Book, String> bookMap = new HashMap<Book, String>();

		bookMap.put(b1, "book1");
		bookMap.put(b2, "book2");
		bookMap.put(b3, "book3");
		bookMap.put(b4, "book4");

		for (Map.Entry<Book, String> entry : bookMap.entrySet()) {
			System.out.println(entry.getKey() + "==" +entry.getValue());
		}

	}

}
