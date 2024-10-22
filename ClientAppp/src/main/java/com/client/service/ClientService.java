package com.client.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.client.model.Client;

@Service
public class ClientService {

	private List<Client> clientList;

	public ClientService() {
		clientList = new ArrayList<>();

		Client client1 = new Client("Kgosi", "Mmutle", 1234567890L, 1234567899876L, "PTA");
		Client client2 = new Client("Joe", "Soap", 1234567890L, 8884567899876L, "JHB");
		Client client3 = new Client("John", "Doe", 1234567890L, 4444567899876L, "CPT");

		clientList.addAll(Arrays.asList(client1, client2, client3));
	}

	public Client getClientByID(Long id) {
		for (Client client : clientList) {
			if (id == client.getIdNumber()) {
				return client;
			}
		}
		return null;

	}

	public Client createClient(@RequestBody Client client) {
		try {
			clientList.add(client);
		} catch (Exception e) {
		}
		return client;

	}

	public Client updateClientByID(@PathVariable Long id, @RequestBody Client newClient) {
		for (Client c : clientList) {

			if (!(id == c.getIdNumber())) {
				clientList.add(newClient);
			}
		}

		return newClient;

	}

	public String verifyClientIDNumber(Long id) {
		String verifyIDUri = "https://bdupreez-south-african-id-no-validator-v1.p.rapidapi.com/";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(verifyIDUri, String.class);
		return result;
	}
}
