package com.java.ejercicios.Sesion3;

public class MegaBytes {
	
	public static void printMegaBytesAndKiloBytes (int kiloBytes) {
		int MB = kiloBytes / 1024;
		int KB = kiloBytes % 1024;
		
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(kiloBytes + " KB = " + MB + "MB and " + KB + " KB");
		}
		
	}

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(8000);
	}
}
