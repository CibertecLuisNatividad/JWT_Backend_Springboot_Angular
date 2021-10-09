package com.sistema.ecommerce.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.ecommerce.security.entity.Rol;
import com.sistema.ecommerce.security.enums.RolNombre;
import com.sistema.ecommerce.security.repository.RolRepository;

@Service
@Transactional
public class RolService {

	@Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
