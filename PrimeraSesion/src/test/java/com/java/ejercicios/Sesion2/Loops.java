package com.java.ejercicios.Sesion2;

import com.java.modificadores.Modificador;

public class Loops extends Modificador{

	public static void main(String[] args) {
		// CICLOS
		
		//WHILE
		//Contador de un rango de numeros
		int minNumero = 1;
		int maxNumero = 10;
		
		while(minNumero <= maxNumero) {
			System.out.println("El numero es " + minNumero);
			minNumero++;
		}
		
		//DO WHILE
		//Cuantas veces se tiene que sumar un mismo numero para llegar a 100?
		int numero = 8;
		int sumTotal = 0;
		int count = 0;
		
		do {
			sumTotal = sumTotal + numero;
					count++;
		}while(sumTotal < 100);
		System.out.println("El numero se sumo a si mismo " + count + " veces");
		

		
		//FOR
		//Contador de un numero limite
		
		int numeroLimite = 10;
		
		for (int i = 1; i<=numeroLimite; i++) {
			System.out.println("El numero FOR es: " + i);
		}
		
		Modificador modificador = new Modificador();
		modificador.sayHello();
		

	}	
	

	
	
}
