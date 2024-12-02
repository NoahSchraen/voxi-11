package fr.voxi.eval;

public class Auditeur {
	private int numero ;
	private String nom ;
	private String prenom ;
	
	
	public Auditeur(int numero, String nom, String prenom) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
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
		return "Auditeur [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}


