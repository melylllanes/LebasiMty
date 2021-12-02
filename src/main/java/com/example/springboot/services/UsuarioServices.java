package com.example.springboot.services;


import javax.transaction.Transactional;
import com.example.springboot.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springboot.entity.DistribuidorUsuario;

@Service
@Transactional
public class UsuarioServices {

	@Autowired
	private UsuarioRepository repo;

	

	public void saveUser(DistribuidorUsuario usuario) {
		repo.save(usuario);
	}

}
