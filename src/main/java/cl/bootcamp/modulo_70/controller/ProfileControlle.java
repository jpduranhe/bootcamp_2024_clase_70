package cl.bootcamp.modulo_70.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileControlle {
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@GetMapping
	public String home(Authentication authentication) {
		return "profile.jsp";
	}

}
