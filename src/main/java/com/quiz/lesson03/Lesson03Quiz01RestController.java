package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.domain.RealEstate;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestController {
	// /lesson03/quiz01/1?id=20
	@Autowired
	private RealEstateBO realestateBO;

	@RequestMapping("/1")
	public RealEstate quiz01_1(
			@RequestParam(value = "id") int id
			) {	
		return realestateBO.getRealEstateBYID(id);
	}

	@RequestMapping("/2")
	// /lesson03/quiz01/2?rentpPrice=90
	public List<RealEstate> quiz01_2(
			@RequestParam(value= "rentPrice") Integer rentPrice
			) {
	
		return realestateBO.getRealEstateByRentPrice(rentPrice);
}
	
	// /lesson03/quiz01/3?area=90&price=130000
	@RequestMapping("/3")
	public List<RealEstate> quiz01_3(
			@RequestParam("area") int area,
			@RequestParam(value ="price",required = true) int price){
		
		return realestateBO.getRealEstatesListByAreaPrice(area, price);
	}
}