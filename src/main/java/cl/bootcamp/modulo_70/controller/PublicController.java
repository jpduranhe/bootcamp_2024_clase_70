package cl.bootcamp.modulo_70.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PublicController {

	@GetMapping("/public")
	public String publicGet() {
		return "public.jsp";
	}
}
