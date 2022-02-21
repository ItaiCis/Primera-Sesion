package com.java.ejercicios.Sesion3;

public class barkingDog {

public static boolean shouldWakeUp(boolean barking, int Hour) {
	
	barking = true;
	Hour = 1;
	if( barking = true && Hour < 8 || Hour > 22) {
		return true;
	}else if (Hour < 0 || Hour > 23) {
		return false;		
	}else { 
		return false;
	}
}
}
