package com.agroall.gessica.descarte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento;
import com.agroall.gessica.descarte.services.NotificacaoRecolhimentoService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/notificacao")
@CrossOrigin
public class NotificacaoRecolhimentoDataResource extends DataObjectResourceControllerImpl<NotificacaoRecolhimento> {
	
	@Autowired private NotificacaoRecolhimentoService service;
	
	@Override
	protected Service<NotificacaoRecolhimento> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public NotificacaoRecolhimento doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public NotificacaoRecolhimento doPost(@RequestBody NotificacaoRecolhimento notificacaoRecolhimento) {
		notificacaoRecolhimento.setId(null);
		return super.doPost(notificacaoRecolhimento);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public NotificacaoRecolhimento doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public NotificacaoRecolhimento doPut(@PathVariable(value = "id") String id, @RequestBody NotificacaoRecolhimento notificacaoRecolhimento) {
		notificacaoRecolhimento.setId(id);
		return super.doPut(id, notificacaoRecolhimento);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public NotificacaoRecolhimento doDelete(NotificacaoRecolhimento notificacaoRecolhimento) {
		return super.doDelete(notificacaoRecolhimento);
	}
	
}
