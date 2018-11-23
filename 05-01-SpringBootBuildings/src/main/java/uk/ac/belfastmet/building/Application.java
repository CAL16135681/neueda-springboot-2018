package uk.ac.belfastmet.building;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.building.domain.Building;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
			
	}
}	