package com.codingdojo.ciro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class EnrutamientoController {
	
	@GetMapping
	public String inicio() {
		return "<h1>¡Hola Coding Dojo!</h1>";
	}
	
	@GetMapping("/python")
	public String python() {
		return "<h1>¡Python/Django fue increíble!</h1>";
	}
	
	@GetMapping("/java")
	public String java() {
		return "<h1>¡Java/Spring es mejor!</h1>";
	}
}
