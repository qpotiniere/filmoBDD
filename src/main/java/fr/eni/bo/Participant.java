package fr.eni.bo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class Participant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length = 50, nullable=false, unique=false)
	private String nom;
	
	@Column(length = 50, nullable=false, unique=false)
	private String prenom;
	
	@ManyToMany(mappedBy="acteurs")
	private List<Film> films;
	
	@OneToMany(mappedBy = "real")
	private List<Film> filmsReal;
	
	public Participant() {
	}
	
	public Participant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Participant(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Participant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
