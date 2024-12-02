package fr.voxi.eval;

import java.util.ArrayList;
import java.util.List;

public class AppEval {

	public static void main(String[] args) {
	
		System.out.println("Q6\n");
		
	List<Auditeur> auditeurs = new ArrayList<Auditeur>() ; // Waouh... Polymorphisme en action
		
		auditeurs.add( new Auditeur( 1 , "BRAAS" , "Emma" ) ) ;
		auditeurs.add( new Auditeur( 2 , "DARBOE" , "Diem" ) ) ;
		auditeurs.add( new Auditeur( 3 , "FERT" , "Delphine" ) ) ;
		auditeurs.add( new Auditeur( 4 , "GAMBO" , "Rachida" ) ) ;
		auditeurs.add( new Auditeur( 5 , "LUCINA" , "Teptida" ) ) ;
		auditeurs.add( new Auditeur( 6 , "MEHDAOUI" , "Immacula" ) ) ;
		auditeurs.add( new Auditeur( 7 , "VICENTE" , "Monica" ) ) ;
		
		for(Auditeur auditrice : auditeurs ) {
			System.out.println( auditrice ) ;
		}
		
		System.out.println("\nQ7\n"); 
		
		Audiobook ab23 = new Audiobook( 23 , "Bel ami" , true ) ;
		System.out.println( ab23 ) ;
		
		System.out.println("\nQ9 - Q10\n");
		
		ab23.evaluer( auditeurs.get( 0 ), new Evaluation( 5 , "Excellent !!!" ) ) ;
		ab23.evaluer( auditeurs.get( 1 ), new Evaluation( 1 , "Vraiment pas bon" ) ) ;
		ab23.evaluer( auditeurs.get( 2 ), new Evaluation( 2 , "Bof" ) ) ;
		ab23.evaluer( auditeurs.get( 3 ), new Evaluation( 2 , "La déception :(" ) ) ;
		ab23.evaluer( auditeurs.get( 4 ), new Evaluation( 5 , "Bravo" ) ) ;
		
		System.out.println(ab23.getEvaluations());
		
		System.out.println("\nQ11 - Q12\n");
		
		ab23.afficherEvaluations();
		
		
		System.out.println("\nQ13 - Q14\n");
		
		ab23.supprimerEvaluation(auditeurs.get(3));
		
		System.out.println("\nQ15 - Q16\n");

	}

}
