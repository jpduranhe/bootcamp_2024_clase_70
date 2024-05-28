package cl.bootcamp.modulo_70.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.modulo_70.model.Usuario;
import cl.bootcamp.modulo_70.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsurioRestController {

	private final UsuarioService usuarioService;
	public UsurioRestController(UsuarioService usuarioService) {
		this.usuarioService=usuarioService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> usuarioGet(@PathVariable int id) {	
		
		Usuario usuario= usuarioService.getById(id);
		
		return ResponseEntity.ok(usuario);
	}
	@PostMapping
	public ResponseEntity<Integer> formPost(@RequestBody Usuario usuario) {
		
		int id =usuarioService.crear(usuario);
		int resultado=(id>0)?1:0;
		return ResponseEntity.created(URI.create("/api/usuario/"+id))
				.body(id);
	}
}
