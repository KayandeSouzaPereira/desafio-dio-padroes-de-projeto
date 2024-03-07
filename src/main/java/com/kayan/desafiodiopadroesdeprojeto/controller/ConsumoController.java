package com.kayan.desafiodiopadroesdeprojeto.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayan.desafiodiopadroesdeprojeto.service.consumo.ConsumoService;
import com.kayan.desafiodiopadroesdeprojeto.service.transporte.Empacotamento;
import com.kayan.desafiodiopadroesdeprojeto.service.transporte.Entrega;
import com.kayan.desafiodiopadroesdeprojeto.service.transporte.Rota;
import com.kayan.desafiodiopadroesdeprojeto.service.transporte.Transporte;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name="3. Entrega e Consumo")
@RequestMapping("consumo")
public class ConsumoController {
	
	@Autowired
	ConsumoService consumoService;
	
	
	
	@GetMapping("/{id}/{etapa}")
	public ResponseEntity<Object> buscarPorId(@PathVariable Long id,@PathVariable Long etapa) {
		Map<String, Object> object = new HashMap<String, Object>();
		if(id == 1) {
			Transporte transporte = Transporte.link(
		            new Empacotamento(etapa),
		            new Rota(etapa),
		            new Entrega(etapa)
		        );
			object.put("Status de entrega :", transporte.check(etapa));
			if(etapa == 4) {
				return ResponseEntity.ok()
					      .contentType(MediaType.IMAGE_JPEG)
					      
					      .body(consumoService.buscarPorIdConsumoFisicos(id).getImagemFisico());
				
			}
			return ResponseEntity.ok(object);
		}else {
			return (ResponseEntity<Object>) ResponseEntity.badRequest();
		}
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
		if(id == 1) {
			return (ResponseEntity<Object>) ResponseEntity.badRequest();
		}else if(id == 2) {
			return ResponseEntity.ok()
				      .contentType(MediaType.IMAGE_JPEG)
				      .body(consumoService.buscarPorIdConsumosAssinatura(id).getImagemFisico());
		}else {
			return (ResponseEntity<Object>) ResponseEntity.badRequest();
		}
		
		
		
		
		
	}

}
