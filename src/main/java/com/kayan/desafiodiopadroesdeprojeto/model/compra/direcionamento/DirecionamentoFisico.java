package com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento;

public class DirecionamentoFisico implements Direcionamento {
	@Override
	public String info() {
		return "Para saber o estado de envio do seu produto utilize o endpoint '/consumo/1/{etapa}', sendo o valor etapa um numero de 1 a 4, avançando de acordo com as etapas de envio 😉";
	}
}
