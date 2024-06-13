package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.mapper.StoreMapper;

@Service
public class StoreBO {

	// input:X
	//output:List<store>
	@Autowired
	private StoreMapper storeMapper;

	public List<Store> getStoreList(){
		// List<Store> storeList = storeMapper.selectStoreList();
		// return storeList; // 컨트롤러한테 전달
		return storeMapper.selectStoreList(); // storeMapper.selectStoreList() 먼저 수행되고
		// 나중에 리턴 컨트롤러한테 전달
	}
}
