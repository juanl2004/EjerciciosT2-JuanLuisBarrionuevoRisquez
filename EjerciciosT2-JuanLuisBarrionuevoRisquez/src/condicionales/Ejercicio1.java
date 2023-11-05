package condicionales;

import java.util.Scanner;

/*
 * ENTRADA: -5 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 * ENTRADA: 50000 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 * ENTRADA: 5 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 25 | RES. ESPERADO: NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 * ENTRADA: 22 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 122 | RES. ESPERADO: NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 * ENTRADA: 555 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 212 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 6666 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 6565 | RES. ESPERADO: NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 * ENTRADA: 6556 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 5891 | RES. ESPERADO:  NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaro como int la variable número que es el número que le pediremos al
		// usuario.
		int numero;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Escribe un número comprendido entre 0 y 9999 -->");
		// Leemos el número del teclado.
		numero = sc.nextInt();

		// Comprobamos si el número esta comprendido entre 0 y 9999.
		if (numero >= 0 && numero <= 9999) {
			// Si no
		} else {
			// Se imprimira el número no esta comprendido entre 0 y 9999.
			System.out.println("El número introducido no está en el rango especificado");
		}

		// Comprobamos si el número esta comprendido entre 0 y 9.
		if (numero >= 0 && numero <= 9) {
			// Se imprime capicúa si se cumple la función anterior.
			System.out.println("El número introducido es capicúa");
		}

		// Comprobamos si el número esta comprendido entre 10 y 99.
		if (numero >= 10 && numero <= 99) {
			// Comprobamos que el resultado del número entre 10 tiene que ser igual al resto
			// de la misma división.
			if ((numero / 10) == (numero % 10)) {
				// Si es cierta la condición anterior se imprime es capicúa.
				System.out.println("El número introducido es capicúa");
				// Si no
			} else {
				// Se imprime no es capicúa.
				System.out.println("El número introducido no es capicúa");
			}
		}
		// Comprobamos si el número esta comprendido entre 100 y 999.
		if (numero >= 100 && numero <= 999) {
			// Comprobamos que el resultado del número entre 100 tiene que ser igual al
			// resto del número entre 10.
			if ((numero / 100) == (numero % 10)) {
				// Si es cierta la condición anterior se imprime es capicúa.
				System.out.println("El número introducido es capicúa");
				// Si no
			} else {
				// Se imprime no es capicúa.
				System.out.println("El número introducido no es capicúa");
			}
		}
		// Comprobamos si el número esta comprendido entre 1000 y 9999.
		if (numero >= 1000 && numero <= 9999) {
			//Comprobamos si el primer y último dígito son iguales y si el segundo y el penúltimo dígito son iguales
			if (numero % 10 == numero / 1000 && (numero / 10) % 10 == (numero / 100) % 10) {
				// Si es cierta la condición anterior se imprime es capicúa.
				System.out.println("El número ingresado es capicúa.");
				// Si no
			} else {
				// Se imprime no es capicúa.
				System.out.println("El número ingresado no es capicúa.");
			}

		}
		// Cierre de Scanner
		sc.close();
	}
}
