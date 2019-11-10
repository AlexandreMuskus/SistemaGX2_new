package br.com.gx2.service;

import java.util.List;

import br.com.gx2.entity.Contato;

public interface ContatoService {

	public boolean create(Contato contato);
	
	public boolean update(Contato contato);
	
	public boolean delete(Contato contato);
	
	public Contato findById(Contato contato);
	
	public List<Contato> listAll();
	
}
