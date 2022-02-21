package com.java.ejercicios.Sesion3;

public class SumOdd {
	
	public static boolean isOdd(int number) {
		if(number > 0) {
			return (number % 2 != 0);
		}else {
		return false;
	}
	}
		
		public static int sumOdd(int start, int end) {
			int sum=0;
			if(start > 0 && end >= start) {
				for(int i = start; i<=end; i++) {
					if(isOdd(i)) {
						sum = sum + i;
					}
				}
				return sum;
			}else {
				return -1;
			}
		}
	}

