package com.quiz.lesson06.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMarkMapper {
	
	public void insertBookMark(
			@Param("title")String title,
			@Param("url")String url);
	
}
