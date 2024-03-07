package com.kayan.desafiodiopadroesdeprojeto.model.produto;

public class ProdutoFisico extends Produto {
	public int limite = 10;
	public int id = 1;
	public String nome = "Produto Foto de Compra Limitada - Para iniciar a compra, utilize o endpoint '/compras/1'";
	public int valor = 20;
	
	public ProdutoFisico() {
	}
	
	public ProdutoFisico(ProdutoFisico produtoFisico) {
		super(produtoFisico);
		if(produtoFisico != null) {
			this.limite = produtoFisico.limite;
			this.id = produtoFisico.id;
			this.nome = produtoFisico.nome;
			this.valor = produtoFisico.valor;
		}
	}
	
	@Override
	public Produto clone() {
		return new ProdutoFisico(this);
	}
	

}
