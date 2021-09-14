package com.bookstoreapp.model.service;

import com.bookstoreapp.model.persistance.BookDao;
import com.bookstoreapp.model.persistance.BookDaoImplHibt;
import com.bookstoreapp.web.entities.Book;

public class BookStoreServiceImpl implements BookStoreService {

	private BookDao bookDao;

	public BookStoreServiceImpl() {
		bookDao = new BookDaoImplHibt();
	}

	public void persistObjectGraph(Book book) {
		bookDao.persistObjectGraph(book);		
	}

	public Book retrieveObjectGraph(String isbn) {
		return bookDao.retrieveObjectGraph(isbn);
	}

}
