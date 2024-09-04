package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Book {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookId;
	private String bookName;
	private String bookPrice;
	
	
}
