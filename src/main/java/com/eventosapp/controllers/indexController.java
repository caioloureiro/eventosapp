/*Start - Controller do INDEX - Controla as funções de redirecionamento*/
package com.eventosapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	@RequestMapping("/")
	
	public String index() {
		
		return "index";
		
		//return "redirect:/eventos";
		
	}
	
}
/*End - Controller do INDEX - Controla as funções de redirecionamento*/