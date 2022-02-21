package com.java;

public class Main {

	public static void main(String[] args) {
		// Perro
		
		Perro chihuahua = new Perro();
//		chihuahua.raza = "Cabeza de venado";
//		chihuahua.color = "Cafe";
//		chihuahua.tamano = "Chico";
//		chihuahua.nombre = "Mero Macho";
//		chihuahua.numeroPatas = 4;
		
		//Perro1 
		Perro perro1 = new Perro("Chihuahua", "Cafe", "Chico", "Mero Macho");
		System.out.println("Mi perro es de raza " + perro1.getRaza());
//		perro1.raza = "Pomeranio";
//		perro1.tamano = "Grande";
//		perro1.color = "Azul";
//		System.out.println("Mi perro es de raza " + perro1.getRaza());
		System.out.println("Mi perro es de color " + perro1.getColor());
		
		//Perro2
		Perro perro2 = new Perro("San Bernardo", "Blanco", "Grande", "Cool", 3);
		perro2.setNumeroPatas(1000000);
		System.out.println("Mi perro tiene " + perro2.getNumeroPatas() + " Patas");

	}

}
