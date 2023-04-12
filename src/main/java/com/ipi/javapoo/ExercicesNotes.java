package com.ipi.javapoo;

import java.util.Random;
import java.util.Scanner;

public class ExercicesNotes {
	
	Integer numberEx5;
	Random random = new Random();
	
	public void ex1(String chaine){
		StringBuilder returnChaine = new StringBuilder();
		for (int i = chaine.length()-1;i>=0;i--){
			returnChaine.append(chaine.charAt(i));
		}
		System.out.println(returnChaine);
		markSeparation();
	}
	
	public void ex2(Integer hauteur){
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
	
	public void ex3(){
		int number = 0;
		for (int i = 0;i<10000;i++){
			number += i;
		}
		System.out.println(number);
		markSeparation();
	}
	
	public void ex4(Integer number){
		if(number % 2 == 0){
			System.out.print("Le nombre est pair");
		}
		else{
			System.out.print("Le nombre est impair");
		}
		
		for (int i = 2; i <= number / 2; ++i) {
			// non premier
			if (number % i == 0) {
				System.out.println(" et non premier");
				return;
			}
		}
		System.out.println(" et premier");
		markSeparation();
	}
	
	public void ex5(){
		numberEx5 = random.nextInt(1000);
		System.out.println("Jeu du juste nombre");
		startGame();
	}
	
	private void startGame() {
		boolean isPlaying = true;
		int nombreDeCoups = 0;
		
		while (isPlaying){
			Scanner myObj = new Scanner(System.in);
			System.out.println("Entrer un nombre :");
			String stringNumber = myObj.nextLine();
			try {
				int number = Integer.parseInt(stringNumber);
			
				if(nombreDeCoups < 7){
					nombreDeCoups++;
					if(number > numberEx5){
						System.out.println("Plus petit");
					}
					else if (number < numberEx5) {
						System.out.println("Plus grand");
					}
					else{
						System.out.println("Gagné!");
						isPlaying = false;
					}
				}
				else{
					System.out.println("Perdu!");
					isPlaying = false;
				}
			}
			catch (NumberFormatException e){
				System.out.println("Mauvaise saisie");
			}
		}

		Scanner myObj = new Scanner(System.in);
		System.out.println("Voulez-vous recommencer? (Y/N)");
		if(myObj.nextLine().equals("y")){
			markSeparation();
			ex5();
		}
		else{
			markSeparation();
		}
	}
	
	private void markSeparation() {
		System.out.println("\n");
	}
}
