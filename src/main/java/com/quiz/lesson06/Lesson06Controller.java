package com.quiz.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
	

	
	@GetMapping("/add-bookmark-view")
	public String addBookMarkView() {
		return "lesson06/addBookmark";
	}

	@ResponseBody
	@PostMapping("/add-bookmark")
	public String addUser(
			@RequestParam("title") String title,
			@RequestParam("url") String url) {
		
		return " 성공";
	}
	
	@GetMapping("/bookmark-list-view")
	public String bookmarkListView() {
		return "lesson06/bookmarkListView";
	}
}
