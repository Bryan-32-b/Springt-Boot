package com.dbo.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.dbo.model.Registro;
import com.dbo.repository.RegistroRepository;

import org.springframework.beans.factory.annotation.Autowired;
@Service
public class RegistroService {

	@Autowired
	private RegistroRepository registroRepository;
	
	public List<Registro> findAll(){
		return registroRepository.findAll();
		
	}
	
	public Registro save (Registro registro) {
		return registroRepository.save(registro);
	}
}
