package com.kayan.desafiodiopadroesdeprojeto.service.consumo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "place", url = "https://place.dog")
public interface ConsumoProdutoFisicoService {
	
	@GetMapping("/300/200")
	byte[] getImageDog();
}

