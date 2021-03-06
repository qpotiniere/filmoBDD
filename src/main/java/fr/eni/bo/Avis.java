package fr.eni.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 1, nullable=false, unique=false)
	private Integer note;
	
	@Column(length = 300, nullable=false, unique=false)
	private String libele;
	
	@ManyToOne
	@JoinColumn(name = "idFilm", nullable = false)
	private Film film;

	@ManyToOne
	@JoinColumn(name = "idMembre", nullable = false)
	private Membre membre;	
	
	public Avis() {
		
	}
	
	public Avis(Integer id, Integer note, String libele) {
		this.id = id;
		this.note = note;
		this.libele = libele;
	}
	
	@Override
	public String toString() {
		return "Avis [id=" + id + ", note=" + note + ", libele=" + libele + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNote() {
		return note;
	}
	public void setNote(Integer note) {
		this.note = note;
	}
	public String getLibele() {
		return libele;
	}
	public void setLibele(String libele) {
		this.libele = libele;
	}
}
