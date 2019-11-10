package br.com.gx2.service.imp;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.UsuarioDAO;
import br.com.gx2.dao.imp.UsuarioDAOImp;
import br.com.gx2.entity.Usuario;
import br.com.gx2.service.UsuarioService;

public class UsuarioServiceImp implements UsuarioService {

//	@Override
	public boolean create(Usuario usuario) {
		try {
			UsuarioDAO dao = new UsuarioDAOImp();
			dao.create(usuario);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

//	@Override
	public boolean update(Usuario usuario) {
		try {
			UsuarioDAO dao = new UsuarioDAOImp();
			dao.update(usuario);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public boolean delete(Usuario usuario) {
		try {
			UsuarioDAO dao = new UsuarioDAOImp();
			dao.delete(usuario);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public Usuario findById(Usuario usuario) {
		Usuario response = new Usuario();
		try {
			UsuarioDAO dao = new UsuarioDAOImp();
			response = dao.findById(usuario.getId());
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
	public List<Usuario> listAll() {
		List<Usuario> response = new ArrayList<Usuario>();
		try {
			UsuarioDAO dao = new UsuarioDAOImp();
			response = dao.listAll();
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
