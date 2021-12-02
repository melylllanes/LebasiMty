/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springboot.controller;

import com.example.springboot.entity.DistribuidorUsuario;
import com.example.springboot.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.springboot.services.UsuarioServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

	@Autowired
	private UsuarioServices service;
	


	@RequestMapping("/inicio")
	public String viewHomePage(Model model) {

		return "index";

	}

	@RequestMapping("/beneficios")
	public String viewBeneficiosPage(Model model) {

		return "beneficios";

	}

	@RequestMapping("/gastritis")
	public String viewPadecimientosChild1(Model model) {

		return "gastritis-colitis";

	}

	@RequestMapping("/diabetes")
	public String viewPadecimientosChild2(Model model) {

		return "diabetes";

	}

	@RequestMapping("/estrenimiento")
	public String viewPadecimientosChild3(Model model) {

		return "estrenimiento";

	}

	@RequestMapping("/anemia")
	public String viewPadecimientosChild4(Model model) {

		return "anemia";

	}

	@RequestMapping("/bronquitis")
	public String viewPadecimientosChild5(Model model) {

		return "bronquitis";

	}

	@RequestMapping("/artritis")
	public String viewPadecimientosChild6(Model model) {

		return "artritis";

	}

	@RequestMapping("/unetelebasi")
	public String viewContactanosForm(Model model) {

		return "contactanos";

	}
	
   @RequestMapping(value = "/guardar", method = RequestMethod.POST)
	//@PostMapping("/unetelebasi")
	public String viewContactanosForm(@ModelAttribute("usuario") DistribuidorUsuario usuario) {
    	service.saveUser(usuario);
		return "contactanos";

	}

	@RequestMapping("/FAQ")
	public String viewFAQPage(Model model) {

		return "FAQ";

	}

	@GetMapping("/tienda")
	public String viewTiendaForm(Model model) {

		model.addAttribute("Pedido", new Pedido());

		return "tienda";
	}

	@PostMapping("/pedido")
	public String viewCheckOut(@ModelAttribute Pedido pedido, BindingResult result, Model model,
			@RequestParam int latas, @RequestParam String municipio) {

		Pedido p = new Pedido();
		p.setLatas(latas);
		p.setMunicipio(municipio);
		p.setCosto_envio(p.calcularCostoEnvio());
		p.setCosto_total_latas(p.calcularCostoLatas());
		p.setCosto_total(p.calcularCostoTotal());
		
		model.addAttribute("pedido", pedido);

		return "checkout";
	}



}
