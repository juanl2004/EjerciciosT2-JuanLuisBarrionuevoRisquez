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
		// Declaramos las variables para horas, minutos y segundos
		int horas = -1, minutos = -1, segundos = -1;
		// Declaramos la variable incremento para almacenar el valor introducido por el
		// usuario.
		int incremento = -1;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Utlizamos un try - catch y un bucle do-while para obtener las horas del
		// usuario, asegurandose de que este en el rango correcto, si no te pedira de
		// nuevo los minutos.
		do {
			try {
				System.out.println("Introduce las horas --> ");
				horas = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (horas < 0 || horas > 23);

		// Utlizamos un try - catch y un bucle do-while para obtener los minutos del
		// usuario, asegurandose de que este en el rango correcto, si no te pedira de
		// nuevo las horas.
		do {
			try {
				System.out.println("Introduce los minutos --> ");
				minutos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (minutos < 0 || minutos > 59);

		// Utlizamos un try - catch y un bucle do-while para obtener los segundos del
		// usuario, asegurandose de que este en el rango correcto, si no te pedira de
		// nuevo los segundos.
		do {
			try {
				System.out.println("Introduce los segundos --> ");
				segundos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (segundos < 0 || segundos > 59);

		// Utlizamos un try - catch y un bucle do-while para obtener el incremento
		// introducido por el usuario, asegurandose de que este en el rango correcto, si
		// no te pedira de nuevo el incremento.
		do {
			try {
				System.out.println("Introduce el incremento que vas a añadir a los segundos --> ");
				incremento = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (incremento < 0);

		// Bucle for para realizar el incremento en los segundos y ajustar minutos y
		// horas según sea necesario.
		
		for (int i = 0; i < incremento; i++) {
			segundos++;
			// Reiniciar los segundos a 0 y aumentar los minutos si superan los 59.
			if (segundos > 59) {
				segundos = 0;
				minutos++;
			}
			// Reiniciar los minutos a 0 y aumentar las horas si superan los 59.
			if (minutos > 59) {
				minutos = 0;
				//minutos = minutos % 60;
				horas++;
			}
			// Reiniciar las horas a 0 si superan las 23.
			if (horas > 23) {
				horas = 0;
			}
		}
		
		// Utilizamos la función if para mostrar las horas, minutos y ssegundos con un
		// cero delante si fuesen menor de 10
		if (horas < 10 && minutos < 10 && segundos < 10) {
			System.out.println("0" + horas + ":" + "0" + minutos + ":" + "0" + segundos);
			// Utilizamos la función if para mostrar solo las horas y minutos, con un
			// cero delante si fuesen menor de 10
		} else if (horas < 10 && minutos < 10) {
			System.out.println("0" + horas + ":" + "0" + minutos + ":" + segundos);
			// Utilizamos la función if para mostrar solo las horas y segundos, con un
			// cero delante si fuesen menor de 10
		} else if (horas < 10 && segundos < 10) {
			System.out.println("0" + horas + ":" + minutos + "0" + segundos);
			// Utilizamos la función if para mostrar solo los minutos y segundos, con un
			// cero delante si fuesen menor de 10
		} else if (minutos < 10 && segundos < 10) {
			System.out.println(horas + ":" + "0" + minutos + ":" + "0" + segundos);
			// Utilizamos la función if para mostrar solo las horas, con un
			// cero delante si fuesen menor de 10
		} else if (horas < 10) {
			System.out.println("0" + horas + ":" + minutos + ":" + segundos);
			// Utilizamos la función if para mostrar solo los minutos, con un
			// cero delante si fuesen menor de 10
		} else if (minutos < 10) {
			System.out.println(horas + ":" + "0" + minutos + ":" + segundos);
			// Utilizamos la función if para mostrar solo los segundos, con un
			// cero delante si fuesen menor de 10
		} else if (segundos < 10) {
			System.out.println(horas + ":" + minutos + ":" + "0" + segundos);
		} else {
			System.out.println(horas + ":" + minutos + ":" + segundos);
		}
		
		// Cierre de Scanner
		sc.close();

	}
}
