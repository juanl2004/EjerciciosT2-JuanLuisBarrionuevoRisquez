package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int num = 0;
		int contadorPrimos = 0;
		boolean esPrimo;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("Introduce un número --> ");
				num = sc.nextInt();
			} catch (Exception e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num < 0);

		for (int i = 2; i <= num; i++) {
			esPrimo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				contadorPrimos++;
			}
		}

		System.out.println("La cantidad de números primos entre 1 y " + num + " es: " + contadorPrimos);

	}

}
