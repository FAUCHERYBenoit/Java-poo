package com.ipi.javapoo;

public class ExercicesNotes {
	
	public void ex1(String chaine){
		StringBuilder returnChaine = new StringBuilder();
		for (int i = chaine.length()-1;i>=0;i--){
			returnChaine.append(chaine.charAt(i));
		}
		System.out.println(returnChaine);
		markSeparation();
	}
	
	public void ex2(int hauteur){
		int k = 0;
		
		for (int i = 1; i <= hauteur; ++i, k = 0) {
			for (int space = 1; space <= hauteur - i; ++space) {
				System.out.print("  ");
			}
			
			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}
			
			System.out.println();
		}
		markSeparation();
	}
	
	private void markSeparation() {
		System.out.println("\n");
	}
}
