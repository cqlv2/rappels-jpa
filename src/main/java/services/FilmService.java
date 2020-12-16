package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entities.Film;
import repo.FilmRepo;

public class FilmService {

	private FilmRepo filmRepo;

	public FilmService(FilmRepo filmRepo) {
		super();
		this.filmRepo = filmRepo;
	}
	
	public List<Film> getByName(String name) {
		List<Film>films =filmRepo.findByTitre(name);
		
		
		return films;
	}
	
}
