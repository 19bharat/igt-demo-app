package com.igt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IGTController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

}
