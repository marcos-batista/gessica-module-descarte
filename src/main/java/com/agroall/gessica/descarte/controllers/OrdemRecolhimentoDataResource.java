package com.agroall.gessica.descarte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento;
import com.agroall.gessica.descarte.services.OrdemRecolhimentoService;
import com.agroall.gessica.services.Service;

@RestController
@CrossOrigin
@RequestMapping("/recolhimento")
public class OrdemRecolhimentoDataResource extends DataObjectResourceControllerImpl<OrdemRecolhimento> {
	
	@Autowired private OrdemRecolhimentoService service;
	
	@Override
	protected Service<OrdemRecolhimento> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public OrdemRecolhimento doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public OrdemRecolhimento doPost(@RequestBody OrdemRecolhimento ordemRecolhimento) {
		ordemRecolhimento.setId(null);
		return super.doPost(ordemRecolhimento);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public OrdemRecolhimento doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public OrdemRecolhimento doPut(@PathVariable(value = "id") String id, @RequestBody OrdemRecolhimento ordemRecolhimento) {
		ordemRecolhimento.setId(id);
		return super.doPut(id, ordemRecolhimento);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public OrdemRecolhimento doDelete(OrdemRecolhimento ordemRecolhimento) {
		return super.doDelete(ordemRecolhimento);
	}
	
}
