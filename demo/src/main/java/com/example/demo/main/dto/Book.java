package com.example.demo.main.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Book {
	private int num;			// 키 값
	private String author;		// 작가
	private String title;		// 제목
	private String detail;		// 설명

}
