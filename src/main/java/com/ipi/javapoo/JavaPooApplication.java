package com.ipi.javapoo;

import com.ipi.javapoo.objects.Rectangle;
import com.ipi.javapoo.objects.Square;
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
			case 9 -> exercicesNotes.ex9();
			case 10 -> exercicesNotes.ex10();
			case 12 -> exercicesNotes.ex12();
			case 11, 13 -> exercicesNotes.ex13();
			default -> System.out.println("Out of range");
		}
	}
}
