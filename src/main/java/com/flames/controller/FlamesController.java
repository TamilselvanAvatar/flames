package com.flames.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.flames.model.FlameAttributes;
import com.flames.service.Selector;

@Controller
@SessionAttributes("END")
public class FlamesController {
	@Autowired
	public Selector selector;

	@GetMapping(value = "/flame")
	public String showPage(@ModelAttribute("flameAttribute") FlameAttributes flameAttribute) {
		return "flames";
	}

	@PostMapping(value = "/result")
	public String result(@ModelAttribute("flameAttribute") FlameAttributes flameAttribute, ModelMap model,
			SessionStatus status) {
		String res1 = selector.letterSelection(flameAttribute);
		String maleName = flameAttribute.getMaleName();
		String femaleName = flameAttribute.getFemaleName();

		String male = (maleName.charAt(0) + "").toUpperCase() + maleName.subSequence(1, maleName.length());
		String female = (femaleName.charAt(0) + "").toUpperCase() + femaleName.subSequence(1, femaleName.length());
		if ("F".equals(res1)) {
			model.addAttribute("res", "in Friends");
		}
		if ("L".equals(res1)) {
			model.addAttribute("res", " a Lovers");
		}
		if ("A".equals(res1)) {
			model.addAttribute("res", "in Affection");
		}
		if ("M".equals(res1)) {
			model.addAttribute("res", "end in Marriage");
		}
		if ("E".equals(res1)) {
			model.addAttribute("res", "Enemy");
		}
		if ("S".equals(res1)) {
			model.addAttribute("res", "Sibilings");
		}
		if ("Same".equals(res1)) {
			model.addAttribute("res", "Same name , so Change");
		}

		model.addAttribute("maleName", male);
		model.addAttribute("femaleName", female);
		model.addAttribute("login", res1);
		status.setComplete();
		return "Result";

	}

}
