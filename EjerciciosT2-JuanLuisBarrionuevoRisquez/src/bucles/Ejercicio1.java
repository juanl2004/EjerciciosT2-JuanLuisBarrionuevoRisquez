package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int horas = 0, minutos, segundos;
		int incremento;

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduce los minutos --> ");
		minutos = sc.nextInt();

		System.out.println("Introduce los segundos --> ");
		segundos = sc.nextInt();

		System.out.println("Introduce la cantidad de segundos a incrementar --> ");
		incremento = sc.nextInt();
		
	do {
		try {
			System.out.println("Introduce las horas --> ");
			horas = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("El dado introducido no es del tipo correcto");
			sc.nextLine();
		}
	} while (horas < 0 || horas > 23);

	segundos = segundos + incremento;
	while (segundos > 59) {
	minutos++;
	}
	
	while (minutos > 59) {
	horas++;
	}
		sc.close();
	}

}
