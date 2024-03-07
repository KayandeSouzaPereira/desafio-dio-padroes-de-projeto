package com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento;

public class DirecionamentoAssinatura implements Direcionamento {
	@Override
	public String info() {
		return "Para adiquirir seu produto utilize o endpoint '/consumo/2'";
		}
}
