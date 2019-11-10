package br.com.gx2.service;

import java.util.List;

import br.com.gx2.entity.Categoria;

public interface CategoriaService {

	public boolean create(Categoria categoria);
	
	public boolean update(Categoria categoria);
	
	public boolean delete(Categoria categoria);
	
	public Categoria findById(Categoria categoria);
	
	public List<Categoria> listAll();
	
}
