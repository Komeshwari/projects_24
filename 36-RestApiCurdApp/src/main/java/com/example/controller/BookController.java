package com.example.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Book;
import com.example.service.BookServiceImp;

@Controller
public class BookController {

	private static final int ResponseEntity = 0;
	private BookServiceImp bookService;
	
	public BookController(BookServiceImp bookService)
	{
		this.bookService=bookService;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveAllBooks(@RequestBody Book book)
	{
		String upsertBook = bookService.upsertBook(book);
		return new ResponseEntity<>(upsertBook,HttpStatus.CREATED);
	}
	@GetMapping("/ret")
	public ResponseEntity<List<Book>>  getBooks()
	{
	List<Book> allBooks = bookService.getAllBook();
	return new ResponseEntity<>(allBooks,HttpStatus.OK);
	}//String deleteBook(Integer bookId);
	@DeleteMapping("/delete/{}")
	public ResponseEntity<String> deleteOneBook(@PathVariable Integer bookId)
	{
		bookService.deleteBook(bookId);
		return new ResponseEntity<>("Sucessfully Deleted....",HttpStatus.OK);
	}
	
}
