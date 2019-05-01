package com.adming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner TableCreate(Crud repository) {
		return (args) -> {
			
			// fetch all customers
			log.info("Démarrage:");
			
			
			// save a couple of customers
			repository.save(new ManutARisque("aa", "bb", 24, "12/24", 50));
			repository.save(new Technicien("Tao", "Fik", 22, "2000/06/15", 2000));
			repository.save(new Manutentionnaire("Anto", "Nain", 32, "1995/12/30", 150));
			repository.save(new TechnARisque("cc", "dd", 58, "12/78", 350));
			repository.save(new Vendeur("rr", "bbe", 95, "36/87", 50000));
			repository.save(new Representant("hh", "ll", 98, "32/75", 5875));
			 //public Employe(String prenom, String nom, int age, String date)
			
			
			// fetch all customers
			log.info("Terminée:");


		};
	}
	
}