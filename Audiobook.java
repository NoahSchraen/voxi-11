package fr.voxi.eval;
import java.util.* ;

public class Audiobook {
	
	private int numero ;
	private String titre ;
	private boolean gratuit = false ;
	private  Auditeur auditeur ;
	private Map<Auditeur, Evaluation> evaluations = new HashMap<Auditeur, Evaluation>();
	
	
	public Auditeur getAuditeur() {
		return auditeur;
	}


	public void setAuditeur(Auditeur auditeur) {
		this.auditeur = auditeur;
	}


	public Map<Auditeur, Evaluation> getEvaluations() {
		return evaluations;
	}


	public void setEvaluations(Map<Auditeur, Evaluation> evaluations) {
		this.evaluations = evaluations;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public boolean isGratuit() {
		return gratuit;
	}


	public void setGratuit(boolean gratuit) {
		this.gratuit = gratuit;
	}


	public Audiobook(int numero, String titre, boolean gratuit) {
		super();
		this.numero = numero;
		this.titre = titre;
		this.gratuit = gratuit;
	}
	
	public boolean evaluer(Auditeur auditeur, Evaluation evaluation) {
		if(evaluations.containsKey(auditeur) == false) {
			evaluations.put(auditeur, evaluation);
		}
		return true ;
	}
	
	public void afficherEvaluations() {
		for(Auditeur auditeur : evaluations.keySet()) {
			System.out.println(auditeur.getPrenom() + " " + auditeur.getNom() + " : " + evaluations.get(auditeur));
		}
	}
	
	public void supprimerEvaluation(Auditeur auditeur) {
		if(evaluations.containsKey(auditeur)) {
			System.out.println(evaluations.get(auditeur));
		}
		evaluations.remove(auditeur) ;
	
		}


	@Override
	public String toString() {
		return "Audiobook [numero=" + numero + ", titre=" + titre + ", gratuit=" + gratuit + ", auditeur=" + auditeur
				+ ", evaluations=" + evaluations + "]";
	}
	
	
}
