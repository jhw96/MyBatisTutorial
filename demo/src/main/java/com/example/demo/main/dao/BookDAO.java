package com.example.demo.main.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.main.dto.Book;

@Mapper
public interface BookDAO{
	public ArrayList<Book> bookList();
	
	public Book getBookById(int num);
	
	public void insertBook(Book book);
}
