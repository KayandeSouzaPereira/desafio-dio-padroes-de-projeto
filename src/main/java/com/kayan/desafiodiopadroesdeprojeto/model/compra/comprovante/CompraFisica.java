package com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante;

public class CompraFisica implements Compra {
	@Override
	public String comprovante() {
		return "Parabéns por adiquirir nosso produto, em breve deverá ser enviado para você.";
	}

	@Override
	public Long id() {
		return (long) 1;
	}
}
