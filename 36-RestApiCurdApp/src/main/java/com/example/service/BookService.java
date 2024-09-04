package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Book;
import com.example.repo.BookRepository;

@Service
public class BookService implements BookServiceImp{

	private BookRepository repo;
	
	public BookService(BookRepository repo)
	{
		this.repo=repo;
	}

	@Override
	public String upsertBook(Book book) {
Integer bookId = book.getBookId();
		
		System.out.println(book);
		
		repo.save(book);
		
		System.out.println(book);

		if (bookId == null) {
			return "Record Inserted";
		} else {
			return "Record Updated";
		}
		
	}

	@Override
	public List<Book> getAllBook() {
		
		return repo.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repo.deleteById(bookId);
		return bookId+"deleted";
	}
	
	
}
