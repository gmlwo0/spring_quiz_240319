package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // html view
public class Lesson01Quiz03Controller {
	// http://localhost:8080/lesson01/quiz03/1
	@RequestMapping("/lesson01/quiz03/1")
	public String quiz03_1() {
		// @ResponseBody가 아닌 상태로 return String을 하면
		// ViewResolver에 의해 리턴된 HTML 경로를 찾아 화면에 구성된다.
		
		return "lesson01/quiz03"; // html 경로
	}
}
