package com.ipi.javapoo;

import com.ipi.javapoo.database_api.repository.ClientRepository;
import com.ipi.javapoo.objects.Rectangle;
import com.ipi.javapoo.objects.Square;
import com.ipi.javapoo.singleton.Singleton;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ExercicesNotes {
	
	private Integer numberEx5;
	private final Random random = new Random();
	private final String TEXT_FILE = "java-poo.txt";
	
	@Autowired
	private ClientRepository repository;
	
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
	
	public void ex6(String phrase){
		System.out.println("La phrase comporte " + phrase.split(" ").length+ " mots.");
	}
	
	public void ex7(String phrase){
		try {
			File myObj = new File(TEXT_FILE);
			if (myObj.createNewFile()) {
				FileWriter myWriter = new FileWriter(TEXT_FILE);
				myWriter.write(phrase);
				myWriter.close();
				
				System.out.println("File created: " + myObj.getAbsolutePath());
			} else {
				myObj.delete();
				ex7(phrase);
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public void ex8(){
		try {
			File myObj = new File(TEXT_FILE);
			Scanner myReader = new Scanner(myObj);
			if (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				myReader.close();
				
				System.out.println("Le fichier comporte " + data.split(" ").length+ " mots.");
			}
			else {
				System.out.println("Aucun fichier texte détecté");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public void ex9() {
		Rectangle rectangle = new Rectangle(6,12);
		rectangle.display();
	}
	
	public void ex10() {
		Square square = new Square(6,6);
		square.display();
		System.out.println();
		square.calculDeSurface();
	}
	
	public void ex12() {
		Singleton singleton = Singleton.getInstance("Singleton1");
		Singleton anotherSingleton = Singleton.getInstance("Singleton2");
		if(Objects.equals(singleton, anotherSingleton)){
			System.out.println(
					"Singleton 1 : " + singleton + " & " +
							"Singleton 2 : " + anotherSingleton + " possèdent la même adresse mémoire."
			);
		}
		else{
			System.out.println("Le singleton ne fonctionne pas");
		}
	}
	
	public void ex13(){
		System.out.println("Veuillez lancer le test ClientServiceTest.");
	}
	
	private void markSeparation() {
		System.out.println("\n");
	}
	
}
