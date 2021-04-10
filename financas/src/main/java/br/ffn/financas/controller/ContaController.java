package br.ffn.financas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ffn.financas.model.Conta;
import br.ffn.financas.service.ContaService;

@RestController
@RequestMapping("/contas")
public class ContaController {
	
	@Autowired
	private ContaService service;
	
	@GetMapping
	public ResponseEntity<List <Conta>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}

}
