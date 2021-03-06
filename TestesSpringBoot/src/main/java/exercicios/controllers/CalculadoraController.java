package exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{n1}/{n2}")
	public double somar(@PathVariable double n1, @PathVariable double n2) {
		return n1+n2;
	}
	@GetMapping(path = "/subtrair")
	public double subtrair(@RequestParam(name = "n1") double n1,@RequestParam(name = "n2") double n2) {
		return n1 - n2;
	}
	
	
}
