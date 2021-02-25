package fr.eni.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Membre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable=false, unique=false)
	private String nom;
	
	@Column(length = 50, nullable=false, unique=false)
	private String prenom;
	
	@Column(length = 50, nullable=false, unique=false)
	private String login;
	
	@Column(length = 50, nullable=false, unique=false)
	private String mdp;
	
	@Column(nullable=false, unique=false)
	private boolean isAdmin;

	@OneToMany(mappedBy = "membre")
	private List<Avis> listAvis;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public List<Avis> getListAvis() {
		return listAvis;
	}

	public void setListAvis(List<Avis> listAvis) {
		this.listAvis = listAvis;
	}

	@Override
	public String toString() {
		return "Membre [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", mdp=" + mdp
				+ ", isAdmin=" + isAdmin + ", listAvis=" + listAvis + "]";
	}
	
}
