package com.kayan.desafiodiopadroesdeprojeto.service.transporte;

public class Rota extends Transporte {
	private String mensagem = "Produto em rota de transporte, aguarde a chegada...";
	
	public Rota(Long etapa) {
	}
	
	public String check(Long etapa) {
		if(etapa == 2) {
			return mensagem; 
		}
		return checkNext(etapa);
	}

}
