package fr.voxi.eval;

public class Evaluation {
	private int note ;
	private String commentaire ;
	
	
	public Evaluation(int note, String commentaire) {
		super();
		this.note = note;
		this.commentaire = commentaire;
	}


	public int getNote() {
		return note;
	}


	public void setNote(int note) {
		this.note = note;
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	@Override
	public String toString() {
		return "Evaluation [note=" + note + ", commentaire=" + commentaire + "]";
	}
	
	

}
