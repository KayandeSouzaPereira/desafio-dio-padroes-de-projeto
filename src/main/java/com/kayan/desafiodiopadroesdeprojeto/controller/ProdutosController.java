package com.kayan.desafiodiopadroesdeprojeto.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayan.desafiodiopadroesdeprojeto.service.produto.ProdutoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name="1. Produtos")
@RequestMapping("produtos")
public class ProdutosController {
	
	@Autowired
	ProdutoService produtoService;
	

	@GetMapping
	public ResponseEntity<Map<String, Object>> buscarTodos() {
		Map<String, Object> object = new HashMap<String, Object>();
		object.put("Produtos Fisicos :", produtoService.buscarPorIdProdutosFisicos((long) 1));
		object.put("Produtos por Assinatura :", produtoService.buscarPorIdProdutosAssinatura((long) 2));
		
		return ResponseEntity.ok(object);
	}

}
