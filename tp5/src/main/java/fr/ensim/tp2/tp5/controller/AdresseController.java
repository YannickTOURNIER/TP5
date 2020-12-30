package fr.ensim.tp2.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdresseController {
	@GetMapping("/adresse")
	public String adresse(Model model) {
		return "adresse";
	}
}
