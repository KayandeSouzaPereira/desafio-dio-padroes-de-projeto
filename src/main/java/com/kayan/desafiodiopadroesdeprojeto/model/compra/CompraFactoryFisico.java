package com.kayan.desafiodiopadroesdeprojeto.model.compra;

import com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante.Compra;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante.CompraFisica;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento.Direcionamento;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento.DirecionamentoFisico;

public class CompraFactoryFisico implements CompraFactory {

	@Override
	public Compra compra() {
		return new CompraFisica();
	}

	@Override
	public Direcionamento info() {
		return new DirecionamentoFisico();
	}
	
	

}
