package com.java.herencia;

public class Padre {
	String nombre;
	double estatura;
	
	//Constructor superclase
	public Padre(String nombre, double estatura) {
		this.nombre = nombre;
		this.estatura = estatura;
	}
	
	//Metodo
	public String colorOjos() {
		return "Color Cafe";
	}

	public String colorCabello() {
		return "Negro";
	}
}
