package tp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Acteur;
import entities.Film;


@SpringBootApplication
public class Main implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = emf.createEntityManager();
		
		Acteur acteurA=em.find(Acteur.class, 1);
		System.out.println(acteurA.getNom());
		System.out.println(acteurA.getPrénom());
		System.out.println(acteurA.getId());
		for (Film f : acteurA.getFilms()) {
			System.out.println(f.getTitre());
		}
		
	}

}
