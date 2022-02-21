package com.java.ejercicios.Sesion2;

public class Arreglos {

	public static void main(String[] args) {
		// ARRAY (ARREGLO)
		
		//Arreglo unidimensional
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		String[] dias2 = new String[7];
		dias2[0] = "Lunes";
		dias2[1] = "Martes";
		dias2[2] = null;
		int[] numero = {1, 2, 3, 5, 7, 100};
		boolean[] algo = {true, true, false, true};
		
		System.out.println("El dia de hoy es: " + dias[5]);
		
		for(int i = 0; i <= dias.length - 1; i++) {
			System.out.println(dias[i]);			
		}
		
		//Arreglo bidimensional
		String [][] nombres = new String[2][2];
		nombres[0][0] = "Itaty";
		nombres[0][1] = "Ricardo";
		nombres[1][0] = "Adonai";
		nombres[1][1] = "Alejandra";
		
		System.out.println("El nombre de la persona es: " + nombres[0][0]);
		
		//ACTIVIDAD imprimir el arreglo bidimensional utilizando un loop
		for(int x = 0; x < nombres.length; x++) {			
			for(int y = 0; y < nombres[x].length; y++) {
				System.out.println(nombres[x][y]);			
		}
	}
		
		//Arreglo multidimensional
		String[][][][] datos = new String[2][2][2][2];
		datos[0][0][0][0] = "HELLO";
		datos[0][0][0][1] = "HELLO1";
		datos[0][0][1][0] = "HELLO2";
		datos[0][1][0][0] = "HELLO3";
		datos[1][0][0][0] = "HELLO4";
		
	}
}
