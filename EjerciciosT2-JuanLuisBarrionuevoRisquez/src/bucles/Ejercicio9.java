package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: -4 | ENTRADA.ESPERADO: Te vuelve a pedir un número | RES. OBTENIDO: Te vuelve a pedir un número.
 * ENTRADA.USUARIO: Hola | ENTRADA.ESPERADO: El dato introducido no es correcto y te vuelve a pedir un número 
 * | RES. OBTENIDO: El dato introducido no es correcto y te vuelve a pedir un número.
 * ENTRADA.USUARIO: 123456 | ENTRADA.ESPERADO: 6| RES. OBTENIDO: 6.
*/

public class Ejercicio9 {

	public static void main(String[] args) {
		// Declaramos número para almacenar el número ingresado por el usuario
		int num = -1;
		// Declaramos contador para contar el número de digitos
		int contador = 0;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Utlizamos un try - catch y un bucle do-while para obtener un número positivo
		// del usuario, si no te pedira de nuevo que introduzcas un número.
		do {
			try {
				// Le pedimos un número al usuario
				System.out.println("Introduce un número: ");
				// Leemos el número del teclado
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num < 0);

		// Este bucle se ejecuta mientras el número sea diferente de 0
		while (num != 0) {
			// Se divide el número por 10 y se incrementa el contador
			num /= 10;
			contador++;
		}

		// Se muestra el resultado, indicando cuántos dígitos tiene el número ingresado
		System.out.println("Las cifras son --> " + contador);

		// Cierre de Scanner
		sc.close();
	}

}