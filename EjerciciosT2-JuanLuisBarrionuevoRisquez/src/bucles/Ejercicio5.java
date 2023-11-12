package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: Primer número: -4| ENTRADA.ESPERADO: Te vuelve a pedir el primer número | RES. OBTENIDO: Te vuelve a pedir el primer número.
 * ENTRADA.USUARIO: Segundo número: -6| ENTRADA.ESPERADO: Te vuelve a pedir el segundo número | RES. OBTENIDO: Te vuelve a pedir el segundo número.
 * ENTRADA.USUARIO: Hola | ENTRADA.ESPERADO: El dato introducido no es correcto y te vuelve a pedir un número 
 * | RES. OBTENIDO: El dato introducido no es correcto y te vuelve a pedir un número.
 * ENTRADA.USUARIO: 24 y 36 | ENTRADA.ESPERADO: 72 | RES. OBTENIDO: 72
*/

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaramos los dos números que el usuario pide
		int num1 = -1, num2 = -1;
		// Variable que guarda el m.c.m.
		int mcm = 0;
		// Variable que se utliza para buscar el m.c.m. incrementando su valor
		int contador = 2;
		// Variable que determina cual de los números es mayor
		int nummayor;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Utlizamos un try - catch y un bucle do-while para obtener un número positivo
		// del usuario, si no te pedira de nuevo que introduzcas un número.
		do {
			try {
				System.out.print("Ingrese el primer número positivo: ");
				num1 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num1 < 0);

		// Utlizamos un try - catch y un bucle do-while para obtener un número positivo
		// del usuario, si no te pedira de nuevo que introduzcas un número.
		do {
			try {
				System.out.print("Ingrese el segundo número positivo: ");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num2 < 0);

		//Determinamos cual es el mayor número entre el número 1 y número 2
		if (num1 > num2) {
			nummayor = num1;
		} else {
			nummayor = num2;
		}
		
		// Le asignamos a contador el valor de nummayor
		contador = nummayor;
		//Le asignamos a mcm el valor de contador
		mcm = contador;

		//Utlizamos un bucle para incrementar contador hasta que se cumpla la condición 
		while (contador % num1 != 0 || contador % num2 != 0) {
			contador++;
			//Se actualiza el valor
			mcm = contador;
		}
		//Se imprime el resultado del m.c.m.
		System.out.println("El m.c.m. de " + num1 + " y " + num2 + " es: " + mcm);

		//Cierre de Scanner
		sc.close();

	}
}