package com.dbo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbo.model.Registro;
import com.dbo.service.RegistroService;

@RestController
@RequestMapping("api/v1/registro")
public class RegistroController {
	
	  @Autowired
	  private RegistroService registroService;
	  
	  
	  @GetMapping("")
	  public ResponseEntity<List<Registro>> getAll(){
	    List<Registro> registros = new ArrayList<Registro>();
	    registroService.findAll().forEach( registros::add);
	    if( registros.isEmpty()) {
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }else {
	      return new ResponseEntity<>( registros, HttpStatus.OK);
	    }
	  }
	  
	  @PostMapping("")
	  public ResponseEntity<Registro> create(@RequestBody Registro registro){
	    return new ResponseEntity<>(registroService.save(registro), HttpStatus.CREATED);
	  }
	}