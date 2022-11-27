package com.dio.padroes_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 *  Projeto Spring Boot gerado via Spring Initializer.
 *  Os seguintes módulos foram selecionadores:
 * - Spring Data JPA
 * - Spring Data Web
 * - H2 Database
 * - OpenFeign
 *
 * (by falvojr)
 * @author FelipeSantt
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpringApplication.class, args);
	}

}
