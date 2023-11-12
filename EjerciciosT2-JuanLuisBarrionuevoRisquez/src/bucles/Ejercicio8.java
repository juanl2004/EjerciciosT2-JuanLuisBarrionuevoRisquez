package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: Número inicial: -4| ENTRADA.ESPERADO: Te vuelve a pedir el primer número | RES. OBTENIDO: Te vuelve a pedir el primer número.
 * ENTRADA.USUARIO: Número inicial: -6| ENTRADA.ESPERADO: Te vuelve a pedir el segundo número | RES. OBTENIDO: Te vuelve a pedir el segundo número.
 * ENTRADA.USUARIO: Número inicial: Hola | ENTRADA.ESPERADO: El dato introducido no es correcto y te vuelve a pedir un número 
 * | RES. OBTENIDO: El dato introducido no es correcto y te vuelve a pedir un número.
 * ENTRADA.USUARIO: Número inicial: 20 | ENTRADA.ESPERADO: Dime un número: | RES. OBTENIDO: Dime un número:
 * ENTRADA.USUARIO: Dime un número: -4| ENTRADA.ESPERADO: ¡Recuerde! Es un número POSITIVO | RES. OBTENIDO: ¡Recuerde! Es un número POSITIVO
 *														  Dime un número: 									Dime un número:
 * ENTRADA.USUARIO: Dime un número 21 y 8| ENTRADA.ESPERADO: Fallo! el número es menor | RES. OBTENIDO: Fallo! el número es menor
 * ENTRADA.USUARIO: Número inicial: 20 | ENTRADA.ESPERADO: Total de números introducidos: 2 | RES. OBTENIDO: Total de números introducidos: 2
 * 					Dime un número 21 y 0				   Numeros fallados: 0								 Numeros fallados: 0
*/

public class Ejercicio8 {

	public static void main(String[] args) {

		// Almacena el número introducido por el usuario
		int num = -1;
		// Almacena el número previamente introducido
		int numM = 0;
		// Contador de números introducidos
		int contador = 1;
		// Contador de números fallados
		int contadorE = 0;
		// Para determinar si la entrada es válida o no.
		boolean esValido;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Este bucle solicita al usuario un número inicial y utiliza un bloque
		// try-catch para manejar posibles excepciones si el usuario no ingresa un
		// número. Si el número es menor que 0, el bucle se repetirá.
		do {
			try {
				// Le pedimos un número al usuario
				System.out.println("Dime un número inicial --> ");
				// Leemos el número del teclado
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num < 0);

		// Este bucle continuará mientras el valor de num sea diferente de 0.
		do {
			// Inicializa num con 1 antes de solicitar un nuevo número al usuario.
			num = 1;

			try {
				// Inicia un bloque try-catch para manejar posibles excepciones durante la
				// entrada de datos.

				// Verifica si num es menor que 0. Si es así, muestra un mensaje indicando que
				// el número debe ser positivo.
				if (num < 0) {
					System.out.println("¡Recuerde! Es un número POSITIVO");
					// Si no
				} else {
					// Solicita al usuario que introduzca un número.
					System.out.println("Dime un número: ");
					// Lee el número introducido por el usuario.
					num = sc.nextInt();

					// Comprueba nuevamente si num es menor que 0 después de la entrada.
					if (num < 0) {
						System.out.println("¡Recuerde! Es un número POSITIVO");
						// Si no
					} else {

						// Si num es mayor o igual a 0
						if (num != 0) {
							// Incrementa el contador
							contador++;
							// Si no
						} else {
							// esValido es false
							esValido = false;
						}

						// Si num es menor que el numM y no es igual a 0
						if (num < numM && num != 0) {
							// Incrementa el contador
							contadorE++;
							System.out.println("Fallo! el número es menor");
						}
						// Actualiza numM con el valor actual de num
						numM = num;
					}
				}
				// Captura una excepción si el usuario ingresa un dato que no es un número
				// entero.
			} catch (InputMismatchException e) {
				// Muestra un mensaje indicando que el dato introducido no es correcto.
				System.out.println("Dato incorrecto.");
				sc.nextLine();
			}
			// Cierra el bloque do-while y especifica que el bucle debe continuar mientras
			// num sea diferente de 0.
		} while (num != 0);

		// Se imprime el total de números introducidos y la cantidad de números
		// fallados.
		System.out.println("Total de números introducidos: " + contador);
		System.out.println("Numeros fallados: " + contadorE);

		// Cierre de Scanner
		sc.close();
	}
}
