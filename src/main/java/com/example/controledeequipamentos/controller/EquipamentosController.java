package com.example.controledeequipamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controledeequipamentos.model.Despesa;
import com.example.controledeequipamentos.repository.ControleDeEquipamentosRepository;

@RestController
public class EquipamentosController {
	
	@Autowired
	private ControleDeEquipamentosRepository repository;
	
	@GetMapping("/despesas")
	public List<Equipamento> getDespesas(){
		return repository.findAll();
		
	}

}
