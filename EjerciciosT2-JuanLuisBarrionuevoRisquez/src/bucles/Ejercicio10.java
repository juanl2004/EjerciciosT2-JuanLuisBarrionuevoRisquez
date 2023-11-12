package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: -4 | ENTRADA.ESPERADO: Te vuelve a pedir un número | RES. OBTENIDO: Te vuelve a pedir un número.
 * ENTRADA.USUARIO: Hola | ENTRADA.ESPERADO: El dato introducido no es correcto y te vuelve a pedir un número 
 * | RES. OBTENIDO: El dato introducido no es correcto y te vuelve a pedir un número.
 * ENTRADA: 5 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 25 | RES. ESPERADO: NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 * ENTRADA: 22 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 122 | RES. ESPERADO: NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 * ENTRADA: 555 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 212 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 6666 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 6565 | RES. ESPERADO: NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 * ENTRADA: 6556 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 5891 | RES. ESPERADO:  NO CAPICÚA | RES. OBTENIDO: NO CAPICÚA
 */

public class Ejercicio10 {

	public static void main(String[] args) {

		// Declaramos el número ingresado por el usuario.
		int num = -1;
		// Declaramos numReves para almacenar el número invertido
		int numReves = 0;
		// Declaramos auxiliar para guardar el valor original del num
		int auxiliar;
		// Declaramos ultimaCifra para almacenar la ultima cifra del número
		int ultimaCifra;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Utlizamos un try - catch y un bucle do-while para obtener un número positivo
		// del usuario, si no te pedira de nuevo que introduzcas un número.
		do {
			try {
				// Le pedimos un número al usuario
				System.out.println("Introduce un número --> ");
				// Leemos el número del teclado
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num < 0);

		// Copia de número original
		auxiliar = num;

		// Comprobamos si el número es menor que 0
		if (num < 0) {
			// Si lo es, mostramos que el número debe de ser mayor o igual que 0
			System.out.println("El número debe ser mayor o igual que 0.");
			// Si no
		} else {
			// Bucle while que se ejecuta mientras num sea diferente de 0.
			while (num != 0) {
				// Se extrae la última cifra de num utilizando el operador de módulo y se
				// almacena
				ultimaCifra = num % 10;
				// Se construye numReves multiplicándolo por 10 y sumándole la última cifra.
				numReves = numReves * 10 + ultimaCifra;
				// El num se divide entre 10 y se guarda e nuevo valor
				num /= 10;

			}
			// Después de salir del bucle, verifica si el número original (auxiliar) es
			// igual al reves (numReves).
			if (auxiliar == numReves) {
				// Si lo es, imprime que es capicua
				System.out.println("El número introducido es capicúa.");
				// Si no lo es, imprime que no es capicua
			} else {
				System.out.println("El número introducido no es capicúa.");
			}
		}

		// Cierre de Scanner
		sc.close();

	}

}
