package com.kayan.desafiodiopadroesdeprojeto.model.produto;

public class ProdutoFisico extends Produto {
	public int limite = 10;
	
	public ProdutoFisico() {
	}
	
	public ProdutoFisico(ProdutoFisico produtoFisico) {
		super(produtoFisico);
		if(produtoFisico != null) {
			this.limite = produtoFisico.limite;
			this.id = 1;
		}
	}
	
	@Override
	public Produto clone() {
		return new ProdutoFisico(this);
	}
	

}
