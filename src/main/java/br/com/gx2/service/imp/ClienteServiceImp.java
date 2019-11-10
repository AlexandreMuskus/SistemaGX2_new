package br.com.gx2.service.imp;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.ClienteDAO;
import br.com.gx2.dao.imp.ClienteDAOImp;
import br.com.gx2.entity.Cliente;
import br.com.gx2.service.ClienteService;

public class ClienteServiceImp implements ClienteService {

//	@Override
	public boolean create(Cliente cliente) {
		try {
			ClienteDAO dao = new ClienteDAOImp();
			dao.create(cliente);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

//	@Override
	public boolean update(Cliente cliente) {
		try {
			ClienteDAO dao = new ClienteDAOImp();
			dao.update(cliente);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public boolean delete(Cliente cliente) {
		try {
			ClienteDAO dao = new ClienteDAOImp();
			dao.delete(cliente);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public Cliente findById(Cliente cliente) {
		Cliente response = new Cliente();
		try {
			ClienteDAO dao = new ClienteDAOImp();
			response = dao.findById(cliente.getId());
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
	public List<Cliente> listAll() {
		List<Cliente> response = new ArrayList<Cliente>();
		try {
			ClienteDAO dao = new ClienteDAOImp();
			response = dao.listAll();
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
