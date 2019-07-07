package com.santiago.tecsup.textimaxapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santiago.tecsup.textimaxapp.models.Compra;
import com.santiago.tecsup.textimaxapp.repositories.ComprasRepository;
import com.santiago.tecsup.textimaxapp.services.IComprasService;


@Service(value = "comprasService")
public class ComprasService implements IComprasService {
	
	@Autowired
	@Qualifier(value= "comprasRepository")
	private ComprasRepository comprasRepository;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<Compra> findAll(){
		return this.comprasRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Compra findById (Integer id) {
		return this.comprasRepository.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public void save (Compra compra) {
		this.comprasRepository.save(compra);
	}
	
	@Transactional
	@Override
	public void delete (Compra compra) {
		this.comprasRepository.delete(compra);
		
	}

	@Override
	public Compra findByCliente(String cliente) {
		return this.comprasRepository.findByCliente(cliente);
	}
	
}
