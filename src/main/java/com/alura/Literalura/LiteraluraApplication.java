package com.alura.Literalura;

import com.alura.Literalura.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alura.Literalura.repository.AutorRepository;


@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner{
    
    @Autowired  
    private AutorRepository repository;
    
    public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}
    @Override
    public void run(String... args) throws Exception {
       Principal principal = new Principal(repository);
       principal.mostrarMenu();
    }

}
