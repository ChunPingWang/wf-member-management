package org.wf192.webcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/form")
	public String form(Model model){
		WFMember scoutMember = new WFScout();
		model.addAttribute("scoutMember", scoutMember);
		return "form";
	}

	@PostMapping("/add")
	public String add(@ModelAttribute WFMember scoutMember, Model model) {
		model.addAttribute("scoutMember", scoutMember);
		return "add";
	}

}
