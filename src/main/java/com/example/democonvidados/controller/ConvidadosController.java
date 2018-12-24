package com.example.democonvidados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.democonvidados.model.Convidado;
import com.example.democonvidados.repository.ConvidadosRepository;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	private ConvidadosRepository convidadosRepository;

	@RequestMapping
	public ModelAndView listaConvidados() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		Iterable<Convidado> convidados = convidadosRepository.findAll();
		mv.addObject(new Convidado());
		mv.addObject("convidados", convidados);
		return mv;
	}

	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidadosRepository.save(convidado);
		return "redirect:/convidados";
	}

}
