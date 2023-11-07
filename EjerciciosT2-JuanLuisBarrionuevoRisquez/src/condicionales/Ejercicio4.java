package condicionales;

import java.util.Scanner;

/*
 * ENTRADA: 0 | RES. ESPERADO: "El número debe estar entre 1 y 99." | RES. OBTENIDO: "El número debe estar entre 1 y 99."
 * ENTRADA: 1 | RES. ESPERADO: "uno" | RES. OBTENIDO: "uno"
 * ENTRADA: 12 | RES. ESPERADO: "doce" | RES. OBTENIDO: "doce"
 * ENTRADA: 68 | RES. ESPERADO: "doce" | RES. OBTENIDO: "doce"
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variable para guardar el número introducido por el usuario.
		int num;
		int unidad;
		int decenas;

		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario que introduzca un número entre 1 y 99.
		System.out.println("Introduce un número entre 1 y 99");
		//Leemos el número del teclado
		num = sc.nextInt();
		
		//Comprobamos si el número está entre 1 y 99
		if (num >= 1 && num <= 99) {
		
		unidad = num % 10;
		switch (unidad)	{
		case 1 -> System.out.println("uno");
		case 2 -> System.out.println("dos");
		case 3 -> System.out.println("tres");
		case 4 -> System.out.println("cuatro");
		case 5 -> System.out.println("cinco");
		case 6 -> System.out.println("seis");
		case 7 -> System.out.println("siete");
		case 8 -> System.out.println("ocho");
		case 9 -> System.out.println("nueve");
		}
		
		decenas = num / 10;
		switch (decenas)	{
		case 1 -> System.out.println("diez");
		case 2 -> System.out.println("doce");
		case 3 -> System.out.println("trece");
		case 4 -> System.out.println("catorce");
		case 5 -> System.out.println("quince");
		}
		sc.close();
	}

	}
	
}
