package com.prev.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prev.demo.model.Client;
import com.prev.demo.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Client createClient(Client client) {
		Client clientCreated = new Client();
		try {
			clientCreated = clientRepository.save(client);
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		return clientCreated;
	}

	public Long getAllClientsSize() {
		System.out.println("Size: ");
		long clientsOnDb = clientRepository.count();
		System.out.println("Size: " + clientsOnDb );
		return clientsOnDb;
	}

}
