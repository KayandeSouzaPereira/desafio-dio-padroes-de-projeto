package com.kayan.desafiodiopadroesdeprojeto.model.compra;

import com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante.Compra;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento.Direcionamento;

public class CompraEntrega {
	private Compra comprovante;
    private Direcionamento direcionamento;

    public CompraEntrega(CompraFactory factory) {
        comprovante = factory.compra();
        direcionamento = factory.info();
    }

    public String valor() {
        return comprovante.comprovante() + direcionamento.info();
    }
}
