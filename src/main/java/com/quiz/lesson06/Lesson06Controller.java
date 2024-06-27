package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.lesson06.bo.BookMarkBO;
import com.quiz.lesson06.domain.BookMark;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
	
	
	@Autowired
	private BookMarkBO bookmarkBO;
	// http://localhost:8080/lesson06/add-bookmark-view
	@GetMapping("/add-bookmark-view")
	public String addBookMarkView() {
		return "lesson06/addBookmark";
	}
	// AJAX가 하는 요청
	// 즐겨찾기 추가 로직
	@ResponseBody
	@PostMapping("/add-bookmark")
	public Map<String,Object> addBookmark(
			@RequestParam("name") String title,
			@RequestParam("url") String url) {
		
		//  db insert
		bookmarkBO.addBookmark(title, url);
		
		// 성공 JSON
		// {"code":200, "result":"성공"}
		Map<String,Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("result", "성공");
		return result; // JSON String
	}
	
	@GetMapping("/bookmark-list-view")
	public String bookmarkListView(Model model) {
		// http://localhost:8080/lesson06/bookmark-list-view
		// db select => List<BookMark>
		List<BookMark> bookmarkList = bookmarkBO.getBookMarkList();
		// model 담기
		model.addAttribute("bookmarkList", bookmarkList);
		return "lesson06/bookmarkListView";
	}
}
