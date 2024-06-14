package com.quiz.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@Service
public class RealEstateBO {

	@Autowired
	public RealEstateMapper realestateMapper;
	
	public RealEstate getRealEstateBYID(int id) {
		return realestateMapper.selectRealEstateBYID(id);
	}
	public RealEstate getRealEstateByRentPrice(Integer rentPrice) {
		return realestateMapper.selectRealEstateByRentPrice(rentPrice);
	}
}
