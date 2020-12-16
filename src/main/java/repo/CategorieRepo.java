package repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie, Integer>{
	List<Categorie> findByDateMaj(LocalDate date);
}
