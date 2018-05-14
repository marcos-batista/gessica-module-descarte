package com.agroall.gessica.descarte.dataobjects;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class ProdutoInsumo extends com.agroall.gessica.dataobjects.ProdutoInsumo implements Persistent<Integer> {
	
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
