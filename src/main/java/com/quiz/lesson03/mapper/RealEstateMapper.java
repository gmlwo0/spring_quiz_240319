package com.quiz.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {
	
	public RealEstate selectRealEstateBYID(int id);
	public RealEstate selectRealEstateByRentPrice(Integer rentPrice);
}
