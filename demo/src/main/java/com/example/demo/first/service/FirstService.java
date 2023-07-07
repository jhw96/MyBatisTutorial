package com.example.demo.first.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.first.dao.FirstDAO;
import com.example.demo.first.dto.Book;

@Service
public class FirstService {
	
	@Autowired(required=true)
	private FirstDAO firstDAO;
	
	public ArrayList<Book> listBook() {
		ArrayList<Book> bookList = firstDAO.listBook();
		
		for(int i=0; i<bookList.size(); i++)
			System.out.println(bookList.get(i));
		
		return bookList;
	}

}
