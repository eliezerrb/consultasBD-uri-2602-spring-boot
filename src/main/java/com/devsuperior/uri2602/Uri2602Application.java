package com.devsuperior.uri2602;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2602.dto.CostumerMinDTO;
import com.devsuperior.uri2602.projections.CustomerMinProjection;
import com.devsuperior.uri2602.repositories.CustomerRepository;

@SpringBootApplication
public class Uri2602Application implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2602Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<CustomerMinProjection> list = repository.serch1("rs");
		List<CostumerMinDTO> result1 = list.stream().map(x -> new CostumerMinDTO(x)).collect(Collectors.toList());
		
		System.out.println("\n*** RESULTADO SQL RAIZ: ");
		for (CostumerMinDTO obj : result1) {
			System.out.println(obj);
		}
		System.out.println("\n\n");
		
		List<CostumerMinDTO> result2 = repository.serch2("rs");
		
		System.out.println("\n*** RESULTADO JPQL: ");
		for (CostumerMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
