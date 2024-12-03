package com.mentoria.arquitetura.escola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
@EnableMongoRepositories
@EnableAutoConfiguration
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
	}

}
