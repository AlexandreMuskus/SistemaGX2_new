package br.com.gx2.service;

import java.util.List;

import br.com.gx2.entity.Usuario;

public interface UsuarioService {

	public boolean create(Usuario usuario);
	
	public boolean update(Usuario usuario);
	
	public boolean delete(Usuario usuario);
	
	public Usuario findById(Usuario usuario);
	
	public List<Usuario> listAll();
	
}
