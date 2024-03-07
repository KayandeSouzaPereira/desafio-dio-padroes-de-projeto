package com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante;

public class CompraAssinatura implements Compra {
	@Override
	public String comprovante() {
		return "Parabéns por adiquirir nosso produto, o acesso já esta disponivel para uso.";
	}

	@Override
	public Long id() {
		return (long) 2;
	}
}
