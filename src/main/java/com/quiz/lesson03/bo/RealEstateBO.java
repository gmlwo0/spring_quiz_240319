package com.quiz.lesson03.bo;

import java.util.List;

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
	public List<RealEstate> getRealEstateByRentPrice(Integer rentPrice) {
		return realestateMapper.selectRealEstateByRentPrice(rentPrice);
	}
	
	//  input: area,price
	// output: List<RealEstate>
	public List<RealEstate> getRealEstatesListByAreaPrice(int area, int price){
		return realestateMapper.selectRealEstatesListByAreaPrice(area,price);
	}
	
	//  input: RealEstate
	// output: 성공한 행의 개수(int)
	public int addRealEstate(RealEstate realEstate) {
		return realestateMapper.insertRealEstate(realEstate);
	}
	
//	id
//	realtorId
//	address
//	area
//	type
//	price
//	rentPrice
//	createdAt
//	updatedAt
	public int addRealEstateAsField (int realtorId, String address,
			int area, String type, int price, int rentPrice) {
		
		return realestateMapper.insertRealEstateAsField(realtorId, address, area, type, price, rentPrice);
				
	}

}
