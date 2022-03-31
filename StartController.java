package edu.multi.boot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

	
	@RequestMapping("/start") //http://localhost:8081/start
	public String start() {
		return "start";
	}
}
