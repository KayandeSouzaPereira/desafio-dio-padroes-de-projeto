package com.kayan.desafiodiopadroesdeprojeto.service.consumo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayan.desafiodiopadroesdeprojeto.model.consumo.ConsumoAssinatura;
import com.kayan.desafiodiopadroesdeprojeto.model.consumo.ConsumoFisico;
import com.kayan.desafiodiopadroesdeprojeto.service.transporte.Transporte;


@Service
public class ConsumoServiceImpl implements ConsumoService {
	
	@Autowired
	private ConsumoProdutoFisicoService produtoFisico;
	
	@Autowired
	private ConsumoProdutoAssinaturaService produtoAssinatura;
	

	@Override
	public ConsumoFisico buscarPorIdConsumoFisicos(Long id) {
		
		ConsumoFisico fisico = new ConsumoFisico();
		fisico.setTituloFisico("Produto Cachorro");
		fisico.setImagemFisico(produtoFisico.getImageDog());
		return fisico;
	}


	@Override
	public ConsumoAssinatura buscarPorIdConsumosAssinatura(Long id) {
		ConsumoAssinatura assinatura = new ConsumoAssinatura();
		assinatura.setImagemFisico(produtoAssinatura.getImageCat());
		return assinatura;
	}

	

	

}
