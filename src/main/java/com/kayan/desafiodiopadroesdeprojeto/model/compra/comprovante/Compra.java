package com.kayan.desafiodiopadroesdeprojeto.model.compra.comprovante;

import org.springframework.data.annotation.Id;

public interface Compra {
	@Id
	Long id();
	String comprovante();
}
