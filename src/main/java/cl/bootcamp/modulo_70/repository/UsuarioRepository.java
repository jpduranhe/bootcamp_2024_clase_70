package cl.bootcamp.modulo_70.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bootcamp.modulo_70.entity.UsuarioEntity;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity,Integer>{

	UsuarioEntity searchByUsername(String email);
}
