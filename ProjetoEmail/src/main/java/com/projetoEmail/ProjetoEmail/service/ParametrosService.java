package com.projetoEmail.ProjetoEmail.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoEmail.ProjetoEmail.model.Parametros;
import com.projetoEmail.ProjetoEmail.repository.ParametrosRepository;

@Service
public class ParametrosService {
	@Autowired
	ParametrosRepository parametroRepository;
	
	public String retornaParametro(Long id) {
		Optional<Parametros> parametroOptional = parametroRepository.findById(id);
		String parametro = parametroOptional.get().getParametro();
			
		return parametro;
	}
	
}
