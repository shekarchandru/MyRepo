package com.rajashis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rajashis.pojo.HumanID;

@Controller
@RequestMapping("/human")
public class HumanIDController {

	@RequestMapping("/IDverification-form")
	public String showVerificationform(Model model) {
		HumanID humid= new HumanID();
		model.addAttribute("humidverfi", humid);
		return "IDverification-form2";
		
	}
}
