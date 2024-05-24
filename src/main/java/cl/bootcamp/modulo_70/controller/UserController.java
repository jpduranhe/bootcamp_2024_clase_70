package cl.bootcamp.modulo_70.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.bootcamp.modulo_70.model.Usuario;
import cl.bootcamp.modulo_70.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UserController {
	
	private final UsuarioService usuarioService;
	
	public UserController(UsuarioService usuarioService) {
		this.usuarioService=usuarioService;
	}
	
	@Secured({"ROLE_ADMIN","ROLE_MANAGER"})
	@GetMapping("/form")
	public String formGet(@RequestParam(defaultValue="false") boolean creado ) {		
	
		return "usuario-form.jsp";
	}
	@Secured({"ROLE_ADMIN","ROLE_MANAGER"})
	@PostMapping("/form")
	public String formPost(@ModelAttribute Usuario usuario) {
		
		int id =usuarioService.crear(usuario);
		int resultado=(id>0)?1:0;
		return "redirect:/usuario/form?creado="+resultado;
	}
}
