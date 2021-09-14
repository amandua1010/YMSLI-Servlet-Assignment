package com.bookstoreapp.model.service;

import com.bookstoreapp.web.entities.Book;

public interface BookStoreService {

	public void persistObjectGraph(Book book);

	public Book retrieveObjectGraph(String isbn);

}
