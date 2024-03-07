package com.kayan.desafiodiopadroesdeprojeto.service.transporte;


public abstract class Transporte {
	private Transporte viagem;
	
	public static Transporte link(Transporte primeiro, Transporte... chain) {
		Transporte inicial = primeiro;
		for (Transporte nextInChain : chain) {
			inicial.viagem = nextInChain;
			inicial = nextInChain;
		}
		return primeiro;
	}
	
	public abstract String check(Long etapa);
	
	
	protected String checkNext(Long etapa) {
		if (viagem == null) {
			return "Nenhuma produto encontrado em transporte com essa descrição";
		}
		return viagem.check(etapa);
	}

}
