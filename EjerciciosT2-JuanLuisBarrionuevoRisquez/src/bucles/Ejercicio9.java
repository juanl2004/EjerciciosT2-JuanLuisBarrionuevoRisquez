package bucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		int num;
		int contador = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Quieres saber cuantos digitos tiene tu número?");
		System.out.println("Introduce un número: ");
		num = sc.nextInt();

		while (num != 0) {
			num /= 10;
			contador++;

		}
		
		System.out.println("Las cifras son --> " + contador);
	}
	
}