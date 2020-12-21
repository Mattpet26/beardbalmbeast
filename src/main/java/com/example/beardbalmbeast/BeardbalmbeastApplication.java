package com.example.beardbalmbeast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@SpringBootApplication
public class BeardbalmbeastApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeardbalmbeastApplication.class, args);
	}
}
