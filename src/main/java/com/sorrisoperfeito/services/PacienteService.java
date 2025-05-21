package com.sorrisoperfeito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sorrisoperfeito.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository repository;

	public PacienteService(PacienteRepository repository) {
		this.repository = repository;
	}
	/*	
	public List<Categorias> findAll(){
		return repository.findAll();
	}
	
	public Optional<Categorias> findById(Integer id){
		return repository.findById(id);
	}
	
	public void deletarPorId(Integer id){
		repository.deleteById(id);;
	}
	
	
	public void inserirCategoria(Categorias categoria) {
	         repository.save(categoria);
	}
*/	
	
/*
	 @PutMapping("/{id}")
	    public Categorias atualizarCategoria(Integer id, Categorias categoria) {
	        if (!repository.existsById(id)) {
	            throw new RunTimeException("Paciente com id " + id + " não encontrado.");
	        }
	        repository.setId(id);
	        return repository.save(paciente);
	    }
*/
	
	

}
