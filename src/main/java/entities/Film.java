package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private int annee_sortie;
	@ManyToOne
	@JoinColumn(name = "id_categ")
	private Categorie catégorie;
	@ManyToMany
	@JoinTable(name = "film_acteur", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_acteur"))
	private List<Acteur> acteurs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnneeSortie() {
		return annee_sortie;
	}

	public void setAnneeSortie(int i) {
		this.annee_sortie = i;
	}

	public Categorie getCatégorie() {
		return catégorie;
	}

	public void setCatégorie(Categorie catégorie) {
		this.catégorie = catégorie;
	}

	public List<Acteur> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

}
