package com.java.ejercicios.Sesion2;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Caracteristicas de un metodo
		 * 
		 * #1 Un metodo no puede escribirse fuera de la clase
		 * #2 Un metodo no se puede escribir dentro de otro metodo
		 * #3 El metodo MAIN es el punto de entrada del programa
		 * #4 Un metodo comienza con una { llave y termina con otra llave }
		 * #5 Dentro de un metodo se puede invocar otro metodo
		 * 
		 */
		
		printHello();
		int suma = suma(1,2);
		System.out.println(suma);

	}
	
	public static void printHello() {
		System.out.println("HELLO");
	}
	
	public static void validateUserLoginPage() {
		
	}
	
	public static int suma(int x, int y) {
		return x+y;
	}

	public static boolean isHuman() {
		return true;
	}
	
	//QA
	public static void loginApp(String username, String password) {
		System.out.println("Entering username " + username);
		System.out.println("Entering password " + password );
	}
	
	//Automation
		public static void loginApp(String username, String password, String token) {
			System.out.println("Entering username " + username);
			System.out.println("Entering password " + password );
			System.out.println("Entering token " + token);
		
		
		}
}

