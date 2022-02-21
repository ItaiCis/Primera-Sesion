package com.java.ejercicios.Sesion2;

public class Condicionales {

	public static void main(String[] args) {
		// Automovil conduciendo a exceso de velocidad
		int limiteVelocidad = 80; //KM*H
		int velocidadActual = 101; //KM*H
		boolean carretera = false;
		
		//IF
//		if(velocidadActual > limiteVelocidad) {
//			System.out.println("MULTA!!!");
//		}
		
		//IF ELSE
//		if(velocidadActual > limiteVelocidad) {
//			System.out.println("MULTA!!!");
//		}else {
//			System.out.println("DESCUENTO :D");
//		}
//		
		
//		//IF ANIDADO
//		if(carretera) {
//			limiteVelocidad = 100;
//		
//		if(velocidadActual > limiteVelocidad) {
//			System.out.println("MULTA!!!");
//		}else {
//			System.out.println("DESCUENTO :D");
//		}
//		}
	
		
//		//IF ELSE IF
//		if(carretera) {
//			//Dando nuevo valor a la variable
//			limiteVelocidad = 100;
//			
//			if(velocidadActual>limiteVelocidad) {
//				System.out.println("MULTA!!! - Vas en Carretera"); //TRUE
//			}else {
//				System.out.println("DESCUENTO :D - Vas en carretera");
//			}
//		}
//		else if(velocidadActual>limiteVelocidad) {
//				System.out.println("MULTA!!! - Vas en la calle"); //TRUE
//			}else {
//				System.out.println("DESCUENTO :D - Vas en la calle"); //False
//
//		}
		
		//SWITCH CASE
		int temperatura = 2; //grados C
		
		switch(temperatura) {
		
		case 2:
			System.out.println("Temperatura Monterrey, Nuevo Leon, Mexico");
			System.out.println("Temperatura USA");
			break;
		case 19:
			System.out.println("Temperatura de Argentina");
			break;
		case 12: 
			System.out.println("Temperatura de Ecuador");
			break;
		case 17:
			System.out.println("Temperatura de Colombia");
			break;
		default: 
			System.out.println("Temperatura de otro lugar");
			break;
		}
	}
}


