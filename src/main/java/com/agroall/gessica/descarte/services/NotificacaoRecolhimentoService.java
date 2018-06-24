package com.agroall.gessica.descarte.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento;
import com.agroall.gessica.descarte.repositories.NotificacaoRecolhimentoRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

public class NotificacaoRecolhimentoService extends ServiceImpl<NotificacaoRecolhimento> {
	
	@Autowired private NotificacaoRecolhimentoRepository repository;
	
	@Override
	public NotificacaoRecolhimento factoryNewDataObject() {
		return new NotificacaoRecolhimento();
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
