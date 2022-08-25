package syk22.askName.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NameController {

	@RequestMapping("hello")
	@ResponseBody
	public String askMyName(@RequestParam(name="location") String locatio,
			@RequestParam(name="name") String name){
		return "Welcome to the " + locatio+ " " + name +"!";
	}
}
