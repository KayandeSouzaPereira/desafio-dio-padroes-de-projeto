package com.kayan.desafiodiopadroesdeprojeto.service.consumo;

import com.kayan.desafiodiopadroesdeprojeto.model.consumo.ConsumoAssinatura;
import com.kayan.desafiodiopadroesdeprojeto.model.consumo.ConsumoFisico;



public interface ConsumoService {
	
	ConsumoFisico buscarPorIdConsumoFisicos(Long id);
	
	ConsumoAssinatura buscarPorIdConsumosAssinatura(Long id);
	

}
