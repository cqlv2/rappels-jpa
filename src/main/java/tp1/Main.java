package tp1;

import java.sql.ResultSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

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
		//lecture de 1 acteur
//		Acteur acteurA=em.find(Acteur.class, 1);
//		System.out.println(acteurA.getNom());
//		System.out.println(acteurA.getPrénom());
//		System.out.println(acteurA.getId());
//		for (Film f : acteurA.getFilms()) {
//			System.out.println(f.getTitre());
//		}
		
		//ajout acteur 

//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		
//		Acteur sp=new Acteur();
//		sp.setNom("Pegs");
//		sp.setPrénom("Simon");
//		TypedQuery<Film> query2 = em.createQuery("select f from Film f where f.titre = 'Mission impossible: Fallout'",
//				Film.class);
//		Film f = query2.getResultList().get(0);
//		sp.getFilms().add(f);
//	
//		em.persist(sp);
//		et.commit();
		
		//Modifiez la date de sortie du film « Avengers : Endgame » qui est 2019 et non 2018
		EntityTransaction et = em.getTransaction();
		et.begin();
		TypedQuery<Film> query = em.createQuery("select f from Film f where f.titre = 'Avengers: Endgame'",
				Film.class);
		Film f = query.getResultList().get(0);
		System.out.println(f.getTitre());
		f.setAnneeSortie(2019);
		et.commit();
		
		
		
	}

}
