package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Acteur;
import entities.Film;

public interface ActeurRepo extends JpaRepository<Acteur, Integer>{

	List<Acteur> findByNomAndPrenom(String nom,String prenom);

	
}
