package com.agroall.gessica.descarte.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento;
import com.agroall.gessica.repositories.Repository;

public interface OrdemRecolhimentoRepository extends MongoRepository<OrdemRecolhimento, String>, Repository {
	
}
