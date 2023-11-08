package condicionales;

import java.util.Scanner;

/*
 * ENTRADA: 
 * 			Comida comprada: 900
 * 			Número de animales: 12
 * 			Kg que comen en total: 750 | 
 * 			RES. ESPERADO: "Disponen de alimento suficiente" | 
 * 			RES. OBTENIDO: "Disponen de alimento suficiente"
 *
 *			Comida comprada: 900
 * 			Número de animales: 12
 * 			Kg que comen en total: 1000 | 
 * 			RES. ESPERADO: "¡¡No hay comida suficiete!! --> A cada animal le corresponde: 75.0 kilos" | 
 * 			RES. OBTENIDO: "¡¡No hay comida suficiete!! --> A cada animal le corresponde: 75.0 kilos"
 * 
 * 			Comida comprada: 900
 * 			Número de animales: 0
 * 			Kg que comen en total: 0 | 
 * 			RES. ESPERADO: "No hay animales a los que alimentar" | 
 * 			RES. OBTENIDO: "No hay animales a los que alimentar"
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos las variables comidaCompr, numAnimales, y kilos, los cuales seran
		// pedidos al usuario.
		double comidaCompr;
		int numAnimales;
		double kilos;
		// Declaramos la variable ración para saber cuantoa comida se le reparte a cada
		// animal en caso de no haber comida suficiente
		float racion;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Se le pregunta al usuario la cantidad de comida comprada.
		System.out.println("Cantidad de comida comprada -->");
		comidaCompr = sc.nextDouble();

		// Se le pregunta al usuario numero de animales
		System.out.println("Número de animales que alimentar -->");
		numAnimales = sc.nextInt();

		// Le preguntamos al usuario cuanto comen los animales en total.
		System.out.println("Kilos de comida que comen en total -->");
		kilos = sc.nextDouble();

		// Si el número de animales es 0, se mostrara que no hay animales que alimentar.
		if (numAnimales <= 0) {
			System.out.println("No hay animales a los que alimentar");

			// Si no
		} else {
			// Comprobamos si los kilos de comidaCompr son mayores o iguales a los kilos de
			// comida que se comen los animales.
			if (comidaCompr >= kilos) {
				// Se mostrara que disponen de alimento suficiente.
				System.out.println("Disponen de alimento suficiente");

				// Si no
			} else {
				// Calculamos el valor de la ración que seria comidaCompr entre numAnimales.
				racion = (float) (comidaCompr / numAnimales);
				// Se mostraria que no hay suficiente comida y los kilos de comida que le
				// pertenecen a cada animal con la comida que hay.
				System.out.print("¡¡No hay comida suficiete!! --> ");
				System.out.println("A cada animal le corresponde: " + racion + " kilos");
			}
		}
		// Cierre
		sc.close();

	}
}
