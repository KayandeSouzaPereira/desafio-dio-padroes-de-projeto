package com.kayan.desafiodiopadroesdeprojeto.service.transporte;

public class Empacotamento extends Transporte {
	private String mensagem = "Produto empacotado, aguardando transportadora...";
	
	public Empacotamento(Long etapa) {
			
	}
	
	public String check(Long etapa) {
		if(etapa == 1) {
			return mensagem; 
		}
		return checkNext(etapa);
	}

}
