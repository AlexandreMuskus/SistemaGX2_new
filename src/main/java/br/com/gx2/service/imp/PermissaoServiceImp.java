package br.com.gx2.service.imp;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.PermissaoDAO;
import br.com.gx2.dao.imp.PermissaoDAOImp;
import br.com.gx2.entity.Permissao;
import br.com.gx2.service.PermissaoService;

public class PermissaoServiceImp implements PermissaoService {

//	@Override
	public boolean create(Permissao permissao) {
		try {
			PermissaoDAO dao = new PermissaoDAOImp();
			dao.create(permissao);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

//	@Override
	public boolean update(Permissao permissao) {
		try {
			PermissaoDAO dao = new PermissaoDAOImp();
			dao.update(permissao);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public boolean delete(Permissao permissao) {
		try {
			PermissaoDAO dao = new PermissaoDAOImp();
			dao.delete(permissao);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public Permissao findById(Permissao permissao) {
		Permissao response = new Permissao();
		try {
			PermissaoDAO dao = new PermissaoDAOImp();
			response = dao.findById(permissao.getId());
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
	public List<Permissao> listAll() {
		List<Permissao> response = new ArrayList<Permissao>();
		try {
			PermissaoDAO dao = new PermissaoDAOImp();
			response = dao.listAll();
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
