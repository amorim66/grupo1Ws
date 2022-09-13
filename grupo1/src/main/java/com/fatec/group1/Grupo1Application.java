package com.fatec.group1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Grupo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Grupo1Application.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
		System.out.println(new BCryptPasswordEncoder().encode("456"));
	}

}
