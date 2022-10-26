package com.napmkmk.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value = "/member" )
	public String member() {
		
		return "member";
	}

}
