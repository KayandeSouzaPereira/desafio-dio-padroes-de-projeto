package com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento;

public class DirecionamentoFisico implements Direcionamento {
	@Override
	public String info() {
		return "Para saber o estado de envio do seu produto utilize o endpoint Y";
	}
}
