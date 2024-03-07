package com.kayan.desafiodiopadroesdeprojeto.service.produto;

import org.springframework.stereotype.Service;

import com.kayan.desafiodiopadroesdeprojeto.model.produto.ProdutoAssinatura;
import com.kayan.desafiodiopadroesdeprojeto.model.produto.ProdutoFisico;


@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Override
	public ProdutoFisico buscarPorIdProdutosFisicos(Long id) {
		ProdutoFisico produto = new ProdutoFisico();
		return produto;
	}

	@Override
	public ProdutoAssinatura buscarPorIdProdutosAssinatura(Long id) {
		ProdutoAssinatura produto = new ProdutoAssinatura();
		return produto;
	}


}
