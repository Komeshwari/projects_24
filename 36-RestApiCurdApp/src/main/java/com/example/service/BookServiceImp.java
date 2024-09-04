package com.example.service;

import java.util.List;

import com.example.entity.Book;

public interface BookServiceImp {
public String upsertBook(Book book);
public List<Book> getAllBook();
public String deleteBook(Integer bookId);
}
