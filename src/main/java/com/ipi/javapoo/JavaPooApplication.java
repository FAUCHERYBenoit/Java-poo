package com.ipi.javapoo;

import com.ipi.javapoo.exerces12_14.Singleton;
import com.ipi.javapoo.exercices9_11.Rectangle;
import com.ipi.javapoo.exercices9_11.Square;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Objects;
import java.util.Scanner;

@SpringBootApplication
public class JavaPooApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JavaPooApplication.class, args);
		System.out.println("##########################################\n");
		
		boolean isPlaying = true;
		while (isPlaying) {
			inputChoice();
			
			Scanner keepGoing = new Scanner(System.in);
			System.out.println("Voulez-vous continuer? (Y/N)");
			if(!keepGoing.nextLine().equalsIgnoreCase("y")){
				isPlaying = false;
			}
		}
		
		ctx.close();
	}
	
	private static void inputChoice() {
		Scanner choix = new Scanner(System.in);
		System.out.println("Entrer un exercice :");
		try{
			chooseExercice(Integer.parseInt(choix.nextLine()));
		}
		catch (NumberFormatException e){
			System.out.println("Mauvaise saisie");
			System.out.println("\n");
			inputChoice();
		}
	}
	
	private static void chooseExercice(Integer choix) {
		ExercicesNotes exercicesNotes = new ExercicesNotes();
		
		switch (choix) {
			case 0, 1 -> exercicesNotes.ex1("Benoît FAUCHERY");
			case 2 -> exercicesNotes.ex2(10);
			case 3 -> exercicesNotes.ex3();
			case 4 -> {
				Scanner ex4Param = new Scanner(System.in);
				System.out.println("Entrer un nombre :");
				String number = ex4Param.nextLine();
				try{
					exercicesNotes.ex4(Integer.parseInt(number));
				}
				catch (NumberFormatException e){
					System.out.println("Mauvaise saisie");
					System.out.println("\n");
				}
			}
			case 5 -> exercicesNotes.ex5();
			case 6 ->{
				Scanner ex6Param = new Scanner(System.in);
				System.out.println("Entrer une phrase :");
				exercicesNotes.ex6(ex6Param.nextLine());
			}
			case 7 ->{
				Scanner ex7Param = new Scanner(System.in);
				System.out.println("Entrer une phrase :");
				exercicesNotes.ex7(ex7Param.nextLine());
			}
			case 8 -> exercicesNotes.ex8();
			case 9 -> {
				Rectangle rectangle = new Rectangle(6,12);
				rectangle.display();
			}
			case 10 -> {
				Square square = new Square(6,6);
				square.display();
				System.out.println();
				square.calculDeSurface();
			}
			case 12 -> {
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
			case 13 -> exercicesNotes.ex13();
			default -> System.out.println("Out of range");
		}
	}
}
