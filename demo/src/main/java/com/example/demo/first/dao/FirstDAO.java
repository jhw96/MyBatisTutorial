package com.example.demo.first.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.first.dto.Book;

@Mapper
public interface FirstDAO{
	public ArrayList<Book> listBook();
	
	public Book getBookById();
}
