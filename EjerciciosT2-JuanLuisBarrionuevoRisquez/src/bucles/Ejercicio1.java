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

		//Declaramos las horas, minutos y segundos que le pediremos al usuario
		int horas, minutos, segundos;
		//Declaramos los segundos que le pediremos al usuario que incremente
		int incremento;
		//Declaramos los segundos totales
		int segundosTot;
		//Declaramos los segundos restantes
		int segundosRest;

		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario que introduzca las horas, minutos, segundos y los segundos que quiere incrementar
		System.out.println("Introduce las horas --> ");
		horas = sc.nextInt();

		System.out.println("Introduce los minutos --> ");
		minutos = sc.nextInt();

		System.out.println("Introduce los segundos --> ");
		segundos = sc.nextInt();

		System.out.println("Introduce la cantidad de segundos a incrementar --> ");
		incremento = sc.nextInt();

		
		
		System.out.println("La nueva hora es: " + horas + ":" + minutos + ":" + segundos);
		sc.close();
	}
}
