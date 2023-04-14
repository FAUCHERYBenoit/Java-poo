package com.ipi.javapoo.exercices9_11;

public class Rectangle {
	
	private int height, width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public void display(){
		for (int i = 0;i<height;i++){
			System.out.print("#  ".repeat(width));
			System.out.println();
		}
	}
	
	public void calculDeSurface(){
		System.out.println(height*width + " cm²");
	}
}
