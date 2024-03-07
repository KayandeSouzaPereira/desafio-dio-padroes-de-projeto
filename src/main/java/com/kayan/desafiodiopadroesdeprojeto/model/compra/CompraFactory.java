package com.kayan.desafiodiopadroesdeprojeto.model.compra;

import com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante.Compra;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.direcionamento.Direcionamento;

public interface CompraFactory {
	Compra compra();
	Direcionamento info();

}
