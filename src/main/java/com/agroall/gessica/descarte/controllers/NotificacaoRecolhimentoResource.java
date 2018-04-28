package com.agroall.gessica.descarte.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.controllers.GessicaDataObjectResourceController;
import com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento;
import com.agroall.gessica.descarte.services.NotificacaoRecolhimentoService;
import com.agroall.gessica.services.Service;

public class NotificacaoRecolhimentoResource extends GessicaDataObjectResourceController<NotificacaoRecolhimento> {
	
	@Autowired private NotificacaoRecolhimentoService service;
	
	@Override
	protected Service<NotificacaoRecolhimento> getService() {
		return this.service;
	}

}
