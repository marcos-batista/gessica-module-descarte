package com.agroall.gessica.descarte.services;

import com.agroall.gessica.descarte.dataobjects.NotificacaoRecolhimento;

public class NotificacaoRecolhimentoService extends DescarteService<NotificacaoRecolhimento> {

	@Override
	public NotificacaoRecolhimento factoryNewDataObject() {
		return new NotificacaoRecolhimento();
	}
	
}
