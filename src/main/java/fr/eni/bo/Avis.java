package fr.eni.bo;

public class Avis {
	private Integer id;
	private Integer note;
	private String libele;
	
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
