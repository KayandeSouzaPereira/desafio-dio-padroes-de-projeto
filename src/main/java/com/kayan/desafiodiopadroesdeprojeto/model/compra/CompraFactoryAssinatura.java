package com.kayan.desafiodiopadroesdeprojeto.model.compra;

import com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante.Compra;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante.CompraAssinatura;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento.Direcionamento;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento.DirecionamentoAssinatura;

public class CompraFactoryAssinatura implements CompraFactory {

	@Override
	public Compra compra() {
		return new CompraAssinatura();
	}

	@Override
	public Direcionamento info() {
		return new DirecionamentoAssinatura();
	}

}
