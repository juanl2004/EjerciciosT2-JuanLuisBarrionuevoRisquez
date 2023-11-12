package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: -4 | ENTRADA.ESPERADO: Te vuelve a pedir un número | RES. OBTENIDO: Te vuelve a pedir un número.
 * ENTRADA.USUARIO: Hola | ENTRADA.ESPERADO: El dato introducido no es correcto y te vuelve a pedir un número 
 * | RES. OBTENIDO: El dato introducido no es correcto y te vuelve a pedir un número.
 * ENTRADA.USUARIO: 25 | ENTRADA.ESPERADO: 9 | RES. OBTENIDO: 9.
*/

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaramos la variable num, introducido por el usuario
		int num = -1;
		// Declaramos las variable contadorPrimos para contar los números de primos
		// encontrados
		int contadorPrimos = 0;
		// Declaramos la variable esPrimo para verificar si el número es primo.
		boolean esPrimo;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Utlizamos un try - catch y un bucle do-while para obtener un número positivo
		// del usuario, si no te pedira de nuevo que introduzcas un número.
		do {
			try {
				System.out.print("Introduce un número --> ");
				num = sc.nextInt();
			} catch (Exception e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num < 0);

		// Bucle for para verificar la cantidad de números primos hasta el número
		// introducido por el usuario
		for (int i = 2; i <= num; i++) {
			// El número es primo en un principio
			esPrimo = true;
			// Bucle for anidado para verificar si el número i es divisible por algún número
			// menor que el
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					// Si es divisible, no es primo
					esPrimo = false;
					// Salimos del bucle
					break;
				}
			}
			// Si al salir del bucle for "esPrimo" sigue siendo true, entonces i es primo
			if (esPrimo) {
				// Incrementamos el contador de primos.
				contadorPrimos++;
			}
		}
		// Imprimimos la cantidad de números primos encontrados.
		System.out.println("La cantidad de números primos entre 1 y " + num + " es: " + contadorPrimos);

		// Cierre de Scanner
	}

}
