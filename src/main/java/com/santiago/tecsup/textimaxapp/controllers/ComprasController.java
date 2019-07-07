package com.santiago.tecsup.textimaxapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.santiago.tecsup.textimaxapp.models.Compra;
import com.santiago.tecsup.textimaxapp.services.IComprasService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value= "/api")
public class ComprasController {

	@Autowired
	@Qualifier(value= "comprasService")
	private IComprasService iComprasService;
	
	@GetMapping(value ="/compras/")
	List<Compra> showAll(){
		return this.iComprasService.findAll();
	}
	
	@GetMapping(value = "/compra/{id}")
	Compra showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iComprasService.findById(id);
	}
	
	
	@GetMapping(value = "/compraCliente/{cliente}")
	Compra showCompraByCliente(@PathVariable(value = "cliente") String cliente) {
		Compra compra = iComprasService.findByCliente(cliente);
		return compra;
	}

	
	@PostMapping(value = "/compra")
	@ResponseStatus(HttpStatus.CREATED)
	Compra create(@RequestBody Compra compra) {
		this.iComprasService.save(compra);
		return compra;
	}
	
	
	
	@PutMapping(value = "/compra/{id}")
	Compra update (@RequestBody Compra compra, @PathVariable(value = "id") Integer id) {
		Compra currentCompra = this.iComprasService.findById(id);
		currentCompra.setEstado(compra.getEstado());
		this.iComprasService.save(currentCompra);
		return currentCompra;
	}
	
	@DeleteMapping(value = "/compra/{id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Compra compra=this.iComprasService.findById(id);
		this.iComprasService.delete(compra);
	}

	
	
	
}

