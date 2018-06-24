package com.agroall.gessica.descarte.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento;
import com.agroall.gessica.descarte.services.OrdemRecolhimentoService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/recolhimentos")
public class OrdemRecolhimentoCollectionResource extends DataCollectionResourceControllerImpl<OrdemRecolhimento> {
	
	@Autowired private OrdemRecolhimentoService service;
	
	@Override
	protected Service<OrdemRecolhimento> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<OrdemRecolhimento> doList() {
		return super.doList();
	}
	
}
