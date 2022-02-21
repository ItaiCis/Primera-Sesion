package com.java.polimorfismo;

public class Main {

	public static void main(String[] args) {
		//POLIMORFISMO
	
		//Clase Abstracta - Nombre de Objeto - Constructor
		Animal puppy = new Perro();
		puppy.speak();
		
		Animal garfield = new Gato();
		garfield.speak();
		
		Animal ricardo = new Humano();
		ricardo.speak();
		
		ricardo = new Gato();
		ricardo.speak();
		
		ricardo = new Perro();
		ricardo.speak();

	}

}
