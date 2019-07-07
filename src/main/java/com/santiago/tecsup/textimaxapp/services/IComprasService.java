package com.santiago.tecsup.textimaxapp.services;

import java.util.List;

import com.santiago.tecsup.textimaxapp.models.Compra;


public interface IComprasService {

	List<Compra> findAll();
	Compra findById (Integer id);
    Compra findByCliente(String cliente);
	
	void save(Compra compra);
	void delete(Compra compra);
	
}

