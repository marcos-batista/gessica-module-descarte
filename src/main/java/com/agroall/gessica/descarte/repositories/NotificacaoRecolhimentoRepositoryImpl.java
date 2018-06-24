package com.agroall.gessica.descarte.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class NotificacaoRecolhimentoRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <NotificacaoRecolhimento> NotificacaoRecolhimento insert_(NotificacaoRecolhimento notificacaoRecolhimento) {
		mongo.insert(notificacaoRecolhimento);
		return notificacaoRecolhimento;
	}
	
	@Override
	public <NotificacaoRecolhimento> NotificacaoRecolhimento update_(NotificacaoRecolhimento notificacaoRecolhimento) {
		mongo.save(notificacaoRecolhimento);
		return notificacaoRecolhimento;
	}
	
	@Override
	public <NotificacaoRecolhimento> void delete_(NotificacaoRecolhimento notificacaoRecolhimento) {
		mongo.remove(notificacaoRecolhimento);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <NotificacaoRecolhimento> NotificacaoRecolhimento findById_(Object id) {
		com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento result = mongo.findById(id, com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento.class);
		return (NotificacaoRecolhimento) result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <NotificacaoRecolhimento> Collection<NotificacaoRecolhimento> listAll_() {
		List<com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento> result = mongo.findAll(com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento.class);
		return (Collection<NotificacaoRecolhimento>) result;
	}

}
