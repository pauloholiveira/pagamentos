package br.com.paulooliveira.pagamentos.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/payments")
@CrossOrigin(origins = "https://calm-rock-03d070d0f.1.azurestaticapps.net")
public class PagamentosController {

	@GetMapping
	@ResponseBody
	public Map<String, List<String>> list() {
	    return Map.of("pagamentos", List.of("pagamento1", "pagamento2"));
	}
}
