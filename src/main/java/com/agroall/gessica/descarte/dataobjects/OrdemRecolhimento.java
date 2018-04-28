package com.agroall.gessica.descarte.dataobjects;

import java.util.Calendar;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class OrdemRecolhimento implements Persistent {
	
	private Integer id;
	private Calendar data;
	private String texto;
	
	private ProdutoInsumo produto;
	private Fabricante fabricante;
	
	
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
	
	public ProdutoInsumo getProduto() {
		return produto;
	}
	
	public void setProduto(ProdutoInsumo produto) {
		this.produto = produto;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
}
