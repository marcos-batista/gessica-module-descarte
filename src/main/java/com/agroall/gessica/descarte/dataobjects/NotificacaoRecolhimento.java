package com.agroall.gessica.descarte.dataobjects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "notificacoes")
public class NotificacaoRecolhimento implements Persistent<String> {
	
	@Id private String id;
	private Long data;
	private String texto;
	
	private ProdutoComercial produto;
	private Revendedor revendedor;
	
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
