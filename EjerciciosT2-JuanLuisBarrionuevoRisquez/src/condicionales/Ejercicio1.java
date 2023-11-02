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
 * ENTRADA: 6565 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 6556 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 5891 | RES. ESPERADO:  NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número comprendido entre 0 y 9999 -->");
		numero = sc.nextInt();

		if (numero >= 0 && numero <= 9999) {
		} else {
			System.out.println("El número introducido no está en el rango especificado");
		}
		if (numero >= 0 && numero <= 9) {
			System.out.println("El número introducido es capicua");
		}

		if (numero >= 10 && numero <= 99) {
			if ((numero / 10) == (numero % 10)) {
				System.out.println("El número introducido es capicua");
			} else {
				System.out.println("El número introducido no es capicua");
			}
		}

		if (numero >= 100 && numero <= 999) {
			if ((numero / 100) == (numero % 10)) {
				System.out.println("El número introducido es capicua");
			} else {
				System.out.println("El número introducido no es capicua");
			}
		}

		if (numero >= 1000 && numero <= 9999) {
			if (numero / 1000 == numero % 10 && (numero / 100) % 10 == (numero / 10) % 10) {
				System.out.println("El número introducido es capicua");
			} else if ((numero / 100) == (numero % 100)) {
				System.out.println("El número introducido es capicua");
			} else {
				System.out.println("El número introducido no es capicua");
			}

		}

	}
}
