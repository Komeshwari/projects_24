package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Book;

public interface BookRepository extends JpaRepository<Book,Serializable> {

}
