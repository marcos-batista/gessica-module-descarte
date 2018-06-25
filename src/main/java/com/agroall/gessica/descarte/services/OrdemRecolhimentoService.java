package com.agroall.gessica.descarte.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento;
import com.agroall.gessica.descarte.repositories.OrdemRecolhimentoRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class OrdemRecolhimentoService extends ServiceImpl<OrdemRecolhimento> {
	
	@Autowired private OrdemRecolhimentoRepository repository;
	
	@Override
	public OrdemRecolhimento factoryNewDataObject() {
		return new OrdemRecolhimento();
	}
	
	@Override
	protected Repository getRepository() {
		return this.repository;
	}
	
	@Override
	protected Repository factoryRepository() {
		return this.repository;
	}
	
}
