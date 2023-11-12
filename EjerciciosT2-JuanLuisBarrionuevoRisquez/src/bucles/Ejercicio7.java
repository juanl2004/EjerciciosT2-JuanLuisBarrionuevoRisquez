package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: -8 | ENTRADA.ESPERADO: Te vuelve a pedir un número | RES. OBTENIDO: Te vuelve a pedir un número.
 * ENTRADA.USUARIO: Hola | ENTRADA.ESPERADO: El dato introducido no es correcto y te vuelve a pedir un número 
 * | RES. OBTENIDO: El dato introducido no es correcto y te vuelve a pedir un número.
 * ENTRADA.USUARIO: 4 | ENTRADA.ESPERADO: 1 | RES. OBTENIDO: 1
 * 										  121				 121
 * 										  12321				 12321
 * 										  1234321			 1234321
*/

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos la variable num, que sera el valor introducido por el usuario
		int num = -1;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Utlizamos un try - catch y un bucle do-while para obtener un número positivo
		// del usuario, si no te pedira de nuevo que introduzcas un número.
		do {
			try {
				// Le pedimos un número al usuario
				System.out.println("Escribe un número --> ");
				// Leemos el número del teclado
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num < 0);

		// Bucle para controlar las filas, comienza en 1 y continúa hasta que la fila
		// sea menor que num.
		for (int fila = 1; fila <= num; fila++) {
			// Bucle para controlar las columnas, comienza en 0 y continua hasta que la
			// columna sea menor que la fila.
			for (int columna = 1; columna <= fila; columna++) {
				// Se imprime el valor de la columna
				System.out.print(columna);
			}
			// Este bucle nos imprime los números en orden descendente. Comienza restandole
			// 1 a la fila y continua hasta que columna es mayor o igual a 1
			for (int columna = fila - 1; columna >= 1; columna--) {
				// Se vuelve a imprimir columna
				System.out.print(columna);
			}
			// Se imprime para un salto de linea
			System.out.println("");
		}

		// Cierre de Scanner
		sc.close();
	}

}
