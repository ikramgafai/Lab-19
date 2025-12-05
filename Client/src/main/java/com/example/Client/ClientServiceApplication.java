package com.example.Client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.example.Client.entities.Client;
import com.example.Client.repositories.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client("Rim EL ABBASSI", 25F));
			clientRepository.save(new Client("Taha EL ABBASSI", 31F));
			clientRepository.save(new Client("Soufyane", 34F));
		};
	}


}