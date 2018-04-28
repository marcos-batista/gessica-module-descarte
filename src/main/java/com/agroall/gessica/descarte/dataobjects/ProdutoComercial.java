package com.agroall.gessica.descarte.dataobjects;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class ProdutoComercial extends com.agroall.gessica.dataobjects.ProdutoComercial implements Persistent {

	private Integer id;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
}
