package br.com.gx2.service;

import java.util.List;

import br.com.gx2.entity.Cidade;

public interface CidadeService {

	public boolean create(Cidade cidade);
	
	public boolean update(Cidade cidade);
	
	public boolean delete(Cidade cidade);
	
	public Cidade findById(Cidade cidade);
	
	public List<Cidade> listAll();
	
}
