package com.example.demo.main.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.main.dto.Book;
import com.example.demo.main.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService firstService;

	@GetMapping("/test")
	public String test() {
		System.out.println("test");

		return "Hello World!";
	}

	// 책 리스트
	@GetMapping("/bookList")
	public ArrayList<Book> bookList() {

		return firstService.bookList();
	}

	// 책 만들기
	@PostMapping("/insertBook")
	public Book insertBook(@RequestParam Map<String, String> paramMap) {
		
		firstService.insertBook(paramMap);
		Book book = firstService.getBookById(Integer.parseInt(paramMap.get("num")));

		return book;
	}
	
	// 책 수정
	@PostMapping("/updateBookById")
	public Book updateBookById(@RequestParam Map<String, String> paramMap) {
		int num = Integer.parseInt(paramMap.get("num"));
		
		Book before = firstService.getBookById(num);
		System.out.println("before : " + before);
		
		firstService.updateBookById(paramMap);
		
		Book after = firstService.getBookById(num);
		System.out.println("after : " + after);
		
		
		return after;
	}

}
