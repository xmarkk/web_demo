package com.th.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {

	@GetMapping("/")
    public String indexPage(Model model) {
		
		model.addAttribute("msg", "test");
        return "index";
    }
	
	@PostMapping("/calculate")
    public String getValuePage(@RequestParam int width,@RequestParam int height,@RequestParam int positionX
    		,@RequestParam int positionY,@RequestParam String direction,@RequestParam String command) {
		String[] commandsplit = command.split(",");
		String checkdirection = "";
		String result = "";
		System.out.println("commandsplit==>"+commandsplit);
		for(String s:commandsplit) {
				System.out.println("s==>"+s);
				if(direction.equalsIgnoreCase("N")) {
					result = calculateposition(s);
				}else if(direction.equalsIgnoreCase("E")) {
					result = calculateposition(s);
				}else if(direction.equalsIgnoreCase("W")) {
					result = calculateposition(s);
				}else {
					result = calculateposition(s);
				}
		}
		System.out.println("result==>"+result);
        return "index";
    }
	
	public String calculateposition(String s) {		
		//int finishpositionX = 0;
		//int finishpositionY = 0;
		String finishdirection = "";
		
		if("R".equalsIgnoreCase(s)) {
			finishdirection ="E";
		}else if("L".equalsIgnoreCase(s)) {
			finishdirection ="N";
		}else {
			finishdirection ="W";
		}
		return finishdirection;
	}

	
}
