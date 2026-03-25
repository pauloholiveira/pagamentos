package br.com.paulooliveira.pagamentos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/payments")
public class PagamentosController {

	@GetMapping
	@ResponseBody
	public Map<String, List<String>> list() {
	    return Map.of("pagamentos", List.of("pagamento1", "pagamento2"));
	}
}
