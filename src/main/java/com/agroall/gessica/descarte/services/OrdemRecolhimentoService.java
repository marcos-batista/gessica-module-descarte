package com.agroall.gessica.descarte.services;

import com.agroall.gessica.descarte.dataobjects.OrdemRecolhimento;

public class OrdemRecolhimentoService extends DescarteService<OrdemRecolhimento> {

	@Override
	public OrdemRecolhimento factoryNewDataObject() {
		return new OrdemRecolhimento();
	}
	
}
