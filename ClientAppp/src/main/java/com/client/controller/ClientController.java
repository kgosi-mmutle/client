package com.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.client.model.Client;
import com.client.service.ClientService;

@RestController
public class ClientController {
	
	ClientService clientService;
	
	@Autowired
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	//Get client by their ID Number
	@GetMapping("/getClientByID/{id}")
	public ResponseEntity<List<Client>> getClientByID(@PathVariable Long id) {
		try {
			clientService.getClientByID(id);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity <>(HttpStatus.OK);
	}

	//Add a client
	@PostMapping("/createClient")
	public ResponseEntity<List<Client>> createClient(@RequestBody Client client) {
		try {
			clientService.createClient(client);
		} catch (Exception e) {
			return new ResponseEntity <>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity <>(HttpStatus.OK);
	}

	//Update a client
	@PostMapping("/updateClientByID/{id}")
	public ResponseEntity<List<Client>> updateClientByID(@PathVariable Long id, Client newClient) {
		try {
			clientService.updateClientByID(id, newClient);
		} catch (Exception e) {
			return new ResponseEntity <>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity <>(HttpStatus.OK);
	}
	
	//Validate to see if ID is South African using 3rd party API
	public ResponseEntity<List<Client>> verifyClientIDNumber(@PathVariable Long id) {
		try {
			clientService.verifyClientIDNumber(id);
		} catch (Exception e) {
			return new ResponseEntity <>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity <>(HttpStatus.OK);
	}
}
