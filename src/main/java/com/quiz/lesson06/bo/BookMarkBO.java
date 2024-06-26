package com.quiz.lesson06.bo;

import org.springframework.stereotype.Service;

import com.quiz.lesson06.domain.BookMark;

@Service
public class BookMarkBO {
	
	public void addBookMark(BookMark bookMark) {
		bookMarkMapper.insertBookMark(bookMark);
	}
}
