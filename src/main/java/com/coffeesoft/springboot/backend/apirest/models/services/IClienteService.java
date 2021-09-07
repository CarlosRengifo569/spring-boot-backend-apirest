package com.coffeesoft.springboot.backend.apirest.models.services;

import java.util.List;

import com.coffeesoft.springboot.backend.apirest.models.entity.Cliente;
import com.coffeesoft.springboot.backend.apirest.models.entity.Factura;
import com.coffeesoft.springboot.backend.apirest.models.entity.Producto;
import com.coffeesoft.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public Page<Cliente> findAll(Pageable pageable);

	public Cliente save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Long id);

	public List<Region> findAllRegiones();

	public Factura findFacturaById(Long id);

	public Factura saveFactura(Factura factura);

	public void deleteFacturaById(Long id);

	public List<Producto> findProductoByNombre(String term);

}
