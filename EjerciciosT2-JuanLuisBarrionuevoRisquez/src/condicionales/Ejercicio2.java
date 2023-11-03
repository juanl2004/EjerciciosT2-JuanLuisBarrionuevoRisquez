package condicionales;

import java.util.Scanner;

/*
 * ENTRADA: 00000000 | RES. ESPERADO: 00000000T | RES. OBTENIDO: 00000000T
 * ENTRADA: 26597217 | RES. ESPERADO: 26597217V | RES. OBTENIDO: 26597217V
 * ENTRADA: 26597217 | RES. ESPERADO: 26597217V | RES. OBTENIDO: 26597217V
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		int dni;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu DNI sin la letra -->");
		dni = sc.nextInt();
		
		if (dni >= 00000000 && dni <= 99999999) {
		switch (dni % 23) {
		case 0 -> System.out.println( dni + "T");
		case 1 -> System.out.println( dni + "R");
		case 2 -> System.out.println( dni + "W");
		case 3 -> System.out.println( dni + "A");
		case 4 -> System.out.println( dni + "G");
		case 5 -> System.out.println( dni + "M");
		case 6 -> System.out.println( dni + "Y");
		case 7 -> System.out.println( dni + "F");
		case 8 -> System.out.println( dni + "P");
		case 9 -> System.out.println( dni + "D");
		case 10 -> System.out.println( dni + "X");
		case 11 -> System.out.println( dni + "B");
		case 12 -> System.out.println( dni + "N");
		case 13 -> System.out.println( dni + "J");
		case 14 -> System.out.println( dni + "Z");
		case 15 -> System.out.println( dni + "S");
		case 16 -> System.out.println( dni + "Q");
		case 17 -> System.out.println( dni + "V");
		case 18 -> System.out.println( dni + "H");
		case 19 -> System.out.println( dni + "L");
		case 20 -> System.out.println( dni + "C");
		case 21 -> System.out.println( dni + "K");
		case 22 -> System.out.println( dni + "E");
		}
		} else {
			System.out.println("Valor no valido");
		}
		sc.close();
	}

}
