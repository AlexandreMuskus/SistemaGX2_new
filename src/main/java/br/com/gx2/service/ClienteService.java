package br.com.gx2.service;

import java.util.List;

import br.com.gx2.entity.Cliente;

public interface ClienteService {

	public boolean create(Cliente cliente);
	
	public boolean update(Cliente cliente);
	
	public boolean delete(Cliente cliente);
	
	public Cliente findById(Cliente cliente);
	
	public List<Cliente> listAll();
	
}
