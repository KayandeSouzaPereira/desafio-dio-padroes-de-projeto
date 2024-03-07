package com.kayan.desafiodiopadroesdeprojeto.service.transporte;

public class Entrega extends Transporte {
	private String mensagem = "Perfeito, seu produto chegou, avance mais uma etapa para abrir !!!";
	
	public Entrega(Long etapa) {
		
	}
	
	public String check(Long etapa) {
		if(etapa == 3) {
			return mensagem; 
		}
		return checkNext(etapa);
	}

}
