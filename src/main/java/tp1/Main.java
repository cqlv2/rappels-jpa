package tp1;

import java.sql.ResultSet;
import java.util.ArrayList;

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
import entities.Categorie;
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
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		TypedQuery<Film> query = em.createQuery("select f from Film f where f.titre = 'Avengers: Endgame'",
//				Film.class);
//		Film f = query.getResultList().get(0);
//		System.out.println(f.getTitre());
//		f.setAnneeSortie(2019);
//		et.commit();
		
		//ajout film+acteurs
		
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		Film f=new Film();
//		f.setTitre("monFilm");
//		f.setAnneeSortie(2000);
//		
//		f.setCatégorie(em.find(Categorie.class, 1));
//		
//		Acteur monActeur=new Acteur();
//		monActeur.setNom("mon");
//		monActeur.setPrenom("acteur");
//		monActeur.setFilms(new ArrayList<Film>());
//		em.persist(monActeur);
//		
//		f.getActeurs().add(em.find(Acteur.class, 1));
//		f.getActeurs().add(em.find(Acteur.class, 2));
//		f.getActeurs().add(monActeur);
//		
//		em.persist(f);
//		et.commit();
		
		
		// remove cat
		
		
//		Categorie c1 = em.find(Categorie.class, 10);
//		Categorie c2 = em.find(Categorie.class, 13);
//			em.remove(c1);
//			em.remove(c2);
		
	}

	

	
	
}
