package com.prev.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.prev.demo.model.Adress;
import com.prev.demo.model.Client;
import com.prev.demo.service.ClientService;


@SpringBootTest
class ProjectForTesteApplicationTests {

	@Test
	void contextLoads() {
	}

	private static final String url = "http://localhost:9090/client/create";
	
    @Autowired
    private RestTemplate restTemplate;
	
    private ClientService clientService;
	
    
    @Test
    public void createOneClient() {
        Client client = new Client(1, "Vinicius", "47737485830", new Adress("São Paulo", "Tucuruvi", "02309080"));
        Client clientCreated = restTemplate.postForObject(url, client, Client.class);
        assertEquals(client.getId(), clientCreated.getId());
    }
    
    
    
	

}
