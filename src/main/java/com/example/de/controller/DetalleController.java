package com.example.de.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.de.entity.Detalle;
import com.example.de.service.DetalleService;

@RestController
public class DetalleController {
	
	@Autowired
	private DetalleService detalleService;
	@GetMapping("/detalle")
	public List<Detalle> getList(){
		return detalleService.readAll();
	}
}
