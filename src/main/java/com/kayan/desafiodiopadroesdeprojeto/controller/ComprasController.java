package com.kayan.desafiodiopadroesdeprojeto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayan.desafiodiopadroesdeprojeto.model.compra.CompraEntrega;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.CompraFactory;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.CompraFactoryAssinatura;
import com.kayan.desafiodiopadroesdeprojeto.model.compra.CompraFactoryFisico;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name="2. Compras")
@RequestMapping("compras")
public class ComprasController {
	
	

	
	@GetMapping("/{id}")
	public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
		if (id == 1) {
			CompraFactory factory;
	        factory = new CompraFactoryFisico();
			CompraEntrega fabrica = new CompraEntrega(factory);
			return ResponseEntity.ok(fabrica.valor());
		}else if (id == 2){
			CompraFactory factory;
	        factory = new CompraFactoryAssinatura();
			CompraEntrega fabrica = new CompraEntrega(factory);
			return ResponseEntity.ok(fabrica.valor());
		}else {
			return (ResponseEntity<Object>) ResponseEntity.badRequest();
		}
		
	}


}
