package com.kayan.desafiodiopadroesdeprojeto.model.produto;

import org.springframework.data.annotation.Id;

public abstract class Produto {
	
	@Id
	public int id;
	public String nome;
	public int valor;
	
	public Produto() {
	}
	
	public Produto(Produto produto) {
		if (produto != null) {
			this.id = produto.id;
			this.nome = produto.nome;
			this.valor = produto.valor;
		}
	}
	
	public abstract Produto clone();
	

}
