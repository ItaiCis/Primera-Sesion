package com.java.ejercicios.Sesion3;

public class imprimirVerificadorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = -1;
		int var2 = 2;
		int var3 = 1;
		
		if((var1 == var2) && (var1 == var3)) {
			System.out.println("Todos los numeros son iguales");
		}else if((var1 != var2) || (var1 != var3)) {
			System.out.println("Ni todos son iguales o diferentes");
		}else if((var1 < 0) || (var2 < 0) || (var3 < 0)) {
			System.out.println("Valor no valido");
		}else {
			System.out.println("Todos los numeros son diferentes");
		}

	}
	

}
