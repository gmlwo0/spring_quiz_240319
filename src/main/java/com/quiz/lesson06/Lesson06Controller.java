package com.quiz.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {

	@GetMapping("/add-bookmark-view")
	public String addBookMarkView() {
		return "lesson06/addBookmark";
	}
	@GetMapping("/bookmark-list-view")
	public String bookmarkListView() {
		return "lesson06/bookmarkListView";
	}
}
