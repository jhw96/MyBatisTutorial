package com.example.demo.main.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.main.dao.BookDAO;
import com.example.demo.main.dto.Book;

@Service
public class BookService {
	
	@Autowired(required=true)
	private BookDAO firstDAO;
	
	
	// 책 리스트
	public ArrayList<Book> bookList() {
		ArrayList<Book> bookList = firstDAO.bookList();
		
		for(int i=0; i<bookList.size(); i++)
			System.out.println(bookList.get(i));
		
		return bookList;
	}
	
	// 책 넣기
	public void insertBook(Map<String, String> paramMap) {
		int num = Integer.parseInt(paramMap.get("num"));
		String title = paramMap.get("title");
		String author = paramMap.get("author");
		String detail = paramMap.get("detail");
		
		// TODO: 1.Key 값에 대한 예외처리 2.ISNERT 시 KEY 값을 순차적으로 넣을 수 있게 3.INSERT한 KEY 값을 가져올 수 있도록 
		
		Book book = new Book();
		book.setNum(num);
		book.setTitle(title);
		book.setAuthor(author);
		book.setDetail(detail);
		
		firstDAO.insertBook(book);
	}
	
	
	// 책 업데이트
	public void updateBookById(Map<String,String> paramMap) {
		int num = Integer.parseInt(paramMap.get("num"));
		String title = paramMap.get("title");
		String author = paramMap.get("author");
		String detail = paramMap.get("detail");
		
		Book book = new Book();
		book.setNum(num);
		book.setTitle(title);
		book.setAuthor(author);
		book.setDetail(detail);
		
		firstDAO.updateBookById(book);
	}
	
	// 책 하나 조회
	public Book getBookById(int num) {
		return firstDAO.getBookById(num);
	}
	

}
