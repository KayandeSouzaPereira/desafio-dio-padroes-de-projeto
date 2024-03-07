package com.kayan.desafiodiopadroesdeprojeto.model.produto;

public class ProdutoAssinatura extends Produto {
	public int tempoExpiracao = 5;
	public int id = 2;
	public String nome = "Produto Foto de Assinatura - Para iniciar a compra, utilize o endpoint '/compras/2'";
	public int valor = 20;
	
	public ProdutoAssinatura() {
	}
	
	public ProdutoAssinatura(ProdutoAssinatura produtoAssinatura) {
		super(produtoAssinatura);
		if(produtoAssinatura != null) {
			this.tempoExpiracao = produtoAssinatura.tempoExpiracao;
			this.id = produtoAssinatura.id;
			this.nome = produtoAssinatura.nome;
			this.valor = produtoAssinatura.valor;
		}
	}
	
	@Override
	public Produto clone() {
		
		return new ProdutoAssinatura(this);
	}
	

}
