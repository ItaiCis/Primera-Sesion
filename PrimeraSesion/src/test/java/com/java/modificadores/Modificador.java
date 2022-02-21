package com.java.modificadores;

public class Modificador {

	
	//Modificadores de acceso o access modifiers
	//Que son? Es que tan accesible o restrictivo es un metodo
	
	/*
	 * PUBLIC - COMPARTIR EN CUALQUIER METODO O CLASE DEL PROYECTO
	 * PROTECTED - SE PUEDE COMPARTIR EN LA CLASE DEL MISMO PAQUETE o QUE HEREDAN
	 * PACKAGE PRIVATE O DEFAULT - SOLO LAS CLASES QUE ESTEN EN EL MISMO PAQUETE PUEDEN ACCEDER
	 * PRIVATE - UNICAMENTE EN LA CLASE DONDE ESTAN LOS METODOS
	 */
	
//	public void sayHello() {
//		System.out.println("Hello");
//	}
	
	public void sayHello() {
		System.out.println("Hello - PACKAGE PRIVATE");
	}
	
	public void invokeSayHello() {
		sayHello();
	}
}
