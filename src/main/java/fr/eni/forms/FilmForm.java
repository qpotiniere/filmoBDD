package fr.eni.forms;

import java.util.ArrayList;

public class FilmForm {
    private String titre;
    private int annee;
    private Integer idRealisateur;
    private ArrayList<Integer> idActeurs;
    private Integer idGenre;
    private String duree;
    private String synopsis;

    public FilmForm() {
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

	public Integer getIdRealisateur() {
		return idRealisateur;
	}

	public void setIdRealisateur(Integer idRealisateur) {
		this.idRealisateur = idRealisateur;
	}

	public ArrayList<Integer> getIdActeurs() {
		return idActeurs;
	}

	public void setIdActeurs(ArrayList<Integer> idActeurs) {
		this.idActeurs = idActeurs;
	}

	public Integer getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(Integer idGenre) {
		this.idGenre = idGenre;
	}
	
	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
    public String toString() {
        return "FilmForm{" +
                "titre='" + titre +
                ", annee=" + annee +
                ", idRealisateur=" + idRealisateur +
                ", idActeurs=" + idActeurs +
                ", idGenre=" + idGenre +
                ", duree=" + duree +
                ", synopsis=" + synopsis +
                '}';
    }
}