package com.java.ejercicios;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar 

		Scanner entero = new Scanner(System.in);
		
		int x;
		
		System.out.println("Ingrese un numero entero");
		x = entero.nextInt();
		
		if( x > 0 ) {			
			System.out.println(x + " Es positivo");
		}else {
			System.out.println(x + " Es negativo");
		}if ( x % 2 == 0) {
				System.out.println(x + " Es par");
	    }else {
				System.out.println(x + " Es impar");
		}
		
	}
	}

