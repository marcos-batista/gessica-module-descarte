package com.agroall.gessica.descarte.dataobjects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "recolhimentos")
public class OrdemRecolhimento implements Persistent<String> {
	
	@Id private String id;
	private Long data;
	private String texto;
	
	private ProdutoInsumo produto;
	private Fabricante fabricante;
	
	
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public Long getData() {
		return data;
	}
	
	public void setData(Long data) {
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
