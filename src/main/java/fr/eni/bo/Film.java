package fr.eni.bo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable=false, unique=false)
	private String titre;
	
	@Column(length = 4, nullable=false, unique=false)
	private int annee;
	
	@ManyToOne
    @JoinColumn(name = "idGenre", nullable = false)
	private Genre genre;
	
	@ManyToOne
    @JoinColumn(name = "idReal", nullable = false)
    private Participant real;
	
	@Column(length = 4, nullable=false, unique=false)
	private String duree;
	
	@ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE}) //pas delete 
	@JoinTable(name="acteurs", 
	           joinColumns= {@JoinColumn(name="idFilm")},
	           inverseJoinColumns= {@JoinColumn(name="idActeur")}
	)
	private List<Participant> acteurs;
	
	@Column(length = 300, nullable=false, unique=false)
	private String synopsis;
	
	@OneToMany(mappedBy = "film")
    private List<Avis> avis;
		
	public Film() {

	}

	public Film(String titre, int annee, Genre genre, Participant real, String duree, List<Participant> acteurs, String synopsis) {
		this.titre = titre;
		this.annee = annee;
		this.genre = genre;
		this.real = real;
		this.duree = duree;
		this.acteurs = acteurs;
		this.synopsis = synopsis;
	}

	public Film(Integer id, String titre, int annee, Genre genre, Participant real, String duree, List<Participant> acteurs, String synopsis) {
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.genre = genre;
		this.real = real;
		this.duree = duree;
		this.acteurs = acteurs;
		this.synopsis = synopsis;
	}
	
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
	
	public int getAnnee() {
		return annee;
	}
	
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public Participant getReal() {
		return real;
	}
	
	public void setReal(Participant real) {
		this.real = real;
	}
	
	public String getDuree() {
		return duree;
	}
	
	public void setDuree(String duree) {
		this.duree = duree;
	}
	
	public List<Participant> getActeurs() {
		return acteurs;
	}
	
	public void setActeurs(List<Participant> acteurs) {
		this.acteurs = acteurs;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", genre=" + genre + ", real=" + real
				+ ", duree=" + duree + ", acteurs=" + acteurs + ", synopsis=" + synopsis + "]";
	}	
}
