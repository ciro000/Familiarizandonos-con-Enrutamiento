package com.codingdojo.ciro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@GetMapping("dojo")
	public String dojo() {
		return "<h1> ¡El Dojo es increíble! </h1>";
	}
	
	@GetMapping("/{dojo_name}")
	public String gettingDojoName(@PathVariable("dojo_name") String dojoname) {
		
		if(dojoname.equals("burbank-dojo")) {
			return "<h3> El Dojo Burbank está localizado al sur de California </h3>"; 
		}
		
		else if(dojoname.equals("san-jose")) {
			return "<h3> El Dojo SJ es el cuartel general </h3>";
		}
		
		else {
			return "Ese Dojo no existe";
		}
	}	
	
}
