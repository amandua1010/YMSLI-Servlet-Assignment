package com.bookstoreapp.model.persistance;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bookstoreapp.model.persistance.factory.HibernateSessionFactory;
import com.bookstoreapp.web.entities.Book;
import com.bookstoreapp.web.entities.Chapter;
import com.bookstoreapp.web.entities.Publisher;

public class BookDaoImplHibt implements BookDao {

	private SessionFactory factory;

	public BookDaoImplHibt() {
		factory = HibernateSessionFactory.getSessionFactory();
	}

	private Session getSession() {
		return factory.openSession();
	}

	public void persistObjectGraph(Book book) {

		Session session = getSession();
		Transaction transaction = session.getTransaction();

		Publisher publisher = book.getPublisher();
		
		List<Chapter> chapters = book.getChapters();

		try {
			
			transaction.begin();

			session.save(book);
			session.save(chapters);
			session.save(publisher);

			transaction.commit();
			
		} 
		
		catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} 
		
		finally {
			
			if (session != null) {
				session.close();
			}
			
		}

	}

	public Book retrieveObjectGraph(String isbn) {
		
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		
		Book book = null;
		
		try {
			
			transaction.begin();

			book = session.get(Book.class, isbn);
			
			Publisher publisher = book.getPublisher();
			
			List<Chapter> chapters = book.getChapters();

			transaction.commit();
			
		} 
		
		catch (HibernateException e) {
			transaction.rollback();
		} 
		
		finally {
			
			if (session != null) {
				session.close();
			}
			
		}
		
		return book;
		
	}

}
