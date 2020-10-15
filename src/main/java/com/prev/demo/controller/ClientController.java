package com.prev.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prev.demo.model.Client;
import com.prev.demo.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping("/create")
	public ResponseEntity<?> createCliente(@RequestBody Client client) {
		Client clientCreated = clientService.createClient(client);
		return new ResponseEntity<>(clientCreated, HttpStatus.OK);
	}
}
