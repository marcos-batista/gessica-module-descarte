package com.agroall.gessica.descarte.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento;
import com.agroall.gessica.repositories.Repository;

public interface NotificacaoRecolhimentoRepository extends MongoRepository<NotificacaoRecolhimento, String>, Repository {
	
}
