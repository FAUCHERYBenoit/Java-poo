package com.ipi.javapoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class JavaPooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JavaPooApplication.class, args);
		System.out.println("##########################################\n");
		
		ExercicesNotes exercicesNotes = new ExercicesNotes();
		
		exercicesNotes.ex1("Benoît FAUCHERY");
		
		exercicesNotes.ex2(10);
		
		exercicesNotes.ex3();
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Entrer un nombre :");
		String number = myObj.nextLine();
		try{
			exercicesNotes.ex4(Integer.parseInt(number));
		}
		catch (NumberFormatException e){
			System.out.println("Mauvaise saisie");
			System.out.println("\n");
		}
		
		exercicesNotes.ex5();
		
		ctx.close();
	}

}
