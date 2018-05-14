package com.agroall.gessica.descarte.dataobjects;

import java.util.Calendar;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class NotificacaoRecolhimento implements Persistent<Integer> {
	
	private Integer id;
	private Calendar data;
	private String texto;
	
	private ProdutoComercial produto;
	private Revendedor revendedor;
	
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public ProdutoComercial getProduto() {
		return produto;
	}
	
	public void setProduto(ProdutoComercial produto) {
		this.produto = produto;
	}
	
	public Revendedor getRevendedor() {
		return revendedor;
	}
	
	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}
	
}
