package com.coffeesoft.springboot.backend.apirest.models.services;

import java.util.List;

import com.coffeesoft.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public Page<Cliente> findAll(Pageable pageable);

	public Cliente save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Long id);

}
