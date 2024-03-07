package com.kayan.desafiodiopadroesdeprojeto.model.produto;

public class ProdutoAssinatura extends Produto {
	public int tempoExpiracao = 5;
	
	public ProdutoAssinatura() {
	}
	
	public ProdutoAssinatura(ProdutoAssinatura produtoAssinatura) {
		super(produtoAssinatura);
		if(produtoAssinatura != null) {
			this.tempoExpiracao = produtoAssinatura.tempoExpiracao;
			this.id = 2;
		}
	}
	
	@Override
	public Produto clone() {
		
		return new ProdutoAssinatura(this);
	}
	

}
