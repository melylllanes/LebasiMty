package com.example.springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.entity.DistribuidorUsuario;

public interface UsuarioRepository  extends CrudRepository<DistribuidorUsuario, Long> {

}
