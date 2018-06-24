package com.agroall.gessica.descarte.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class OrdemRecolhimentoRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <OrdemRecolhimento> OrdemRecolhimento insert_(OrdemRecolhimento ordemRecolhimento) {
		mongo.insert(ordemRecolhimento);
		return ordemRecolhimento;
	}
	
	@Override
	public <OrdemRecolhimento> OrdemRecolhimento update_(OrdemRecolhimento ordemRecolhimento) {
		mongo.save(ordemRecolhimento);
		return ordemRecolhimento;
	}
	
	@Override
	public <OrdemRecolhimento> void delete_(OrdemRecolhimento ordemRecolhimento) {
		mongo.remove(ordemRecolhimento);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <OrdemRecolhimento> OrdemRecolhimento findById_(Object id) {
		com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento result = mongo.findById(id, com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento.class);
		return (OrdemRecolhimento) result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <OrdemRecolhimento> Collection<OrdemRecolhimento> listAll_() {
		List<com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento> result = mongo.findAll(com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento.class);
		return (Collection<OrdemRecolhimento>) result;
	}

}
