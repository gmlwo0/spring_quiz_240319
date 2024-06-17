package com.quiz.lesson02.mapper;

import java.util.List;

import com.quiz.lesson02.domain.Store;

@Mapper
public interface StoreMapper {

	//  input: X
	// output:List<Store>
	public List<Store> selectStoreList();
}
