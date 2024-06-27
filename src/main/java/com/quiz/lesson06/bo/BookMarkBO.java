package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.domain.BookMark;
import com.quiz.lesson06.mapper.BookMarkMapper;

@Service
public class BookMarkBO {
	
	@Autowired
	private BookMarkMapper bookmarkMapper;
	//  input:X
	// output:List<BookMark>

	public List<BookMark> getBookMarkList(){
		return bookmarkMapper.selectBookMarkList();
		
	}
	
	//  input: name,url
	// output: X
	public void addBookmark(String name, String url) {
		bookmarkMapper.insertBookmark(name, url);
		
	}
}
