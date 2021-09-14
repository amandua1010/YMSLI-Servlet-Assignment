package com.bookstoreapp.model.persistance;

import com.bookstoreapp.web.entities.Book;

public interface BookDao {

	public void persistObjectGraph(Book book);

	public Book retrieveObjectGraph(String isbn);

}
