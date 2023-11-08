package condicionales;

import java.util.Scanner;

/*
 * ENTRADA.USUARIO: 23:59:59 | ENTRADA.ESPERADO: 24:00:00 | RES. ESPERADO: 24:00:00
 * ENTRADA.USUARIO: 23:50:59 | ENTRADA.ESPERADO: 23:51:00 | RES. ESPERADO: 23:51:00
 * ENTRADA.USUARIO: 23:59:51 | ENTRADA.ESPERADO: 23:59:52 | RES. ESPERADO: 23:59:52
 * ENTRADA.USUARIO: 00:00:00 | ENTRADA.ESPERADO: 00:00:01 | RES. ESPERADO: 00:00:01
*/

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos las siguientes variables para registrar los valores de las horas,
		// minutos y segundos
		int horas;
		int minutos;
		int segundos;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario las horas, minutos y segundos
		System.out.println("Introduce cuantas horas -->");
		horas = sc.nextInt();

		System.out.println("Introduce cuantos minutos -->");
		minutos = sc.nextInt();

		System.out.println("Introduce cuantos segundos -->");
		segundos = sc.nextInt();

		// Si los segundos son mayores o iguales a 59 los segundos valen 0 y a los
		// minutos se les suma 1.
		if (segundos >= 59) {
			segundos = 0;
			minutos++;
		} else { // Si no, le incrementamos un segundo a los segundos
			segundos++;
		}

		// Si los minutos son mayores que 59, los minutos serian 0 y se incrementaria
		// una hora a las horas
		if (minutos > 59) {
			minutos = 0;
			horas++;
			// Si no comprobamos si los segundos son mayores o igual a 59 y si es asi se
			// suma 1 a los minutos.
		} else if (segundos >= 59) {
			minutos++;
		}

		// Mostramos el resultado despues de incrementar 1 segundo
		System.out.println("La hora es -->" + horas + ":" + minutos + ":" + segundos);

		// Cierre Scanner
		sc.close();
	}

}
