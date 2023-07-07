package com.example.demo.first.dto;

import lombok.Data;

@Data
public class Book {
	private int isbn;			// 키 값
	private String author;		// 작가
	private String title;		// 제목
	private String detail;		// 설명

}
