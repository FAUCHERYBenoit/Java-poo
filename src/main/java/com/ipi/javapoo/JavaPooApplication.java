package com.ipi.javapoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPooApplication.class, args);
		System.out.println("##########################################\n");
		
		ExercicesNotes exercicesNotes = new ExercicesNotes();
		exercicesNotes.ex1("Benoît FAUCHERY");
		exercicesNotes.ex2(10);
	}

}
