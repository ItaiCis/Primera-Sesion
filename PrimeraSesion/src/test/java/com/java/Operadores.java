package com.java;

public class Operadores {

	public static void main(String[] args) {
		// OPERATORS
		
		//operadores aritmeticos ( + - * /)
		int x = 2;
		int y = 2;
		
		int suma = x + y;
		int resta = x - y;
		int division = x / y;
		int multiplicacion = x * y;
		
		System.out.println("Esta es la suma " + suma);
		System.out.println("Esta es la resta " + resta);
		System.out.println("Esta es la division " + division);
		System.out.println("Esta es la multiplicacion " + multiplicacion);
		
		double z = 2.23;
		double a = 4.34;
		
		double mult2 = z * a;
		System.out.println("Esta es la multiplicacion " + mult2);
		
		//Operadores Unarios ayuda a incrementar o decrementar un valor
		int unario = 2;
		unario++;
		System.out.println(unario);
		
		
		//Operadores relacionales o condicionales
//		Igual que ==
//		Diferente a !=
//		Mayor que >
//		Mayor o igual que >=
//		Menor que <
//		Menor o igual que <=
		
		int or = 2;
		int or2 = 3;
		
		if(or != or2) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	
		
		String msg = "Hello";
		String msg2 = "Hello";
		
		if(msg != msg2) {
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");		
		}
		
		//Operadores Condicionales
//		AND &&
//		OR ||
		
		int oper1 = 2;
		int oper2 = 4;
		int oper3 = 1;
		int oper4 = 3;
		
		if(oper1 == oper2 || oper3 == oper4) {
			System.out.println("TODOS LOS VALORES SON IGUALES");
		}else{
			System.out.println("NO SON IGUALES TODOS LOS VALORES");		
		}
		
	}
}



