package com.bookstoreapp.web.controller;

import java.util.ArrayList;
import java.util.List;

import com.bookstoreapp.model.service.BookStoreService;
import com.bookstoreapp.model.service.BookStoreServiceImpl;
import com.bookstoreapp.web.entities.Book;
import com.bookstoreapp.web.entities.Chapter;
import com.bookstoreapp.web.entities.Publisher;

public class Main {

	public static void main(String[] args) {

		BookStoreService bookStoreService = new BookStoreServiceImpl();

		// persisting object graph
		Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

		Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);

		List<Chapter> chapters = new ArrayList<Chapter>();

		Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
		chapters.add(chapter1);

		Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
		chapters.add(chapter2);

		book.setChapters(chapters);

		bookStoreService.persistObjectGraph(book);

		Book book1 = bookStoreService.retrieveObjectGraph("9781617290459");
		System.out.println(book1);

	}

}
