package cl.bootcamp.modulo_70.service;

import cl.bootcamp.modulo_70.model.Usuario;

public interface UsuarioService {

	Usuario getByUsername(String username);
	int crear(Usuario usuario);
	int editar(Usuario usuario);
}
