package com.sorrisoperfeito.controller;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sorrisoperfeito.services.PacienteService;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriaController {
	
	@Autowired
	private PacienteService repository;
	
	public CategoriaController(PacienteService repository) {
		
		this.repository = repository;
	}

	/*	
	@GetMapping
	public List<Categorias> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Categorias> buscarPorId(@PathVariable Integer id) {
		return repository.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletePorId(@PathVariable Integer id) {
		repository.deletarPorId(id);
	}
	
	 @PostMapping
	    public void inserirCategoria(@RequestBody Categorias categoria) {
	        repository.inserirCategoria(categoria);
	    }
*/
	 
	 
/*	 @PutMapping("/{id}")
	    public Categorias atualizarCategoria(@PathVariable Integer id, @RequestBody Categorias categoria) {
	        if (!repository.existsById(id)) {
	            throw new ResourceNotFoundException("Paciente com id " + id + " não encontrado.");
	        }
	        paciente.setId(id);
	        return repository.save(paciente);
	    }
*/
	
}
