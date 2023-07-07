package com.example.demo.first.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.first.dto.Book;
import com.example.demo.first.service.FirstService;

@RestController
public class FirstController {
	
	@Autowired
	FirstService firstService;

	@GetMapping("/test")
	String test() {
		System.out.println("test");

		return "Hello World!";
	}
	
	@GetMapping("/bookList")
	ArrayList<Book> bookList(){
		
		return firstService.listBook();
	}

}
