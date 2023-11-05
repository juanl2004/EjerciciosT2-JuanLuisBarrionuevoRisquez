package bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int horas;
		int minutos;
		int segundos;
		int cantsegund;
		int totalSegundos;
		int nuevasH;
		int nuevosM;
		int nuevosS;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce las horas --> ");
		horas = sc.nextInt();

		System.out.println("Introduce los minutos --> ");
		minutos = sc.nextInt();

		System.out.println("Introduce los segundos --> ");
		segundos = sc.nextInt();

		System.out.println("Introduce la cantidad de segundos a incrementar --> ");
		cantsegund = sc.nextInt();

		totalSegundos = horas * 3600 + minutos * 60 + segundos;

		totalSegundos =+ cantsegund;

		while (totalSegundos >= 86400) {
			totalSegundos -= 86400;
		}

		nuevasH = totalSegundos / 3600;
		nuevosM= (totalSegundos % 3600) / 60;
		nuevosS = totalSegundos % 60;

		System.out.printf("La nueva hora es: " + nuevasH + ":" + nuevosM + ":" + nuevosS);

		sc.close();
	}

}
