package com.sistema.ecommerce.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.ecommerce.security.entity.Rol;
import com.sistema.ecommerce.security.enums.RolNombre;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
	 Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
