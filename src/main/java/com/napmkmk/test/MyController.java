package com.napmkmk.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value = "/member" )
	public String member() {
		
		return "member";
	}
	
	@RequestMapping(value = "/list")
	public String list() {
		
		return "list";
	}
	
	@RequestMapping(value = "/content")
	public String content() {
		
		return "board/content"; // WEB-INF/views/board/content.jsp 불러 오려는 주소 호출
	}
	
	@RequestMapping(value = "/view")
	public String view(Model model) {  //model import해야함.
		
		model.addAttribute("name", "홍길동"); // String name = "홍길동" 숫자 문자 아무거나 올수 있다.
		
		return "board/view"; 
	}
	
	@RequestMapping(value = "/reply")
	public ModelAndView reply() {  // 잘사용하지 않음.
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "홍길동");  // String name = "홍길동"
		mv.setViewName("board/reply");
		return mv; 
	}
}
