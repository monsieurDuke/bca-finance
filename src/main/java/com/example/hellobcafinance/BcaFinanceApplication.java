package com.example.hellobcafinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@SpringBootApplication
public class BcaFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcaFinanceApplication.class, args);
	}

	@RestController
	class Hello {
		@RequestMapping("/")
		String index() {
			return "Bca Finance";
		}
	}
}
