package com.agroall.gessica.descarte.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento;
import com.agroall.gessica.descarte.services.NotificacaoRecolhimentoService;
import com.agroall.gessica.services.Service;

@RestController
@CrossOrigin
@RequestMapping("/notificacoes")
public class NotificacaoRecolhimentoCollectionResource extends DataCollectionResourceControllerImpl<NotificacaoRecolhimento> {
	
	@Autowired private NotificacaoRecolhimentoService service;
	
	@Override
	protected Service<NotificacaoRecolhimento> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<NotificacaoRecolhimento> doList() {
		return super.doList();
	}
	
}
