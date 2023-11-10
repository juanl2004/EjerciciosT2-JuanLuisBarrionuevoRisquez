package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: 23:59:55 + 5 seg | ENTRADA.ESPERADO: 00:00:00 | RES. ESPERADO: 00:00:00
 * ENTRADA.USUARIO: 22:59:55 + 5 seg | ENTRADA.ESPERADO: 23:00:00 | RES. ESPERADO: 23:00:00
 * ENTRADA.USUARIO: 23:58:51 + 5 seg | ENTRADA.ESPERADO: 23:59:52 | RES. ESPERADO: 23:59:52
 * ENTRADA.USUARIO: 00:00:00 | ENTRADA.ESPERADO: 00:00:01 | RES. ESPERADO: 00:00:01
*/

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos las horas, minutos y segundos que le pediremos al usuario
		int horas = 1, minutos = 1, segundos = 1;
		// Declaramos los segundos que le pediremos al usuario que incremente
		int incremento = 0;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("Introduce las horas --> ");
				horas = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (horas < 0 || horas < 24);

		do {
			try {
				System.out.println("Introduce los minutos --> ");
				minutos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (minutos < 0 || minutos < 60);

		do {
			try {
				System.out.println("Introduce los segundos --> ");
				segundos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (segundos < 0 || minutos < 60);

		do {
			try {
				System.out.println("Introduce el incremento que vas a añadir a los segundos --> ");
				incremento = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (incremento < 0);

		for (int i = 0; i < incremento; i++) {
			segundos++;
			if (segundos > 59) {
				segundos = 0;
				minutos++;
			}
			if (minutos > 59) {
				minutos = minutos % 60;
				horas++;
			}
			if (horas > 23) {
				horas = 0;
			}
		}

		if (horas < 10 && minutos < 10 && segundos < 10) {
			System.out.println("0" + horas + ":" + "0" + minutos + ":" + "0" + segundos);
		} else if (horas < 10 && minutos < 10) {
			System.out.println("0" + horas + ":" + "0" + minutos + ":" + segundos);
		} else if (horas < 10 && segundos < 10) {
			System.out.println("0" + horas + ":" + minutos + "0" + segundos);
		} else if (minutos < 10 && segundos < 10) {
			System.out.println(horas + ":" + "0" + minutos + ":" + "0" + segundos);
		} else if (horas < 10) {
			System.out.println("0" + horas + ":" + minutos + ":" + segundos);
		} else if (minutos < 10) {
			System.out.println(horas + ":" + "0" + minutos + ":" + segundos);
		} else if (segundos < 10) {
			System.out.println(horas + ":" + minutos + ":" + "0" + segundos);
		}

		sc.close();

	}
}
