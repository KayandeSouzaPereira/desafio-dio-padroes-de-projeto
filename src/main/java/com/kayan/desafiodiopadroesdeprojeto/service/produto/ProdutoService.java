package com.kayan.desafiodiopadroesdeprojeto.service.produto;

import com.kayan.desafiodiopadroesdeprojeto.model.produto.ProdutoAssinatura;
import com.kayan.desafiodiopadroesdeprojeto.model.produto.ProdutoFisico;



public interface ProdutoService {
	
	
	ProdutoFisico buscarPorIdProdutosFisicos(Long id);
	
	ProdutoAssinatura buscarPorIdProdutosAssinatura(Long id);
	

}
