package com.santiago.tecsup.textimaxapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santiago.tecsup.textimaxapp.models.Compra;

@Repository(value = "comprasRepository")
public interface ComprasRepository extends JpaRepository<Compra,Integer>{
		Compra findByCliente(String cliente);
	
}

