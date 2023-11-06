package condicionales;

import java.util.Scanner;

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

		// Si los minutos son mayores que 59, los minutos serian 0 y se incrementaria
		// una hora a las horas
		if (minutos >= 59) {
			minutos = 0;
			horas++;
		}

		// Si los segundos son mayores que 59, los minutos serian 0 y se incrementaria
		// un minuto a los minutos
		if (segundos >= 59) {
			segundos = 0;
			minutos++;
		} else { //Si no, le incrementamos un segundo a los segundos 
			segundos++;
		}

		//Mostramos el resultado despues de incrementar 1 segundo
		System.out.println("La hora es -->" + horas + ":" + minutos + ":" + segundos);
		
		//Cierre Scanner
		sc.close();
	}

}
