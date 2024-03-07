package com.kayan.desafiodiopadroesdeprojeto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayan.desafiodiopadroesdeprojeto.model.compra.CompraFactory;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.CompraFactoryAssinatura;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.CompraFactoryFisico;

@RestController
@RequestMapping("compras")
public class ComprasController {
	
	

	
	@GetMapping("/{id}")
	public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
		if (id == 1) {
			CompraFactory fabrica;
			fabrica = new CompraFactoryFisico();
			return ResponseEntity.ok(fabrica());
		}else if (id == 2){
			CompraFactoryAssinatura assinatura = new CompraFactoryAssinatura();
			return ResponseEntity.ok(assinatura);
		}else {
			return (ResponseEntity<Object>) ResponseEntity.badRequest();
		}
		
	}


}
