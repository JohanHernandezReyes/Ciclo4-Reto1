package Ciclo4.Reto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("Ciclo4.Reto1.Modelo")
public class Reto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}

}
