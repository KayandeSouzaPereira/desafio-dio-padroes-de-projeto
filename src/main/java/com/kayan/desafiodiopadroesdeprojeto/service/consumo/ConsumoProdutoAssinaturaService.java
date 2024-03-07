package com.kayan.desafiodiopadroesdeprojeto.service.consumo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "placekitten", url = "https://placekitten.com")
public interface ConsumoProdutoAssinaturaService {
	
	@GetMapping("/200/300")
	byte[] getImageCat();

}
